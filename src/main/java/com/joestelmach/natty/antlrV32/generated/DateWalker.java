// $ANTLR 3.2 Sep 23, 2009 14:05:07 com/joestelmach/natty/generated/DateWalker.g 2014-09-18 18:35:13
 package com.joestelmach.natty.antlrV32.generated;

//import org.antlr.runtime.*;
import com.joestelmach.natty.antlrV32.WalkerState;
import org.antlr.v32.runtime.*;
import org.antlr.v32.runtime.tree.*;
//import org.antlr.runtime.tree.*;


public class DateWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOT", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "HOUR", "MINUTE", "DAY", "WEEK", "MONTH", "SINGLE_QUOTE", "YEAR", "TODAY", "TOMORROW", "TONIGHT", "YESTERDAY", "EVERY", "UNTIL", "AT", "AFTER", "PAST", "AM", "PM", "T", "MILITARY_HOUR_SUFFIX", "MIDNIGHT", "NOON", "MORNING", "EVENING", "NIGHT", "UTC", "EST", "PST", "CST", "MST", "AKST", "HAST", "INT_00", "INT_01", "INT_02", "INT_03", "INT_04", "INT_05", "INT_06", "INT_07", "INT_08", "INT_09", "INT_0", "INT_1", "INT_2", "INT_3", "INT_4", "INT_5", "INT_6", "INT_7", "INT_8", "INT_9", "INT_10", "INT_11", "INT_12", "INT_13", "INT_14", "INT_15", "INT_16", "INT_17", "INT_18", "INT_19", "INT_20", "INT_21", "INT_22", "INT_23", "INT_24", "INT_25", "INT_26", "INT_27", "INT_28", "INT_29", "INT_30", "INT_31", "INT_32", "INT_33", "INT_34", "INT_35", "INT_36", "INT_37", "INT_38", "INT_39", "INT_40", "INT_41", "INT_42", "INT_43", "INT_44", "INT_45", "INT_46", "INT_47", "INT_48", "INT_49", "INT_50", "INT_51", "INT_52", "INT_53", "INT_54", "INT_55", "INT_56", "INT_57", "INT_58", "INT_59", "INT_60", "INT_61", "INT_62", "INT_63", "INT_64", "INT_65", "INT_66", "INT_67", "INT_68", "INT_69", "INT_70", "INT_71", "INT_72", "INT_73", "INT_74", "INT_75", "INT_76", "INT_77", "INT_78", "INT_79", "INT_80", "INT_81", "INT_82", "INT_83", "INT_84", "INT_85", "INT_86", "INT_87", "INT_88", "INT_89", "INT_90", "INT_91", "INT_92", "INT_93", "INT_94", "INT_95", "INT_96", "INT_97", "INT_98", "INT_99", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "THIRTIETH", "ST", "ND", "RD", "TH", "COLON", "COMMA", "DASH", "SLASH", "PLUS", "FOR", "IN", "AN", "THE", "OR", "AND", "TO", "THROUGH", "ON", "OF", "THIS", "THAT", "LAST", "NEXT", "COMING", "UPCOMING", "FROM", "NOW", "AGO", "BEFORE", "BEGINNING", "START", "END", "SPACE", "WHITE_SPACE", "FOOL", "BLACK", "CHRISTMAS", "COLUMBUS", "EARTH", "EASTER", "FATHER", "FLAG", "GOOD", "GROUND", "HOG", "GROUNDHOG", "HALLOWEEN", "INAUGURATION", "INDEPENDENCE", "KWANZAA", "LABOR", "MLK", "MEMORIAL", "MOTHER", "NEW", "PALM", "PATRIOT", "PRESIDENT", "PATRICK", "SAINT", "TAX", "THANKSGIVING", "ELECTION", "VALENTINE", "VETERAN", "WINTER", "FALL", "AUTUMN", "SPRING", "SUMMER", "UNKNOWN_CHAR", "UNKNOWN", "DIGIT", "INT", "MONTH_OF_YEAR", "DAY_OF_MONTH", "DAY_OF_WEEK", "DAY_OF_YEAR", "YEAR_OF", "DATE_TIME", "DATE_TIME_ALTERNATIVE", "EXPLICIT_DATE", "RELATIVE_DATE", "SEEK", "DIRECTION", "SEEK_BY", "EXPLICIT_SEEK", "SPAN", "EXPLICIT_TIME", "RELATIVE_TIME", "HOURS_OF_DAY", "MINUTES_OF_HOUR", "SECONDS_OF_MINUTE", "AM_PM", "ZONE", "ZONE_OFFSET", "RECURRENCE", "HOLIDAY", "SEASON", "WEEK_INDEX"
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
    public static final int WEEK_INDEX=465;
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


        public DateWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public DateWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return DateWalker.tokenNames; }
    public String getGrammarFileName() { return "com/joestelmach/natty/antlrV32/generated/DateWalker.g"; }


      private WalkerState _walkerState = new WalkerState();
      private java.util.logging.Logger _logger = java.util.logging.Logger.getLogger("com.joestelmach.natty");
      
      public void displayRecognitionError(String[] tokenNames, RecognitionException re) {
        String message = getErrorHeader(re);
        try { message += getErrorMessage(re, tokenNames); } catch(Exception e) {}
        _logger.fine(message);
      }
      
      public void recover(IntStream input, RecognitionException re) {
        reportError(re);
        _walkerState.clearDateGroup();
      }
      
      public WalkerState getState() {
        return _walkerState;
      }



    // $ANTLR start "parse"
    // com/joestelmach/natty/spark/DateWalker.g:30:1: parse : date_time_alternative ( recurrence )? ;
    public final void parse() throws RecognitionException {
        try {
            // com/joestelmach/natty/spark/DateWalker.g:31:3: ( date_time_alternative ( recurrence )? )
            // com/joestelmach/natty/spark/DateWalker.g:31:5: date_time_alternative ( recurrence )?
            {
            pushFollow(FOLLOW_date_time_alternative_in_parse45);
            date_time_alternative();

            state._fsp--;

            // com/joestelmach/natty/spark/DateWalker.g:31:27: ( recurrence )?
            int alt1=2;
            switch ( input.LA(1) ) {
                case RECURRENCE:
                    {
                    alt1=1;
                    }
                    break;
            }

            switch (alt1) {
                case 1 :
                    // com/joestelmach/natty/spark/DateWalker.g:31:27: recurrence
                    {
                    pushFollow(FOLLOW_recurrence_in_parse47);
                    recurrence();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "parse"


    // $ANTLR start "recurrence"
    // com/joestelmach/natty/spark/DateWalker.g:34:1: recurrence : ^( RECURRENCE ( date_time )? ) ;
    public final void recurrence() throws RecognitionException {
         
            _walkerState.setRecurring();
          
        try {
            // com/joestelmach/natty/spark/DateWalker.g:38:3: ( ^( RECURRENCE ( date_time )? ) )
            // com/joestelmach/natty/spark/DateWalker.g:38:5: ^( RECURRENCE ( date_time )? )
            {
            match(input,RECURRENCE,FOLLOW_RECURRENCE_in_recurrence71); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com/joestelmach/natty/spark/DateWalker.g:38:18: ( date_time )?
                int alt2=2;
                switch ( input.LA(1) ) {
                    case DATE_TIME:
                        {
                        alt2=1;
                        }
                        break;
                }

                switch (alt2) {
                    case 1 :
                        // com/joestelmach/natty/spark/DateWalker.g:38:18: date_time
                        {
                        pushFollow(FOLLOW_date_time_in_recurrence73);
                        date_time();

                        state._fsp--;


                        }
                        break;

                }

                 _walkerState.captureDateTime(); 

                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "recurrence"


    // $ANTLR start "date_time_alternative"
    // com/joestelmach/natty/spark/DateWalker.g:41:1: date_time_alternative : ^( DATE_TIME_ALTERNATIVE ( date_time )+ ) ;
    public final void date_time_alternative() throws RecognitionException {
        try {
            // com/joestelmach/natty/spark/DateWalker.g:42:3: ( ^( DATE_TIME_ALTERNATIVE ( date_time )+ ) )
            // com/joestelmach/natty/spark/DateWalker.g:42:5: ^( DATE_TIME_ALTERNATIVE ( date_time )+ )
            {
            match(input,DATE_TIME_ALTERNATIVE,FOLLOW_DATE_TIME_ALTERNATIVE_in_date_time_alternative92); 

            match(input, Token.DOWN, null); 
            // com/joestelmach/natty/spark/DateWalker.g:42:29: ( date_time )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case DATE_TIME:
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // com/joestelmach/natty/spark/DateWalker.g:42:29: date_time
            	    {
            	    pushFollow(FOLLOW_date_time_in_date_time_alternative94);
            	    date_time();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "date_time_alternative"


    // $ANTLR start "date_time"
    // com/joestelmach/natty/spark/DateWalker.g:45:1: date_time : ^( DATE_TIME ( date )? ( time )? ) ;
    public final void date_time() throws RecognitionException {
        try {
            // com/joestelmach/natty/spark/DateWalker.g:49:3: ( ^( DATE_TIME ( date )? ( time )? ) )
            // com/joestelmach/natty/spark/DateWalker.g:49:5: ^( DATE_TIME ( date )? ( time )? )
            {
            match(input,DATE_TIME,FOLLOW_DATE_TIME_in_date_time117); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com/joestelmach/natty/spark/DateWalker.g:49:17: ( date )?
                int alt4=2;
                switch ( input.LA(1) ) {
                    case EXPLICIT_DATE:
                    case RELATIVE_DATE:
                        {
                        alt4=1;
                        }
                        break;
                }

                switch (alt4) {
                    case 1 :
                        // com/joestelmach/natty/spark/DateWalker.g:49:17: date
                        {
                        pushFollow(FOLLOW_date_in_date_time119);
                        date();

                        state._fsp--;


                        }
                        break;

                }

                // com/joestelmach/natty/spark/DateWalker.g:49:23: ( time )?
                int alt5=2;
                switch ( input.LA(1) ) {
                    case EXPLICIT_TIME:
                    case RELATIVE_TIME:
                        {
                        alt5=1;
                        }
                        break;
                }

                switch (alt5) {
                    case 1 :
                        // com/joestelmach/natty/spark/DateWalker.g:49:23: time
                        {
                        pushFollow(FOLLOW_time_in_date_time122);
                        time();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }


                _walkerState.captureDateTime(); 
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "date_time"


    // $ANTLR start "date"
    // com/joestelmach/natty/spark/DateWalker.g:52:1: date : ( relative_date | explicit_date );
    public final void date() throws RecognitionException {
        try {
            // com/joestelmach/natty/spark/DateWalker.g:53:3: ( relative_date | explicit_date )
            int alt6=2;
            switch ( input.LA(1) ) {
            case RELATIVE_DATE:
                {
                alt6=1;
                }
                break;
            case EXPLICIT_DATE:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // com/joestelmach/natty/spark/DateWalker.g:53:5: relative_date
                    {
                    pushFollow(FOLLOW_relative_date_in_date141);
                    relative_date();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/spark/DateWalker.g:54:5: explicit_date
                    {
                    pushFollow(FOLLOW_explicit_date_in_date148);
                    explicit_date();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "date"


    // $ANTLR start "relative_date"
    // com/joestelmach/natty/spark/DateWalker.g:57:1: relative_date : ^( RELATIVE_DATE ( seek )? ( explicit_seek )* ) ;
    public final void relative_date() throws RecognitionException {
        try {
            // com/joestelmach/natty/spark/DateWalker.g:58:3: ( ^( RELATIVE_DATE ( seek )? ( explicit_seek )* ) )
            // com/joestelmach/natty/spark/DateWalker.g:58:5: ^( RELATIVE_DATE ( seek )? ( explicit_seek )* )
            {
            match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date164); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com/joestelmach/natty/spark/DateWalker.g:58:21: ( seek )?
                int alt7=2;
                switch ( input.LA(1) ) {
                    case SEEK:
                        {
                        alt7=1;
                        }
                        break;
                }

                switch (alt7) {
                    case 1 :
                        // com/joestelmach/natty/spark/DateWalker.g:58:21: seek
                        {
                        pushFollow(FOLLOW_seek_in_relative_date166);
                        seek();

                        state._fsp--;


                        }
                        break;

                }

                // com/joestelmach/natty/spark/DateWalker.g:58:27: ( explicit_seek )*
                loop8:
                do {
                    int alt8=2;
                    switch ( input.LA(1) ) {
                    case EXPLICIT_SEEK:
                        {
                        alt8=1;
                        }
                        break;

                    }

                    switch (alt8) {
                	case 1 :
                	    // com/joestelmach/natty/spark/DateWalker.g:58:27: explicit_seek
                	    {
                	    pushFollow(FOLLOW_explicit_seek_in_relative_date169);
                	    explicit_seek();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop8;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relative_date"


    // $ANTLR start "week_index"
    // com/joestelmach/natty/spark/DateWalker.g:61:1: week_index : ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ) ;
    public final void week_index() throws RecognitionException {
        CommonTree index=null;
        CommonTree day=null;

        try {
            // com/joestelmach/natty/spark/DateWalker.g:62:3: ( ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ) )
            // com/joestelmach/natty/spark/DateWalker.g:62:5: ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) )
            {
            match(input,WEEK_INDEX,FOLLOW_WEEK_INDEX_in_week_index187); 

            match(input, Token.DOWN, null); 
            index=(CommonTree)match(input,INT,FOLLOW_INT_in_week_index191); 
            match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_week_index194); 

            match(input, Token.DOWN, null); 
            day=(CommonTree)match(input,INT,FOLLOW_INT_in_week_index198); 

            match(input, Token.UP, null); 

            match(input, Token.UP, null); 
            _walkerState.setDayOfWeekIndex((index!=null?index.getText():null), (day!=null?day.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "week_index"


    // $ANTLR start "explicit_date"
    // com/joestelmach/natty/spark/DateWalker.g:66:1: explicit_date : ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH dom= INT ) ( ^( DAY_OF_WEEK dow= INT ) )? ( ^( YEAR_OF year= INT ) )? ) ;
    public final void explicit_date() throws RecognitionException {
        CommonTree month=null;
        CommonTree dom=null;
        CommonTree dow=null;
        CommonTree year=null;

        try {
            // com/joestelmach/natty/spark/DateWalker.g:67:3: ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH dom= INT ) ( ^( DAY_OF_WEEK dow= INT ) )? ( ^( YEAR_OF year= INT ) )? ) )
            // com/joestelmach/natty/spark/DateWalker.g:67:5: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH dom= INT ) ( ^( DAY_OF_WEEK dow= INT ) )? ( ^( YEAR_OF year= INT ) )? )
            {
            match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date222); 

            match(input, Token.DOWN, null); 
            match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date225); 

            match(input, Token.DOWN, null); 
            month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date229); 

            match(input, Token.UP, null); 
            match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date233); 

            match(input, Token.DOWN, null); 
            dom=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date237); 

            match(input, Token.UP, null); 
            // com/joestelmach/natty/spark/DateWalker.g:68:9: ( ^( DAY_OF_WEEK dow= INT ) )?
            int alt9=2;
            switch ( input.LA(1) ) {
                case DAY_OF_WEEK:
                    {
                    alt9=1;
                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // com/joestelmach/natty/spark/DateWalker.g:68:10: ^( DAY_OF_WEEK dow= INT )
                    {
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_explicit_date251); 

                    match(input, Token.DOWN, null); 
                    dow=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date255); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // com/joestelmach/natty/spark/DateWalker.g:68:35: ( ^( YEAR_OF year= INT ) )?
            int alt10=2;
            switch ( input.LA(1) ) {
                case YEAR_OF:
                    {
                    alt10=1;
                    }
                    break;
            }

            switch (alt10) {
                case 1 :
                    // com/joestelmach/natty/spark/DateWalker.g:68:36: ^( YEAR_OF year= INT )
                    {
                    match(input,YEAR_OF,FOLLOW_YEAR_OF_in_explicit_date262); 

                    match(input, Token.DOWN, null); 
                    year=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date266); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            _walkerState.setExplicitDate((month!=null?month.getText():null), (dom!=null?dom.getText():null), (dow!=null?dow.getText():null), (year!=null?year.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "explicit_date"


    // $ANTLR start "time"
    // com/joestelmach/natty/spark/DateWalker.g:72:1: time : ( explicit_time | relative_time );
    public final void time() throws RecognitionException {
        try {
            // com/joestelmach/natty/spark/DateWalker.g:73:3: ( explicit_time | relative_time )
            int alt11=2;
            switch ( input.LA(1) ) {
            case EXPLICIT_TIME:
                {
                alt11=1;
                }
                break;
            case RELATIVE_TIME:
                {
                alt11=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // com/joestelmach/natty/spark/DateWalker.g:73:5: explicit_time
                    {
                    pushFollow(FOLLOW_explicit_time_in_time291);
                    explicit_time();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/spark/DateWalker.g:74:5: relative_time
                    {
                    pushFollow(FOLLOW_relative_time_in_time297);
                    relative_time();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "time"


    // $ANTLR start "explicit_time"
    // com/joestelmach/natty/spark/DateWalker.g:77:1: explicit_time : ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( ^( SECONDS_OF_MINUTE seconds= INT ) )? ( AM_PM )? (zone= ZONE | zone= ZONE_OFFSET )? ) ;
    public final void explicit_time() throws RecognitionException {
        CommonTree hours=null;
        CommonTree minutes=null;
        CommonTree seconds=null;
        CommonTree zone=null;
        CommonTree AM_PM1=null;

        try {
            // com/joestelmach/natty/spark/DateWalker.g:78:3: ( ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( ^( SECONDS_OF_MINUTE seconds= INT ) )? ( AM_PM )? (zone= ZONE | zone= ZONE_OFFSET )? ) )
            // com/joestelmach/natty/spark/DateWalker.g:78:5: ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( ^( SECONDS_OF_MINUTE seconds= INT ) )? ( AM_PM )? (zone= ZONE | zone= ZONE_OFFSET )? )
            {
            match(input,EXPLICIT_TIME,FOLLOW_EXPLICIT_TIME_in_explicit_time313); 

            match(input, Token.DOWN, null); 
            match(input,HOURS_OF_DAY,FOLLOW_HOURS_OF_DAY_in_explicit_time316); 

            match(input, Token.DOWN, null); 
            hours=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_time320); 

            match(input, Token.UP, null); 
            match(input,MINUTES_OF_HOUR,FOLLOW_MINUTES_OF_HOUR_in_explicit_time324); 

            match(input, Token.DOWN, null); 
            minutes=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_time328); 

            match(input, Token.UP, null); 
            // com/joestelmach/natty/spark/DateWalker.g:79:9: ( ^( SECONDS_OF_MINUTE seconds= INT ) )?
            int alt12=2;
            switch ( input.LA(1) ) {
                case SECONDS_OF_MINUTE:
                    {
                    alt12=1;
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // com/joestelmach/natty/spark/DateWalker.g:79:10: ^( SECONDS_OF_MINUTE seconds= INT )
                    {
                    match(input,SECONDS_OF_MINUTE,FOLLOW_SECONDS_OF_MINUTE_in_explicit_time342); 

                    match(input, Token.DOWN, null); 
                    seconds=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_time346); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // com/joestelmach/natty/spark/DateWalker.g:79:45: ( AM_PM )?
            int alt13=2;
            switch ( input.LA(1) ) {
                case AM_PM:
                    {
                    alt13=1;
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // com/joestelmach/natty/spark/DateWalker.g:79:45: AM_PM
                    {
                    AM_PM1=(CommonTree)match(input,AM_PM,FOLLOW_AM_PM_in_explicit_time351); 

                    }
                    break;

            }

            // com/joestelmach/natty/spark/DateWalker.g:79:52: (zone= ZONE | zone= ZONE_OFFSET )?
            int alt14=3;
            switch ( input.LA(1) ) {
                case ZONE:
                    {
                    alt14=1;
                    }
                    break;
                case ZONE_OFFSET:
                    {
                    alt14=2;
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // com/joestelmach/natty/spark/DateWalker.g:79:53: zone= ZONE
                    {
                    zone=(CommonTree)match(input,ZONE,FOLLOW_ZONE_in_explicit_time357); 

                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/spark/DateWalker.g:79:65: zone= ZONE_OFFSET
                    {
                    zone=(CommonTree)match(input,ZONE_OFFSET,FOLLOW_ZONE_OFFSET_in_explicit_time363); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            _walkerState.setExplicitTime((hours!=null?hours.getText():null), (minutes!=null?minutes.getText():null), (seconds!=null?seconds.getText():null), (AM_PM1!=null?AM_PM1.getText():null), (zone!=null?zone.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "explicit_time"


    // $ANTLR start "relative_time"
    // com/joestelmach/natty/spark/DateWalker.g:83:1: relative_time : ^( RELATIVE_TIME seek ) ;
    public final void relative_time() throws RecognitionException {
        try {
            // com/joestelmach/natty/spark/DateWalker.g:84:3: ( ^( RELATIVE_TIME seek ) )
            // com/joestelmach/natty/spark/DateWalker.g:84:5: ^( RELATIVE_TIME seek )
            {
            match(input,RELATIVE_TIME,FOLLOW_RELATIVE_TIME_in_relative_time388); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_seek_in_relative_time390);
            seek();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relative_time"


    // $ANTLR start "seek"
    // com/joestelmach/natty/spark/DateWalker.g:87:1: seek : ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ( date )? ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY ( explicit_seek | relative_date )? INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) | ^( SEEK DIRECTION SEEK_BY INT HOLIDAY ) | ^( SEEK DIRECTION SEEK_BY INT SEASON ) );
    public final void seek() throws RecognitionException {
        CommonTree by=null;
        CommonTree amount=null;
        CommonTree day=null;
        CommonTree month=null;
        CommonTree DIRECTION2=null;
        CommonTree DIRECTION3=null;
        CommonTree DIRECTION4=null;
        CommonTree INT5=null;
        CommonTree SPAN6=null;
        CommonTree DIRECTION7=null;
        CommonTree INT8=null;
        CommonTree SEEK_BY9=null;
        CommonTree HOLIDAY10=null;
        CommonTree DIRECTION11=null;
        CommonTree INT12=null;
        CommonTree SEASON13=null;
        CommonTree DIRECTION14=null;
        CommonTree INT15=null;

        try {
            // com/joestelmach/natty/spark/DateWalker.g:88:3: ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ( date )? ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY ( explicit_seek | relative_date )? INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) | ^( SEEK DIRECTION SEEK_BY INT HOLIDAY ) | ^( SEEK DIRECTION SEEK_BY INT SEASON ) )
            int alt17=6;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // com/joestelmach/natty/spark/DateWalker.g:88:5: ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ( date )? )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek407); 

                    match(input, Token.DOWN, null); 
                    DIRECTION2=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek409); 
                    by=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek413); 
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek417); 
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_seek420); 

                    match(input, Token.DOWN, null); 
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_seek424); 

                    match(input, Token.UP, null); 
                    // com/joestelmach/natty/spark/DateWalker.g:88:68: ( date )?
                    int alt15=2;
                    switch ( input.LA(1) ) {
                        case EXPLICIT_DATE:
                        case RELATIVE_DATE:
                            {
                            alt15=1;
                            }
                            break;
                    }

                    switch (alt15) {
                        case 1 :
                            // com/joestelmach/natty/spark/DateWalker.g:88:68: date
                            {
                            pushFollow(FOLLOW_date_in_seek428);
                            date();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    _walkerState.seekToDayOfWeek((DIRECTION2!=null?DIRECTION2.getText():null), (by!=null?by.getText():null), (amount!=null?amount.getText():null), (day!=null?day.getText():null));

                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/spark/DateWalker.g:91:5: ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek448); 

                    match(input, Token.DOWN, null); 
                    DIRECTION3=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek450); 
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek452); 
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek456); 
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_seek459); 

                    match(input, Token.DOWN, null); 
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_seek463); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    _walkerState.seekToMonth((DIRECTION3!=null?DIRECTION3.getText():null), (amount!=null?amount.getText():null), (month!=null?month.getText():null));

                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/spark/DateWalker.g:94:5: ^( SEEK DIRECTION SEEK_BY ( explicit_seek | relative_date )? INT SPAN )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek481); 

                    match(input, Token.DOWN, null); 
                    DIRECTION4=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek483); 
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek485); 
                    // com/joestelmach/natty/spark/DateWalker.g:94:30: ( explicit_seek | relative_date )?
                    int alt16=3;
                    switch ( input.LA(1) ) {
                        case EXPLICIT_SEEK:
                            {
                            alt16=1;
                            }
                            break;
                        case RELATIVE_DATE:
                            {
                            alt16=2;
                            }
                            break;
                    }

                    switch (alt16) {
                        case 1 :
                            // com/joestelmach/natty/spark/DateWalker.g:94:31: explicit_seek
                            {
                            pushFollow(FOLLOW_explicit_seek_in_seek488);
                            explicit_seek();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // com/joestelmach/natty/spark/DateWalker.g:94:47: relative_date
                            {
                            pushFollow(FOLLOW_relative_date_in_seek492);
                            relative_date();

                            state._fsp--;


                            }
                            break;

                    }

                    INT5=(CommonTree)match(input,INT,FOLLOW_INT_in_seek496); 
                    SPAN6=(CommonTree)match(input,SPAN,FOLLOW_SPAN_in_seek498); 

                    match(input, Token.UP, null); 
                    _walkerState.seekBySpan((DIRECTION4!=null?DIRECTION4.getText():null), (INT5!=null?INT5.getText():null), (SPAN6!=null?SPAN6.getText():null));

                    }
                    break;
                case 4 :
                    // com/joestelmach/natty/spark/DateWalker.g:97:5: ^( SEEK DIRECTION SEEK_BY INT date )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek515); 

                    match(input, Token.DOWN, null); 
                    DIRECTION7=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek517); 
                    SEEK_BY9=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek519); 
                    INT8=(CommonTree)match(input,INT,FOLLOW_INT_in_seek521); 
                    pushFollow(FOLLOW_date_in_seek523);
                    date();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    _walkerState.seekBySpan((DIRECTION7!=null?DIRECTION7.getText():null), (INT8!=null?INT8.getText():null), (SEEK_BY9!=null?SEEK_BY9.getText():null));

                    }
                    break;
                case 5 :
                    // com/joestelmach/natty/spark/DateWalker.g:100:5: ^( SEEK DIRECTION SEEK_BY INT HOLIDAY )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek542); 

                    match(input, Token.DOWN, null); 
                    DIRECTION11=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek544); 
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek546); 
                    INT12=(CommonTree)match(input,INT,FOLLOW_INT_in_seek548); 
                    HOLIDAY10=(CommonTree)match(input,HOLIDAY,FOLLOW_HOLIDAY_in_seek550); 

                    match(input, Token.UP, null); 
                    _walkerState.seekToHoliday((HOLIDAY10!=null?HOLIDAY10.getText():null), (DIRECTION11!=null?DIRECTION11.getText():null), (INT12!=null?INT12.getText():null));

                    }
                    break;
                case 6 :
                    // com/joestelmach/natty/spark/DateWalker.g:103:5: ^( SEEK DIRECTION SEEK_BY INT SEASON )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek569); 

                    match(input, Token.DOWN, null); 
                    DIRECTION14=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek571); 
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek573); 
                    INT15=(CommonTree)match(input,INT,FOLLOW_INT_in_seek575); 
                    SEASON13=(CommonTree)match(input,SEASON,FOLLOW_SEASON_in_seek577); 

                    match(input, Token.UP, null); 
                    _walkerState.seekToSeason((SEASON13!=null?SEASON13.getText():null), (DIRECTION14!=null?DIRECTION14.getText():null), (INT15!=null?INT15.getText():null));

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
        return ;
    }
    // $ANTLR end "seek"


    // $ANTLR start "explicit_seek"
    // com/joestelmach/natty/spark/DateWalker.g:107:1: explicit_seek : ( ^( EXPLICIT_SEEK ^( MONTH_OF_YEAR day= INT ) ) | ^( EXPLICIT_SEEK ^( DAY_OF_MONTH month= INT ) ) | ^( EXPLICIT_SEEK ^( DAY_OF_WEEK day= INT ) ) | ^( EXPLICIT_SEEK ^( DAY_OF_YEAR day= INT ) ) | ^( EXPLICIT_SEEK ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_SEEK HOLIDAY ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_SEEK SEASON ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_SEEK index= INT ^( DAY_OF_WEEK day= INT ) ) | ^( EXPLICIT_SEEK explicit_time ) );
    public final void explicit_seek() throws RecognitionException {
        CommonTree day=null;
        CommonTree month=null;
        CommonTree year=null;
        CommonTree index=null;
        CommonTree HOLIDAY16=null;
        CommonTree SEASON17=null;

        try {
            // com/joestelmach/natty/spark/DateWalker.g:108:3: ( ^( EXPLICIT_SEEK ^( MONTH_OF_YEAR day= INT ) ) | ^( EXPLICIT_SEEK ^( DAY_OF_MONTH month= INT ) ) | ^( EXPLICIT_SEEK ^( DAY_OF_WEEK day= INT ) ) | ^( EXPLICIT_SEEK ^( DAY_OF_YEAR day= INT ) ) | ^( EXPLICIT_SEEK ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_SEEK HOLIDAY ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_SEEK SEASON ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_SEEK index= INT ^( DAY_OF_WEEK day= INT ) ) | ^( EXPLICIT_SEEK explicit_time ) )
            int alt18=9;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // com/joestelmach/natty/spark/DateWalker.g:108:5: ^( EXPLICIT_SEEK ^( MONTH_OF_YEAR day= INT ) )
                    {
                    match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek600); 

                    match(input, Token.DOWN, null); 
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_seek603); 

                    match(input, Token.DOWN, null); 
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek607); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    _walkerState.seekToMonth(">", "0", (day!=null?day.getText():null));

                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/spark/DateWalker.g:111:5: ^( EXPLICIT_SEEK ^( DAY_OF_MONTH month= INT ) )
                    {
                    match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek627); 

                    match(input, Token.DOWN, null); 
                    match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_seek630); 

                    match(input, Token.DOWN, null); 
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek634); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    _walkerState.seekToDayOfMonth((month!=null?month.getText():null));

                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/spark/DateWalker.g:114:5: ^( EXPLICIT_SEEK ^( DAY_OF_WEEK day= INT ) )
                    {
                    match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek654); 

                    match(input, Token.DOWN, null); 
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_explicit_seek657); 

                    match(input, Token.DOWN, null); 
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek661); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    _walkerState.seekToDayOfWeek(">", "by_week", "0", (day!=null?day.getText():null));

                    }
                    break;
                case 4 :
                    // com/joestelmach/natty/spark/DateWalker.g:117:5: ^( EXPLICIT_SEEK ^( DAY_OF_YEAR day= INT ) )
                    {
                    match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek681); 

                    match(input, Token.DOWN, null); 
                    match(input,DAY_OF_YEAR,FOLLOW_DAY_OF_YEAR_in_explicit_seek684); 

                    match(input, Token.DOWN, null); 
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek688); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    _walkerState.seekToDayOfYear((day!=null?day.getText():null));

                    }
                    break;
                case 5 :
                    // com/joestelmach/natty/spark/DateWalker.g:120:5: ^( EXPLICIT_SEEK ^( YEAR_OF year= INT ) )
                    {
                    match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek708); 

                    match(input, Token.DOWN, null); 
                    match(input,YEAR_OF,FOLLOW_YEAR_OF_in_explicit_seek711); 

                    match(input, Token.DOWN, null); 
                    year=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek715); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    _walkerState.seekToYear((year!=null?year.getText():null));

                    }
                    break;
                case 6 :
                    // com/joestelmach/natty/spark/DateWalker.g:123:5: ^( EXPLICIT_SEEK HOLIDAY ^( YEAR_OF year= INT ) )
                    {
                    match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek735); 

                    match(input, Token.DOWN, null); 
                    HOLIDAY16=(CommonTree)match(input,HOLIDAY,FOLLOW_HOLIDAY_in_explicit_seek737); 
                    match(input,YEAR_OF,FOLLOW_YEAR_OF_in_explicit_seek740); 

                    match(input, Token.DOWN, null); 
                    year=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek744); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    _walkerState.seekToHolidayYear((HOLIDAY16!=null?HOLIDAY16.getText():null), (year!=null?year.getText():null));

                    }
                    break;
                case 7 :
                    // com/joestelmach/natty/spark/DateWalker.g:126:5: ^( EXPLICIT_SEEK SEASON ^( YEAR_OF year= INT ) )
                    {
                    match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek764); 

                    match(input, Token.DOWN, null); 
                    SEASON17=(CommonTree)match(input,SEASON,FOLLOW_SEASON_in_explicit_seek766); 
                    match(input,YEAR_OF,FOLLOW_YEAR_OF_in_explicit_seek769); 

                    match(input, Token.DOWN, null); 
                    year=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek773); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    _walkerState.seekToSeasonYear((SEASON17!=null?SEASON17.getText():null), (year!=null?year.getText():null));

                    }
                    break;
                case 8 :
                    // com/joestelmach/natty/spark/DateWalker.g:129:5: ^( EXPLICIT_SEEK index= INT ^( DAY_OF_WEEK day= INT ) )
                    {
                    match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek793); 

                    match(input, Token.DOWN, null); 
                    index=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek797); 
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_explicit_seek800); 

                    match(input, Token.DOWN, null); 
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek804); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    _walkerState.setDayOfWeekIndex((index!=null?index.getText():null), (day!=null?day.getText():null));

                    }
                    break;
                case 9 :
                    // com/joestelmach/natty/spark/DateWalker.g:132:5: ^( EXPLICIT_SEEK explicit_time )
                    {
                    match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek824); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_explicit_time_in_explicit_seek826);
                    explicit_time();

                    state._fsp--;


                    match(input, Token.UP, null); 

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
        return ;
    }
    // $ANTLR end "explicit_seek"

    // Delegated rules


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA17_eotS =
        "\14\uffff";
    static final String DFA17_eofS =
        "\14\uffff";
    static final String DFA17_minS =
        "\1\u01c1\1\2\1\u01c2\1\u01c3\1\u0119\1\u01b8\6\uffff";
    static final String DFA17_maxS =
        "\1\u01c1\1\2\1\u01c2\1\u01c3\1\u01c4\1\u01d0\6\uffff";
    static final String DFA17_acceptS =
        "\6\uffff\1\3\1\1\1\2\1\5\1\6\1\4";
    static final String DFA17_specialS =
        "\14\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5\u00a6\uffff\1\6\3\uffff\1\6",
            "\1\10\1\uffff\1\7\4\uffff\2\13\4\uffff\1\6\11\uffff\1\11\1"+
            "\12",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "87:1: seek : ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ( date )? ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY ( explicit_seek | relative_date )? INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) | ^( SEEK DIRECTION SEEK_BY INT HOLIDAY ) | ^( SEEK DIRECTION SEEK_BY INT SEASON ) );";
        }
    }
    static final String DFA18_eotS =
        "\14\uffff";
    static final String DFA18_eofS =
        "\14\uffff";
    static final String DFA18_minS =
        "\1\u01c4\1\2\1\u0119\11\uffff";
    static final String DFA18_maxS =
        "\1\u01c4\1\2\1\u01d0\11\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA18_specialS =
        "\14\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1",
            "\1\2",
            "\1\12\u009e\uffff\1\3\1\4\1\5\1\6\1\7\11\uffff\1\13\10\uffff"+
            "\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "107:1: explicit_seek : ( ^( EXPLICIT_SEEK ^( MONTH_OF_YEAR day= INT ) ) | ^( EXPLICIT_SEEK ^( DAY_OF_MONTH month= INT ) ) | ^( EXPLICIT_SEEK ^( DAY_OF_WEEK day= INT ) ) | ^( EXPLICIT_SEEK ^( DAY_OF_YEAR day= INT ) ) | ^( EXPLICIT_SEEK ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_SEEK HOLIDAY ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_SEEK SEASON ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_SEEK index= INT ^( DAY_OF_WEEK day= INT ) ) | ^( EXPLICIT_SEEK explicit_time ) );";
        }
    }
 

    public static final BitSet FOLLOW_date_time_alternative_in_parse45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_recurrence_in_parse47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECURRENCE_in_recurrence71 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_date_time_in_recurrence73 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATE_TIME_ALTERNATIVE_in_date_time_alternative92 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_date_time_in_date_time_alternative94 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_DATE_TIME_in_date_time117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_date_in_date_time119 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_time_in_date_time122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relative_date_in_date141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_date_in_date148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date164 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_seek_in_relative_date166 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_explicit_seek_in_relative_date169 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_WEEK_INDEX_in_week_index187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_week_index191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_week_index194 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_week_index198 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_explicit_date225 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_date233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_explicit_date251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date255 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YEAR_OF_in_explicit_date262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_explicit_time_in_time291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_time_in_time297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPLICIT_TIME_in_explicit_time313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_HOURS_OF_DAY_in_explicit_time316 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_time320 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTES_OF_HOUR_in_explicit_time324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_time328 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECONDS_OF_MINUTE_in_explicit_time342 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_time346 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AM_PM_in_explicit_time351 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_ZONE_in_explicit_time357 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ZONE_OFFSET_in_explicit_time363 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_TIME_in_relative_time388 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_seek_in_relative_time390 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek407 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_seek417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_seek420 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_seek424 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_date_in_seek428 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_seek456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_seek459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_seek463 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000011L});
    public static final BitSet FOLLOW_explicit_seek_in_seek488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_relative_date_in_seek492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_seek496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_SPAN_in_seek498 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek515 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_seek521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_date_in_seek523 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek542 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_seek548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_HOLIDAY_in_seek550 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_seek575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SEASON_in_seek577 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek600 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_explicit_seek603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_seek607 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek627 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_seek630 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_seek634 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_explicit_seek657 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_seek661 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek681 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DAY_OF_YEAR_in_explicit_seek684 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_seek688 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek708 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_YEAR_OF_in_explicit_seek711 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_seek715 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek735 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_HOLIDAY_in_explicit_seek737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_YEAR_OF_in_explicit_seek740 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_seek744 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek764 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SEASON_in_explicit_seek766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_YEAR_OF_in_explicit_seek769 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_seek773 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek793 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_seek797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_explicit_seek800 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_seek804 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek824 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_explicit_time_in_explicit_seek826 = new BitSet(new long[]{0x0000000000000008L});

}