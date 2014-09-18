// $ANTLR 3.2 Sep 23, 2009 14:05:07 com/joestelmach/natty/generated/TreeRewrite.g 2014-09-18 18:35:13
 package com.joestelmach.natty.generated; 

import com.spark.antlr.runtime.*;
import com.spark.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class TreeRewrite extends TreeRewriter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOT", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "HOUR", "MINUTE", "DAY", "WEEK", "MONTH", "SINGLE_QUOTE", "YEAR", "TODAY", "TOMORROW", "TONIGHT", "YESTERDAY", "EVERY", "UNTIL", "AT", "AFTER", "PAST", "AM", "PM", "T", "MILITARY_HOUR_SUFFIX", "MIDNIGHT", "NOON", "MORNING", "EVENING", "NIGHT", "UTC", "EST", "PST", "CST", "MST", "AKST", "HAST", "INT_00", "INT_01", "INT_02", "INT_03", "INT_04", "INT_05", "INT_06", "INT_07", "INT_08", "INT_09", "INT_0", "INT_1", "INT_2", "INT_3", "INT_4", "INT_5", "INT_6", "INT_7", "INT_8", "INT_9", "INT_10", "INT_11", "INT_12", "INT_13", "INT_14", "INT_15", "INT_16", "INT_17", "INT_18", "INT_19", "INT_20", "INT_21", "INT_22", "INT_23", "INT_24", "INT_25", "INT_26", "INT_27", "INT_28", "INT_29", "INT_30", "INT_31", "INT_32", "INT_33", "INT_34", "INT_35", "INT_36", "INT_37", "INT_38", "INT_39", "INT_40", "INT_41", "INT_42", "INT_43", "INT_44", "INT_45", "INT_46", "INT_47", "INT_48", "INT_49", "INT_50", "INT_51", "INT_52", "INT_53", "INT_54", "INT_55", "INT_56", "INT_57", "INT_58", "INT_59", "INT_60", "INT_61", "INT_62", "INT_63", "INT_64", "INT_65", "INT_66", "INT_67", "INT_68", "INT_69", "INT_70", "INT_71", "INT_72", "INT_73", "INT_74", "INT_75", "INT_76", "INT_77", "INT_78", "INT_79", "INT_80", "INT_81", "INT_82", "INT_83", "INT_84", "INT_85", "INT_86", "INT_87", "INT_88", "INT_89", "INT_90", "INT_91", "INT_92", "INT_93", "INT_94", "INT_95", "INT_96", "INT_97", "INT_98", "INT_99", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "THIRTIETH", "ST", "ND", "RD", "TH", "COLON", "COMMA", "DASH", "SLASH", "PLUS", "FOR", "IN", "AN", "THE", "OR", "AND", "TO", "THROUGH", "ON", "OF", "THIS", "THAT", "LAST", "NEXT", "COMING", "UPCOMING", "FROM", "NOW", "AGO", "BEFORE", "BEGINNING", "START", "END", "SPACE", "WHITE_SPACE", "FOOL", "BLACK", "CHRISTMAS", "COLUMBUS", "EARTH", "EASTER", "FATHER", "FLAG", "GOOD", "GROUND", "HOG", "GROUNDHOG", "HALLOWEEN", "INAUGURATION", "INDEPENDENCE", "KWANZAA", "LABOR", "MLK", "MEMORIAL", "MOTHER", "NEW", "PALM", "PATRIOT", "PRESIDENT", "PATRICK", "SAINT", "TAX", "THANKSGIVING", "ELECTION", "VALENTINE", "VETERAN", "WINTER", "FALL", "AUTUMN", "SPRING", "SUMMER", "UNKNOWN_CHAR", "UNKNOWN", "DIGIT", "INT", "MONTH_OF_YEAR", "DAY_OF_MONTH", "DAY_OF_WEEK", "DAY_OF_YEAR", "YEAR_OF", "DATE_TIME", "DATE_TIME_ALTERNATIVE", "EXPLICIT_DATE", "RELATIVE_DATE", "SEEK", "DIRECTION", "SEEK_BY", "EXPLICIT_SEEK", "SPAN", "EXPLICIT_TIME", "RELATIVE_TIME", "HOURS_OF_DAY", "MINUTES_OF_HOUR", "SECONDS_OF_MINUTE", "AM_PM", "ZONE", "ZONE_OFFSET", "RECURRENCE", "HOLIDAY", "SEASON"
    };
    public static final int MONTH=28;
    public static final int SIXTH=192;
    public static final int DECEMBER=16;
    public static final int YESTERDAY=34;
    public static final int MIDNIGHT=44;
    public static final int INT_51=117;
    public static final int AFTER=38;
    public static final int INT_52=118;
    public static final int INT_53=119;
    public static final int INT_54=120;
    public static final int INT_50=116;
    public static final int INT_59=125;
    public static final int WEDNESDAY=20;
    public static final int COMING=231;
    public static final int EASTER=247;
    public static final int YEAR=30;
    public static final int INT_55=121;
    public static final int AKST=54;
    public static final int INT_56=122;
    public static final int COLUMBUS=245;
    public static final int INT_57=123;
    public static final int INT_58=124;
    public static final int BLACK=243;
    public static final int TWENTIETH=206;
    public static final int HOG=252;
    public static final int SPRING=276;
    public static final int INT_62=128;
    public static final int INT_63=129;
    public static final int INT_64=130;
    public static final int INT_65=131;
    public static final int AM=40;
    public static final int TWO=167;
    public static final int AN=219;
    public static final int INT_60=126;
    public static final int INT_61=127;
    public static final int RD=210;
    public static final int AT=37;
    public static final int INT_66=132;
    public static final int INT_67=133;
    public static final int INT_68=134;
    public static final int PAST=39;
    public static final int INT_69=135;
    public static final int JULY=11;
    public static final int THIRTEENTH=199;
    public static final int DAY_OF_WEEK=442;
    public static final int RELATIVE_DATE=448;
    public static final int PATRICK=266;
    public static final int DAY_OF_YEAR=443;
    public static final int EIGHTEEN=183;
    public static final int ONE=166;
    public static final int FOOL=242;
    public static final int INT_73=139;
    public static final int INT_74=140;
    public static final int INT_75=141;
    public static final int INT_76=142;
    public static final int INT_70=136;
    public static final int INT_71=137;
    public static final int INT_72=138;
    public static final int ELEVEN=176;
    public static final int THE=220;
    public static final int SPACE=240;
    public static final int T=42;
    public static final int INT_77=143;
    public static final int INT_78=144;
    public static final int FIFTEENTH=201;
    public static final int INT_79=145;
    public static final int GROUND=251;
    public static final int WINTER=273;
    public static final int EIGHTH=194;
    public static final int LABOR=258;
    public static final int SEEK=449;
    public static final int JUNE=10;
    public static final int SEVENTH=193;
    public static final int ST=208;
    public static final int INT_84=150;
    public static final int INT_85=151;
    public static final int INT_86=152;
    public static final int INT_87=153;
    public static final int FIFTH=191;
    public static final int INT_80=146;
    public static final int INT_81=147;
    public static final int INT_82=148;
    public static final int INT_83=149;
    public static final int MEMORIAL=260;
    public static final int SAINT=267;
    public static final int FATHER=248;
    public static final int MONTH_OF_YEAR=440;
    public static final int INT_88=154;
    public static final int TH=211;
    public static final int INT_89=155;
    public static final int MARCH=7;
    public static final int THIRTIETH=207;
    public static final int TO=223;
    public static final int EXPLICIT_TIME=454;
    public static final int INT_90=156;
    public static final int INT_95=161;
    public static final int INT_96=162;
    public static final int INT_97=163;
    public static final int INT_98=164;
    public static final int INT_91=157;
    public static final int BEGINNING=237;
    public static final int INT_92=158;
    public static final int MLK=259;
    public static final int INT_93=159;
    public static final int FOURTEENTH=200;
    public static final int INT_94=160;
    public static final int FIVE=170;
    public static final int THIRTY=186;
    public static final int INT_99=165;
    public static final int NINE=174;
    public static final int THANKSGIVING=269;
    public static final int TONIGHT=33;
    public static final int YEAR_OF=444;
    public static final int GOOD=250;
    public static final int TUESDAY=19;
    public static final int GROUNDHOG=253;
    public static final int FOR=217;
    public static final int SIXTEEN=181;
    public static final int PST=51;
    public static final int INDEPENDENCE=256;
    public static final int LAST=229;
    public static final int NOW=234;
    public static final int THIS=227;
    public static final int FIFTEEN=180;
    public static final int END=239;
    public static final int SIX=171;
    public static final int ELEVENTH=197;
    public static final int EVENING=47;
    public static final int NEXT=230;
    public static final int TWELVE=177;
    public static final int EXPLICIT_SEEK=452;
    public static final int EOF=-1;
    public static final int VALENTINE=271;
    public static final int OCTOBER=14;
    public static final int AGO=235;
    public static final int COLON=212;
    public static final int DIGIT=280;
    public static final int SECONDS_OF_MINUTE=458;
    public static final int MONDAY=18;
    public static final int SEVENTEENTH=203;
    public static final int PRESIDENT=265;
    public static final int START=238;
    public static final int PATRIOT=264;
    public static final int FOUR=169;
    public static final int INAUGURATION=255;
    public static final int MILITARY_HOUR_SUFFIX=43;
    public static final int EVERY=35;
    public static final int MORNING=46;
    public static final int PALM=263;
    public static final int SATURDAY=23;
    public static final int IN=218;
    public static final int CHRISTMAS=244;
    public static final int MOTHER=261;
    public static final int DOT=4;
    public static final int THIRTEEN=178;
    public static final int SEEK_BY=451;
    public static final int SEVENTEEN=182;
    public static final int HAST=55;
    public static final int MAY=9;
    public static final int NOON=45;
    public static final int DAY_OF_MONTH=441;
    public static final int FRIDAY=22;
    public static final int AM_PM=459;
    public static final int FEBRUARY=6;
    public static final int VETERAN=272;
    public static final int FLAG=249;
    public static final int ZONE_OFFSET=461;
    public static final int EIGHTEENTH=204;
    public static final int FOURTEEN=179;
    public static final int FALL=274;
    public static final int MINUTES_OF_HOUR=457;
    public static final int SEVEN=172;
    public static final int COMMA=213;
    public static final int KWANZAA=257;
    public static final int TWELFTH=198;
    public static final int EST=50;
    public static final int NOVEMBER=15;
    public static final int FIRST=187;
    public static final int SPAN=453;
    public static final int SINGLE_QUOTE=29;
    public static final int SEASON=464;
    public static final int MST=53;
    public static final int INT_04=60;
    public static final int INT_05=61;
    public static final int INT_06=62;
    public static final int INT_07=63;
    public static final int INT_00=56;
    public static final int INT_01=57;
    public static final int INT_02=58;
    public static final int INT_03=59;
    public static final int DATE_TIME_ALTERNATIVE=446;
    public static final int HOURS_OF_DAY=456;
    public static final int INT_08=64;
    public static final int UNKNOWN_CHAR=278;
    public static final int DAY=26;
    public static final int INT_09=65;
    public static final int THAT=228;
    public static final int EIGHT=173;
    public static final int NEW=262;
    public static final int THURSDAY=21;
    public static final int UTC=49;
    public static final int THIRD=189;
    public static final int ZONE=460;
    public static final int TAX=268;
    public static final int INT_10=76;
    public static final int FROM=233;
    public static final int DASH=214;
    public static final int INT_15=81;
    public static final int INT_16=82;
    public static final int INT_17=83;
    public static final int INT_18=84;
    public static final int INT_11=77;
    public static final int UPCOMING=232;
    public static final int NIGHT=48;
    public static final int INT_12=78;
    public static final int INT_13=79;
    public static final int INT_14=80;
    public static final int WHITE_SPACE=241;
    public static final int MINUTE=25;
    public static final int INT_19=85;
    public static final int JANUARY=5;
    public static final int SUNDAY=17;
    public static final int SEPTEMBER=13;
    public static final int INT_20=86;
    public static final int INT_21=87;
    public static final int EXPLICIT_DATE=447;
    public static final int INT_26=92;
    public static final int TWENTY=185;
    public static final int INT_27=93;
    public static final int INT_28=94;
    public static final int INT_29=95;
    public static final int INT_22=88;
    public static final int THROUGH=224;
    public static final int INT_23=89;
    public static final int INT_24=90;
    public static final int ND=209;
    public static final int INT_25=91;
    public static final int AND=222;
    public static final int AUGUST=12;
    public static final int ELECTION=270;
    public static final int DATE_TIME=445;
    public static final int THREE=168;
    public static final int PLUS=216;
    public static final int EARTH=246;
    public static final int HOUR=24;
    public static final int INT_30=96;
    public static final int INT_31=97;
    public static final int NINTH=195;
    public static final int INT_32=98;
    public static final int INT=281;
    public static final int INT_37=103;
    public static final int INT_38=104;
    public static final int NINETEENTH=205;
    public static final int INT_39=105;
    public static final int INT_33=99;
    public static final int INT_34=100;
    public static final int TOMORROW=32;
    public static final int INT_35=101;
    public static final int AUTUMN=275;
    public static final int INT_36=102;
    public static final int OF=226;
    public static final int HOLIDAY=463;
    public static final int HALLOWEEN=254;
    public static final int RECURRENCE=462;
    public static final int SUMMER=277;
    public static final int WEEK=27;
    public static final int NINETEEN=184;
    public static final int SIXTEENTH=202;
    public static final int APRIL=8;
    public static final int ON=225;
    public static final int INT_9=75;
    public static final int INT_8=74;
    public static final int OR=221;
    public static final int TODAY=31;
    public static final int CST=52;
    public static final int RELATIVE_TIME=455;
    public static final int DIRECTION=450;
    public static final int INT_1=67;
    public static final int INT_40=106;
    public static final int SLASH=215;
    public static final int INT_0=66;
    public static final int INT_41=107;
    public static final int INT_3=69;
    public static final int INT_42=108;
    public static final int INT_2=68;
    public static final int INT_43=109;
    public static final int UNTIL=36;
    public static final int INT_5=71;
    public static final int INT_4=70;
    public static final int INT_7=73;
    public static final int FOURTH=190;
    public static final int INT_6=72;
    public static final int INT_48=114;
    public static final int INT_49=115;
    public static final int TENTH=196;
    public static final int BEFORE=236;
    public static final int INT_44=110;
    public static final int INT_45=111;
    public static final int INT_46=112;
    public static final int INT_47=113;
    public static final int SECOND=188;
    public static final int UNKNOWN=279;
    public static final int TEN=175;
    public static final int PM=41;

    // delegates
    // delegators


        public TreeRewrite(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public TreeRewrite(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return TreeRewrite.tokenNames; }
    public String getGrammarFileName() { return "com/joestelmach/natty/generated/TreeRewrite.g"; }


      private java.util.logging.Logger _logger = java.util.logging.Logger.getLogger("com.joestelmach.natty");
      
      public void displayRecognitionError(String[] tokenNames, RecognitionException re) {
        String message = getErrorHeader(re);
        try { message += getErrorMessage(re, tokenNames); } catch(Exception e) {}
        _logger.fine(message);
      }


    public static class topdown_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topdown"
    // com/joestelmach/natty/generated/TreeRewrite.g:22:1: topdown : ( ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK INT ) ^( DAY_OF_WEEK dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH INT ) ^( DAY_OF_MONTH dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) ^( MONTH_OF_YEAR dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) amount= INT ^( MONTH_OF_YEAR dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY $amount ^( MONTH_OF_YEAR $dow) ) | ^( RELATIVE_DATE ^( SEEK dir= DIRECTION seekby= SEEK_BY day= INT ^( MONTH_OF_YEAR month= INT ) ) ^( EXPLICIT_SEEK amount= INT ^( DAY_OF_WEEK dow= INT ) ) ^( EXPLICIT_SEEK ^( YEAR_OF year= INT ) ) ) -> ^( RELATIVE_DATE ^( SEEK $dir $seekby $day ^( MONTH_OF_YEAR $month) ) ^( EXPLICIT_SEEK ^( YEAR_OF $year) ) ^( EXPLICIT_SEEK $amount ^( DAY_OF_WEEK $dow) ) ) );
    public final TreeRewrite.topdown_return topdown() throws RecognitionException {
        TreeRewrite.topdown_return retval = new TreeRewrite.topdown_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree dow=null;
        CommonTree amount=null;
        CommonTree dir=null;
        CommonTree seekby=null;
        CommonTree day=null;
        CommonTree month=null;
        CommonTree year=null;
        CommonTree SEEK1=null;
        CommonTree DIRECTION2=null;
        CommonTree SEEK_BY3=null;
        CommonTree INT4=null;
        CommonTree DAY_OF_WEEK5=null;
        CommonTree INT6=null;
        CommonTree DAY_OF_WEEK7=null;
        CommonTree SEEK8=null;
        CommonTree DIRECTION9=null;
        CommonTree SEEK_BY10=null;
        CommonTree INT11=null;
        CommonTree DAY_OF_MONTH12=null;
        CommonTree INT13=null;
        CommonTree DAY_OF_MONTH14=null;
        CommonTree SEEK15=null;
        CommonTree DIRECTION16=null;
        CommonTree SEEK_BY17=null;
        CommonTree INT18=null;
        CommonTree MONTH_OF_YEAR19=null;
        CommonTree INT20=null;
        CommonTree MONTH_OF_YEAR21=null;
        CommonTree SEEK22=null;
        CommonTree DIRECTION23=null;
        CommonTree SEEK_BY24=null;
        CommonTree INT25=null;
        CommonTree MONTH_OF_YEAR26=null;
        CommonTree INT27=null;
        CommonTree MONTH_OF_YEAR28=null;
        CommonTree RELATIVE_DATE29=null;
        CommonTree SEEK30=null;
        CommonTree MONTH_OF_YEAR31=null;
        CommonTree EXPLICIT_SEEK32=null;
        CommonTree DAY_OF_WEEK33=null;
        CommonTree EXPLICIT_SEEK34=null;
        CommonTree YEAR_OF35=null;

        CommonTree dow_tree=null;
        CommonTree amount_tree=null;
        CommonTree dir_tree=null;
        CommonTree seekby_tree=null;
        CommonTree day_tree=null;
        CommonTree month_tree=null;
        CommonTree year_tree=null;
        CommonTree SEEK1_tree=null;
        CommonTree DIRECTION2_tree=null;
        CommonTree SEEK_BY3_tree=null;
        CommonTree INT4_tree=null;
        CommonTree DAY_OF_WEEK5_tree=null;
        CommonTree INT6_tree=null;
        CommonTree DAY_OF_WEEK7_tree=null;
        CommonTree SEEK8_tree=null;
        CommonTree DIRECTION9_tree=null;
        CommonTree SEEK_BY10_tree=null;
        CommonTree INT11_tree=null;
        CommonTree DAY_OF_MONTH12_tree=null;
        CommonTree INT13_tree=null;
        CommonTree DAY_OF_MONTH14_tree=null;
        CommonTree SEEK15_tree=null;
        CommonTree DIRECTION16_tree=null;
        CommonTree SEEK_BY17_tree=null;
        CommonTree INT18_tree=null;
        CommonTree MONTH_OF_YEAR19_tree=null;
        CommonTree INT20_tree=null;
        CommonTree MONTH_OF_YEAR21_tree=null;
        CommonTree SEEK22_tree=null;
        CommonTree DIRECTION23_tree=null;
        CommonTree SEEK_BY24_tree=null;
        CommonTree INT25_tree=null;
        CommonTree MONTH_OF_YEAR26_tree=null;
        CommonTree INT27_tree=null;
        CommonTree MONTH_OF_YEAR28_tree=null;
        CommonTree RELATIVE_DATE29_tree=null;
        CommonTree SEEK30_tree=null;
        CommonTree MONTH_OF_YEAR31_tree=null;
        CommonTree EXPLICIT_SEEK32_tree=null;
        CommonTree DAY_OF_WEEK33_tree=null;
        CommonTree EXPLICIT_SEEK34_tree=null;
        CommonTree YEAR_OF35_tree=null;
        RewriteRuleNodeStream stream_MONTH_OF_YEAR=new RewriteRuleNodeStream(adaptor,"token MONTH_OF_YEAR");
        RewriteRuleNodeStream stream_DAY_OF_MONTH=new RewriteRuleNodeStream(adaptor,"token DAY_OF_MONTH");
        RewriteRuleNodeStream stream_DIRECTION=new RewriteRuleNodeStream(adaptor,"token DIRECTION");
        RewriteRuleNodeStream stream_YEAR_OF=new RewriteRuleNodeStream(adaptor,"token YEAR_OF");
        RewriteRuleNodeStream stream_DAY_OF_WEEK=new RewriteRuleNodeStream(adaptor,"token DAY_OF_WEEK");
        RewriteRuleNodeStream stream_EXPLICIT_SEEK=new RewriteRuleNodeStream(adaptor,"token EXPLICIT_SEEK");
        RewriteRuleNodeStream stream_SEEK_BY=new RewriteRuleNodeStream(adaptor,"token SEEK_BY");
        RewriteRuleNodeStream stream_SEEK=new RewriteRuleNodeStream(adaptor,"token SEEK");
        RewriteRuleNodeStream stream_INT=new RewriteRuleNodeStream(adaptor,"token INT");
        RewriteRuleNodeStream stream_RELATIVE_DATE=new RewriteRuleNodeStream(adaptor,"token RELATIVE_DATE");

        try {
            // com/joestelmach/natty/generated/TreeRewrite.g:23:3: ( ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK INT ) ^( DAY_OF_WEEK dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH INT ) ^( DAY_OF_MONTH dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) ^( MONTH_OF_YEAR dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) amount= INT ^( MONTH_OF_YEAR dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY $amount ^( MONTH_OF_YEAR $dow) ) | ^( RELATIVE_DATE ^( SEEK dir= DIRECTION seekby= SEEK_BY day= INT ^( MONTH_OF_YEAR month= INT ) ) ^( EXPLICIT_SEEK amount= INT ^( DAY_OF_WEEK dow= INT ) ) ^( EXPLICIT_SEEK ^( YEAR_OF year= INT ) ) ) -> ^( RELATIVE_DATE ^( SEEK $dir $seekby $day ^( MONTH_OF_YEAR $month) ) ^( EXPLICIT_SEEK ^( YEAR_OF $year) ) ^( EXPLICIT_SEEK $amount ^( DAY_OF_WEEK $dow) ) ) )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // com/joestelmach/natty/generated/TreeRewrite.g:23:5: ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK INT ) ^( DAY_OF_WEEK dow= INT ) )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    SEEK1=(CommonTree)match(input,SEEK,FOLLOW_SEEK_in_topdown60); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SEEK.add(SEEK1);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = SEEK1;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    DIRECTION2=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_topdown62); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DIRECTION.add(DIRECTION2);

                    _last = (CommonTree)input.LT(1);
                    SEEK_BY3=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_topdown64); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SEEK_BY.add(SEEK_BY3);

                    _last = (CommonTree)input.LT(1);
                    INT4=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown66); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(INT4);

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    DAY_OF_WEEK5=(CommonTree)match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_topdown69); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DAY_OF_WEEK.add(DAY_OF_WEEK5);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = DAY_OF_WEEK5;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    INT6=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown71); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(INT6);


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    DAY_OF_WEEK7=(CommonTree)match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_topdown75); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DAY_OF_WEEK.add(DAY_OF_WEEK7);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = DAY_OF_WEEK7;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    dow=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown79); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(dow);


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: SEEK_BY, DIRECTION, INT, DAY_OF_WEEK, SEEK, dow
                    // token labels: dow
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleNodeStream stream_dow=new RewriteRuleNodeStream(adaptor,"token dow",dow);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 24:7: -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK $dow) )
                    {
                        // com/joestelmach/natty/generated/TreeRewrite.g:24:10: ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK $dow) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SEEK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_DIRECTION.nextNode());
                        adaptor.addChild(root_1, stream_SEEK_BY.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());
                        // com/joestelmach/natty/generated/TreeRewrite.g:24:39: ^( DAY_OF_WEEK $dow)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_DAY_OF_WEEK.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_dow.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/TreeRewrite.g:26:5: ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH INT ) ^( DAY_OF_MONTH dow= INT ) )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    SEEK8=(CommonTree)match(input,SEEK,FOLLOW_SEEK_in_topdown120); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SEEK.add(SEEK8);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = SEEK8;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    DIRECTION9=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_topdown122); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DIRECTION.add(DIRECTION9);

                    _last = (CommonTree)input.LT(1);
                    SEEK_BY10=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_topdown124); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SEEK_BY.add(SEEK_BY10);

                    _last = (CommonTree)input.LT(1);
                    INT11=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown126); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(INT11);

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    DAY_OF_MONTH12=(CommonTree)match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_topdown129); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DAY_OF_MONTH.add(DAY_OF_MONTH12);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = DAY_OF_MONTH12;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    INT13=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown131); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(INT13);


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    DAY_OF_MONTH14=(CommonTree)match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_topdown135); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DAY_OF_MONTH.add(DAY_OF_MONTH14);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = DAY_OF_MONTH14;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    dow=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown139); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(dow);


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: DIRECTION, SEEK_BY, INT, SEEK, DAY_OF_MONTH, dow
                    // token labels: dow
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleNodeStream stream_dow=new RewriteRuleNodeStream(adaptor,"token dow",dow);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 27:7: -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH $dow) )
                    {
                        // com/joestelmach/natty/generated/TreeRewrite.g:27:10: ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH $dow) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SEEK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_DIRECTION.nextNode());
                        adaptor.addChild(root_1, stream_SEEK_BY.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());
                        // com/joestelmach/natty/generated/TreeRewrite.g:27:39: ^( DAY_OF_MONTH $dow)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_DAY_OF_MONTH.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_dow.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/TreeRewrite.g:29:5: ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) ^( MONTH_OF_YEAR dow= INT ) )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    SEEK15=(CommonTree)match(input,SEEK,FOLLOW_SEEK_in_topdown180); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SEEK.add(SEEK15);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = SEEK15;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    DIRECTION16=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_topdown182); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DIRECTION.add(DIRECTION16);

                    _last = (CommonTree)input.LT(1);
                    SEEK_BY17=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_topdown184); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SEEK_BY.add(SEEK_BY17);

                    _last = (CommonTree)input.LT(1);
                    INT18=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown186); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(INT18);

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    MONTH_OF_YEAR19=(CommonTree)match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_topdown189); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_MONTH_OF_YEAR.add(MONTH_OF_YEAR19);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = MONTH_OF_YEAR19;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    INT20=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown191); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(INT20);


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    MONTH_OF_YEAR21=(CommonTree)match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_topdown195); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_MONTH_OF_YEAR.add(MONTH_OF_YEAR21);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = MONTH_OF_YEAR21;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    dow=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown199); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(dow);


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: MONTH_OF_YEAR, SEEK_BY, dow, INT, SEEK, DIRECTION
                    // token labels: dow
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleNodeStream stream_dow=new RewriteRuleNodeStream(adaptor,"token dow",dow);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 30:7: -> ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR $dow) )
                    {
                        // com/joestelmach/natty/generated/TreeRewrite.g:30:10: ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR $dow) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SEEK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_DIRECTION.nextNode());
                        adaptor.addChild(root_1, stream_SEEK_BY.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());
                        // com/joestelmach/natty/generated/TreeRewrite.g:30:39: ^( MONTH_OF_YEAR $dow)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_MONTH_OF_YEAR.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_dow.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 4 :
                    // com/joestelmach/natty/generated/TreeRewrite.g:32:5: ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) amount= INT ^( MONTH_OF_YEAR dow= INT ) )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    SEEK22=(CommonTree)match(input,SEEK,FOLLOW_SEEK_in_topdown240); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SEEK.add(SEEK22);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = SEEK22;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    DIRECTION23=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_topdown242); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DIRECTION.add(DIRECTION23);

                    _last = (CommonTree)input.LT(1);
                    SEEK_BY24=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_topdown244); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SEEK_BY.add(SEEK_BY24);

                    _last = (CommonTree)input.LT(1);
                    INT25=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown246); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(INT25);

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    MONTH_OF_YEAR26=(CommonTree)match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_topdown249); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_MONTH_OF_YEAR.add(MONTH_OF_YEAR26);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = MONTH_OF_YEAR26;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    INT27=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown251); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(INT27);


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown256); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(amount);

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    MONTH_OF_YEAR28=(CommonTree)match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_topdown259); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_MONTH_OF_YEAR.add(MONTH_OF_YEAR28);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = MONTH_OF_YEAR28;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    dow=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown263); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(dow);


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: MONTH_OF_YEAR, dow, SEEK_BY, SEEK, DIRECTION, amount
                    // token labels: amount, dow
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleNodeStream stream_amount=new RewriteRuleNodeStream(adaptor,"token amount",amount);
                    RewriteRuleNodeStream stream_dow=new RewriteRuleNodeStream(adaptor,"token dow",dow);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 33:7: -> ^( SEEK DIRECTION SEEK_BY $amount ^( MONTH_OF_YEAR $dow) )
                    {
                        // com/joestelmach/natty/generated/TreeRewrite.g:33:10: ^( SEEK DIRECTION SEEK_BY $amount ^( MONTH_OF_YEAR $dow) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SEEK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_DIRECTION.nextNode());
                        adaptor.addChild(root_1, stream_SEEK_BY.nextNode());
                        adaptor.addChild(root_1, stream_amount.nextNode());
                        // com/joestelmach/natty/generated/TreeRewrite.g:33:43: ^( MONTH_OF_YEAR $dow)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_MONTH_OF_YEAR.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_dow.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 5 :
                    // com/joestelmach/natty/generated/TreeRewrite.g:37:5: ^( RELATIVE_DATE ^( SEEK dir= DIRECTION seekby= SEEK_BY day= INT ^( MONTH_OF_YEAR month= INT ) ) ^( EXPLICIT_SEEK amount= INT ^( DAY_OF_WEEK dow= INT ) ) ^( EXPLICIT_SEEK ^( YEAR_OF year= INT ) ) )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE_DATE29=(CommonTree)match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_topdown303); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE_DATE.add(RELATIVE_DATE29);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = RELATIVE_DATE29;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    SEEK30=(CommonTree)match(input,SEEK,FOLLOW_SEEK_in_topdown306); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SEEK.add(SEEK30);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = SEEK30;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    dir=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_topdown310); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DIRECTION.add(dir);

                    _last = (CommonTree)input.LT(1);
                    seekby=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_topdown314); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SEEK_BY.add(seekby);

                    _last = (CommonTree)input.LT(1);
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown318); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(day);

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_3 = _last;
                    CommonTree _first_3 = null;
                    _last = (CommonTree)input.LT(1);
                    MONTH_OF_YEAR31=(CommonTree)match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_topdown321); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_MONTH_OF_YEAR.add(MONTH_OF_YEAR31);


                    if ( state.backtracking==1 )
                    if ( _first_2==null ) _first_2 = MONTH_OF_YEAR31;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown325); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(month);


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_3;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    EXPLICIT_SEEK32=(CommonTree)match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_topdown336); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_EXPLICIT_SEEK.add(EXPLICIT_SEEK32);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = EXPLICIT_SEEK32;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown340); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(amount);

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_3 = _last;
                    CommonTree _first_3 = null;
                    _last = (CommonTree)input.LT(1);
                    DAY_OF_WEEK33=(CommonTree)match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_topdown343); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DAY_OF_WEEK.add(DAY_OF_WEEK33);


                    if ( state.backtracking==1 )
                    if ( _first_2==null ) _first_2 = DAY_OF_WEEK33;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    dow=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown347); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(dow);


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_3;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    EXPLICIT_SEEK34=(CommonTree)match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_topdown358); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_EXPLICIT_SEEK.add(EXPLICIT_SEEK34);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = EXPLICIT_SEEK34;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_3 = _last;
                    CommonTree _first_3 = null;
                    _last = (CommonTree)input.LT(1);
                    YEAR_OF35=(CommonTree)match(input,YEAR_OF,FOLLOW_YEAR_OF_in_topdown361); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_YEAR_OF.add(YEAR_OF35);


                    if ( state.backtracking==1 )
                    if ( _first_2==null ) _first_2 = YEAR_OF35;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    year=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown365); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_INT.add(year);


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_3;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: DAY_OF_WEEK, year, dow, RELATIVE_DATE, month, day, YEAR_OF, seekby, amount, EXPLICIT_SEEK, EXPLICIT_SEEK, SEEK, MONTH_OF_YEAR, dir
                    // token labels: amount, seekby, month, year, dir, dow, day
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleNodeStream stream_amount=new RewriteRuleNodeStream(adaptor,"token amount",amount);
                    RewriteRuleNodeStream stream_seekby=new RewriteRuleNodeStream(adaptor,"token seekby",seekby);
                    RewriteRuleNodeStream stream_month=new RewriteRuleNodeStream(adaptor,"token month",month);
                    RewriteRuleNodeStream stream_year=new RewriteRuleNodeStream(adaptor,"token year",year);
                    RewriteRuleNodeStream stream_dir=new RewriteRuleNodeStream(adaptor,"token dir",dir);
                    RewriteRuleNodeStream stream_dow=new RewriteRuleNodeStream(adaptor,"token dow",dow);
                    RewriteRuleNodeStream stream_day=new RewriteRuleNodeStream(adaptor,"token day",day);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 42:5: -> ^( RELATIVE_DATE ^( SEEK $dir $seekby $day ^( MONTH_OF_YEAR $month) ) ^( EXPLICIT_SEEK ^( YEAR_OF $year) ) ^( EXPLICIT_SEEK $amount ^( DAY_OF_WEEK $dow) ) )
                    {
                        // com/joestelmach/natty/generated/TreeRewrite.g:42:8: ^( RELATIVE_DATE ^( SEEK $dir $seekby $day ^( MONTH_OF_YEAR $month) ) ^( EXPLICIT_SEEK ^( YEAR_OF $year) ) ^( EXPLICIT_SEEK $amount ^( DAY_OF_WEEK $dow) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_RELATIVE_DATE.nextNode(), root_1);

                        // com/joestelmach/natty/generated/TreeRewrite.g:42:24: ^( SEEK $dir $seekby $day ^( MONTH_OF_YEAR $month) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_SEEK.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_dir.nextNode());
                        adaptor.addChild(root_2, stream_seekby.nextNode());
                        adaptor.addChild(root_2, stream_day.nextNode());
                        // com/joestelmach/natty/generated/TreeRewrite.g:42:49: ^( MONTH_OF_YEAR $month)
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot(stream_MONTH_OF_YEAR.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_month.nextNode());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // com/joestelmach/natty/generated/TreeRewrite.g:43:8: ^( EXPLICIT_SEEK ^( YEAR_OF $year) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_EXPLICIT_SEEK.nextNode(), root_2);

                        // com/joestelmach/natty/generated/TreeRewrite.g:43:24: ^( YEAR_OF $year)
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot(stream_YEAR_OF.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_year.nextNode());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // com/joestelmach/natty/generated/TreeRewrite.g:44:8: ^( EXPLICIT_SEEK $amount ^( DAY_OF_WEEK $dow) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_EXPLICIT_SEEK.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_amount.nextNode());
                        // com/joestelmach/natty/generated/TreeRewrite.g:44:32: ^( DAY_OF_WEEK $dow)
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot(stream_DAY_OF_WEEK.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_dow.nextNode());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "topdown"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\17\uffff";
    static final String DFA1_eofS =
        "\17\uffff";
    static final String DFA1_minS =
        "\1\u01c0\1\2\1\uffff\1\u01c2\1\u01c3\1\u0119\1\u01b8\2\uffff\1\2"+
        "\1\u0119\1\3\1\u0119\2\uffff";
    static final String DFA1_maxS =
        "\1\u01c1\1\2\1\uffff\1\u01c2\1\u01c3\1\u0119\1\u01ba\2\uffff\1\2"+
        "\1\u0119\1\3\1\u01b8\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\5\4\uffff\1\1\1\2\4\uffff\1\3\1\4";
    static final String DFA1_specialS =
        "\17\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\1",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\11\1\10\1\7",
            "",
            "",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\16\u009e\uffff\1\15",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "22:1: topdown : ( ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK INT ) ^( DAY_OF_WEEK dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH INT ) ^( DAY_OF_MONTH dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) ^( MONTH_OF_YEAR dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) amount= INT ^( MONTH_OF_YEAR dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY $amount ^( MONTH_OF_YEAR $dow) ) | ^( RELATIVE_DATE ^( SEEK dir= DIRECTION seekby= SEEK_BY day= INT ^( MONTH_OF_YEAR month= INT ) ) ^( EXPLICIT_SEEK amount= INT ^( DAY_OF_WEEK dow= INT ) ) ^( EXPLICIT_SEEK ^( YEAR_OF year= INT ) ) ) -> ^( RELATIVE_DATE ^( SEEK $dir $seekby $day ^( MONTH_OF_YEAR $month) ) ^( EXPLICIT_SEEK ^( YEAR_OF $year) ) ^( EXPLICIT_SEEK $amount ^( DAY_OF_WEEK $dow) ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_SEEK_in_topdown60 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_topdown62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_BY_in_topdown64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_topdown66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_topdown69 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_topdown71 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_topdown75 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_topdown79 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_topdown120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_topdown122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_BY_in_topdown124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_topdown126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_topdown129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_topdown131 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_topdown135 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_topdown139 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_topdown180 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_topdown182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_BY_in_topdown184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_topdown186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_topdown189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_topdown191 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_topdown195 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_topdown199 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_topdown240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_topdown242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_BY_in_topdown244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_topdown246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_topdown249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_topdown251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_topdown256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_topdown259 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_topdown263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_topdown303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SEEK_in_topdown306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_topdown310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_BY_in_topdown314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_topdown318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_topdown321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_topdown325 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_SEEK_in_topdown336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_topdown340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_topdown343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_topdown347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_SEEK_in_topdown358 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_YEAR_OF_in_topdown361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_topdown365 = new BitSet(new long[]{0x0000000000000008L});

}