// $ANTLR 3.2 Sep 23, 2009 14:05:07 NumericRules.g 2014-09-18 18:35:12

  package com.joestelmach.natty.generated;


//import org.antlr.runtime.*;
import com.spark.antlr.runtime.*;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

//import org.antlr.runtime.debug.*;
import com.spark.antlr.runtime.debug.*;
import java.io.IOException;

//import org.antlr.runtime.tree.*;
import com.spark.antlr.runtime.tree.*;


public class DateParser_NumericRules extends DebugParser {
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
    public DateParser gDateParser;
    public DateParser gParent;

     
        public int getRuleLevel() { return gDateParser.getRuleLevel(); }
        public void incRuleLevel() { gDateParser.incRuleLevel(); }
        public void decRuleLevel() { gDateParser.decRuleLevel(); }
        public DateParser_NumericRules(TokenStream input, DebugEventListener dbg, RecognizerSharedState state, DateParser gDateParser) {
            super(input, dbg, state);
            this.gDateParser = gDateParser;
        }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = (DebugTreeAdaptor)adaptor; // delegator sends dbg adaptor 

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return DateParser.tokenNames; }
    public String getGrammarFileName() { return "NumericRules.g"; }


    public static class int_00_to_59_mandatory_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_00_to_59_mandatory_prefix"
    // NumericRules.g:14:1: int_00_to_59_mandatory_prefix : ( INT_00 | int_01_to_12 | int_13_to_23 | int_24_to_31 | int_32_to_59 ) -> INT[$int_00_to_59_mandatory_prefix.text] ;
    public final DateParser_NumericRules.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix() throws RecognitionException {
        DateParser_NumericRules.int_00_to_59_mandatory_prefix_return retval = new DateParser_NumericRules.int_00_to_59_mandatory_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_001=null;
        DateParser_NumericRules.int_01_to_12_return int_01_to_122 = null;

        DateParser_NumericRules.int_13_to_23_return int_13_to_233 = null;

        DateParser_NumericRules.int_24_to_31_return int_24_to_314 = null;

        DateParser_NumericRules.int_32_to_59_return int_32_to_595 = null;


        Object INT_001_tree=null;
        RewriteRuleTokenStream stream_INT_00=new RewriteRuleTokenStream(adaptor,"token INT_00");
        RewriteRuleSubtreeStream stream_int_13_to_23=new RewriteRuleSubtreeStream(adaptor,"rule int_13_to_23");
        RewriteRuleSubtreeStream stream_int_24_to_31=new RewriteRuleSubtreeStream(adaptor,"rule int_24_to_31");
        RewriteRuleSubtreeStream stream_int_32_to_59=new RewriteRuleSubtreeStream(adaptor,"rule int_32_to_59");
        RewriteRuleSubtreeStream stream_int_01_to_12=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_12");
        try { dbg.enterRule(getGrammarFileName(), "int_00_to_59_mandatory_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 1);

        try {
            // NumericRules.g:15:3: ( ( INT_00 | int_01_to_12 | int_13_to_23 | int_24_to_31 | int_32_to_59 ) -> INT[$int_00_to_59_mandatory_prefix.text] )
            dbg.enterAlt(1);

            // NumericRules.g:15:5: ( INT_00 | int_01_to_12 | int_13_to_23 | int_24_to_31 | int_32_to_59 )
            {
            dbg.location(15,5);
            // NumericRules.g:15:5: ( INT_00 | int_01_to_12 | int_13_to_23 | int_24_to_31 | int_32_to_59 )
            int alt1=5;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1);

            switch ( input.LA(1) ) {
            case INT_00:
                {
                alt1=1;
                }
                break;
            case INT_01:
            case INT_02:
            case INT_03:
            case INT_04:
            case INT_05:
            case INT_06:
            case INT_07:
            case INT_08:
            case INT_09:
            case INT_10:
            case INT_11:
            case INT_12:
                {
                alt1=2;
                }
                break;
            case INT_13:
            case INT_14:
            case INT_15:
            case INT_16:
            case INT_17:
            case INT_18:
            case INT_19:
            case INT_20:
            case INT_21:
            case INT_22:
            case INT_23:
                {
                alt1=3;
                }
                break;
            case INT_24:
            case INT_25:
            case INT_26:
            case INT_27:
            case INT_28:
            case INT_29:
            case INT_30:
            case INT_31:
                {
                alt1=4;
                }
                break;
            case INT_32:
            case INT_33:
            case INT_34:
            case INT_35:
            case INT_36:
            case INT_37:
            case INT_38:
            case INT_39:
            case INT_40:
            case INT_41:
            case INT_42:
            case INT_43:
            case INT_44:
            case INT_45:
            case INT_46:
            case INT_47:
            case INT_48:
            case INT_49:
            case INT_50:
            case INT_51:
            case INT_52:
            case INT_53:
            case INT_54:
            case INT_55:
            case INT_56:
            case INT_57:
            case INT_58:
            case INT_59:
                {
                alt1=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // NumericRules.g:15:6: INT_00
                    {
                    dbg.location(15,6);
                    INT_001=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix42); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_00.add(INT_001);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // NumericRules.g:16:5: int_01_to_12
                    {
                    dbg.location(16,5);
                    pushFollow(FOLLOW_int_01_to_12_in_int_00_to_59_mandatory_prefix48);
                    int_01_to_122=int_01_to_12();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_01_to_12.add(int_01_to_122.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // NumericRules.g:17:5: int_13_to_23
                    {
                    dbg.location(17,5);
                    pushFollow(FOLLOW_int_13_to_23_in_int_00_to_59_mandatory_prefix54);
                    int_13_to_233=int_13_to_23();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_13_to_23.add(int_13_to_233.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // NumericRules.g:18:5: int_24_to_31
                    {
                    dbg.location(18,5);
                    pushFollow(FOLLOW_int_24_to_31_in_int_00_to_59_mandatory_prefix60);
                    int_24_to_314=int_24_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_24_to_31.add(int_24_to_314.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // NumericRules.g:19:5: int_32_to_59
                    {
                    dbg.location(19,5);
                    pushFollow(FOLLOW_int_32_to_59_in_int_00_to_59_mandatory_prefix66);
                    int_32_to_595=int_32_to_59();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_32_to_59.add(int_32_to_595.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 19:19: -> INT[$int_00_to_59_mandatory_prefix.text]
            {
                dbg.location(19,22);
                adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(20, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_00_to_59_mandatory_prefix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_00_to_59_mandatory_prefix"

    public static class int_00_to_99_mandatory_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_00_to_99_mandatory_prefix"
    // NumericRules.g:23:1: int_00_to_99_mandatory_prefix : ( int_00_to_59_mandatory_prefix | int_60_to_99 ) -> INT[$int_00_to_99_mandatory_prefix.text] ;
    public final DateParser_NumericRules.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix() throws RecognitionException {
        DateParser_NumericRules.int_00_to_99_mandatory_prefix_return retval = new DateParser_NumericRules.int_00_to_99_mandatory_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser_NumericRules.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix6 = null;

        DateParser_NumericRules.int_60_to_99_return int_60_to_997 = null;


        RewriteRuleSubtreeStream stream_int_60_to_99=new RewriteRuleSubtreeStream(adaptor,"rule int_60_to_99");
        RewriteRuleSubtreeStream stream_int_00_to_59_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_59_mandatory_prefix");
        try { dbg.enterRule(getGrammarFileName(), "int_00_to_99_mandatory_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 1);

        try {
            // NumericRules.g:24:3: ( ( int_00_to_59_mandatory_prefix | int_60_to_99 ) -> INT[$int_00_to_99_mandatory_prefix.text] )
            dbg.enterAlt(1);

            // NumericRules.g:24:5: ( int_00_to_59_mandatory_prefix | int_60_to_99 )
            {
            dbg.location(24,5);
            // NumericRules.g:24:5: ( int_00_to_59_mandatory_prefix | int_60_to_99 )
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2);

            switch ( input.LA(1) ) {
            case INT_00:
            case INT_01:
            case INT_02:
            case INT_03:
            case INT_04:
            case INT_05:
            case INT_06:
            case INT_07:
            case INT_08:
            case INT_09:
            case INT_10:
            case INT_11:
            case INT_12:
            case INT_13:
            case INT_14:
            case INT_15:
            case INT_16:
            case INT_17:
            case INT_18:
            case INT_19:
            case INT_20:
            case INT_21:
            case INT_22:
            case INT_23:
            case INT_24:
            case INT_25:
            case INT_26:
            case INT_27:
            case INT_28:
            case INT_29:
            case INT_30:
            case INT_31:
            case INT_32:
            case INT_33:
            case INT_34:
            case INT_35:
            case INT_36:
            case INT_37:
            case INT_38:
            case INT_39:
            case INT_40:
            case INT_41:
            case INT_42:
            case INT_43:
            case INT_44:
            case INT_45:
            case INT_46:
            case INT_47:
            case INT_48:
            case INT_49:
            case INT_50:
            case INT_51:
            case INT_52:
            case INT_53:
            case INT_54:
            case INT_55:
            case INT_56:
            case INT_57:
            case INT_58:
            case INT_59:
                {
                alt2=1;
                }
                break;
            case INT_60:
            case INT_61:
            case INT_62:
            case INT_63:
            case INT_64:
            case INT_65:
            case INT_66:
            case INT_67:
            case INT_68:
            case INT_69:
            case INT_70:
            case INT_71:
            case INT_72:
            case INT_73:
            case INT_74:
            case INT_75:
            case INT_76:
            case INT_77:
            case INT_78:
            case INT_79:
            case INT_80:
            case INT_81:
            case INT_82:
            case INT_83:
            case INT_84:
            case INT_85:
            case INT_86:
            case INT_87:
            case INT_88:
            case INT_89:
            case INT_90:
            case INT_91:
            case INT_92:
            case INT_93:
            case INT_94:
            case INT_95:
            case INT_96:
            case INT_97:
            case INT_98:
            case INT_99:
                {
                alt2=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // NumericRules.g:24:6: int_00_to_59_mandatory_prefix
                    {
                    dbg.location(24,6);
                    pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix89);
                    int_00_to_59_mandatory_prefix6=int_00_to_59_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_00_to_59_mandatory_prefix.add(int_00_to_59_mandatory_prefix6.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // NumericRules.g:24:38: int_60_to_99
                    {
                    dbg.location(24,38);
                    pushFollow(FOLLOW_int_60_to_99_in_int_00_to_99_mandatory_prefix93);
                    int_60_to_997=int_60_to_99();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_60_to_99.add(int_60_to_997.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 25:5: -> INT[$int_00_to_99_mandatory_prefix.text]
            {
                dbg.location(25,8);
                adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(26, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_00_to_99_mandatory_prefix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_00_to_99_mandatory_prefix"

    public static class int_01_to_12_optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_01_to_12_optional_prefix"
    // NumericRules.g:29:1: int_01_to_12_optional_prefix : ( int_1_to_9 | int_01_to_12 ) -> INT[$int_01_to_12_optional_prefix.text] ;
    public final DateParser_NumericRules.int_01_to_12_optional_prefix_return int_01_to_12_optional_prefix() throws RecognitionException {
        DateParser_NumericRules.int_01_to_12_optional_prefix_return retval = new DateParser_NumericRules.int_01_to_12_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser_NumericRules.int_1_to_9_return int_1_to_98 = null;

        DateParser_NumericRules.int_01_to_12_return int_01_to_129 = null;


        RewriteRuleSubtreeStream stream_int_1_to_9=new RewriteRuleSubtreeStream(adaptor,"rule int_1_to_9");
        RewriteRuleSubtreeStream stream_int_01_to_12=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_12");
        try { dbg.enterRule(getGrammarFileName(), "int_01_to_12_optional_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 1);

        try {
            // NumericRules.g:30:3: ( ( int_1_to_9 | int_01_to_12 ) -> INT[$int_01_to_12_optional_prefix.text] )
            dbg.enterAlt(1);

            // NumericRules.g:30:5: ( int_1_to_9 | int_01_to_12 )
            {
            dbg.location(30,5);
            // NumericRules.g:30:5: ( int_1_to_9 | int_01_to_12 )
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3);

            switch ( input.LA(1) ) {
            case INT_1:
            case INT_2:
            case INT_3:
            case INT_4:
            case INT_5:
            case INT_6:
            case INT_7:
            case INT_8:
            case INT_9:
                {
                alt3=1;
                }
                break;
            case INT_01:
            case INT_02:
            case INT_03:
            case INT_04:
            case INT_05:
            case INT_06:
            case INT_07:
            case INT_08:
            case INT_09:
            case INT_10:
            case INT_11:
            case INT_12:
                {
                alt3=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // NumericRules.g:30:6: int_1_to_9
                    {
                    dbg.location(30,6);
                    pushFollow(FOLLOW_int_1_to_9_in_int_01_to_12_optional_prefix120);
                    int_1_to_98=int_1_to_9();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_9.add(int_1_to_98.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // NumericRules.g:30:19: int_01_to_12
                    {
                    dbg.location(30,19);
                    pushFollow(FOLLOW_int_01_to_12_in_int_01_to_12_optional_prefix124);
                    int_01_to_129=int_01_to_12();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_01_to_12.add(int_01_to_129.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 30:33: -> INT[$int_01_to_12_optional_prefix.text]
            {
                dbg.location(30,36);
                adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(31, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_01_to_12_optional_prefix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_01_to_12_optional_prefix"

    public static class int_00_to_23_optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_00_to_23_optional_prefix"
    // NumericRules.g:34:1: int_00_to_23_optional_prefix : ( INT_00 | INT_0 | int_1_to_9 | int_01_to_12 | int_13_to_23 ) -> INT[$int_00_to_23_optional_prefix.text] ;
    public final DateParser_NumericRules.int_00_to_23_optional_prefix_return int_00_to_23_optional_prefix() throws RecognitionException {
        DateParser_NumericRules.int_00_to_23_optional_prefix_return retval = new DateParser_NumericRules.int_00_to_23_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_0010=null;
        Token INT_011=null;
        DateParser_NumericRules.int_1_to_9_return int_1_to_912 = null;

        DateParser_NumericRules.int_01_to_12_return int_01_to_1213 = null;

        DateParser_NumericRules.int_13_to_23_return int_13_to_2314 = null;


        Object INT_0010_tree=null;
        Object INT_011_tree=null;
        RewriteRuleTokenStream stream_INT_00=new RewriteRuleTokenStream(adaptor,"token INT_00");
        RewriteRuleTokenStream stream_INT_0=new RewriteRuleTokenStream(adaptor,"token INT_0");
        RewriteRuleSubtreeStream stream_int_13_to_23=new RewriteRuleSubtreeStream(adaptor,"rule int_13_to_23");
        RewriteRuleSubtreeStream stream_int_1_to_9=new RewriteRuleSubtreeStream(adaptor,"rule int_1_to_9");
        RewriteRuleSubtreeStream stream_int_01_to_12=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_12");
        try { dbg.enterRule(getGrammarFileName(), "int_00_to_23_optional_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 1);

        try {
            // NumericRules.g:35:3: ( ( INT_00 | INT_0 | int_1_to_9 | int_01_to_12 | int_13_to_23 ) -> INT[$int_00_to_23_optional_prefix.text] )
            dbg.enterAlt(1);

            // NumericRules.g:35:5: ( INT_00 | INT_0 | int_1_to_9 | int_01_to_12 | int_13_to_23 )
            {
            dbg.location(35,5);
            // NumericRules.g:35:5: ( INT_00 | INT_0 | int_1_to_9 | int_01_to_12 | int_13_to_23 )
            int alt4=5;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4);

            switch ( input.LA(1) ) {
            case INT_00:
                {
                alt4=1;
                }
                break;
            case INT_0:
                {
                alt4=2;
                }
                break;
            case INT_1:
            case INT_2:
            case INT_3:
            case INT_4:
            case INT_5:
            case INT_6:
            case INT_7:
            case INT_8:
            case INT_9:
                {
                alt4=3;
                }
                break;
            case INT_01:
            case INT_02:
            case INT_03:
            case INT_04:
            case INT_05:
            case INT_06:
            case INT_07:
            case INT_08:
            case INT_09:
            case INT_10:
            case INT_11:
            case INT_12:
                {
                alt4=4;
                }
                break;
            case INT_13:
            case INT_14:
            case INT_15:
            case INT_16:
            case INT_17:
            case INT_18:
            case INT_19:
            case INT_20:
            case INT_21:
            case INT_22:
            case INT_23:
                {
                alt4=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // NumericRules.g:35:6: INT_00
                    {
                    dbg.location(35,6);
                    INT_0010=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_23_optional_prefix147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_00.add(INT_0010);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // NumericRules.g:36:5: INT_0
                    {
                    dbg.location(36,5);
                    INT_011=(Token)match(input,INT_0,FOLLOW_INT_0_in_int_00_to_23_optional_prefix154); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_0.add(INT_011);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // NumericRules.g:37:5: int_1_to_9
                    {
                    dbg.location(37,5);
                    pushFollow(FOLLOW_int_1_to_9_in_int_00_to_23_optional_prefix160);
                    int_1_to_912=int_1_to_9();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_9.add(int_1_to_912.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // NumericRules.g:38:5: int_01_to_12
                    {
                    dbg.location(38,5);
                    pushFollow(FOLLOW_int_01_to_12_in_int_00_to_23_optional_prefix166);
                    int_01_to_1213=int_01_to_12();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_01_to_12.add(int_01_to_1213.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // NumericRules.g:39:5: int_13_to_23
                    {
                    dbg.location(39,5);
                    pushFollow(FOLLOW_int_13_to_23_in_int_00_to_23_optional_prefix172);
                    int_13_to_2314=int_13_to_23();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_13_to_23.add(int_13_to_2314.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 39:19: -> INT[$int_00_to_23_optional_prefix.text]
            {
                dbg.location(39,22);
                adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(40, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_00_to_23_optional_prefix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_00_to_23_optional_prefix"

    public static class int_01_to_31_optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_01_to_31_optional_prefix"
    // NumericRules.g:43:1: int_01_to_31_optional_prefix : ( int_01_to_12 | int_1_to_9 | int_13_to_23 | int_24_to_31 ) -> INT[$int_01_to_31_optional_prefix.text] ;
    public final DateParser_NumericRules.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix() throws RecognitionException {
        DateParser_NumericRules.int_01_to_31_optional_prefix_return retval = new DateParser_NumericRules.int_01_to_31_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser_NumericRules.int_01_to_12_return int_01_to_1215 = null;

        DateParser_NumericRules.int_1_to_9_return int_1_to_916 = null;

        DateParser_NumericRules.int_13_to_23_return int_13_to_2317 = null;

        DateParser_NumericRules.int_24_to_31_return int_24_to_3118 = null;


        RewriteRuleSubtreeStream stream_int_13_to_23=new RewriteRuleSubtreeStream(adaptor,"rule int_13_to_23");
        RewriteRuleSubtreeStream stream_int_24_to_31=new RewriteRuleSubtreeStream(adaptor,"rule int_24_to_31");
        RewriteRuleSubtreeStream stream_int_01_to_12=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_12");
        RewriteRuleSubtreeStream stream_int_1_to_9=new RewriteRuleSubtreeStream(adaptor,"rule int_1_to_9");
        try { dbg.enterRule(getGrammarFileName(), "int_01_to_31_optional_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 1);

        try {
            // NumericRules.g:44:3: ( ( int_01_to_12 | int_1_to_9 | int_13_to_23 | int_24_to_31 ) -> INT[$int_01_to_31_optional_prefix.text] )
            dbg.enterAlt(1);

            // NumericRules.g:44:5: ( int_01_to_12 | int_1_to_9 | int_13_to_23 | int_24_to_31 )
            {
            dbg.location(44,5);
            // NumericRules.g:44:5: ( int_01_to_12 | int_1_to_9 | int_13_to_23 | int_24_to_31 )
            int alt5=4;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            switch ( input.LA(1) ) {
            case INT_01:
            case INT_02:
            case INT_03:
            case INT_04:
            case INT_05:
            case INT_06:
            case INT_07:
            case INT_08:
            case INT_09:
            case INT_10:
            case INT_11:
            case INT_12:
                {
                alt5=1;
                }
                break;
            case INT_1:
            case INT_2:
            case INT_3:
            case INT_4:
            case INT_5:
            case INT_6:
            case INT_7:
            case INT_8:
            case INT_9:
                {
                alt5=2;
                }
                break;
            case INT_13:
            case INT_14:
            case INT_15:
            case INT_16:
            case INT_17:
            case INT_18:
            case INT_19:
            case INT_20:
            case INT_21:
            case INT_22:
            case INT_23:
                {
                alt5=3;
                }
                break;
            case INT_24:
            case INT_25:
            case INT_26:
            case INT_27:
            case INT_28:
            case INT_29:
            case INT_30:
            case INT_31:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // NumericRules.g:44:6: int_01_to_12
                    {
                    dbg.location(44,6);
                    pushFollow(FOLLOW_int_01_to_12_in_int_01_to_31_optional_prefix195);
                    int_01_to_1215=int_01_to_12();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_01_to_12.add(int_01_to_1215.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // NumericRules.g:45:5: int_1_to_9
                    {
                    dbg.location(45,5);
                    pushFollow(FOLLOW_int_1_to_9_in_int_01_to_31_optional_prefix201);
                    int_1_to_916=int_1_to_9();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_9.add(int_1_to_916.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // NumericRules.g:46:5: int_13_to_23
                    {
                    dbg.location(46,5);
                    pushFollow(FOLLOW_int_13_to_23_in_int_01_to_31_optional_prefix207);
                    int_13_to_2317=int_13_to_23();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_13_to_23.add(int_13_to_2317.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // NumericRules.g:47:5: int_24_to_31
                    {
                    dbg.location(47,5);
                    pushFollow(FOLLOW_int_24_to_31_in_int_01_to_31_optional_prefix213);
                    int_24_to_3118=int_24_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_24_to_31.add(int_24_to_3118.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 47:19: -> INT[$int_01_to_31_optional_prefix.text]
            {
                dbg.location(47,22);
                adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(48, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_01_to_31_optional_prefix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_01_to_31_optional_prefix"

    public static class int_four_digits_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_four_digits"
    // NumericRules.g:51:1: int_four_digits : int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix -> INT[$int_four_digits.text] ;
    public final DateParser_NumericRules.int_four_digits_return int_four_digits() throws RecognitionException {
        DateParser_NumericRules.int_four_digits_return retval = new DateParser_NumericRules.int_four_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser_NumericRules.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix19 = null;

        DateParser_NumericRules.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix20 = null;


        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try { dbg.enterRule(getGrammarFileName(), "int_four_digits");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 1);

        try {
            // NumericRules.g:52:3: ( int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix -> INT[$int_four_digits.text] )
            dbg.enterAlt(1);

            // NumericRules.g:52:5: int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix
            {
            dbg.location(52,5);
            pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits235);
            int_00_to_99_mandatory_prefix19=int_00_to_99_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix19.getTree());
            dbg.location(52,35);
            pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits237);
            int_00_to_99_mandatory_prefix20=int_00_to_99_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix20.getTree());


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 53:7: -> INT[$int_four_digits.text]
            {
                dbg.location(53,10);
                adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(54, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_four_digits");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_four_digits"

    public static class spelled_or_int_01_to_31_optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_or_int_01_to_31_optional_prefix"
    // NumericRules.g:58:1: spelled_or_int_01_to_31_optional_prefix : ( int_01_to_31_optional_prefix | spelled_one_to_thirty_one );
    public final DateParser_NumericRules.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix() throws RecognitionException {
        DateParser_NumericRules.spelled_or_int_01_to_31_optional_prefix_return retval = new DateParser_NumericRules.spelled_or_int_01_to_31_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser_NumericRules.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix21 = null;

        DateParser_NumericRules.spelled_one_to_thirty_one_return spelled_one_to_thirty_one22 = null;



        try { dbg.enterRule(getGrammarFileName(), "spelled_or_int_01_to_31_optional_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(58, 1);

        try {
            // NumericRules.g:59:3: ( int_01_to_31_optional_prefix | spelled_one_to_thirty_one )
            int alt6=2;
            try { dbg.enterDecision(6);

            switch ( input.LA(1) ) {
            case INT_01:
            case INT_02:
            case INT_03:
            case INT_04:
            case INT_05:
            case INT_06:
            case INT_07:
            case INT_08:
            case INT_09:
            case INT_1:
            case INT_2:
            case INT_3:
            case INT_4:
            case INT_5:
            case INT_6:
            case INT_7:
            case INT_8:
            case INT_9:
            case INT_10:
            case INT_11:
            case INT_12:
            case INT_13:
            case INT_14:
            case INT_15:
            case INT_16:
            case INT_17:
            case INT_18:
            case INT_19:
            case INT_20:
            case INT_21:
            case INT_22:
            case INT_23:
            case INT_24:
            case INT_25:
            case INT_26:
            case INT_27:
            case INT_28:
            case INT_29:
            case INT_30:
            case INT_31:
                {
                alt6=1;
                }
                break;
            case ONE:
            case TWO:
            case THREE:
            case FOUR:
            case FIVE:
            case SIX:
            case SEVEN:
            case EIGHT:
            case NINE:
            case TEN:
            case ELEVEN:
            case TWELVE:
            case THIRTEEN:
            case FOURTEEN:
            case FIFTEEN:
            case SIXTEEN:
            case SEVENTEEN:
            case EIGHTEEN:
            case NINETEEN:
            case TWENTY:
            case THIRTY:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // NumericRules.g:59:5: int_01_to_31_optional_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(59,5);
                    pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix265);
                    int_01_to_31_optional_prefix21=int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_01_to_31_optional_prefix21.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // NumericRules.g:60:5: spelled_one_to_thirty_one
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(60,5);
                    pushFollow(FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix271);
                    spelled_one_to_thirty_one22=spelled_one_to_thirty_one();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, spelled_one_to_thirty_one22.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(61, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "spelled_or_int_01_to_31_optional_prefix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "spelled_or_int_01_to_31_optional_prefix"

    public static class spelled_or_int_optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_or_int_optional_prefix"
    // NumericRules.g:65:1: spelled_or_int_optional_prefix : ( spelled_one_to_thirty_one | ( ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 ) ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 )? -> INT[$spelled_or_int_optional_prefix.text] ) );
    public final DateParser_NumericRules.spelled_or_int_optional_prefix_return spelled_or_int_optional_prefix() throws RecognitionException {
        DateParser_NumericRules.spelled_or_int_optional_prefix_return retval = new DateParser_NumericRules.spelled_or_int_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser_NumericRules.spelled_one_to_thirty_one_return spelled_one_to_thirty_one23 = null;

        DateParser_NumericRules.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix24 = null;

        DateParser_NumericRules.int_32_to_59_return int_32_to_5925 = null;

        DateParser_NumericRules.int_60_to_99_return int_60_to_9926 = null;

        DateParser_NumericRules.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix27 = null;

        DateParser_NumericRules.int_32_to_59_return int_32_to_5928 = null;

        DateParser_NumericRules.int_60_to_99_return int_60_to_9929 = null;


        RewriteRuleSubtreeStream stream_int_60_to_99=new RewriteRuleSubtreeStream(adaptor,"rule int_60_to_99");
        RewriteRuleSubtreeStream stream_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_31_optional_prefix");
        RewriteRuleSubtreeStream stream_int_32_to_59=new RewriteRuleSubtreeStream(adaptor,"rule int_32_to_59");
        try { dbg.enterRule(getGrammarFileName(), "spelled_or_int_optional_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 1);

        try {
            // NumericRules.g:66:3: ( spelled_one_to_thirty_one | ( ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 ) ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 )? -> INT[$spelled_or_int_optional_prefix.text] ) )
            int alt9=2;
            try { dbg.enterDecision(9);

            switch ( input.LA(1) ) {
            case ONE:
            case TWO:
            case THREE:
            case FOUR:
            case FIVE:
            case SIX:
            case SEVEN:
            case EIGHT:
            case NINE:
            case TEN:
            case ELEVEN:
            case TWELVE:
            case THIRTEEN:
            case FOURTEEN:
            case FIFTEEN:
            case SIXTEEN:
            case SEVENTEEN:
            case EIGHTEEN:
            case NINETEEN:
            case TWENTY:
            case THIRTY:
                {
                alt9=1;
                }
                break;
            case INT_01:
            case INT_02:
            case INT_03:
            case INT_04:
            case INT_05:
            case INT_06:
            case INT_07:
            case INT_08:
            case INT_09:
            case INT_1:
            case INT_2:
            case INT_3:
            case INT_4:
            case INT_5:
            case INT_6:
            case INT_7:
            case INT_8:
            case INT_9:
            case INT_10:
            case INT_11:
            case INT_12:
            case INT_13:
            case INT_14:
            case INT_15:
            case INT_16:
            case INT_17:
            case INT_18:
            case INT_19:
            case INT_20:
            case INT_21:
            case INT_22:
            case INT_23:
            case INT_24:
            case INT_25:
            case INT_26:
            case INT_27:
            case INT_28:
            case INT_29:
            case INT_30:
            case INT_31:
            case INT_32:
            case INT_33:
            case INT_34:
            case INT_35:
            case INT_36:
            case INT_37:
            case INT_38:
            case INT_39:
            case INT_40:
            case INT_41:
            case INT_42:
            case INT_43:
            case INT_44:
            case INT_45:
            case INT_46:
            case INT_47:
            case INT_48:
            case INT_49:
            case INT_50:
            case INT_51:
            case INT_52:
            case INT_53:
            case INT_54:
            case INT_55:
            case INT_56:
            case INT_57:
            case INT_58:
            case INT_59:
            case INT_60:
            case INT_61:
            case INT_62:
            case INT_63:
            case INT_64:
            case INT_65:
            case INT_66:
            case INT_67:
            case INT_68:
            case INT_69:
            case INT_70:
            case INT_71:
            case INT_72:
            case INT_73:
            case INT_74:
            case INT_75:
            case INT_76:
            case INT_77:
            case INT_78:
            case INT_79:
            case INT_80:
            case INT_81:
            case INT_82:
            case INT_83:
            case INT_84:
            case INT_85:
            case INT_86:
            case INT_87:
            case INT_88:
            case INT_89:
            case INT_90:
            case INT_91:
            case INT_92:
            case INT_93:
            case INT_94:
            case INT_95:
            case INT_96:
            case INT_97:
            case INT_98:
            case INT_99:
                {
                alt9=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // NumericRules.g:66:5: spelled_one_to_thirty_one
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(66,5);
                    pushFollow(FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_optional_prefix288);
                    spelled_one_to_thirty_one23=spelled_one_to_thirty_one();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, spelled_one_to_thirty_one23.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // NumericRules.g:67:5: ( ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 ) ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 )? -> INT[$spelled_or_int_optional_prefix.text] )
                    {
                    dbg.location(67,5);
                    // NumericRules.g:67:5: ( ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 ) ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 )? -> INT[$spelled_or_int_optional_prefix.text] )
                    dbg.enterAlt(1);

                    // NumericRules.g:67:6: ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 ) ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 )?
                    {
                    dbg.location(67,6);
                    // NumericRules.g:67:6: ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 )
                    int alt7=3;
                    try { dbg.enterSubRule(7);
                    try { dbg.enterDecision(7);

                    switch ( input.LA(1) ) {
                    case INT_01:
                    case INT_02:
                    case INT_03:
                    case INT_04:
                    case INT_05:
                    case INT_06:
                    case INT_07:
                    case INT_08:
                    case INT_09:
                    case INT_1:
                    case INT_2:
                    case INT_3:
                    case INT_4:
                    case INT_5:
                    case INT_6:
                    case INT_7:
                    case INT_8:
                    case INT_9:
                    case INT_10:
                    case INT_11:
                    case INT_12:
                    case INT_13:
                    case INT_14:
                    case INT_15:
                    case INT_16:
                    case INT_17:
                    case INT_18:
                    case INT_19:
                    case INT_20:
                    case INT_21:
                    case INT_22:
                    case INT_23:
                    case INT_24:
                    case INT_25:
                    case INT_26:
                    case INT_27:
                    case INT_28:
                    case INT_29:
                    case INT_30:
                    case INT_31:
                        {
                        alt7=1;
                        }
                        break;
                    case INT_32:
                    case INT_33:
                    case INT_34:
                    case INT_35:
                    case INT_36:
                    case INT_37:
                    case INT_38:
                    case INT_39:
                    case INT_40:
                    case INT_41:
                    case INT_42:
                    case INT_43:
                    case INT_44:
                    case INT_45:
                    case INT_46:
                    case INT_47:
                    case INT_48:
                    case INT_49:
                    case INT_50:
                    case INT_51:
                    case INT_52:
                    case INT_53:
                    case INT_54:
                    case INT_55:
                    case INT_56:
                    case INT_57:
                    case INT_58:
                    case INT_59:
                        {
                        alt7=2;
                        }
                        break;
                    case INT_60:
                    case INT_61:
                    case INT_62:
                    case INT_63:
                    case INT_64:
                    case INT_65:
                    case INT_66:
                    case INT_67:
                    case INT_68:
                    case INT_69:
                    case INT_70:
                    case INT_71:
                    case INT_72:
                    case INT_73:
                    case INT_74:
                    case INT_75:
                    case INT_76:
                    case INT_77:
                    case INT_78:
                    case INT_79:
                    case INT_80:
                    case INT_81:
                    case INT_82:
                    case INT_83:
                    case INT_84:
                    case INT_85:
                    case INT_86:
                    case INT_87:
                    case INT_88:
                    case INT_89:
                    case INT_90:
                    case INT_91:
                    case INT_92:
                    case INT_93:
                    case INT_94:
                    case INT_95:
                    case INT_96:
                    case INT_97:
                    case INT_98:
                    case INT_99:
                        {
                        alt7=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(7);}

                    switch (alt7) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:67:7: int_01_to_31_optional_prefix
                            {
                            dbg.location(67,7);
                            pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_optional_prefix297);
                            int_01_to_31_optional_prefix24=int_01_to_31_optional_prefix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_int_01_to_31_optional_prefix.add(int_01_to_31_optional_prefix24.getTree());

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:67:38: int_32_to_59
                            {
                            dbg.location(67,38);
                            pushFollow(FOLLOW_int_32_to_59_in_spelled_or_int_optional_prefix301);
                            int_32_to_5925=int_32_to_59();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_int_32_to_59.add(int_32_to_5925.getTree());

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // NumericRules.g:67:53: int_60_to_99
                            {
                            dbg.location(67,53);
                            pushFollow(FOLLOW_int_60_to_99_in_spelled_or_int_optional_prefix305);
                            int_60_to_9926=int_60_to_99();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_int_60_to_99.add(int_60_to_9926.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(7);}

                    dbg.location(68,6);
                    // NumericRules.g:68:6: ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 )?
                    int alt8=4;
                    try { dbg.enterSubRule(8);
                    try { dbg.enterDecision(8);

                    switch ( input.LA(1) ) {
                        case INT_01:
                        case INT_02:
                        case INT_03:
                        case INT_04:
                        case INT_05:
                        case INT_06:
                        case INT_07:
                        case INT_08:
                        case INT_09:
                        case INT_1:
                        case INT_2:
                        case INT_3:
                        case INT_4:
                        case INT_5:
                        case INT_6:
                        case INT_7:
                        case INT_8:
                        case INT_9:
                        case INT_10:
                        case INT_11:
                        case INT_12:
                        case INT_13:
                        case INT_14:
                        case INT_15:
                        case INT_16:
                        case INT_17:
                        case INT_18:
                        case INT_19:
                        case INT_20:
                        case INT_21:
                        case INT_22:
                        case INT_23:
                        case INT_24:
                        case INT_25:
                        case INT_26:
                        case INT_27:
                        case INT_28:
                        case INT_29:
                        case INT_30:
                        case INT_31:
                            {
                            alt8=1;
                            }
                            break;
                        case INT_32:
                        case INT_33:
                        case INT_34:
                        case INT_35:
                        case INT_36:
                        case INT_37:
                        case INT_38:
                        case INT_39:
                        case INT_40:
                        case INT_41:
                        case INT_42:
                        case INT_43:
                        case INT_44:
                        case INT_45:
                        case INT_46:
                        case INT_47:
                        case INT_48:
                        case INT_49:
                        case INT_50:
                        case INT_51:
                        case INT_52:
                        case INT_53:
                        case INT_54:
                        case INT_55:
                        case INT_56:
                        case INT_57:
                        case INT_58:
                        case INT_59:
                            {
                            alt8=2;
                            }
                            break;
                        case INT_60:
                        case INT_61:
                        case INT_62:
                        case INT_63:
                        case INT_64:
                        case INT_65:
                        case INT_66:
                        case INT_67:
                        case INT_68:
                        case INT_69:
                        case INT_70:
                        case INT_71:
                        case INT_72:
                        case INT_73:
                        case INT_74:
                        case INT_75:
                        case INT_76:
                        case INT_77:
                        case INT_78:
                        case INT_79:
                        case INT_80:
                        case INT_81:
                        case INT_82:
                        case INT_83:
                        case INT_84:
                        case INT_85:
                        case INT_86:
                        case INT_87:
                        case INT_88:
                        case INT_89:
                        case INT_90:
                        case INT_91:
                        case INT_92:
                        case INT_93:
                        case INT_94:
                        case INT_95:
                        case INT_96:
                        case INT_97:
                        case INT_98:
                        case INT_99:
                            {
                            alt8=3;
                            }
                            break;
                    }

                    } finally {dbg.exitDecision(8);}

                    switch (alt8) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:68:7: int_01_to_31_optional_prefix
                            {
                            dbg.location(68,7);
                            pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_optional_prefix314);
                            int_01_to_31_optional_prefix27=int_01_to_31_optional_prefix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_int_01_to_31_optional_prefix.add(int_01_to_31_optional_prefix27.getTree());

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:68:38: int_32_to_59
                            {
                            dbg.location(68,38);
                            pushFollow(FOLLOW_int_32_to_59_in_spelled_or_int_optional_prefix318);
                            int_32_to_5928=int_32_to_59();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_int_32_to_59.add(int_32_to_5928.getTree());

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // NumericRules.g:68:53: int_60_to_99
                            {
                            dbg.location(68,53);
                            pushFollow(FOLLOW_int_60_to_99_in_spelled_or_int_optional_prefix322);
                            int_60_to_9929=int_60_to_99();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_int_60_to_99.add(int_60_to_9929.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(8);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 69:8: -> INT[$spelled_or_int_optional_prefix.text]
                    {
                        dbg.location(69,11);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(70, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "spelled_or_int_optional_prefix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "spelled_or_int_optional_prefix"

    public static class spelled_one_to_thirty_one_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_one_to_thirty_one"
    // NumericRules.g:73:1: spelled_one_to_thirty_one : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | ( TWENTY WHITE_SPACE ONE )=> TWENTY WHITE_SPACE ONE -> INT[\"21\"] | TWENTY ( DASH )? ONE -> INT[\"21\"] | ( TWENTY WHITE_SPACE TWO )=> TWENTY WHITE_SPACE TWO -> INT[\"22\"] | TWENTY ( DASH )? TWO -> INT[\"22\"] | ( TWENTY WHITE_SPACE THREE )=> TWENTY WHITE_SPACE THREE -> INT[\"23\"] | TWENTY ( DASH )? THREE -> INT[\"23\"] | ( TWENTY WHITE_SPACE FOUR )=> TWENTY WHITE_SPACE FOUR -> INT[\"24\"] | TWENTY ( DASH )? FOUR -> INT[\"24\"] | ( TWENTY WHITE_SPACE FIVE )=> TWENTY WHITE_SPACE FIVE -> INT[\"25\"] | TWENTY ( DASH )? FIVE -> INT[\"25\"] | ( TWENTY WHITE_SPACE SIX )=> TWENTY WHITE_SPACE SIX -> INT[\"26\"] | TWENTY ( DASH )? SIX -> INT[\"26\"] | ( TWENTY WHITE_SPACE SEVEN )=> TWENTY WHITE_SPACE SEVEN -> INT[\"27\"] | TWENTY ( DASH )? SEVEN -> INT[\"27\"] | ( TWENTY WHITE_SPACE EIGHT )=> TWENTY WHITE_SPACE EIGHT -> INT[\"28\"] | TWENTY ( DASH )? EIGHT -> INT[\"28\"] | ( TWENTY WHITE_SPACE NINE )=> TWENTY WHITE_SPACE NINE -> INT[\"29\"] | TWENTY ( DASH )? NINE -> INT[\"29\"] | TWENTY -> INT[\"20\"] | ( THIRTY WHITE_SPACE ONE )=> THIRTY WHITE_SPACE ONE -> INT[\"31\"] | THIRTY ( DASH )? ONE -> INT[\"31\"] | THIRTY -> INT[\"30\"] );
    public final DateParser_NumericRules.spelled_one_to_thirty_one_return spelled_one_to_thirty_one() throws RecognitionException {
        DateParser_NumericRules.spelled_one_to_thirty_one_return retval = new DateParser_NumericRules.spelled_one_to_thirty_one_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE30=null;
        Token TWO31=null;
        Token THREE32=null;
        Token FOUR33=null;
        Token FIVE34=null;
        Token SIX35=null;
        Token SEVEN36=null;
        Token EIGHT37=null;
        Token NINE38=null;
        Token TEN39=null;
        Token ELEVEN40=null;
        Token TWELVE41=null;
        Token THIRTEEN42=null;
        Token FOURTEEN43=null;
        Token FIFTEEN44=null;
        Token SIXTEEN45=null;
        Token SEVENTEEN46=null;
        Token EIGHTEEN47=null;
        Token NINETEEN48=null;
        Token TWENTY49=null;
        Token WHITE_SPACE50=null;
        Token ONE51=null;
        Token TWENTY52=null;
        Token DASH53=null;
        Token ONE54=null;
        Token TWENTY55=null;
        Token WHITE_SPACE56=null;
        Token TWO57=null;
        Token TWENTY58=null;
        Token DASH59=null;
        Token TWO60=null;
        Token TWENTY61=null;
        Token WHITE_SPACE62=null;
        Token THREE63=null;
        Token TWENTY64=null;
        Token DASH65=null;
        Token THREE66=null;
        Token TWENTY67=null;
        Token WHITE_SPACE68=null;
        Token FOUR69=null;
        Token TWENTY70=null;
        Token DASH71=null;
        Token FOUR72=null;
        Token TWENTY73=null;
        Token WHITE_SPACE74=null;
        Token FIVE75=null;
        Token TWENTY76=null;
        Token DASH77=null;
        Token FIVE78=null;
        Token TWENTY79=null;
        Token WHITE_SPACE80=null;
        Token SIX81=null;
        Token TWENTY82=null;
        Token DASH83=null;
        Token SIX84=null;
        Token TWENTY85=null;
        Token WHITE_SPACE86=null;
        Token SEVEN87=null;
        Token TWENTY88=null;
        Token DASH89=null;
        Token SEVEN90=null;
        Token TWENTY91=null;
        Token WHITE_SPACE92=null;
        Token EIGHT93=null;
        Token TWENTY94=null;
        Token DASH95=null;
        Token EIGHT96=null;
        Token TWENTY97=null;
        Token WHITE_SPACE98=null;
        Token NINE99=null;
        Token TWENTY100=null;
        Token DASH101=null;
        Token NINE102=null;
        Token TWENTY103=null;
        Token THIRTY104=null;
        Token WHITE_SPACE105=null;
        Token ONE106=null;
        Token THIRTY107=null;
        Token DASH108=null;
        Token ONE109=null;
        Token THIRTY110=null;

        Object ONE30_tree=null;
        Object TWO31_tree=null;
        Object THREE32_tree=null;
        Object FOUR33_tree=null;
        Object FIVE34_tree=null;
        Object SIX35_tree=null;
        Object SEVEN36_tree=null;
        Object EIGHT37_tree=null;
        Object NINE38_tree=null;
        Object TEN39_tree=null;
        Object ELEVEN40_tree=null;
        Object TWELVE41_tree=null;
        Object THIRTEEN42_tree=null;
        Object FOURTEEN43_tree=null;
        Object FIFTEEN44_tree=null;
        Object SIXTEEN45_tree=null;
        Object SEVENTEEN46_tree=null;
        Object EIGHTEEN47_tree=null;
        Object NINETEEN48_tree=null;
        Object TWENTY49_tree=null;
        Object WHITE_SPACE50_tree=null;
        Object ONE51_tree=null;
        Object TWENTY52_tree=null;
        Object DASH53_tree=null;
        Object ONE54_tree=null;
        Object TWENTY55_tree=null;
        Object WHITE_SPACE56_tree=null;
        Object TWO57_tree=null;
        Object TWENTY58_tree=null;
        Object DASH59_tree=null;
        Object TWO60_tree=null;
        Object TWENTY61_tree=null;
        Object WHITE_SPACE62_tree=null;
        Object THREE63_tree=null;
        Object TWENTY64_tree=null;
        Object DASH65_tree=null;
        Object THREE66_tree=null;
        Object TWENTY67_tree=null;
        Object WHITE_SPACE68_tree=null;
        Object FOUR69_tree=null;
        Object TWENTY70_tree=null;
        Object DASH71_tree=null;
        Object FOUR72_tree=null;
        Object TWENTY73_tree=null;
        Object WHITE_SPACE74_tree=null;
        Object FIVE75_tree=null;
        Object TWENTY76_tree=null;
        Object DASH77_tree=null;
        Object FIVE78_tree=null;
        Object TWENTY79_tree=null;
        Object WHITE_SPACE80_tree=null;
        Object SIX81_tree=null;
        Object TWENTY82_tree=null;
        Object DASH83_tree=null;
        Object SIX84_tree=null;
        Object TWENTY85_tree=null;
        Object WHITE_SPACE86_tree=null;
        Object SEVEN87_tree=null;
        Object TWENTY88_tree=null;
        Object DASH89_tree=null;
        Object SEVEN90_tree=null;
        Object TWENTY91_tree=null;
        Object WHITE_SPACE92_tree=null;
        Object EIGHT93_tree=null;
        Object TWENTY94_tree=null;
        Object DASH95_tree=null;
        Object EIGHT96_tree=null;
        Object TWENTY97_tree=null;
        Object WHITE_SPACE98_tree=null;
        Object NINE99_tree=null;
        Object TWENTY100_tree=null;
        Object DASH101_tree=null;
        Object NINE102_tree=null;
        Object TWENTY103_tree=null;
        Object THIRTY104_tree=null;
        Object WHITE_SPACE105_tree=null;
        Object ONE106_tree=null;
        Object THIRTY107_tree=null;
        Object DASH108_tree=null;
        Object ONE109_tree=null;
        Object THIRTY110_tree=null;
        RewriteRuleTokenStream stream_EIGHT=new RewriteRuleTokenStream(adaptor,"token EIGHT");
        RewriteRuleTokenStream stream_EIGHTEEN=new RewriteRuleTokenStream(adaptor,"token EIGHTEEN");
        RewriteRuleTokenStream stream_SIX=new RewriteRuleTokenStream(adaptor,"token SIX");
        RewriteRuleTokenStream stream_ONE=new RewriteRuleTokenStream(adaptor,"token ONE");
        RewriteRuleTokenStream stream_FOUR=new RewriteRuleTokenStream(adaptor,"token FOUR");
        RewriteRuleTokenStream stream_THIRTEEN=new RewriteRuleTokenStream(adaptor,"token THIRTEEN");
        RewriteRuleTokenStream stream_SIXTEEN=new RewriteRuleTokenStream(adaptor,"token SIXTEEN");
        RewriteRuleTokenStream stream_TWO=new RewriteRuleTokenStream(adaptor,"token TWO");
        RewriteRuleTokenStream stream_DASH=new RewriteRuleTokenStream(adaptor,"token DASH");
        RewriteRuleTokenStream stream_SEVENTEEN=new RewriteRuleTokenStream(adaptor,"token SEVENTEEN");
        RewriteRuleTokenStream stream_ELEVEN=new RewriteRuleTokenStream(adaptor,"token ELEVEN");
        RewriteRuleTokenStream stream_TWENTY=new RewriteRuleTokenStream(adaptor,"token TWENTY");
        RewriteRuleTokenStream stream_FIVE=new RewriteRuleTokenStream(adaptor,"token FIVE");
        RewriteRuleTokenStream stream_THIRTY=new RewriteRuleTokenStream(adaptor,"token THIRTY");
        RewriteRuleTokenStream stream_FOURTEEN=new RewriteRuleTokenStream(adaptor,"token FOURTEEN");
        RewriteRuleTokenStream stream_NINE=new RewriteRuleTokenStream(adaptor,"token NINE");
        RewriteRuleTokenStream stream_TWELVE=new RewriteRuleTokenStream(adaptor,"token TWELVE");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleTokenStream stream_FIFTEEN=new RewriteRuleTokenStream(adaptor,"token FIFTEEN");
        RewriteRuleTokenStream stream_TEN=new RewriteRuleTokenStream(adaptor,"token TEN");
        RewriteRuleTokenStream stream_NINETEEN=new RewriteRuleTokenStream(adaptor,"token NINETEEN");
        RewriteRuleTokenStream stream_THREE=new RewriteRuleTokenStream(adaptor,"token THREE");
        RewriteRuleTokenStream stream_SEVEN=new RewriteRuleTokenStream(adaptor,"token SEVEN");

        try { dbg.enterRule(getGrammarFileName(), "spelled_one_to_thirty_one");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(73, 1);

        try {
            // NumericRules.g:74:3: ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | ( TWENTY WHITE_SPACE ONE )=> TWENTY WHITE_SPACE ONE -> INT[\"21\"] | TWENTY ( DASH )? ONE -> INT[\"21\"] | ( TWENTY WHITE_SPACE TWO )=> TWENTY WHITE_SPACE TWO -> INT[\"22\"] | TWENTY ( DASH )? TWO -> INT[\"22\"] | ( TWENTY WHITE_SPACE THREE )=> TWENTY WHITE_SPACE THREE -> INT[\"23\"] | TWENTY ( DASH )? THREE -> INT[\"23\"] | ( TWENTY WHITE_SPACE FOUR )=> TWENTY WHITE_SPACE FOUR -> INT[\"24\"] | TWENTY ( DASH )? FOUR -> INT[\"24\"] | ( TWENTY WHITE_SPACE FIVE )=> TWENTY WHITE_SPACE FIVE -> INT[\"25\"] | TWENTY ( DASH )? FIVE -> INT[\"25\"] | ( TWENTY WHITE_SPACE SIX )=> TWENTY WHITE_SPACE SIX -> INT[\"26\"] | TWENTY ( DASH )? SIX -> INT[\"26\"] | ( TWENTY WHITE_SPACE SEVEN )=> TWENTY WHITE_SPACE SEVEN -> INT[\"27\"] | TWENTY ( DASH )? SEVEN -> INT[\"27\"] | ( TWENTY WHITE_SPACE EIGHT )=> TWENTY WHITE_SPACE EIGHT -> INT[\"28\"] | TWENTY ( DASH )? EIGHT -> INT[\"28\"] | ( TWENTY WHITE_SPACE NINE )=> TWENTY WHITE_SPACE NINE -> INT[\"29\"] | TWENTY ( DASH )? NINE -> INT[\"29\"] | TWENTY -> INT[\"20\"] | ( THIRTY WHITE_SPACE ONE )=> THIRTY WHITE_SPACE ONE -> INT[\"31\"] | THIRTY ( DASH )? ONE -> INT[\"31\"] | THIRTY -> INT[\"30\"] )
            int alt20=41;
            try { dbg.enterDecision(20);

            try {
                isCyclicDecision = true;
                alt20 = dfa20.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // NumericRules.g:74:5: ONE
                    {
                    dbg.location(74,5);
                    ONE30=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one354); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE30);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 74:16: -> INT[\"1\"]
                    {
                        dbg.location(74,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // NumericRules.g:75:5: TWO
                    {
                    dbg.location(75,5);
                    TWO31=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one372); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO31);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 75:16: -> INT[\"2\"]
                    {
                        dbg.location(75,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // NumericRules.g:76:5: THREE
                    {
                    dbg.location(76,5);
                    THREE32=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one390); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE32);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 76:16: -> INT[\"3\"]
                    {
                        dbg.location(76,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // NumericRules.g:77:5: FOUR
                    {
                    dbg.location(77,5);
                    FOUR33=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR33);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 77:16: -> INT[\"4\"]
                    {
                        dbg.location(77,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // NumericRules.g:78:5: FIVE
                    {
                    dbg.location(78,5);
                    FIVE34=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one423); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE34);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:16: -> INT[\"5\"]
                    {
                        dbg.location(78,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // NumericRules.g:79:5: SIX
                    {
                    dbg.location(79,5);
                    SIX35=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one440); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX35);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 79:16: -> INT[\"6\"]
                    {
                        dbg.location(79,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // NumericRules.g:80:5: SEVEN
                    {
                    dbg.location(80,5);
                    SEVEN36=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one458); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN36);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 80:16: -> INT[\"7\"]
                    {
                        dbg.location(80,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // NumericRules.g:81:5: EIGHT
                    {
                    dbg.location(81,5);
                    EIGHT37=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT37);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 81:16: -> INT[\"8\"]
                    {
                        dbg.location(81,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // NumericRules.g:82:5: NINE
                    {
                    dbg.location(82,5);
                    NINE38=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE38);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:16: -> INT[\"9\"]
                    {
                        dbg.location(82,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // NumericRules.g:83:5: TEN
                    {
                    dbg.location(83,5);
                    TEN39=(Token)match(input,TEN,FOLLOW_TEN_in_spelled_one_to_thirty_one507); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN.add(TEN39);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:16: -> INT[\"10\"]
                    {
                        dbg.location(83,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // NumericRules.g:84:5: ELEVEN
                    {
                    dbg.location(84,5);
                    ELEVEN40=(Token)match(input,ELEVEN,FOLLOW_ELEVEN_in_spelled_one_to_thirty_one525); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVEN.add(ELEVEN40);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 84:16: -> INT[\"11\"]
                    {
                        dbg.location(84,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // NumericRules.g:85:5: TWELVE
                    {
                    dbg.location(85,5);
                    TWELVE41=(Token)match(input,TWELVE,FOLLOW_TWELVE_in_spelled_one_to_thirty_one540); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELVE.add(TWELVE41);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 85:16: -> INT[\"12\"]
                    {
                        dbg.location(85,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // NumericRules.g:86:5: THIRTEEN
                    {
                    dbg.location(86,5);
                    THIRTEEN42=(Token)match(input,THIRTEEN,FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one555); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN.add(THIRTEEN42);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:16: -> INT[\"13\"]
                    {
                        dbg.location(86,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // NumericRules.g:87:5: FOURTEEN
                    {
                    dbg.location(87,5);
                    FOURTEEN43=(Token)match(input,FOURTEEN,FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one568); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEEN.add(FOURTEEN43);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 87:16: -> INT[\"14\"]
                    {
                        dbg.location(87,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // NumericRules.g:88:5: FIFTEEN
                    {
                    dbg.location(88,5);
                    FIFTEEN44=(Token)match(input,FIFTEEN,FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one581); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEEN.add(FIFTEEN44);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 88:16: -> INT[\"15\"]
                    {
                        dbg.location(88,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // NumericRules.g:89:5: SIXTEEN
                    {
                    dbg.location(89,5);
                    SIXTEEN45=(Token)match(input,SIXTEEN,FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one595); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEEN.add(SIXTEEN45);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 89:16: -> INT[\"16\"]
                    {
                        dbg.location(89,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // NumericRules.g:90:5: SEVENTEEN
                    {
                    dbg.location(90,5);
                    SEVENTEEN46=(Token)match(input,SEVENTEEN,FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one609); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEEN.add(SEVENTEEN46);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 90:16: -> INT[\"17\"]
                    {
                        dbg.location(90,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    dbg.enterAlt(18);

                    // NumericRules.g:91:5: EIGHTEEN
                    {
                    dbg.location(91,5);
                    EIGHTEEN47=(Token)match(input,EIGHTEEN,FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEEN.add(EIGHTEEN47);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 91:16: -> INT[\"18\"]
                    {
                        dbg.location(91,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    dbg.enterAlt(19);

                    // NumericRules.g:92:5: NINETEEN
                    {
                    dbg.location(92,5);
                    NINETEEN48=(Token)match(input,NINETEEN,FOLLOW_NINETEEN_in_spelled_one_to_thirty_one634); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEEN.add(NINETEEN48);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 92:16: -> INT[\"19\"]
                    {
                        dbg.location(92,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    dbg.enterAlt(20);

                    // NumericRules.g:93:5: ( TWENTY WHITE_SPACE ONE )=> TWENTY WHITE_SPACE ONE
                    {
                    dbg.location(93,34);
                    TWENTY49=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one658); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY49);

                    dbg.location(93,41);
                    WHITE_SPACE50=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE50);

                    dbg.location(93,53);
                    ONE51=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one662); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE51);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 93:59: -> INT[\"21\"]
                    {
                        dbg.location(93,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    dbg.enterAlt(21);

                    // NumericRules.g:94:5: TWENTY ( DASH )? ONE
                    {
                    dbg.location(94,5);
                    TWENTY52=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one675); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY52);

                    dbg.location(94,12);
                    // NumericRules.g:94:12: ( DASH )?
                    int alt10=2;
                    try { dbg.enterSubRule(10);
                    try { dbg.enterDecision(10);

                    switch ( input.LA(1) ) {
                        case DASH:
                            {
                            alt10=1;
                            }
                            break;
                    }

                    } finally {dbg.exitDecision(10);}

                    switch (alt10) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:94:12: DASH
                            {
                            dbg.location(94,12);
                            DASH53=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one677); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH53);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(10);}

                    dbg.location(94,18);
                    ONE54=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one680); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE54);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 94:59: -> INT[\"21\"]
                    {
                        dbg.location(94,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    dbg.enterAlt(22);

                    // NumericRules.g:95:5: ( TWENTY WHITE_SPACE TWO )=> TWENTY WHITE_SPACE TWO
                    {
                    dbg.location(95,34);
                    TWENTY55=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one739); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY55);

                    dbg.location(95,41);
                    WHITE_SPACE56=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one741); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE56);

                    dbg.location(95,53);
                    TWO57=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO57);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 95:59: -> INT[\"22\"]
                    {
                        dbg.location(95,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    dbg.enterAlt(23);

                    // NumericRules.g:96:5: TWENTY ( DASH )? TWO
                    {
                    dbg.location(96,5);
                    TWENTY58=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY58);

                    dbg.location(96,12);
                    // NumericRules.g:96:12: ( DASH )?
                    int alt11=2;
                    try { dbg.enterSubRule(11);
                    try { dbg.enterDecision(11);

                    switch ( input.LA(1) ) {
                        case DASH:
                            {
                            alt11=1;
                            }
                            break;
                    }

                    } finally {dbg.exitDecision(11);}

                    switch (alt11) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:96:12: DASH
                            {
                            dbg.location(96,12);
                            DASH59=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one758); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH59);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(11);}

                    dbg.location(96,18);
                    TWO60=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one761); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO60);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 96:59: -> INT[\"22\"]
                    {
                        dbg.location(96,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    dbg.enterAlt(24);

                    // NumericRules.g:97:5: ( TWENTY WHITE_SPACE THREE )=> TWENTY WHITE_SPACE THREE
                    {
                    dbg.location(97,34);
                    TWENTY61=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one818); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY61);

                    dbg.location(97,41);
                    WHITE_SPACE62=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one820); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE62);

                    dbg.location(97,53);
                    THREE63=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one822); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE63);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 97:59: -> INT[\"23\"]
                    {
                        dbg.location(97,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    dbg.enterAlt(25);

                    // NumericRules.g:98:5: TWENTY ( DASH )? THREE
                    {
                    dbg.location(98,5);
                    TWENTY64=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one833); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY64);

                    dbg.location(98,12);
                    // NumericRules.g:98:12: ( DASH )?
                    int alt12=2;
                    try { dbg.enterSubRule(12);
                    try { dbg.enterDecision(12);

                    switch ( input.LA(1) ) {
                        case DASH:
                            {
                            alt12=1;
                            }
                            break;
                    }

                    } finally {dbg.exitDecision(12);}

                    switch (alt12) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:98:12: DASH
                            {
                            dbg.location(98,12);
                            DASH65=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one835); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH65);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(12);}

                    dbg.location(98,18);
                    THREE66=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE66);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 98:59: -> INT[\"23\"]
                    {
                        dbg.location(98,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    dbg.enterAlt(26);

                    // NumericRules.g:99:5: ( TWENTY WHITE_SPACE FOUR )=> TWENTY WHITE_SPACE FOUR
                    {
                    dbg.location(99,34);
                    TWENTY67=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one894); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY67);

                    dbg.location(99,41);
                    WHITE_SPACE68=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one896); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE68);

                    dbg.location(99,53);
                    FOUR69=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one898); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR69);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 99:59: -> INT[\"24\"]
                    {
                        dbg.location(99,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    dbg.enterAlt(27);

                    // NumericRules.g:100:5: TWENTY ( DASH )? FOUR
                    {
                    dbg.location(100,5);
                    TWENTY70=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one910); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY70);

                    dbg.location(100,12);
                    // NumericRules.g:100:12: ( DASH )?
                    int alt13=2;
                    try { dbg.enterSubRule(13);
                    try { dbg.enterDecision(13);

                    switch ( input.LA(1) ) {
                        case DASH:
                            {
                            alt13=1;
                            }
                            break;
                    }

                    } finally {dbg.exitDecision(13);}

                    switch (alt13) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:100:12: DASH
                            {
                            dbg.location(100,12);
                            DASH71=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one912); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH71);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(13);}

                    dbg.location(100,18);
                    FOUR72=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one915); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR72);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 100:59: -> INT[\"24\"]
                    {
                        dbg.location(100,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    dbg.enterAlt(28);

                    // NumericRules.g:101:5: ( TWENTY WHITE_SPACE FIVE )=> TWENTY WHITE_SPACE FIVE
                    {
                    dbg.location(101,34);
                    TWENTY73=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one972); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY73);

                    dbg.location(101,41);
                    WHITE_SPACE74=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one974); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE74);

                    dbg.location(101,53);
                    FIVE75=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one976); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE75);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 101:59: -> INT[\"25\"]
                    {
                        dbg.location(101,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    dbg.enterAlt(29);

                    // NumericRules.g:102:5: TWENTY ( DASH )? FIVE
                    {
                    dbg.location(102,5);
                    TWENTY76=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one988); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY76);

                    dbg.location(102,12);
                    // NumericRules.g:102:12: ( DASH )?
                    int alt14=2;
                    try { dbg.enterSubRule(14);
                    try { dbg.enterDecision(14);

                    switch ( input.LA(1) ) {
                        case DASH:
                            {
                            alt14=1;
                            }
                            break;
                    }

                    } finally {dbg.exitDecision(14);}

                    switch (alt14) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:102:12: DASH
                            {
                            dbg.location(102,12);
                            DASH77=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one990); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH77);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(14);}

                    dbg.location(102,18);
                    FIVE78=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one993); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE78);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 102:59: -> INT[\"25\"]
                    {
                        dbg.location(102,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    dbg.enterAlt(30);

                    // NumericRules.g:103:5: ( TWENTY WHITE_SPACE SIX )=> TWENTY WHITE_SPACE SIX
                    {
                    dbg.location(103,34);
                    TWENTY79=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1051); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY79);

                    dbg.location(103,41);
                    WHITE_SPACE80=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1053); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE80);

                    dbg.location(103,53);
                    SIX81=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one1055); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX81);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:59: -> INT[\"26\"]
                    {
                        dbg.location(103,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    dbg.enterAlt(31);

                    // NumericRules.g:104:5: TWENTY ( DASH )? SIX
                    {
                    dbg.location(104,5);
                    TWENTY82=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1068); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY82);

                    dbg.location(104,12);
                    // NumericRules.g:104:12: ( DASH )?
                    int alt15=2;
                    try { dbg.enterSubRule(15);
                    try { dbg.enterDecision(15);

                    switch ( input.LA(1) ) {
                        case DASH:
                            {
                            alt15=1;
                            }
                            break;
                    }

                    } finally {dbg.exitDecision(15);}

                    switch (alt15) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:104:12: DASH
                            {
                            dbg.location(104,12);
                            DASH83=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one1070); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH83);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(15);}

                    dbg.location(104,18);
                    SIX84=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one1073); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX84);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:59: -> INT[\"26\"]
                    {
                        dbg.location(104,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 32 :
                    dbg.enterAlt(32);

                    // NumericRules.g:105:5: ( TWENTY WHITE_SPACE SEVEN )=> TWENTY WHITE_SPACE SEVEN
                    {
                    dbg.location(105,34);
                    TWENTY85=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1130); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY85);

                    dbg.location(105,41);
                    WHITE_SPACE86=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1132); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE86);

                    dbg.location(105,53);
                    SEVEN87=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one1134); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN87);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:59: -> INT[\"27\"]
                    {
                        dbg.location(105,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 33 :
                    dbg.enterAlt(33);

                    // NumericRules.g:106:5: TWENTY ( DASH )? SEVEN
                    {
                    dbg.location(106,5);
                    TWENTY88=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1145); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY88);

                    dbg.location(106,12);
                    // NumericRules.g:106:12: ( DASH )?
                    int alt16=2;
                    try { dbg.enterSubRule(16);
                    try { dbg.enterDecision(16);

                    switch ( input.LA(1) ) {
                        case DASH:
                            {
                            alt16=1;
                            }
                            break;
                    }

                    } finally {dbg.exitDecision(16);}

                    switch (alt16) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:106:12: DASH
                            {
                            dbg.location(106,12);
                            DASH89=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one1147); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH89);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(16);}

                    dbg.location(106,18);
                    SEVEN90=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one1150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN90);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:59: -> INT[\"27\"]
                    {
                        dbg.location(106,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 34 :
                    dbg.enterAlt(34);

                    // NumericRules.g:107:5: ( TWENTY WHITE_SPACE EIGHT )=> TWENTY WHITE_SPACE EIGHT
                    {
                    dbg.location(107,34);
                    TWENTY91=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1205); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY91);

                    dbg.location(107,41);
                    WHITE_SPACE92=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1207); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE92);

                    dbg.location(107,53);
                    EIGHT93=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one1209); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT93);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:59: -> INT[\"28\"]
                    {
                        dbg.location(107,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 35 :
                    dbg.enterAlt(35);

                    // NumericRules.g:108:5: TWENTY ( DASH )? EIGHT
                    {
                    dbg.location(108,5);
                    TWENTY94=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1220); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY94);

                    dbg.location(108,12);
                    // NumericRules.g:108:12: ( DASH )?
                    int alt17=2;
                    try { dbg.enterSubRule(17);
                    try { dbg.enterDecision(17);

                    switch ( input.LA(1) ) {
                        case DASH:
                            {
                            alt17=1;
                            }
                            break;
                    }

                    } finally {dbg.exitDecision(17);}

                    switch (alt17) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:108:12: DASH
                            {
                            dbg.location(108,12);
                            DASH95=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one1222); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH95);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(17);}

                    dbg.location(108,18);
                    EIGHT96=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one1225); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT96);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:59: -> INT[\"28\"]
                    {
                        dbg.location(108,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 36 :
                    dbg.enterAlt(36);

                    // NumericRules.g:109:5: ( TWENTY WHITE_SPACE NINE )=> TWENTY WHITE_SPACE NINE
                    {
                    dbg.location(109,34);
                    TWENTY97=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1281); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY97);

                    dbg.location(109,41);
                    WHITE_SPACE98=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1283); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE98);

                    dbg.location(109,53);
                    NINE99=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one1285); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE99);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:59: -> INT[\"29\"]
                    {
                        dbg.location(109,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 37 :
                    dbg.enterAlt(37);

                    // NumericRules.g:110:5: TWENTY ( DASH )? NINE
                    {
                    dbg.location(110,5);
                    TWENTY100=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1297); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY100);

                    dbg.location(110,12);
                    // NumericRules.g:110:12: ( DASH )?
                    int alt18=2;
                    try { dbg.enterSubRule(18);
                    try { dbg.enterDecision(18);

                    switch ( input.LA(1) ) {
                        case DASH:
                            {
                            alt18=1;
                            }
                            break;
                    }

                    } finally {dbg.exitDecision(18);}

                    switch (alt18) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:110:12: DASH
                            {
                            dbg.location(110,12);
                            DASH101=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one1299); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH101);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(18);}

                    dbg.location(110,18);
                    NINE102=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one1302); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE102);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 110:59: -> INT[\"29\"]
                    {
                        dbg.location(110,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 38 :
                    dbg.enterAlt(38);

                    // NumericRules.g:111:5: TWENTY
                    {
                    dbg.location(111,5);
                    TWENTY103=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1349); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY103);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 111:59: -> INT[\"20\"]
                    {
                        dbg.location(111,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 39 :
                    dbg.enterAlt(39);

                    // NumericRules.g:112:5: ( THIRTY WHITE_SPACE ONE )=> THIRTY WHITE_SPACE ONE
                    {
                    dbg.location(112,34);
                    THIRTY104=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one1418); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY104);

                    dbg.location(112,41);
                    WHITE_SPACE105=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1420); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE105);

                    dbg.location(112,53);
                    ONE106=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one1422); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE106);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 112:59: -> INT[\"31\"]
                    {
                        dbg.location(112,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "31"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 40 :
                    dbg.enterAlt(40);

                    // NumericRules.g:113:5: THIRTY ( DASH )? ONE
                    {
                    dbg.location(113,5);
                    THIRTY107=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one1435); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY107);

                    dbg.location(113,12);
                    // NumericRules.g:113:12: ( DASH )?
                    int alt19=2;
                    try { dbg.enterSubRule(19);
                    try { dbg.enterDecision(19);

                    switch ( input.LA(1) ) {
                        case DASH:
                            {
                            alt19=1;
                            }
                            break;
                    }

                    } finally {dbg.exitDecision(19);}

                    switch (alt19) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:113:12: DASH
                            {
                            dbg.location(113,12);
                            DASH108=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one1437); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH108);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(19);}

                    dbg.location(113,18);
                    ONE109=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one1440); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE109);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:59: -> INT[\"31\"]
                    {
                        dbg.location(113,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "31"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 41 :
                    dbg.enterAlt(41);

                    // NumericRules.g:114:5: THIRTY
                    {
                    dbg.location(114,5);
                    THIRTY110=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one1488); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY110);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:59: -> INT[\"30\"]
                    {
                        dbg.location(114,62);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(115, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "spelled_one_to_thirty_one");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "spelled_one_to_thirty_one"

    public static class spelled_first_to_thirty_first_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_first_to_thirty_first"
    // NumericRules.g:118:1: spelled_first_to_thirty_first : ( ( FIRST | INT_1 ST ) -> INT[\"1\"] | ( SECOND | INT_2 ND ) -> INT[\"2\"] | ( THIRD | INT_3 RD ) -> INT[\"3\"] | ( FOURTH | INT_4 TH ) -> INT[\"4\"] | ( FIFTH | INT_5 TH ) -> INT[\"5\"] | ( SIXTH | INT_6 TH ) -> INT[\"6\"] | ( SEVENTH | INT_7 TH ) -> INT[\"7\"] | ( EIGHTH | INT_8 TH ) -> INT[\"8\"] | ( NINTH | INT_9 TH ) -> INT[\"9\"] | ( TENTH | INT_10 TH ) -> INT[\"10\"] | ( ELEVENTH | INT_11 TH ) -> INT[\"11\"] | ( TWELFTH | INT_12 TH ) -> INT[\"12\"] | ( THIRTEENTH | INT_13 TH ) -> INT[\"13\"] | ( FOURTEENTH | INT_14 TH ) -> INT[\"14\"] | ( FIFTEENTH | INT_15 TH ) -> INT[\"15\"] | ( SIXTEENTH | INT_16 TH ) -> INT[\"16\"] | ( SEVENTEENTH | INT_17 TH ) -> INT[\"17\"] | ( EIGHTEENTH | INT_18 TH ) -> INT[\"18\"] | ( NINETEENTH | INT_19 TH ) -> INT[\"19\"] | ( TWENTIETH | INT_20 TH ) -> INT[\"20\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) | INT_21 ST ) -> INT[\"21\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) | INT_22 ND ) -> INT[\"22\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) | INT_23 RD ) -> INT[\"23\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) | INT_24 TH ) -> INT[\"24\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) | INT_25 TH ) -> INT[\"25\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) | INT_26 TH ) -> INT[\"26\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) | INT_27 TH ) -> INT[\"27\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) | INT_28 TH ) -> INT[\"28\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) | INT_29 TH ) -> INT[\"29\"] | ( THIRTIETH | INT_30 TH ) -> INT[\"30\"] | ( ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) | INT_31 ST ) -> INT[\"31\"] );
    public final DateParser_NumericRules.spelled_first_to_thirty_first_return spelled_first_to_thirty_first() throws RecognitionException {
        DateParser_NumericRules.spelled_first_to_thirty_first_return retval = new DateParser_NumericRules.spelled_first_to_thirty_first_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FIRST111=null;
        Token INT_1112=null;
        Token ST113=null;
        Token SECOND114=null;
        Token INT_2115=null;
        Token ND116=null;
        Token THIRD117=null;
        Token INT_3118=null;
        Token RD119=null;
        Token FOURTH120=null;
        Token INT_4121=null;
        Token TH122=null;
        Token FIFTH123=null;
        Token INT_5124=null;
        Token TH125=null;
        Token SIXTH126=null;
        Token INT_6127=null;
        Token TH128=null;
        Token SEVENTH129=null;
        Token INT_7130=null;
        Token TH131=null;
        Token EIGHTH132=null;
        Token INT_8133=null;
        Token TH134=null;
        Token NINTH135=null;
        Token INT_9136=null;
        Token TH137=null;
        Token TENTH138=null;
        Token INT_10139=null;
        Token TH140=null;
        Token ELEVENTH141=null;
        Token INT_11142=null;
        Token TH143=null;
        Token TWELFTH144=null;
        Token INT_12145=null;
        Token TH146=null;
        Token THIRTEENTH147=null;
        Token INT_13148=null;
        Token TH149=null;
        Token FOURTEENTH150=null;
        Token INT_14151=null;
        Token TH152=null;
        Token FIFTEENTH153=null;
        Token INT_15154=null;
        Token TH155=null;
        Token SIXTEENTH156=null;
        Token INT_16157=null;
        Token TH158=null;
        Token SEVENTEENTH159=null;
        Token INT_17160=null;
        Token TH161=null;
        Token EIGHTEENTH162=null;
        Token INT_18163=null;
        Token TH164=null;
        Token NINETEENTH165=null;
        Token INT_19166=null;
        Token TH167=null;
        Token TWENTIETH168=null;
        Token INT_20169=null;
        Token TH170=null;
        Token TWENTY171=null;
        Token DASH172=null;
        Token WHITE_SPACE173=null;
        Token FIRST174=null;
        Token INT_21175=null;
        Token ST176=null;
        Token TWENTY177=null;
        Token DASH178=null;
        Token WHITE_SPACE179=null;
        Token SECOND180=null;
        Token INT_22181=null;
        Token ND182=null;
        Token TWENTY183=null;
        Token DASH184=null;
        Token WHITE_SPACE185=null;
        Token THIRD186=null;
        Token INT_23187=null;
        Token RD188=null;
        Token TWENTY189=null;
        Token DASH190=null;
        Token WHITE_SPACE191=null;
        Token FOURTH192=null;
        Token INT_24193=null;
        Token TH194=null;
        Token TWENTY195=null;
        Token DASH196=null;
        Token WHITE_SPACE197=null;
        Token FIFTH198=null;
        Token INT_25199=null;
        Token TH200=null;
        Token TWENTY201=null;
        Token DASH202=null;
        Token WHITE_SPACE203=null;
        Token SIXTH204=null;
        Token INT_26205=null;
        Token TH206=null;
        Token TWENTY207=null;
        Token DASH208=null;
        Token WHITE_SPACE209=null;
        Token SEVENTH210=null;
        Token INT_27211=null;
        Token TH212=null;
        Token TWENTY213=null;
        Token DASH214=null;
        Token WHITE_SPACE215=null;
        Token EIGHTH216=null;
        Token INT_28217=null;
        Token TH218=null;
        Token TWENTY219=null;
        Token DASH220=null;
        Token WHITE_SPACE221=null;
        Token NINTH222=null;
        Token INT_29223=null;
        Token TH224=null;
        Token THIRTIETH225=null;
        Token INT_30226=null;
        Token TH227=null;
        Token THIRTY228=null;
        Token DASH229=null;
        Token WHITE_SPACE230=null;
        Token FIRST231=null;
        Token INT_31232=null;
        Token ST233=null;

        Object FIRST111_tree=null;
        Object INT_1112_tree=null;
        Object ST113_tree=null;
        Object SECOND114_tree=null;
        Object INT_2115_tree=null;
        Object ND116_tree=null;
        Object THIRD117_tree=null;
        Object INT_3118_tree=null;
        Object RD119_tree=null;
        Object FOURTH120_tree=null;
        Object INT_4121_tree=null;
        Object TH122_tree=null;
        Object FIFTH123_tree=null;
        Object INT_5124_tree=null;
        Object TH125_tree=null;
        Object SIXTH126_tree=null;
        Object INT_6127_tree=null;
        Object TH128_tree=null;
        Object SEVENTH129_tree=null;
        Object INT_7130_tree=null;
        Object TH131_tree=null;
        Object EIGHTH132_tree=null;
        Object INT_8133_tree=null;
        Object TH134_tree=null;
        Object NINTH135_tree=null;
        Object INT_9136_tree=null;
        Object TH137_tree=null;
        Object TENTH138_tree=null;
        Object INT_10139_tree=null;
        Object TH140_tree=null;
        Object ELEVENTH141_tree=null;
        Object INT_11142_tree=null;
        Object TH143_tree=null;
        Object TWELFTH144_tree=null;
        Object INT_12145_tree=null;
        Object TH146_tree=null;
        Object THIRTEENTH147_tree=null;
        Object INT_13148_tree=null;
        Object TH149_tree=null;
        Object FOURTEENTH150_tree=null;
        Object INT_14151_tree=null;
        Object TH152_tree=null;
        Object FIFTEENTH153_tree=null;
        Object INT_15154_tree=null;
        Object TH155_tree=null;
        Object SIXTEENTH156_tree=null;
        Object INT_16157_tree=null;
        Object TH158_tree=null;
        Object SEVENTEENTH159_tree=null;
        Object INT_17160_tree=null;
        Object TH161_tree=null;
        Object EIGHTEENTH162_tree=null;
        Object INT_18163_tree=null;
        Object TH164_tree=null;
        Object NINETEENTH165_tree=null;
        Object INT_19166_tree=null;
        Object TH167_tree=null;
        Object TWENTIETH168_tree=null;
        Object INT_20169_tree=null;
        Object TH170_tree=null;
        Object TWENTY171_tree=null;
        Object DASH172_tree=null;
        Object WHITE_SPACE173_tree=null;
        Object FIRST174_tree=null;
        Object INT_21175_tree=null;
        Object ST176_tree=null;
        Object TWENTY177_tree=null;
        Object DASH178_tree=null;
        Object WHITE_SPACE179_tree=null;
        Object SECOND180_tree=null;
        Object INT_22181_tree=null;
        Object ND182_tree=null;
        Object TWENTY183_tree=null;
        Object DASH184_tree=null;
        Object WHITE_SPACE185_tree=null;
        Object THIRD186_tree=null;
        Object INT_23187_tree=null;
        Object RD188_tree=null;
        Object TWENTY189_tree=null;
        Object DASH190_tree=null;
        Object WHITE_SPACE191_tree=null;
        Object FOURTH192_tree=null;
        Object INT_24193_tree=null;
        Object TH194_tree=null;
        Object TWENTY195_tree=null;
        Object DASH196_tree=null;
        Object WHITE_SPACE197_tree=null;
        Object FIFTH198_tree=null;
        Object INT_25199_tree=null;
        Object TH200_tree=null;
        Object TWENTY201_tree=null;
        Object DASH202_tree=null;
        Object WHITE_SPACE203_tree=null;
        Object SIXTH204_tree=null;
        Object INT_26205_tree=null;
        Object TH206_tree=null;
        Object TWENTY207_tree=null;
        Object DASH208_tree=null;
        Object WHITE_SPACE209_tree=null;
        Object SEVENTH210_tree=null;
        Object INT_27211_tree=null;
        Object TH212_tree=null;
        Object TWENTY213_tree=null;
        Object DASH214_tree=null;
        Object WHITE_SPACE215_tree=null;
        Object EIGHTH216_tree=null;
        Object INT_28217_tree=null;
        Object TH218_tree=null;
        Object TWENTY219_tree=null;
        Object DASH220_tree=null;
        Object WHITE_SPACE221_tree=null;
        Object NINTH222_tree=null;
        Object INT_29223_tree=null;
        Object TH224_tree=null;
        Object THIRTIETH225_tree=null;
        Object INT_30226_tree=null;
        Object TH227_tree=null;
        Object THIRTY228_tree=null;
        Object DASH229_tree=null;
        Object WHITE_SPACE230_tree=null;
        Object FIRST231_tree=null;
        Object INT_31232_tree=null;
        Object ST233_tree=null;
        RewriteRuleTokenStream stream_SIXTH=new RewriteRuleTokenStream(adaptor,"token SIXTH");
        RewriteRuleTokenStream stream_THIRD=new RewriteRuleTokenStream(adaptor,"token THIRD");
        RewriteRuleTokenStream stream_INT_10=new RewriteRuleTokenStream(adaptor,"token INT_10");
        RewriteRuleTokenStream stream_DASH=new RewriteRuleTokenStream(adaptor,"token DASH");
        RewriteRuleTokenStream stream_FOURTEENTH=new RewriteRuleTokenStream(adaptor,"token FOURTEENTH");
        RewriteRuleTokenStream stream_INT_15=new RewriteRuleTokenStream(adaptor,"token INT_15");
        RewriteRuleTokenStream stream_INT_16=new RewriteRuleTokenStream(adaptor,"token INT_16");
        RewriteRuleTokenStream stream_INT_17=new RewriteRuleTokenStream(adaptor,"token INT_17");
        RewriteRuleTokenStream stream_THIRTY=new RewriteRuleTokenStream(adaptor,"token THIRTY");
        RewriteRuleTokenStream stream_INT_18=new RewriteRuleTokenStream(adaptor,"token INT_18");
        RewriteRuleTokenStream stream_INT_11=new RewriteRuleTokenStream(adaptor,"token INT_11");
        RewriteRuleTokenStream stream_INT_12=new RewriteRuleTokenStream(adaptor,"token INT_12");
        RewriteRuleTokenStream stream_INT_13=new RewriteRuleTokenStream(adaptor,"token INT_13");
        RewriteRuleTokenStream stream_INT_14=new RewriteRuleTokenStream(adaptor,"token INT_14");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleTokenStream stream_INT_19=new RewriteRuleTokenStream(adaptor,"token INT_19");
        RewriteRuleTokenStream stream_TWENTIETH=new RewriteRuleTokenStream(adaptor,"token TWENTIETH");
        RewriteRuleTokenStream stream_INT_20=new RewriteRuleTokenStream(adaptor,"token INT_20");
        RewriteRuleTokenStream stream_INT_21=new RewriteRuleTokenStream(adaptor,"token INT_21");
        RewriteRuleTokenStream stream_TWENTY=new RewriteRuleTokenStream(adaptor,"token TWENTY");
        RewriteRuleTokenStream stream_INT_26=new RewriteRuleTokenStream(adaptor,"token INT_26");
        RewriteRuleTokenStream stream_INT_27=new RewriteRuleTokenStream(adaptor,"token INT_27");
        RewriteRuleTokenStream stream_RD=new RewriteRuleTokenStream(adaptor,"token RD");
        RewriteRuleTokenStream stream_INT_28=new RewriteRuleTokenStream(adaptor,"token INT_28");
        RewriteRuleTokenStream stream_INT_29=new RewriteRuleTokenStream(adaptor,"token INT_29");
        RewriteRuleTokenStream stream_INT_22=new RewriteRuleTokenStream(adaptor,"token INT_22");
        RewriteRuleTokenStream stream_INT_23=new RewriteRuleTokenStream(adaptor,"token INT_23");
        RewriteRuleTokenStream stream_ND=new RewriteRuleTokenStream(adaptor,"token ND");
        RewriteRuleTokenStream stream_INT_24=new RewriteRuleTokenStream(adaptor,"token INT_24");
        RewriteRuleTokenStream stream_INT_25=new RewriteRuleTokenStream(adaptor,"token INT_25");
        RewriteRuleTokenStream stream_THIRTEENTH=new RewriteRuleTokenStream(adaptor,"token THIRTEENTH");
        RewriteRuleTokenStream stream_INT_30=new RewriteRuleTokenStream(adaptor,"token INT_30");
        RewriteRuleTokenStream stream_NINTH=new RewriteRuleTokenStream(adaptor,"token NINTH");
        RewriteRuleTokenStream stream_INT_31=new RewriteRuleTokenStream(adaptor,"token INT_31");
        RewriteRuleTokenStream stream_ELEVENTH=new RewriteRuleTokenStream(adaptor,"token ELEVENTH");
        RewriteRuleTokenStream stream_NINETEENTH=new RewriteRuleTokenStream(adaptor,"token NINETEENTH");
        RewriteRuleTokenStream stream_EIGHTEENTH=new RewriteRuleTokenStream(adaptor,"token EIGHTEENTH");
        RewriteRuleTokenStream stream_FIFTEENTH=new RewriteRuleTokenStream(adaptor,"token FIFTEENTH");
        RewriteRuleTokenStream stream_EIGHTH=new RewriteRuleTokenStream(adaptor,"token EIGHTH");
        RewriteRuleTokenStream stream_SIXTEENTH=new RewriteRuleTokenStream(adaptor,"token SIXTEENTH");
        RewriteRuleTokenStream stream_INT_9=new RewriteRuleTokenStream(adaptor,"token INT_9");
        RewriteRuleTokenStream stream_ST=new RewriteRuleTokenStream(adaptor,"token ST");
        RewriteRuleTokenStream stream_SEVENTH=new RewriteRuleTokenStream(adaptor,"token SEVENTH");
        RewriteRuleTokenStream stream_INT_8=new RewriteRuleTokenStream(adaptor,"token INT_8");
        RewriteRuleTokenStream stream_TWELFTH=new RewriteRuleTokenStream(adaptor,"token TWELFTH");
        RewriteRuleTokenStream stream_INT_1=new RewriteRuleTokenStream(adaptor,"token INT_1");
        RewriteRuleTokenStream stream_INT_3=new RewriteRuleTokenStream(adaptor,"token INT_3");
        RewriteRuleTokenStream stream_INT_2=new RewriteRuleTokenStream(adaptor,"token INT_2");
        RewriteRuleTokenStream stream_FIFTH=new RewriteRuleTokenStream(adaptor,"token FIFTH");
        RewriteRuleTokenStream stream_FIRST=new RewriteRuleTokenStream(adaptor,"token FIRST");
        RewriteRuleTokenStream stream_INT_5=new RewriteRuleTokenStream(adaptor,"token INT_5");
        RewriteRuleTokenStream stream_INT_4=new RewriteRuleTokenStream(adaptor,"token INT_4");
        RewriteRuleTokenStream stream_FOURTH=new RewriteRuleTokenStream(adaptor,"token FOURTH");
        RewriteRuleTokenStream stream_INT_7=new RewriteRuleTokenStream(adaptor,"token INT_7");
        RewriteRuleTokenStream stream_INT_6=new RewriteRuleTokenStream(adaptor,"token INT_6");
        RewriteRuleTokenStream stream_TENTH=new RewriteRuleTokenStream(adaptor,"token TENTH");
        RewriteRuleTokenStream stream_SEVENTEENTH=new RewriteRuleTokenStream(adaptor,"token SEVENTEENTH");
        RewriteRuleTokenStream stream_TH=new RewriteRuleTokenStream(adaptor,"token TH");
        RewriteRuleTokenStream stream_THIRTIETH=new RewriteRuleTokenStream(adaptor,"token THIRTIETH");
        RewriteRuleTokenStream stream_SECOND=new RewriteRuleTokenStream(adaptor,"token SECOND");

        try { dbg.enterRule(getGrammarFileName(), "spelled_first_to_thirty_first");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(118, 1);

        try {
            // NumericRules.g:119:3: ( ( FIRST | INT_1 ST ) -> INT[\"1\"] | ( SECOND | INT_2 ND ) -> INT[\"2\"] | ( THIRD | INT_3 RD ) -> INT[\"3\"] | ( FOURTH | INT_4 TH ) -> INT[\"4\"] | ( FIFTH | INT_5 TH ) -> INT[\"5\"] | ( SIXTH | INT_6 TH ) -> INT[\"6\"] | ( SEVENTH | INT_7 TH ) -> INT[\"7\"] | ( EIGHTH | INT_8 TH ) -> INT[\"8\"] | ( NINTH | INT_9 TH ) -> INT[\"9\"] | ( TENTH | INT_10 TH ) -> INT[\"10\"] | ( ELEVENTH | INT_11 TH ) -> INT[\"11\"] | ( TWELFTH | INT_12 TH ) -> INT[\"12\"] | ( THIRTEENTH | INT_13 TH ) -> INT[\"13\"] | ( FOURTEENTH | INT_14 TH ) -> INT[\"14\"] | ( FIFTEENTH | INT_15 TH ) -> INT[\"15\"] | ( SIXTEENTH | INT_16 TH ) -> INT[\"16\"] | ( SEVENTEENTH | INT_17 TH ) -> INT[\"17\"] | ( EIGHTEENTH | INT_18 TH ) -> INT[\"18\"] | ( NINETEENTH | INT_19 TH ) -> INT[\"19\"] | ( TWENTIETH | INT_20 TH ) -> INT[\"20\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) | INT_21 ST ) -> INT[\"21\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) | INT_22 ND ) -> INT[\"22\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) | INT_23 RD ) -> INT[\"23\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) | INT_24 TH ) -> INT[\"24\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) | INT_25 TH ) -> INT[\"25\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) | INT_26 TH ) -> INT[\"26\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) | INT_27 TH ) -> INT[\"27\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) | INT_28 TH ) -> INT[\"28\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) | INT_29 TH ) -> INT[\"29\"] | ( THIRTIETH | INT_30 TH ) -> INT[\"30\"] | ( ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) | INT_31 ST ) -> INT[\"31\"] )
            int alt62=31;
            try { dbg.enterDecision(62);

            try {
                isCyclicDecision = true;
                alt62 = dfa62.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(62);}

            switch (alt62) {
                case 1 :
                    dbg.enterAlt(1);

                    // NumericRules.g:119:5: ( FIRST | INT_1 ST )
                    {
                    dbg.location(119,5);
                    // NumericRules.g:119:5: ( FIRST | INT_1 ST )
                    int alt21=2;
                    try { dbg.enterSubRule(21);
                    try { dbg.enterDecision(21);

                    switch ( input.LA(1) ) {
                    case FIRST:
                        {
                        alt21=1;
                        }
                        break;
                    case INT_1:
                        {
                        alt21=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(21);}

                    switch (alt21) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:119:6: FIRST
                            {
                            dbg.location(119,6);
                            FIRST111=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first1557); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST111);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:119:20: INT_1 ST
                            {
                            dbg.location(119,20);
                            INT_1112=(Token)match(input,INT_1,FOLLOW_INT_1_in_spelled_first_to_thirty_first1567); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_1.add(INT_1112);

                            dbg.location(119,26);
                            ST113=(Token)match(input,ST,FOLLOW_ST_in_spelled_first_to_thirty_first1569); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ST.add(ST113);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(21);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 119:31: -> INT[\"1\"]
                    {
                        dbg.location(119,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // NumericRules.g:120:5: ( SECOND | INT_2 ND )
                    {
                    dbg.location(120,5);
                    // NumericRules.g:120:5: ( SECOND | INT_2 ND )
                    int alt22=2;
                    try { dbg.enterSubRule(22);
                    try { dbg.enterDecision(22);

                    switch ( input.LA(1) ) {
                    case SECOND:
                        {
                        alt22=1;
                        }
                        break;
                    case INT_2:
                        {
                        alt22=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(22);}

                    switch (alt22) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:120:6: SECOND
                            {
                            dbg.location(120,6);
                            SECOND114=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first1583); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SECOND.add(SECOND114);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:120:20: INT_2 ND
                            {
                            dbg.location(120,20);
                            INT_2115=(Token)match(input,INT_2,FOLLOW_INT_2_in_spelled_first_to_thirty_first1592); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_2.add(INT_2115);

                            dbg.location(120,26);
                            ND116=(Token)match(input,ND,FOLLOW_ND_in_spelled_first_to_thirty_first1594); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ND.add(ND116);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(22);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 120:31: -> INT[\"2\"]
                    {
                        dbg.location(120,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // NumericRules.g:121:5: ( THIRD | INT_3 RD )
                    {
                    dbg.location(121,5);
                    // NumericRules.g:121:5: ( THIRD | INT_3 RD )
                    int alt23=2;
                    try { dbg.enterSubRule(23);
                    try { dbg.enterDecision(23);

                    switch ( input.LA(1) ) {
                    case THIRD:
                        {
                        alt23=1;
                        }
                        break;
                    case INT_3:
                        {
                        alt23=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(23);}

                    switch (alt23) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:121:6: THIRD
                            {
                            dbg.location(121,6);
                            THIRD117=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first1608); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRD.add(THIRD117);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:121:20: INT_3 RD
                            {
                            dbg.location(121,20);
                            INT_3118=(Token)match(input,INT_3,FOLLOW_INT_3_in_spelled_first_to_thirty_first1618); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_3.add(INT_3118);

                            dbg.location(121,26);
                            RD119=(Token)match(input,RD,FOLLOW_RD_in_spelled_first_to_thirty_first1620); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RD.add(RD119);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(23);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 121:31: -> INT[\"3\"]
                    {
                        dbg.location(121,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // NumericRules.g:122:5: ( FOURTH | INT_4 TH )
                    {
                    dbg.location(122,5);
                    // NumericRules.g:122:5: ( FOURTH | INT_4 TH )
                    int alt24=2;
                    try { dbg.enterSubRule(24);
                    try { dbg.enterDecision(24);

                    switch ( input.LA(1) ) {
                    case FOURTH:
                        {
                        alt24=1;
                        }
                        break;
                    case INT_4:
                        {
                        alt24=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(24);}

                    switch (alt24) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:122:6: FOURTH
                            {
                            dbg.location(122,6);
                            FOURTH120=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first1634); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH120);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:122:20: INT_4 TH
                            {
                            dbg.location(122,20);
                            INT_4121=(Token)match(input,INT_4,FOLLOW_INT_4_in_spelled_first_to_thirty_first1643); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_4.add(INT_4121);

                            dbg.location(122,26);
                            TH122=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1645); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH122);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(24);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 122:31: -> INT[\"4\"]
                    {
                        dbg.location(122,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // NumericRules.g:123:5: ( FIFTH | INT_5 TH )
                    {
                    dbg.location(123,5);
                    // NumericRules.g:123:5: ( FIFTH | INT_5 TH )
                    int alt25=2;
                    try { dbg.enterSubRule(25);
                    try { dbg.enterDecision(25);

                    switch ( input.LA(1) ) {
                    case FIFTH:
                        {
                        alt25=1;
                        }
                        break;
                    case INT_5:
                        {
                        alt25=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(25);}

                    switch (alt25) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:123:6: FIFTH
                            {
                            dbg.location(123,6);
                            FIFTH123=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first1659); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH123);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:123:20: INT_5 TH
                            {
                            dbg.location(123,20);
                            INT_5124=(Token)match(input,INT_5,FOLLOW_INT_5_in_spelled_first_to_thirty_first1669); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_5.add(INT_5124);

                            dbg.location(123,26);
                            TH125=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1671); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH125);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(25);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 123:31: -> INT[\"5\"]
                    {
                        dbg.location(123,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // NumericRules.g:124:5: ( SIXTH | INT_6 TH )
                    {
                    dbg.location(124,5);
                    // NumericRules.g:124:5: ( SIXTH | INT_6 TH )
                    int alt26=2;
                    try { dbg.enterSubRule(26);
                    try { dbg.enterDecision(26);

                    switch ( input.LA(1) ) {
                    case SIXTH:
                        {
                        alt26=1;
                        }
                        break;
                    case INT_6:
                        {
                        alt26=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(26);}

                    switch (alt26) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:124:6: SIXTH
                            {
                            dbg.location(124,6);
                            SIXTH126=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first1685); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH126);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:124:20: INT_6 TH
                            {
                            dbg.location(124,20);
                            INT_6127=(Token)match(input,INT_6,FOLLOW_INT_6_in_spelled_first_to_thirty_first1695); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_6.add(INT_6127);

                            dbg.location(124,26);
                            TH128=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1697); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH128);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(26);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 124:31: -> INT[\"6\"]
                    {
                        dbg.location(124,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // NumericRules.g:125:5: ( SEVENTH | INT_7 TH )
                    {
                    dbg.location(125,5);
                    // NumericRules.g:125:5: ( SEVENTH | INT_7 TH )
                    int alt27=2;
                    try { dbg.enterSubRule(27);
                    try { dbg.enterDecision(27);

                    switch ( input.LA(1) ) {
                    case SEVENTH:
                        {
                        alt27=1;
                        }
                        break;
                    case INT_7:
                        {
                        alt27=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(27);}

                    switch (alt27) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:125:6: SEVENTH
                            {
                            dbg.location(125,6);
                            SEVENTH129=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first1711); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH129);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:125:20: INT_7 TH
                            {
                            dbg.location(125,20);
                            INT_7130=(Token)match(input,INT_7,FOLLOW_INT_7_in_spelled_first_to_thirty_first1719); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_7.add(INT_7130);

                            dbg.location(125,26);
                            TH131=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1721); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH131);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(27);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 125:31: -> INT[\"7\"]
                    {
                        dbg.location(125,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // NumericRules.g:126:5: ( EIGHTH | INT_8 TH )
                    {
                    dbg.location(126,5);
                    // NumericRules.g:126:5: ( EIGHTH | INT_8 TH )
                    int alt28=2;
                    try { dbg.enterSubRule(28);
                    try { dbg.enterDecision(28);

                    switch ( input.LA(1) ) {
                    case EIGHTH:
                        {
                        alt28=1;
                        }
                        break;
                    case INT_8:
                        {
                        alt28=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(28);}

                    switch (alt28) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:126:6: EIGHTH
                            {
                            dbg.location(126,6);
                            EIGHTH132=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first1735); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH132);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:126:20: INT_8 TH
                            {
                            dbg.location(126,20);
                            INT_8133=(Token)match(input,INT_8,FOLLOW_INT_8_in_spelled_first_to_thirty_first1744); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_8.add(INT_8133);

                            dbg.location(126,26);
                            TH134=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1746); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH134);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(28);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 126:31: -> INT[\"8\"]
                    {
                        dbg.location(126,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // NumericRules.g:127:5: ( NINTH | INT_9 TH )
                    {
                    dbg.location(127,5);
                    // NumericRules.g:127:5: ( NINTH | INT_9 TH )
                    int alt29=2;
                    try { dbg.enterSubRule(29);
                    try { dbg.enterDecision(29);

                    switch ( input.LA(1) ) {
                    case NINTH:
                        {
                        alt29=1;
                        }
                        break;
                    case INT_9:
                        {
                        alt29=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(29);}

                    switch (alt29) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:127:6: NINTH
                            {
                            dbg.location(127,6);
                            NINTH135=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first1760); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NINTH.add(NINTH135);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:127:20: INT_9 TH
                            {
                            dbg.location(127,20);
                            INT_9136=(Token)match(input,INT_9,FOLLOW_INT_9_in_spelled_first_to_thirty_first1770); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_9.add(INT_9136);

                            dbg.location(127,26);
                            TH137=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1772); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH137);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(29);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 127:31: -> INT[\"9\"]
                    {
                        dbg.location(127,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // NumericRules.g:128:5: ( TENTH | INT_10 TH )
                    {
                    dbg.location(128,5);
                    // NumericRules.g:128:5: ( TENTH | INT_10 TH )
                    int alt30=2;
                    try { dbg.enterSubRule(30);
                    try { dbg.enterDecision(30);

                    switch ( input.LA(1) ) {
                    case TENTH:
                        {
                        alt30=1;
                        }
                        break;
                    case INT_10:
                        {
                        alt30=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(30);}

                    switch (alt30) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:128:6: TENTH
                            {
                            dbg.location(128,6);
                            TENTH138=(Token)match(input,TENTH,FOLLOW_TENTH_in_spelled_first_to_thirty_first1786); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TENTH.add(TENTH138);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:128:20: INT_10 TH
                            {
                            dbg.location(128,20);
                            INT_10139=(Token)match(input,INT_10,FOLLOW_INT_10_in_spelled_first_to_thirty_first1796); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_10.add(INT_10139);

                            dbg.location(128,27);
                            TH140=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1798); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH140);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(30);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 128:31: -> INT[\"10\"]
                    {
                        dbg.location(128,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // NumericRules.g:129:5: ( ELEVENTH | INT_11 TH )
                    {
                    dbg.location(129,5);
                    // NumericRules.g:129:5: ( ELEVENTH | INT_11 TH )
                    int alt31=2;
                    try { dbg.enterSubRule(31);
                    try { dbg.enterDecision(31);

                    switch ( input.LA(1) ) {
                    case ELEVENTH:
                        {
                        alt31=1;
                        }
                        break;
                    case INT_11:
                        {
                        alt31=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(31);}

                    switch (alt31) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:129:6: ELEVENTH
                            {
                            dbg.location(129,6);
                            ELEVENTH141=(Token)match(input,ELEVENTH,FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first1811); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELEVENTH.add(ELEVENTH141);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:129:20: INT_11 TH
                            {
                            dbg.location(129,20);
                            INT_11142=(Token)match(input,INT_11,FOLLOW_INT_11_in_spelled_first_to_thirty_first1818); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_11.add(INT_11142);

                            dbg.location(129,27);
                            TH143=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1820); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH143);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(31);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 129:31: -> INT[\"11\"]
                    {
                        dbg.location(129,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // NumericRules.g:130:5: ( TWELFTH | INT_12 TH )
                    {
                    dbg.location(130,5);
                    // NumericRules.g:130:5: ( TWELFTH | INT_12 TH )
                    int alt32=2;
                    try { dbg.enterSubRule(32);
                    try { dbg.enterDecision(32);

                    switch ( input.LA(1) ) {
                    case TWELFTH:
                        {
                        alt32=1;
                        }
                        break;
                    case INT_12:
                        {
                        alt32=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(32);}

                    switch (alt32) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:130:6: TWELFTH
                            {
                            dbg.location(130,6);
                            TWELFTH144=(Token)match(input,TWELFTH,FOLLOW_TWELFTH_in_spelled_first_to_thirty_first1833); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWELFTH.add(TWELFTH144);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:130:20: INT_12 TH
                            {
                            dbg.location(130,20);
                            INT_12145=(Token)match(input,INT_12,FOLLOW_INT_12_in_spelled_first_to_thirty_first1841); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_12.add(INT_12145);

                            dbg.location(130,27);
                            TH146=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1843); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH146);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(32);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 130:31: -> INT[\"12\"]
                    {
                        dbg.location(130,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // NumericRules.g:131:5: ( THIRTEENTH | INT_13 TH )
                    {
                    dbg.location(131,5);
                    // NumericRules.g:131:5: ( THIRTEENTH | INT_13 TH )
                    int alt33=2;
                    try { dbg.enterSubRule(33);
                    try { dbg.enterDecision(33);

                    switch ( input.LA(1) ) {
                    case THIRTEENTH:
                        {
                        alt33=1;
                        }
                        break;
                    case INT_13:
                        {
                        alt33=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(33);}

                    switch (alt33) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:131:6: THIRTEENTH
                            {
                            dbg.location(131,6);
                            THIRTEENTH147=(Token)match(input,THIRTEENTH,FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first1856); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTEENTH.add(THIRTEENTH147);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:131:20: INT_13 TH
                            {
                            dbg.location(131,20);
                            INT_13148=(Token)match(input,INT_13,FOLLOW_INT_13_in_spelled_first_to_thirty_first1861); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_13.add(INT_13148);

                            dbg.location(131,27);
                            TH149=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1863); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH149);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(33);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 131:31: -> INT[\"13\"]
                    {
                        dbg.location(131,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // NumericRules.g:132:5: ( FOURTEENTH | INT_14 TH )
                    {
                    dbg.location(132,5);
                    // NumericRules.g:132:5: ( FOURTEENTH | INT_14 TH )
                    int alt34=2;
                    try { dbg.enterSubRule(34);
                    try { dbg.enterDecision(34);

                    switch ( input.LA(1) ) {
                    case FOURTEENTH:
                        {
                        alt34=1;
                        }
                        break;
                    case INT_14:
                        {
                        alt34=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(34);}

                    switch (alt34) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:132:6: FOURTEENTH
                            {
                            dbg.location(132,6);
                            FOURTEENTH150=(Token)match(input,FOURTEENTH,FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first1876); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOURTEENTH.add(FOURTEENTH150);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:132:20: INT_14 TH
                            {
                            dbg.location(132,20);
                            INT_14151=(Token)match(input,INT_14,FOLLOW_INT_14_in_spelled_first_to_thirty_first1881); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_14.add(INT_14151);

                            dbg.location(132,27);
                            TH152=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1883); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH152);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(34);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 132:31: -> INT[\"14\"]
                    {
                        dbg.location(132,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // NumericRules.g:133:5: ( FIFTEENTH | INT_15 TH )
                    {
                    dbg.location(133,5);
                    // NumericRules.g:133:5: ( FIFTEENTH | INT_15 TH )
                    int alt35=2;
                    try { dbg.enterSubRule(35);
                    try { dbg.enterDecision(35);

                    switch ( input.LA(1) ) {
                    case FIFTEENTH:
                        {
                        alt35=1;
                        }
                        break;
                    case INT_15:
                        {
                        alt35=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(35);}

                    switch (alt35) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:133:6: FIFTEENTH
                            {
                            dbg.location(133,6);
                            FIFTEENTH153=(Token)match(input,FIFTEENTH,FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first1896); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIFTEENTH.add(FIFTEENTH153);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:133:20: INT_15 TH
                            {
                            dbg.location(133,20);
                            INT_15154=(Token)match(input,INT_15,FOLLOW_INT_15_in_spelled_first_to_thirty_first1902); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_15.add(INT_15154);

                            dbg.location(133,27);
                            TH155=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1904); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH155);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(35);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 133:31: -> INT[\"15\"]
                    {
                        dbg.location(133,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // NumericRules.g:134:5: ( SIXTEENTH | INT_16 TH )
                    {
                    dbg.location(134,5);
                    // NumericRules.g:134:5: ( SIXTEENTH | INT_16 TH )
                    int alt36=2;
                    try { dbg.enterSubRule(36);
                    try { dbg.enterDecision(36);

                    switch ( input.LA(1) ) {
                    case SIXTEENTH:
                        {
                        alt36=1;
                        }
                        break;
                    case INT_16:
                        {
                        alt36=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(36);}

                    switch (alt36) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:134:6: SIXTEENTH
                            {
                            dbg.location(134,6);
                            SIXTEENTH156=(Token)match(input,SIXTEENTH,FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first1917); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SIXTEENTH.add(SIXTEENTH156);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:134:20: INT_16 TH
                            {
                            dbg.location(134,20);
                            INT_16157=(Token)match(input,INT_16,FOLLOW_INT_16_in_spelled_first_to_thirty_first1923); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_16.add(INT_16157);

                            dbg.location(134,27);
                            TH158=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1925); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH158);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(36);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 134:31: -> INT[\"16\"]
                    {
                        dbg.location(134,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // NumericRules.g:135:5: ( SEVENTEENTH | INT_17 TH )
                    {
                    dbg.location(135,5);
                    // NumericRules.g:135:5: ( SEVENTEENTH | INT_17 TH )
                    int alt37=2;
                    try { dbg.enterSubRule(37);
                    try { dbg.enterDecision(37);

                    switch ( input.LA(1) ) {
                    case SEVENTEENTH:
                        {
                        alt37=1;
                        }
                        break;
                    case INT_17:
                        {
                        alt37=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(37);}

                    switch (alt37) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:135:6: SEVENTEENTH
                            {
                            dbg.location(135,6);
                            SEVENTEENTH159=(Token)match(input,SEVENTEENTH,FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first1938); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEVENTEENTH.add(SEVENTEENTH159);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:135:20: INT_17 TH
                            {
                            dbg.location(135,20);
                            INT_17160=(Token)match(input,INT_17,FOLLOW_INT_17_in_spelled_first_to_thirty_first1942); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_17.add(INT_17160);

                            dbg.location(135,27);
                            TH161=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1944); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH161);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(37);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 135:31: -> INT[\"17\"]
                    {
                        dbg.location(135,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    dbg.enterAlt(18);

                    // NumericRules.g:136:5: ( EIGHTEENTH | INT_18 TH )
                    {
                    dbg.location(136,5);
                    // NumericRules.g:136:5: ( EIGHTEENTH | INT_18 TH )
                    int alt38=2;
                    try { dbg.enterSubRule(38);
                    try { dbg.enterDecision(38);

                    switch ( input.LA(1) ) {
                    case EIGHTEENTH:
                        {
                        alt38=1;
                        }
                        break;
                    case INT_18:
                        {
                        alt38=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(38);}

                    switch (alt38) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:136:6: EIGHTEENTH
                            {
                            dbg.location(136,6);
                            EIGHTEENTH162=(Token)match(input,EIGHTEENTH,FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first1957); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EIGHTEENTH.add(EIGHTEENTH162);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:136:20: INT_18 TH
                            {
                            dbg.location(136,20);
                            INT_18163=(Token)match(input,INT_18,FOLLOW_INT_18_in_spelled_first_to_thirty_first1962); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_18.add(INT_18163);

                            dbg.location(136,27);
                            TH164=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1964); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH164);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(38);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 136:31: -> INT[\"18\"]
                    {
                        dbg.location(136,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    dbg.enterAlt(19);

                    // NumericRules.g:137:5: ( NINETEENTH | INT_19 TH )
                    {
                    dbg.location(137,5);
                    // NumericRules.g:137:5: ( NINETEENTH | INT_19 TH )
                    int alt39=2;
                    try { dbg.enterSubRule(39);
                    try { dbg.enterDecision(39);

                    switch ( input.LA(1) ) {
                    case NINETEENTH:
                        {
                        alt39=1;
                        }
                        break;
                    case INT_19:
                        {
                        alt39=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(39);}

                    switch (alt39) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:137:6: NINETEENTH
                            {
                            dbg.location(137,6);
                            NINETEENTH165=(Token)match(input,NINETEENTH,FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first1977); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NINETEENTH.add(NINETEENTH165);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:137:20: INT_19 TH
                            {
                            dbg.location(137,20);
                            INT_19166=(Token)match(input,INT_19,FOLLOW_INT_19_in_spelled_first_to_thirty_first1982); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_19.add(INT_19166);

                            dbg.location(137,27);
                            TH167=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1984); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH167);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(39);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 137:31: -> INT[\"19\"]
                    {
                        dbg.location(137,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    dbg.enterAlt(20);

                    // NumericRules.g:138:5: ( TWENTIETH | INT_20 TH )
                    {
                    dbg.location(138,5);
                    // NumericRules.g:138:5: ( TWENTIETH | INT_20 TH )
                    int alt40=2;
                    try { dbg.enterSubRule(40);
                    try { dbg.enterDecision(40);

                    switch ( input.LA(1) ) {
                    case TWENTIETH:
                        {
                        alt40=1;
                        }
                        break;
                    case INT_20:
                        {
                        alt40=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(40);}

                    switch (alt40) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:138:6: TWENTIETH
                            {
                            dbg.location(138,6);
                            TWENTIETH168=(Token)match(input,TWENTIETH,FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first1997); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTIETH.add(TWENTIETH168);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:138:20: INT_20 TH
                            {
                            dbg.location(138,20);
                            INT_20169=(Token)match(input,INT_20,FOLLOW_INT_20_in_spelled_first_to_thirty_first2003); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_20.add(INT_20169);

                            dbg.location(138,27);
                            TH170=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first2005); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH170);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(40);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 138:31: -> INT[\"20\"]
                    {
                        dbg.location(138,34);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    dbg.enterAlt(21);

                    // NumericRules.g:139:5: ( ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) | INT_21 ST )
                    {
                    dbg.location(139,5);
                    // NumericRules.g:139:5: ( ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) | INT_21 ST )
                    int alt42=2;
                    try { dbg.enterSubRule(42);
                    try { dbg.enterDecision(42);

                    switch ( input.LA(1) ) {
                    case TWENTY:
                        {
                        alt42=1;
                        }
                        break;
                    case INT_21:
                        {
                        alt42=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(42);}

                    switch (alt42) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:139:6: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
                            {
                            dbg.location(139,6);
                            // NumericRules.g:139:6: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
                            dbg.enterAlt(1);

                            // NumericRules.g:139:7: TWENTY ( DASH | WHITE_SPACE )? FIRST
                            {
                            dbg.location(139,7);
                            TWENTY171=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2019); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY171);

                            dbg.location(139,14);
                            // NumericRules.g:139:14: ( DASH | WHITE_SPACE )?
                            int alt41=3;
                            try { dbg.enterSubRule(41);
                            try { dbg.enterDecision(41);

                            switch ( input.LA(1) ) {
                                case DASH:
                                    {
                                    alt41=1;
                                    }
                                    break;
                                case WHITE_SPACE:
                                    {
                                    alt41=2;
                                    }
                                    break;
                            }

                            } finally {dbg.exitDecision(41);}

                            switch (alt41) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // NumericRules.g:139:15: DASH
                                    {
                                    dbg.location(139,15);
                                    DASH172=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2022); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH172);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // NumericRules.g:139:22: WHITE_SPACE
                                    {
                                    dbg.location(139,22);
                                    WHITE_SPACE173=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2026); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE173);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(41);}

                            dbg.location(139,36);
                            FIRST174=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first2030); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST174);


                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:139:47: INT_21 ST
                            {
                            dbg.location(139,47);
                            INT_21175=(Token)match(input,INT_21,FOLLOW_INT_21_in_spelled_first_to_thirty_first2037); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_21.add(INT_21175);

                            dbg.location(139,54);
                            ST176=(Token)match(input,ST,FOLLOW_ST_in_spelled_first_to_thirty_first2039); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ST.add(ST176);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(42);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 139:58: -> INT[\"21\"]
                    {
                        dbg.location(139,61);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    dbg.enterAlt(22);

                    // NumericRules.g:140:5: ( ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) | INT_22 ND )
                    {
                    dbg.location(140,5);
                    // NumericRules.g:140:5: ( ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) | INT_22 ND )
                    int alt44=2;
                    try { dbg.enterSubRule(44);
                    try { dbg.enterDecision(44);

                    switch ( input.LA(1) ) {
                    case TWENTY:
                        {
                        alt44=1;
                        }
                        break;
                    case INT_22:
                        {
                        alt44=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(44);}

                    switch (alt44) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:140:6: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
                            {
                            dbg.location(140,6);
                            // NumericRules.g:140:6: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
                            dbg.enterAlt(1);

                            // NumericRules.g:140:7: TWENTY ( DASH | WHITE_SPACE )? SECOND
                            {
                            dbg.location(140,7);
                            TWENTY177=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2053); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY177);

                            dbg.location(140,14);
                            // NumericRules.g:140:14: ( DASH | WHITE_SPACE )?
                            int alt43=3;
                            try { dbg.enterSubRule(43);
                            try { dbg.enterDecision(43);

                            switch ( input.LA(1) ) {
                                case DASH:
                                    {
                                    alt43=1;
                                    }
                                    break;
                                case WHITE_SPACE:
                                    {
                                    alt43=2;
                                    }
                                    break;
                            }

                            } finally {dbg.exitDecision(43);}

                            switch (alt43) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // NumericRules.g:140:15: DASH
                                    {
                                    dbg.location(140,15);
                                    DASH178=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2056); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH178);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // NumericRules.g:140:22: WHITE_SPACE
                                    {
                                    dbg.location(140,22);
                                    WHITE_SPACE179=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2060); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE179);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(43);}

                            dbg.location(140,36);
                            SECOND180=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first2064); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SECOND.add(SECOND180);


                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:140:47: INT_22 ND
                            {
                            dbg.location(140,47);
                            INT_22181=(Token)match(input,INT_22,FOLLOW_INT_22_in_spelled_first_to_thirty_first2070); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_22.add(INT_22181);

                            dbg.location(140,54);
                            ND182=(Token)match(input,ND,FOLLOW_ND_in_spelled_first_to_thirty_first2072); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ND.add(ND182);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(44);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 140:58: -> INT[\"22\"]
                    {
                        dbg.location(140,61);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    dbg.enterAlt(23);

                    // NumericRules.g:141:5: ( ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) | INT_23 RD )
                    {
                    dbg.location(141,5);
                    // NumericRules.g:141:5: ( ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) | INT_23 RD )
                    int alt46=2;
                    try { dbg.enterSubRule(46);
                    try { dbg.enterDecision(46);

                    switch ( input.LA(1) ) {
                    case TWENTY:
                        {
                        alt46=1;
                        }
                        break;
                    case INT_23:
                        {
                        alt46=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(46);}

                    switch (alt46) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:141:6: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
                            {
                            dbg.location(141,6);
                            // NumericRules.g:141:6: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
                            dbg.enterAlt(1);

                            // NumericRules.g:141:7: TWENTY ( DASH | WHITE_SPACE )? THIRD
                            {
                            dbg.location(141,7);
                            TWENTY183=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2086); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY183);

                            dbg.location(141,14);
                            // NumericRules.g:141:14: ( DASH | WHITE_SPACE )?
                            int alt45=3;
                            try { dbg.enterSubRule(45);
                            try { dbg.enterDecision(45);

                            switch ( input.LA(1) ) {
                                case DASH:
                                    {
                                    alt45=1;
                                    }
                                    break;
                                case WHITE_SPACE:
                                    {
                                    alt45=2;
                                    }
                                    break;
                            }

                            } finally {dbg.exitDecision(45);}

                            switch (alt45) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // NumericRules.g:141:15: DASH
                                    {
                                    dbg.location(141,15);
                                    DASH184=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2089); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH184);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // NumericRules.g:141:22: WHITE_SPACE
                                    {
                                    dbg.location(141,22);
                                    WHITE_SPACE185=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2093); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE185);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(45);}

                            dbg.location(141,36);
                            THIRD186=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first2097); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRD.add(THIRD186);


                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:141:47: INT_23 RD
                            {
                            dbg.location(141,47);
                            INT_23187=(Token)match(input,INT_23,FOLLOW_INT_23_in_spelled_first_to_thirty_first2104); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_23.add(INT_23187);

                            dbg.location(141,54);
                            RD188=(Token)match(input,RD,FOLLOW_RD_in_spelled_first_to_thirty_first2106); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RD.add(RD188);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(46);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 141:58: -> INT[\"23\"]
                    {
                        dbg.location(141,61);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    dbg.enterAlt(24);

                    // NumericRules.g:142:5: ( ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) | INT_24 TH )
                    {
                    dbg.location(142,5);
                    // NumericRules.g:142:5: ( ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) | INT_24 TH )
                    int alt48=2;
                    try { dbg.enterSubRule(48);
                    try { dbg.enterDecision(48);

                    switch ( input.LA(1) ) {
                    case TWENTY:
                        {
                        alt48=1;
                        }
                        break;
                    case INT_24:
                        {
                        alt48=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(48);}

                    switch (alt48) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:142:6: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
                            {
                            dbg.location(142,6);
                            // NumericRules.g:142:6: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
                            dbg.enterAlt(1);

                            // NumericRules.g:142:7: TWENTY ( DASH | WHITE_SPACE )? FOURTH
                            {
                            dbg.location(142,7);
                            TWENTY189=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2120); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY189);

                            dbg.location(142,14);
                            // NumericRules.g:142:14: ( DASH | WHITE_SPACE )?
                            int alt47=3;
                            try { dbg.enterSubRule(47);
                            try { dbg.enterDecision(47);

                            switch ( input.LA(1) ) {
                                case DASH:
                                    {
                                    alt47=1;
                                    }
                                    break;
                                case WHITE_SPACE:
                                    {
                                    alt47=2;
                                    }
                                    break;
                            }

                            } finally {dbg.exitDecision(47);}

                            switch (alt47) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // NumericRules.g:142:15: DASH
                                    {
                                    dbg.location(142,15);
                                    DASH190=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2123); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH190);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // NumericRules.g:142:22: WHITE_SPACE
                                    {
                                    dbg.location(142,22);
                                    WHITE_SPACE191=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2127); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE191);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(47);}

                            dbg.location(142,36);
                            FOURTH192=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first2131); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH192);


                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:142:47: INT_24 TH
                            {
                            dbg.location(142,47);
                            INT_24193=(Token)match(input,INT_24,FOLLOW_INT_24_in_spelled_first_to_thirty_first2137); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_24.add(INT_24193);

                            dbg.location(142,54);
                            TH194=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first2139); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH194);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(48);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 142:58: -> INT[\"24\"]
                    {
                        dbg.location(142,61);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    dbg.enterAlt(25);

                    // NumericRules.g:143:5: ( ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) | INT_25 TH )
                    {
                    dbg.location(143,5);
                    // NumericRules.g:143:5: ( ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) | INT_25 TH )
                    int alt50=2;
                    try { dbg.enterSubRule(50);
                    try { dbg.enterDecision(50);

                    switch ( input.LA(1) ) {
                    case TWENTY:
                        {
                        alt50=1;
                        }
                        break;
                    case INT_25:
                        {
                        alt50=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(50);}

                    switch (alt50) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:143:6: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
                            {
                            dbg.location(143,6);
                            // NumericRules.g:143:6: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
                            dbg.enterAlt(1);

                            // NumericRules.g:143:7: TWENTY ( DASH | WHITE_SPACE )? FIFTH
                            {
                            dbg.location(143,7);
                            TWENTY195=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2153); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY195);

                            dbg.location(143,14);
                            // NumericRules.g:143:14: ( DASH | WHITE_SPACE )?
                            int alt49=3;
                            try { dbg.enterSubRule(49);
                            try { dbg.enterDecision(49);

                            switch ( input.LA(1) ) {
                                case DASH:
                                    {
                                    alt49=1;
                                    }
                                    break;
                                case WHITE_SPACE:
                                    {
                                    alt49=2;
                                    }
                                    break;
                            }

                            } finally {dbg.exitDecision(49);}

                            switch (alt49) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // NumericRules.g:143:15: DASH
                                    {
                                    dbg.location(143,15);
                                    DASH196=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2156); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH196);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // NumericRules.g:143:22: WHITE_SPACE
                                    {
                                    dbg.location(143,22);
                                    WHITE_SPACE197=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2160); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE197);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(49);}

                            dbg.location(143,36);
                            FIFTH198=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first2164); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH198);


                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:143:47: INT_25 TH
                            {
                            dbg.location(143,47);
                            INT_25199=(Token)match(input,INT_25,FOLLOW_INT_25_in_spelled_first_to_thirty_first2171); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_25.add(INT_25199);

                            dbg.location(143,54);
                            TH200=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first2173); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH200);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(50);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 143:58: -> INT[\"25\"]
                    {
                        dbg.location(143,61);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    dbg.enterAlt(26);

                    // NumericRules.g:144:5: ( ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) | INT_26 TH )
                    {
                    dbg.location(144,5);
                    // NumericRules.g:144:5: ( ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) | INT_26 TH )
                    int alt52=2;
                    try { dbg.enterSubRule(52);
                    try { dbg.enterDecision(52);

                    switch ( input.LA(1) ) {
                    case TWENTY:
                        {
                        alt52=1;
                        }
                        break;
                    case INT_26:
                        {
                        alt52=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(52);}

                    switch (alt52) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:144:6: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
                            {
                            dbg.location(144,6);
                            // NumericRules.g:144:6: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
                            dbg.enterAlt(1);

                            // NumericRules.g:144:7: TWENTY ( DASH | WHITE_SPACE )? SIXTH
                            {
                            dbg.location(144,7);
                            TWENTY201=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2187); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY201);

                            dbg.location(144,14);
                            // NumericRules.g:144:14: ( DASH | WHITE_SPACE )?
                            int alt51=3;
                            try { dbg.enterSubRule(51);
                            try { dbg.enterDecision(51);

                            switch ( input.LA(1) ) {
                                case DASH:
                                    {
                                    alt51=1;
                                    }
                                    break;
                                case WHITE_SPACE:
                                    {
                                    alt51=2;
                                    }
                                    break;
                            }

                            } finally {dbg.exitDecision(51);}

                            switch (alt51) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // NumericRules.g:144:15: DASH
                                    {
                                    dbg.location(144,15);
                                    DASH202=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2190); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH202);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // NumericRules.g:144:22: WHITE_SPACE
                                    {
                                    dbg.location(144,22);
                                    WHITE_SPACE203=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2194); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE203);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(51);}

                            dbg.location(144,36);
                            SIXTH204=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first2198); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH204);


                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:144:47: INT_26 TH
                            {
                            dbg.location(144,47);
                            INT_26205=(Token)match(input,INT_26,FOLLOW_INT_26_in_spelled_first_to_thirty_first2205); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_26.add(INT_26205);

                            dbg.location(144,54);
                            TH206=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first2207); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH206);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(52);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 144:58: -> INT[\"26\"]
                    {
                        dbg.location(144,61);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    dbg.enterAlt(27);

                    // NumericRules.g:145:5: ( ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) | INT_27 TH )
                    {
                    dbg.location(145,5);
                    // NumericRules.g:145:5: ( ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) | INT_27 TH )
                    int alt54=2;
                    try { dbg.enterSubRule(54);
                    try { dbg.enterDecision(54);

                    switch ( input.LA(1) ) {
                    case TWENTY:
                        {
                        alt54=1;
                        }
                        break;
                    case INT_27:
                        {
                        alt54=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(54);}

                    switch (alt54) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:145:6: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
                            {
                            dbg.location(145,6);
                            // NumericRules.g:145:6: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
                            dbg.enterAlt(1);

                            // NumericRules.g:145:7: TWENTY ( DASH | WHITE_SPACE )? SEVENTH
                            {
                            dbg.location(145,7);
                            TWENTY207=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2221); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY207);

                            dbg.location(145,14);
                            // NumericRules.g:145:14: ( DASH | WHITE_SPACE )?
                            int alt53=3;
                            try { dbg.enterSubRule(53);
                            try { dbg.enterDecision(53);

                            switch ( input.LA(1) ) {
                                case DASH:
                                    {
                                    alt53=1;
                                    }
                                    break;
                                case WHITE_SPACE:
                                    {
                                    alt53=2;
                                    }
                                    break;
                            }

                            } finally {dbg.exitDecision(53);}

                            switch (alt53) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // NumericRules.g:145:15: DASH
                                    {
                                    dbg.location(145,15);
                                    DASH208=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2224); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH208);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // NumericRules.g:145:22: WHITE_SPACE
                                    {
                                    dbg.location(145,22);
                                    WHITE_SPACE209=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2228); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE209);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(53);}

                            dbg.location(145,36);
                            SEVENTH210=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first2232); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH210);


                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:145:47: INT_27 TH
                            {
                            dbg.location(145,47);
                            INT_27211=(Token)match(input,INT_27,FOLLOW_INT_27_in_spelled_first_to_thirty_first2237); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_27.add(INT_27211);

                            dbg.location(145,54);
                            TH212=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first2239); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH212);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(54);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 145:58: -> INT[\"27\"]
                    {
                        dbg.location(145,61);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    dbg.enterAlt(28);

                    // NumericRules.g:146:5: ( ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) | INT_28 TH )
                    {
                    dbg.location(146,5);
                    // NumericRules.g:146:5: ( ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) | INT_28 TH )
                    int alt56=2;
                    try { dbg.enterSubRule(56);
                    try { dbg.enterDecision(56);

                    switch ( input.LA(1) ) {
                    case TWENTY:
                        {
                        alt56=1;
                        }
                        break;
                    case INT_28:
                        {
                        alt56=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(56);}

                    switch (alt56) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:146:6: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
                            {
                            dbg.location(146,6);
                            // NumericRules.g:146:6: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
                            dbg.enterAlt(1);

                            // NumericRules.g:146:7: TWENTY ( DASH | WHITE_SPACE )? EIGHTH
                            {
                            dbg.location(146,7);
                            TWENTY213=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2253); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY213);

                            dbg.location(146,14);
                            // NumericRules.g:146:14: ( DASH | WHITE_SPACE )?
                            int alt55=3;
                            try { dbg.enterSubRule(55);
                            try { dbg.enterDecision(55);

                            switch ( input.LA(1) ) {
                                case DASH:
                                    {
                                    alt55=1;
                                    }
                                    break;
                                case WHITE_SPACE:
                                    {
                                    alt55=2;
                                    }
                                    break;
                            }

                            } finally {dbg.exitDecision(55);}

                            switch (alt55) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // NumericRules.g:146:15: DASH
                                    {
                                    dbg.location(146,15);
                                    DASH214=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2256); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH214);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // NumericRules.g:146:22: WHITE_SPACE
                                    {
                                    dbg.location(146,22);
                                    WHITE_SPACE215=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2260); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE215);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(55);}

                            dbg.location(146,36);
                            EIGHTH216=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first2264); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH216);


                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:146:47: INT_28 TH
                            {
                            dbg.location(146,47);
                            INT_28217=(Token)match(input,INT_28,FOLLOW_INT_28_in_spelled_first_to_thirty_first2270); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_28.add(INT_28217);

                            dbg.location(146,54);
                            TH218=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first2272); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH218);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(56);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 146:58: -> INT[\"28\"]
                    {
                        dbg.location(146,61);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    dbg.enterAlt(29);

                    // NumericRules.g:147:5: ( ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) | INT_29 TH )
                    {
                    dbg.location(147,5);
                    // NumericRules.g:147:5: ( ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) | INT_29 TH )
                    int alt58=2;
                    try { dbg.enterSubRule(58);
                    try { dbg.enterDecision(58);

                    switch ( input.LA(1) ) {
                    case TWENTY:
                        {
                        alt58=1;
                        }
                        break;
                    case INT_29:
                        {
                        alt58=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(58);}

                    switch (alt58) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:147:6: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
                            {
                            dbg.location(147,6);
                            // NumericRules.g:147:6: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
                            dbg.enterAlt(1);

                            // NumericRules.g:147:7: TWENTY ( DASH | WHITE_SPACE )? NINTH
                            {
                            dbg.location(147,7);
                            TWENTY219=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2286); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY219);

                            dbg.location(147,14);
                            // NumericRules.g:147:14: ( DASH | WHITE_SPACE )?
                            int alt57=3;
                            try { dbg.enterSubRule(57);
                            try { dbg.enterDecision(57);

                            switch ( input.LA(1) ) {
                                case DASH:
                                    {
                                    alt57=1;
                                    }
                                    break;
                                case WHITE_SPACE:
                                    {
                                    alt57=2;
                                    }
                                    break;
                            }

                            } finally {dbg.exitDecision(57);}

                            switch (alt57) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // NumericRules.g:147:15: DASH
                                    {
                                    dbg.location(147,15);
                                    DASH220=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2289); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH220);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // NumericRules.g:147:22: WHITE_SPACE
                                    {
                                    dbg.location(147,22);
                                    WHITE_SPACE221=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2293); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE221);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(57);}

                            dbg.location(147,36);
                            NINTH222=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first2297); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NINTH.add(NINTH222);


                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:147:47: INT_29 TH
                            {
                            dbg.location(147,47);
                            INT_29223=(Token)match(input,INT_29,FOLLOW_INT_29_in_spelled_first_to_thirty_first2304); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_29.add(INT_29223);

                            dbg.location(147,54);
                            TH224=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first2306); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH224);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(58);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 147:58: -> INT[\"29\"]
                    {
                        dbg.location(147,61);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    dbg.enterAlt(30);

                    // NumericRules.g:148:5: ( THIRTIETH | INT_30 TH )
                    {
                    dbg.location(148,5);
                    // NumericRules.g:148:5: ( THIRTIETH | INT_30 TH )
                    int alt59=2;
                    try { dbg.enterSubRule(59);
                    try { dbg.enterDecision(59);

                    switch ( input.LA(1) ) {
                    case THIRTIETH:
                        {
                        alt59=1;
                        }
                        break;
                    case INT_30:
                        {
                        alt59=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(59);}

                    switch (alt59) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:148:6: THIRTIETH
                            {
                            dbg.location(148,6);
                            THIRTIETH225=(Token)match(input,THIRTIETH,FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first2319); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTIETH.add(THIRTIETH225);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:148:18: INT_30 TH
                            {
                            dbg.location(148,18);
                            INT_30226=(Token)match(input,INT_30,FOLLOW_INT_30_in_spelled_first_to_thirty_first2323); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_30.add(INT_30226);

                            dbg.location(148,25);
                            TH227=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first2325); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TH.add(TH227);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(59);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 148:58: -> INT[\"30\"]
                    {
                        dbg.location(148,61);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    dbg.enterAlt(31);

                    // NumericRules.g:149:5: ( ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) | INT_31 ST )
                    {
                    dbg.location(149,5);
                    // NumericRules.g:149:5: ( ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) | INT_31 ST )
                    int alt61=2;
                    try { dbg.enterSubRule(61);
                    try { dbg.enterDecision(61);

                    switch ( input.LA(1) ) {
                    case THIRTY:
                        {
                        alt61=1;
                        }
                        break;
                    case INT_31:
                        {
                        alt61=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(61);}

                    switch (alt61) {
                        case 1 :
                            dbg.enterAlt(1);

                            // NumericRules.g:149:6: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
                            {
                            dbg.location(149,6);
                            // NumericRules.g:149:6: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
                            dbg.enterAlt(1);

                            // NumericRules.g:149:7: THIRTY ( DASH | WHITE_SPACE )? FIRST
                            {
                            dbg.location(149,7);
                            THIRTY228=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_first_to_thirty_first2368); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY228);

                            dbg.location(149,14);
                            // NumericRules.g:149:14: ( DASH | WHITE_SPACE )?
                            int alt60=3;
                            try { dbg.enterSubRule(60);
                            try { dbg.enterDecision(60);

                            switch ( input.LA(1) ) {
                                case DASH:
                                    {
                                    alt60=1;
                                    }
                                    break;
                                case WHITE_SPACE:
                                    {
                                    alt60=2;
                                    }
                                    break;
                            }

                            } finally {dbg.exitDecision(60);}

                            switch (alt60) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // NumericRules.g:149:15: DASH
                                    {
                                    dbg.location(149,15);
                                    DASH229=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2371); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH229);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // NumericRules.g:149:22: WHITE_SPACE
                                    {
                                    dbg.location(149,22);
                                    WHITE_SPACE230=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2375); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE230);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(60);}

                            dbg.location(149,36);
                            FIRST231=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first2379); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST231);


                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // NumericRules.g:149:47: INT_31 ST
                            {
                            dbg.location(149,47);
                            INT_31232=(Token)match(input,INT_31,FOLLOW_INT_31_in_spelled_first_to_thirty_first2386); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INT_31.add(INT_31232);

                            dbg.location(149,54);
                            ST233=(Token)match(input,ST,FOLLOW_ST_in_spelled_first_to_thirty_first2388); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ST.add(ST233);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(61);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 149:58: -> INT[\"31\"]
                    {
                        dbg.location(149,61);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "31"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(150, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "spelled_first_to_thirty_first");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "spelled_first_to_thirty_first"

    public static class int_60_to_99_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_60_to_99"
    // NumericRules.g:152:1: int_60_to_99 : ( INT_60 | INT_61 | INT_62 | INT_63 | INT_64 | INT_65 | INT_66 | INT_67 | INT_68 | INT_69 | INT_70 | INT_71 | INT_72 | INT_73 | INT_74 | INT_75 | INT_76 | INT_77 | INT_78 | INT_79 | INT_80 | INT_81 | INT_82 | INT_83 | INT_84 | INT_85 | INT_86 | INT_87 | INT_88 | INT_89 | INT_90 | INT_91 | INT_92 | INT_93 | INT_94 | INT_95 | INT_96 | INT_97 | INT_98 | INT_99 );
    public final DateParser_NumericRules.int_60_to_99_return int_60_to_99() throws RecognitionException {
        DateParser_NumericRules.int_60_to_99_return retval = new DateParser_NumericRules.int_60_to_99_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set234=null;

        Object set234_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "int_60_to_99");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(152, 1);

        try {
            // NumericRules.g:153:3: ( INT_60 | INT_61 | INT_62 | INT_63 | INT_64 | INT_65 | INT_66 | INT_67 | INT_68 | INT_69 | INT_70 | INT_71 | INT_72 | INT_73 | INT_74 | INT_75 | INT_76 | INT_77 | INT_78 | INT_79 | INT_80 | INT_81 | INT_82 | INT_83 | INT_84 | INT_85 | INT_86 | INT_87 | INT_88 | INT_89 | INT_90 | INT_91 | INT_92 | INT_93 | INT_94 | INT_95 | INT_96 | INT_97 | INT_98 | INT_99 )
            dbg.enterAlt(1);

            // NumericRules.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(153,3);
            set234=(Token)input.LT(1);
            if ( (input.LA(1)>=INT_60 && input.LA(1)<=INT_99) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set234));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(158, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_60_to_99");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_60_to_99"

    public static class int_32_to_59_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_32_to_59"
    // NumericRules.g:160:1: int_32_to_59 : ( INT_32 | INT_33 | INT_34 | INT_35 | INT_36 | INT_37 | INT_38 | INT_39 | INT_40 | INT_41 | INT_42 | INT_43 | INT_44 | INT_45 | INT_46 | INT_47 | INT_48 | INT_49 | INT_50 | INT_51 | INT_52 | INT_53 | INT_54 | INT_55 | INT_56 | INT_57 | INT_58 | INT_59 );
    public final DateParser_NumericRules.int_32_to_59_return int_32_to_59() throws RecognitionException {
        DateParser_NumericRules.int_32_to_59_return retval = new DateParser_NumericRules.int_32_to_59_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set235=null;

        Object set235_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "int_32_to_59");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(160, 1);

        try {
            // NumericRules.g:161:3: ( INT_32 | INT_33 | INT_34 | INT_35 | INT_36 | INT_37 | INT_38 | INT_39 | INT_40 | INT_41 | INT_42 | INT_43 | INT_44 | INT_45 | INT_46 | INT_47 | INT_48 | INT_49 | INT_50 | INT_51 | INT_52 | INT_53 | INT_54 | INT_55 | INT_56 | INT_57 | INT_58 | INT_59 )
            dbg.enterAlt(1);

            // NumericRules.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(161,3);
            set235=(Token)input.LT(1);
            if ( (input.LA(1)>=INT_32 && input.LA(1)<=INT_59) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set235));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(165, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_32_to_59");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_32_to_59"

    public static class int_24_to_31_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_24_to_31"
    // NumericRules.g:167:1: int_24_to_31 : ( INT_24 | INT_25 | INT_26 | INT_27 | INT_28 | INT_29 | INT_30 | INT_31 );
    public final DateParser_NumericRules.int_24_to_31_return int_24_to_31() throws RecognitionException {
        DateParser_NumericRules.int_24_to_31_return retval = new DateParser_NumericRules.int_24_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set236=null;

        Object set236_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "int_24_to_31");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(167, 1);

        try {
            // NumericRules.g:168:3: ( INT_24 | INT_25 | INT_26 | INT_27 | INT_28 | INT_29 | INT_30 | INT_31 )
            dbg.enterAlt(1);

            // NumericRules.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(168,3);
            set236=(Token)input.LT(1);
            if ( (input.LA(1)>=INT_24 && input.LA(1)<=INT_31) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set236));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(169, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_24_to_31");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_24_to_31"

    public static class int_13_to_23_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_13_to_23"
    // NumericRules.g:171:1: int_13_to_23 : ( INT_13 | INT_14 | INT_15 | INT_16 | INT_17 | INT_18 | INT_19 | INT_20 | INT_21 | INT_22 | INT_23 );
    public final DateParser_NumericRules.int_13_to_23_return int_13_to_23() throws RecognitionException {
        DateParser_NumericRules.int_13_to_23_return retval = new DateParser_NumericRules.int_13_to_23_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set237=null;

        Object set237_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "int_13_to_23");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(171, 1);

        try {
            // NumericRules.g:172:3: ( INT_13 | INT_14 | INT_15 | INT_16 | INT_17 | INT_18 | INT_19 | INT_20 | INT_21 | INT_22 | INT_23 )
            dbg.enterAlt(1);

            // NumericRules.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(172,3);
            set237=(Token)input.LT(1);
            if ( (input.LA(1)>=INT_13 && input.LA(1)<=INT_23) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set237));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(174, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_13_to_23");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_13_to_23"

    public static class int_01_to_12_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_01_to_12"
    // NumericRules.g:176:1: int_01_to_12 : ( INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09 | INT_10 | INT_11 | INT_12 );
    public final DateParser_NumericRules.int_01_to_12_return int_01_to_12() throws RecognitionException {
        DateParser_NumericRules.int_01_to_12_return retval = new DateParser_NumericRules.int_01_to_12_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set238=null;

        Object set238_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "int_01_to_12");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(176, 1);

        try {
            // NumericRules.g:177:3: ( INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09 | INT_10 | INT_11 | INT_12 )
            dbg.enterAlt(1);

            // NumericRules.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(177,3);
            set238=(Token)input.LT(1);
            if ( (input.LA(1)>=INT_01 && input.LA(1)<=INT_09)||(input.LA(1)>=INT_10 && input.LA(1)<=INT_12) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set238));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(179, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_01_to_12");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_01_to_12"

    public static class int_1_to_9_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_1_to_9"
    // NumericRules.g:181:1: int_1_to_9 : ( INT_1 | INT_2 | INT_3 | INT_4 | INT_5 | INT_6 | INT_7 | INT_8 | INT_9 );
    public final DateParser_NumericRules.int_1_to_9_return int_1_to_9() throws RecognitionException {
        DateParser_NumericRules.int_1_to_9_return retval = new DateParser_NumericRules.int_1_to_9_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set239=null;

        Object set239_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "int_1_to_9");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(181, 1);

        try {
            // NumericRules.g:182:3: ( INT_1 | INT_2 | INT_3 | INT_4 | INT_5 | INT_6 | INT_7 | INT_8 | INT_9 )
            dbg.enterAlt(1);

            // NumericRules.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(182,3);
            set239=(Token)input.LT(1);
            if ( (input.LA(1)>=INT_1 && input.LA(1)<=INT_9) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set239));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(183, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_1_to_9");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_1_to_9"

    public static class int_1_to_5_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_1_to_5"
    // NumericRules.g:185:1: int_1_to_5 : ( INT_1 | INT_2 | INT_3 | INT_4 | INT_5 );
    public final DateParser_NumericRules.int_1_to_5_return int_1_to_5() throws RecognitionException {
        DateParser_NumericRules.int_1_to_5_return retval = new DateParser_NumericRules.int_1_to_5_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set240=null;

        Object set240_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "int_1_to_5");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(185, 1);

        try {
            // NumericRules.g:186:3: ( INT_1 | INT_2 | INT_3 | INT_4 | INT_5 )
            dbg.enterAlt(1);

            // NumericRules.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(186,3);
            set240=(Token)input.LT(1);
            if ( (input.LA(1)>=INT_1 && input.LA(1)<=INT_5) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set240));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(187, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_1_to_5");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_1_to_5"

    // $ANTLR start synpred1_NumericRules
    public final void synpred1_NumericRules_fragment() throws RecognitionException {   
        // NumericRules.g:93:5: ( TWENTY WHITE_SPACE ONE )
        dbg.enterAlt(1);

        // NumericRules.g:93:6: TWENTY WHITE_SPACE ONE
        {
        dbg.location(93,6);
        match(input,TWENTY,FOLLOW_TWENTY_in_synpred1_NumericRules648); if (state.failed) return ;
        dbg.location(93,13);
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred1_NumericRules650); if (state.failed) return ;
        dbg.location(93,25);
        match(input,ONE,FOLLOW_ONE_in_synpred1_NumericRules652); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_NumericRules

    // $ANTLR start synpred2_NumericRules
    public final void synpred2_NumericRules_fragment() throws RecognitionException {   
        // NumericRules.g:95:5: ( TWENTY WHITE_SPACE TWO )
        dbg.enterAlt(1);

        // NumericRules.g:95:6: TWENTY WHITE_SPACE TWO
        {
        dbg.location(95,6);
        match(input,TWENTY,FOLLOW_TWENTY_in_synpred2_NumericRules729); if (state.failed) return ;
        dbg.location(95,13);
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred2_NumericRules731); if (state.failed) return ;
        dbg.location(95,25);
        match(input,TWO,FOLLOW_TWO_in_synpred2_NumericRules733); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_NumericRules

    // $ANTLR start synpred3_NumericRules
    public final void synpred3_NumericRules_fragment() throws RecognitionException {   
        // NumericRules.g:97:5: ( TWENTY WHITE_SPACE THREE )
        dbg.enterAlt(1);

        // NumericRules.g:97:6: TWENTY WHITE_SPACE THREE
        {
        dbg.location(97,6);
        match(input,TWENTY,FOLLOW_TWENTY_in_synpred3_NumericRules810); if (state.failed) return ;
        dbg.location(97,13);
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred3_NumericRules812); if (state.failed) return ;
        dbg.location(97,25);
        match(input,THREE,FOLLOW_THREE_in_synpred3_NumericRules814); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_NumericRules

    // $ANTLR start synpred4_NumericRules
    public final void synpred4_NumericRules_fragment() throws RecognitionException {   
        // NumericRules.g:99:5: ( TWENTY WHITE_SPACE FOUR )
        dbg.enterAlt(1);

        // NumericRules.g:99:6: TWENTY WHITE_SPACE FOUR
        {
        dbg.location(99,6);
        match(input,TWENTY,FOLLOW_TWENTY_in_synpred4_NumericRules885); if (state.failed) return ;
        dbg.location(99,13);
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred4_NumericRules887); if (state.failed) return ;
        dbg.location(99,25);
        match(input,FOUR,FOLLOW_FOUR_in_synpred4_NumericRules889); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_NumericRules

    // $ANTLR start synpred5_NumericRules
    public final void synpred5_NumericRules_fragment() throws RecognitionException {   
        // NumericRules.g:101:5: ( TWENTY WHITE_SPACE FIVE )
        dbg.enterAlt(1);

        // NumericRules.g:101:6: TWENTY WHITE_SPACE FIVE
        {
        dbg.location(101,6);
        match(input,TWENTY,FOLLOW_TWENTY_in_synpred5_NumericRules963); if (state.failed) return ;
        dbg.location(101,13);
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred5_NumericRules965); if (state.failed) return ;
        dbg.location(101,25);
        match(input,FIVE,FOLLOW_FIVE_in_synpred5_NumericRules967); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_NumericRules

    // $ANTLR start synpred6_NumericRules
    public final void synpred6_NumericRules_fragment() throws RecognitionException {   
        // NumericRules.g:103:5: ( TWENTY WHITE_SPACE SIX )
        dbg.enterAlt(1);

        // NumericRules.g:103:6: TWENTY WHITE_SPACE SIX
        {
        dbg.location(103,6);
        match(input,TWENTY,FOLLOW_TWENTY_in_synpred6_NumericRules1041); if (state.failed) return ;
        dbg.location(103,13);
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred6_NumericRules1043); if (state.failed) return ;
        dbg.location(103,25);
        match(input,SIX,FOLLOW_SIX_in_synpred6_NumericRules1045); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_NumericRules

    // $ANTLR start synpred7_NumericRules
    public final void synpred7_NumericRules_fragment() throws RecognitionException {   
        // NumericRules.g:105:5: ( TWENTY WHITE_SPACE SEVEN )
        dbg.enterAlt(1);

        // NumericRules.g:105:6: TWENTY WHITE_SPACE SEVEN
        {
        dbg.location(105,6);
        match(input,TWENTY,FOLLOW_TWENTY_in_synpred7_NumericRules1122); if (state.failed) return ;
        dbg.location(105,13);
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred7_NumericRules1124); if (state.failed) return ;
        dbg.location(105,25);
        match(input,SEVEN,FOLLOW_SEVEN_in_synpred7_NumericRules1126); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_NumericRules

    // $ANTLR start synpred8_NumericRules
    public final void synpred8_NumericRules_fragment() throws RecognitionException {   
        // NumericRules.g:107:5: ( TWENTY WHITE_SPACE EIGHT )
        dbg.enterAlt(1);

        // NumericRules.g:107:6: TWENTY WHITE_SPACE EIGHT
        {
        dbg.location(107,6);
        match(input,TWENTY,FOLLOW_TWENTY_in_synpred8_NumericRules1197); if (state.failed) return ;
        dbg.location(107,13);
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred8_NumericRules1199); if (state.failed) return ;
        dbg.location(107,25);
        match(input,EIGHT,FOLLOW_EIGHT_in_synpred8_NumericRules1201); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_NumericRules

    // $ANTLR start synpred9_NumericRules
    public final void synpred9_NumericRules_fragment() throws RecognitionException {   
        // NumericRules.g:109:5: ( TWENTY WHITE_SPACE NINE )
        dbg.enterAlt(1);

        // NumericRules.g:109:6: TWENTY WHITE_SPACE NINE
        {
        dbg.location(109,6);
        match(input,TWENTY,FOLLOW_TWENTY_in_synpred9_NumericRules1272); if (state.failed) return ;
        dbg.location(109,13);
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred9_NumericRules1274); if (state.failed) return ;
        dbg.location(109,25);
        match(input,NINE,FOLLOW_NINE_in_synpred9_NumericRules1276); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_NumericRules

    // $ANTLR start synpred10_NumericRules
    public final void synpred10_NumericRules_fragment() throws RecognitionException {   
        // NumericRules.g:112:5: ( THIRTY WHITE_SPACE ONE )
        dbg.enterAlt(1);

        // NumericRules.g:112:6: THIRTY WHITE_SPACE ONE
        {
        dbg.location(112,6);
        match(input,THIRTY,FOLLOW_THIRTY_in_synpred10_NumericRules1408); if (state.failed) return ;
        dbg.location(112,13);
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred10_NumericRules1410); if (state.failed) return ;
        dbg.location(112,25);
        match(input,ONE,FOLLOW_ONE_in_synpred10_NumericRules1412); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_NumericRules

    // Delegated rules

    public final boolean synpred1_NumericRules() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred1_NumericRules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_NumericRules() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred3_NumericRules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_NumericRules() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred4_NumericRules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_NumericRules() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred5_NumericRules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_NumericRules() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred9_NumericRules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_NumericRules() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred10_NumericRules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_NumericRules() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred7_NumericRules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_NumericRules() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred6_NumericRules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_NumericRules() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred8_NumericRules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_NumericRules() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred2_NumericRules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA62 dfa62 = new DFA62(this);
    static final String DFA20_eotS =
        "\71\uffff";
    static final String DFA20_eofS =
        "\24\uffff\1\32\1\43\1\32\13\uffff\1\43\26\uffff";
    static final String DFA20_minS =
        "\1\u00a6\23\uffff\2\52\1\5\1\u00a6\12\uffff\1\5\2\uffff\12\0\12"+
        "\uffff";
    static final String DFA20_maxS =
        "\1\u00ba\23\uffff\2\u00f1\1\u0115\1\u00ae\12\uffff\1\u0115\2\uffff"+
        "\12\0\12\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\4\uffff\1\37\1\25\1\46\1\43\1"+
        "\31\1\35\1\41\1\27\1\45\1\33\1\uffff\1\51\1\50\12\uffff\1\24\1\26"+
        "\1\30\1\32\1\34\1\36\1\40\1\42\1\44\1\47";
    static final String DFA20_specialS =
        "\45\uffff\1\7\1\4\1\2\1\0\1\10\1\6\1\5\1\1\1\11\1\3\12\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
            "\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32\173\uffff\1\31\1\37\1\34\1\41\1\35\1\30\1\36\1\33\1\40"+
            "\46\uffff\1\32\1\27\32\uffff\1\26",
            "\1\43\173\uffff\1\44\56\uffff\1\43\1\44\32\uffff\1\42",
            "\32\32\2\uffff\1\32\2\uffff\2\32\1\uffff\1\32\4\uffff\5\32"+
            "\7\uffff\156\32\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\14\32\1\uffff\1\32\23\uffff\1\32\5\uffff\1\32\3\uffff\1\32"+
            "\1\uffff\5\32\1\uffff\2\32\1\uffff\4\32\12\uffff\10\32\2\uffff"+
            "\12\32\1\uffff\2\32\1\uffff\13\32",
            "\1\31\1\37\1\34\1\41\1\35\1\30\1\36\1\33\1\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\43\2\uffff\1\43\2\uffff\2\43\1\uffff\1\43\4\uffff\5\43"+
            "\7\uffff\156\43\1\56\24\43\1\uffff\1\43\23\uffff\1\43\5\uffff"+
            "\1\43\3\uffff\1\43\1\uffff\5\43\1\uffff\2\43\1\uffff\4\43\12"+
            "\uffff\10\43\2\uffff\12\43\1\uffff\2\43\1\uffff\13\43",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "73:1: spelled_one_to_thirty_one : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | ( TWENTY WHITE_SPACE ONE )=> TWENTY WHITE_SPACE ONE -> INT[\"21\"] | TWENTY ( DASH )? ONE -> INT[\"21\"] | ( TWENTY WHITE_SPACE TWO )=> TWENTY WHITE_SPACE TWO -> INT[\"22\"] | TWENTY ( DASH )? TWO -> INT[\"22\"] | ( TWENTY WHITE_SPACE THREE )=> TWENTY WHITE_SPACE THREE -> INT[\"23\"] | TWENTY ( DASH )? THREE -> INT[\"23\"] | ( TWENTY WHITE_SPACE FOUR )=> TWENTY WHITE_SPACE FOUR -> INT[\"24\"] | TWENTY ( DASH )? FOUR -> INT[\"24\"] | ( TWENTY WHITE_SPACE FIVE )=> TWENTY WHITE_SPACE FIVE -> INT[\"25\"] | TWENTY ( DASH )? FIVE -> INT[\"25\"] | ( TWENTY WHITE_SPACE SIX )=> TWENTY WHITE_SPACE SIX -> INT[\"26\"] | TWENTY ( DASH )? SIX -> INT[\"26\"] | ( TWENTY WHITE_SPACE SEVEN )=> TWENTY WHITE_SPACE SEVEN -> INT[\"27\"] | TWENTY ( DASH )? SEVEN -> INT[\"27\"] | ( TWENTY WHITE_SPACE EIGHT )=> TWENTY WHITE_SPACE EIGHT -> INT[\"28\"] | TWENTY ( DASH )? EIGHT -> INT[\"28\"] | ( TWENTY WHITE_SPACE NINE )=> TWENTY WHITE_SPACE NINE -> INT[\"29\"] | TWENTY ( DASH )? NINE -> INT[\"29\"] | TWENTY -> INT[\"20\"] | ( THIRTY WHITE_SPACE ONE )=> THIRTY WHITE_SPACE ONE -> INT[\"31\"] | THIRTY ( DASH )? ONE -> INT[\"31\"] | THIRTY -> INT[\"30\"] );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_40 = input.LA(1);

                         
                        int index20_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_NumericRules()) ) {s = 50;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index20_40);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_44 = input.LA(1);

                         
                        int index20_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_NumericRules()) ) {s = 54;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index20_44);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_39 = input.LA(1);

                         
                        int index20_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_NumericRules()) ) {s = 49;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index20_39);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_46 = input.LA(1);

                         
                        int index20_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_NumericRules()) ) {s = 56;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index20_46);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_38 = input.LA(1);

                         
                        int index20_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_NumericRules()) ) {s = 48;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index20_38);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_43 = input.LA(1);

                         
                        int index20_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_NumericRules()) ) {s = 53;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index20_43);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_42 = input.LA(1);

                         
                        int index20_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_NumericRules()) ) {s = 52;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index20_42);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA20_37 = input.LA(1);

                         
                        int index20_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_NumericRules()) ) {s = 47;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index20_37);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA20_41 = input.LA(1);

                         
                        int index20_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_NumericRules()) ) {s = 51;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index20_41);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA20_45 = input.LA(1);

                         
                        int index20_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_NumericRules()) ) {s = 55;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index20_45);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\43\uffff";
    static final String DFA62_eofS =
        "\43\uffff";
    static final String DFA62_minS =
        "\1\103\24\uffff\1\u00bb\13\uffff\2\u00bb";
    static final String DFA62_maxS =
        "\1\u00cf\24\uffff\1\u00f1\13\uffff\2\u00c3";
    static final String DFA62_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\uffff\1\25\1\26\1\27\1"+
        "\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\2\uffff";
    static final String DFA62_specialS =
        "\43\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
            "\16\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\1\31\1\32\1"+
            "\33\1\34\1\35\1\36\1\37\1\40\127\uffff\1\25\1\40\1\1\1\2\1\3"+
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
            "\1\21\1\22\1\23\1\24\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\22\uffff\1\41"+
            "\32\uffff\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36",
            "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "118:1: spelled_first_to_thirty_first : ( ( FIRST | INT_1 ST ) -> INT[\"1\"] | ( SECOND | INT_2 ND ) -> INT[\"2\"] | ( THIRD | INT_3 RD ) -> INT[\"3\"] | ( FOURTH | INT_4 TH ) -> INT[\"4\"] | ( FIFTH | INT_5 TH ) -> INT[\"5\"] | ( SIXTH | INT_6 TH ) -> INT[\"6\"] | ( SEVENTH | INT_7 TH ) -> INT[\"7\"] | ( EIGHTH | INT_8 TH ) -> INT[\"8\"] | ( NINTH | INT_9 TH ) -> INT[\"9\"] | ( TENTH | INT_10 TH ) -> INT[\"10\"] | ( ELEVENTH | INT_11 TH ) -> INT[\"11\"] | ( TWELFTH | INT_12 TH ) -> INT[\"12\"] | ( THIRTEENTH | INT_13 TH ) -> INT[\"13\"] | ( FOURTEENTH | INT_14 TH ) -> INT[\"14\"] | ( FIFTEENTH | INT_15 TH ) -> INT[\"15\"] | ( SIXTEENTH | INT_16 TH ) -> INT[\"16\"] | ( SEVENTEENTH | INT_17 TH ) -> INT[\"17\"] | ( EIGHTEENTH | INT_18 TH ) -> INT[\"18\"] | ( NINETEENTH | INT_19 TH ) -> INT[\"19\"] | ( TWENTIETH | INT_20 TH ) -> INT[\"20\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) | INT_21 ST ) -> INT[\"21\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) | INT_22 ND ) -> INT[\"22\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) | INT_23 RD ) -> INT[\"23\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) | INT_24 TH ) -> INT[\"24\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) | INT_25 TH ) -> INT[\"25\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) | INT_26 TH ) -> INT[\"26\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) | INT_27 TH ) -> INT[\"27\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) | INT_28 TH ) -> INT[\"28\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) | INT_29 TH ) -> INT[\"29\"] | ( THIRTIETH | INT_30 TH ) -> INT[\"30\"] | ( ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) | INT_31 ST ) -> INT[\"31\"] );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_12_in_int_00_to_59_mandatory_prefix48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_13_to_23_in_int_00_to_59_mandatory_prefix54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_24_to_31_in_int_00_to_59_mandatory_prefix60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_32_to_59_in_int_00_to_59_mandatory_prefix66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_60_to_99_in_int_00_to_99_mandatory_prefix93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_1_to_9_in_int_01_to_12_optional_prefix120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_12_in_int_01_to_12_optional_prefix124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_00_in_int_00_to_23_optional_prefix147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_0_in_int_00_to_23_optional_prefix154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_1_to_9_in_int_00_to_23_optional_prefix160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_12_in_int_00_to_23_optional_prefix166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_13_to_23_in_int_00_to_23_optional_prefix172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_12_in_int_01_to_31_optional_prefix195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_1_to_9_in_int_01_to_31_optional_prefix201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_13_to_23_in_int_01_to_31_optional_prefix207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_24_to_31_in_int_01_to_31_optional_prefix213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits235 = new BitSet(new long[]{0xFF00000000000000L,0xFFFFFFFFFFFFF003L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_optional_prefix288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_optional_prefix297 = new BitSet(new long[]{0xFF00000000000002L,0xFFFFFFFFFFFFFFFBL,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_int_32_to_59_in_spelled_or_int_optional_prefix301 = new BitSet(new long[]{0xFF00000000000002L,0xFFFFFFFFFFFFFFFBL,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_int_60_to_99_in_spelled_or_int_optional_prefix305 = new BitSet(new long[]{0xFF00000000000002L,0xFFFFFFFFFFFFFFFBL,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_optional_prefix314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_32_to_59_in_spelled_or_int_optional_prefix318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_60_to_99_in_spelled_or_int_optional_prefix322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_in_spelled_one_to_thirty_one507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVEN_in_spelled_one_to_thirty_one525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELVE_in_spelled_one_to_thirty_one540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEEN_in_spelled_one_to_thirty_one634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one1070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one1147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one1222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one1299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one1418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one1435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one1437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_in_spelled_first_to_thirty_first1567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ST_in_spelled_first_to_thirty_first1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_2_in_spelled_first_to_thirty_first1592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ND_in_spelled_first_to_thirty_first1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_3_in_spelled_first_to_thirty_first1618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RD_in_spelled_first_to_thirty_first1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_4_in_spelled_first_to_thirty_first1643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_5_in_spelled_first_to_thirty_first1669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_6_in_spelled_first_to_thirty_first1695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_7_in_spelled_first_to_thirty_first1719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_8_in_spelled_first_to_thirty_first1744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_9_in_spelled_first_to_thirty_first1770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TENTH_in_spelled_first_to_thirty_first1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_10_in_spelled_first_to_thirty_first1796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_11_in_spelled_first_to_thirty_first1818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELFTH_in_spelled_first_to_thirty_first1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_12_in_spelled_first_to_thirty_first1841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_in_spelled_first_to_thirty_first1861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_14_in_spelled_first_to_thirty_first1881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_15_in_spelled_first_to_thirty_first1902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_16_in_spelled_first_to_thirty_first1923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_17_in_spelled_first_to_thirty_first1942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_18_in_spelled_first_to_thirty_first1962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_19_in_spelled_first_to_thirty_first1982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_20_in_spelled_first_to_thirty_first2003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0002000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_21_in_spelled_first_to_thirty_first2037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ST_in_spelled_first_to_thirty_first2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x0002000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_22_in_spelled_first_to_thirty_first2070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ND_in_spelled_first_to_thirty_first2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L,0x0002000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_23_in_spelled_first_to_thirty_first2104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RD_in_spelled_first_to_thirty_first2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L,0x0002000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_24_in_spelled_first_to_thirty_first2137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0002000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_25_in_spelled_first_to_thirty_first2171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000400001L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_26_in_spelled_first_to_thirty_first2205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000400002L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_27_in_spelled_first_to_thirty_first2237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000400004L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_28_in_spelled_first_to_thirty_first2270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000400008L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_29_in_spelled_first_to_thirty_first2304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_30_in_spelled_first_to_thirty_first2323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_first_to_thirty_first2368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0002000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_31_in_spelled_first_to_thirty_first2386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ST_in_spelled_first_to_thirty_first2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_int_60_to_990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_int_32_to_590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_int_24_to_310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_int_13_to_230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_int_01_to_120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_int_1_to_90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_int_1_to_50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_synpred1_NumericRules648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred1_NumericRules650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_ONE_in_synpred1_NumericRules652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_synpred2_NumericRules729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred2_NumericRules731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_TWO_in_synpred2_NumericRules733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_synpred3_NumericRules810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred3_NumericRules812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_THREE_in_synpred3_NumericRules814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_synpred4_NumericRules885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred4_NumericRules887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_FOUR_in_synpred4_NumericRules889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_synpred5_NumericRules963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred5_NumericRules965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_FIVE_in_synpred5_NumericRules967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_synpred6_NumericRules1041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred6_NumericRules1043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_SIX_in_synpred6_NumericRules1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_synpred7_NumericRules1122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred7_NumericRules1124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_SEVEN_in_synpred7_NumericRules1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_synpred8_NumericRules1197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred8_NumericRules1199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_EIGHT_in_synpred8_NumericRules1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_synpred9_NumericRules1272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred9_NumericRules1274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_NINE_in_synpred9_NumericRules1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_synpred10_NumericRules1408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred10_NumericRules1410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_ONE_in_synpred10_NumericRules1412 = new BitSet(new long[]{0x0000000000000002L});

}