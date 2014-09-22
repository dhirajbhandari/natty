#!/usr/bin/env ruby

require 'fileutils'

class Transformer
 attr_reader :src_dir, :from_package, :to_package, :from_dir, :to_dir, :antlr_package

 def initialize(src_dir, from_package, to_package)
   @src_dir = src_dir
   @from_dir = "#{src_dir}/#{from_package.gsub('.','/')}"
   @to_dir = "#{src_dir}/#{to_package.gsub('.','/')}"
   @from_package = from_package
   @to_package = to_package
   @antlr_package = 'org.antlr.v32.runtime'
 end

 def run
   puts "from: #{from_dir}"
   puts "run!!!"
   Dir["#{from_dir}/**/*.java"].each do |from|
     dest = dest_file(from)
     puts "dest: #{dest}"
     file_tr(from, dest)
   end
 end

 def dest_file(f)
   f.sub(from_dir, to_dir)
 end

 def file_tr(from, to)
   source = File.readlines(from)
   tr_data = package_tr(source)
   FileUtils.mkdir_p(File.dirname(to))
   File.open(to, 'w') do |f|
     tr_data.each {|line| f.puts line }
   end
 end

 def package_tr(source)
   # match and replace
   source.map { |l| line_tr(l) }
 end

 def line_tr(line)
   package_regex = Regexp.new(Regexp.escape("package #{from_package}"))
   antlr_import_regex = Regexp.new(Regexp.escape("import org.antlr.runtime"))
   #puts "package_regex: #{package_regex}"
   result = line
   if line =~ package_regex
     puts "matched!!: #{line}"
     result = line.sub(package_regex, "package #{to_package}")
     puts "#{line} -> #{result}"
     result
   elsif line =~ antlr_import_regex
      puts "matched import !!: #{line}"
        result = line.sub(antlr_import_regex, 'import org.antlr.v32.runtime')
        puts "import #{line} -> #{result}"
        result
   else
     #puts "not_matched: #{line}"
     result = line
   end
   result
 end

end

# run it
root_dir = File.expand_path(File.join(File.dirname(__FILE__), '..'))

tr = Transformer.new("#{root_dir}/src/main/java",
 'com.joestelmach.natty.generated',
  'com.joestelmach.natty.antlrV32.generated')
tr.run