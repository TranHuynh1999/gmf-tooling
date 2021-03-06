/*******************************************************************************
* Copyright (c) 2006, 2007 Eclipse.org
* 
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.eclipse.gmf.internal.xpand.expression.parser;

public class ExpressionParserprs implements lpg.lpgjavaruntime.ParseTable, ExpressionParsersym {

    public interface IsKeyword {
        public final static byte isKeyword[] = {0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0
        };
    };
    public final static byte isKeyword[] = IsKeyword.isKeyword;
    public final boolean isKeyword(int index) { return isKeyword[index] != 0; }

    public interface BaseCheck {
        public final static byte baseCheck[] = {0,
            1,6,1,4,1,1,3,1,5,10,
            1,0,5,1,3,1,3,1,3,1,
            3,1,1,1,1,1,1,1,3,1,
            1,1,3,1,1,1,2,2,2,3,
            1,2,1,1,1,1,1,1,1,1,
            3,4,3,1,1,3,2,2,1,1,
            1,1,1,4,6,4,1,1,1,1,
            1,1,0,1,2,4,1,3,1,1,
            4,1,1,1,3,1,1,3,-14,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-33,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            -53,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-1,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-8,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-25,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-29,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-42,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-59,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-57,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-64,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-43,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-22,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-58,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-23,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,-66,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,-69,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,-70,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            -41,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,-24,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-40,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-38,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,-39,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,-6,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-7,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,-46,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,-37,0,0,0,0,0,0,
            0,0,-30,0,0,0,0,0,-13,0,
            0,-17,-28,0,0,-15,-16,-31,0,-32,
            0,-54,-63,-55,-2,-72,-3,-4,-5,-9,
            -10,-11,-12,-18,-19,-20,-21,-26,-27,-34,
            -35,-36,-44,0,-45,0,-47,-48,0,-49,
            -50,0,-51,0,0,0,0,-52,-56,-60,
            -61,-62,-65,-67,-68,-71,0
        };
    };
    public final static byte baseCheck[] = BaseCheck.baseCheck;
    public final int baseCheck(int index) { return baseCheck[index]; }
    public final static byte rhs[] = baseCheck;
    public final int rhs(int index) { return rhs[index]; };

    public interface BaseAction {
        public final static char baseAction[] = {
            28,28,29,29,27,27,25,25,26,26,
            24,24,31,31,23,23,21,21,22,22,
            20,20,34,34,34,34,34,34,19,19,
            32,32,17,17,35,35,18,18,18,33,
            33,9,9,10,10,10,10,10,10,10,
            10,10,6,6,6,6,15,15,16,11,
            11,14,12,13,7,7,7,8,8,8,
            8,8,8,37,37,38,38,30,30,3,
            3,4,5,5,5,2,2,1,1,1,
            86,80,54,79,780,50,55,781,36,766,
            44,45,46,47,48,49,28,767,762,779,
            778,784,11,777,5,786,3,792,1,791,
            30,86,80,54,79,780,50,55,781,36,
            766,44,45,46,47,48,49,28,767,762,
            779,778,784,11,777,5,786,3,792,1,
            808,56,86,80,54,79,780,50,55,781,
            36,766,44,45,46,47,48,49,28,767,
            762,779,778,784,11,777,5,786,3,792,
            1,78,56,86,80,54,79,780,50,55,
            781,36,766,44,45,46,47,48,49,28,
            767,762,779,778,784,11,777,5,786,3,
            775,1,56,86,80,789,79,780,50,55,
            781,36,766,44,45,46,47,48,49,28,
            767,762,779,778,784,11,777,5,786,3,
            788,1,56,86,80,54,79,780,50,55,
            781,36,766,44,45,46,47,48,49,28,
            767,762,779,778,784,11,777,5,786,3,
            788,1,82,86,80,54,79,780,50,55,
            781,36,766,44,45,46,47,48,49,28,
            767,762,779,778,784,11,777,5,786,3,
            798,1,56,86,80,54,79,780,50,55,
            781,36,766,44,45,46,47,48,49,28,
            767,762,779,778,784,11,777,5,786,3,
            809,1,56,86,80,54,79,780,50,55,
            781,36,766,44,45,46,47,48,49,28,
            767,762,779,778,784,11,777,5,786,3,
            812,1,133,86,80,54,79,780,50,55,
            781,36,766,44,45,46,47,48,49,28,
            767,762,779,778,784,11,777,5,786,811,
            133,86,80,54,79,780,50,55,781,36,
            766,44,45,46,47,48,49,28,767,762,
            779,778,784,11,777,5,786,2,108,86,
            80,54,79,780,50,55,781,36,766,44,
            45,46,47,48,49,28,767,762,779,778,
            784,11,777,7,786,108,86,80,54,79,
            780,50,55,781,36,766,44,45,46,47,
            48,49,28,767,762,779,778,784,11,795,
            108,86,80,54,79,780,50,55,781,36,
            766,44,45,46,47,48,49,28,767,762,
            779,778,784,11,9,158,86,80,54,79,
            780,50,55,781,36,766,44,45,46,47,
            48,49,28,767,762,779,778,784,15,158,
            86,80,54,79,780,50,55,781,36,766,
            44,45,46,47,48,49,28,767,762,779,
            778,784,815,158,86,80,54,79,780,50,
            55,781,36,766,44,45,46,47,48,49,
            28,767,762,779,778,784,816,158,86,80,
            54,79,780,50,55,781,36,766,44,45,
            46,47,48,49,28,767,762,779,778,784,
            776,158,86,80,54,79,780,50,55,781,
            36,766,44,45,46,47,48,49,28,767,
            762,779,17,784,158,86,80,54,79,780,
            50,55,781,36,766,44,45,46,47,48,
            49,28,767,762,19,158,86,80,54,79,
            780,50,55,781,36,766,44,45,46,47,
            48,49,28,767,774,158,86,80,54,79,
            780,50,55,781,36,766,44,45,46,47,
            48,49,33,767,158,86,80,54,79,780,
            50,55,781,36,766,44,45,46,47,48,
            49,29,767,181,86,80,54,79,780,50,
            55,781,38,766,44,45,46,47,48,49,
            181,86,80,54,79,780,50,55,781,37,
            766,44,45,46,47,48,49,181,86,80,
            54,79,780,50,55,781,4,766,44,45,
            46,47,48,49,225,86,80,54,79,780,
            772,55,781,240,86,80,801,79,780,280,
            86,58,217,280,86,797,254,227,289,88,
            289,85,298,309,249,28,309,238,156,248,
            247,255,267,251,266,283,270,286,273,288,
            242,291,292,293,674,294,635,295,297,42,
            250,299,655,105,813,40,674,13,301,302,
            303,305,306,308,310,312,315,819,819
        };
    };
    public final static char baseAction[] = BaseAction.baseAction;
    public final int baseAction(int index) { return baseAction[index]; }
    public final static char lhs[] = baseAction;
    public final int lhs(int index) { return lhs[index]; };

    public interface TermCheck {
        public final static byte termCheck[] = {0,
            0,1,2,3,4,5,6,7,8,9,
            10,11,12,13,14,15,16,17,18,19,
            20,21,22,0,24,25,0,0,28,0,
            1,2,3,4,5,6,7,8,9,10,
            11,12,13,14,15,16,17,18,19,20,
            21,22,23,24,25,0,1,2,3,4,
            5,6,7,8,9,10,11,12,13,14,
            15,16,17,18,19,20,21,22,51,24,
            25,0,1,2,3,4,5,6,7,8,
            9,10,11,12,13,14,15,16,17,18,
            19,20,21,22,0,24,25,0,1,2,
            3,4,5,6,7,8,9,10,11,12,
            13,14,15,16,17,18,19,20,21,22,
            26,24,0,1,2,3,4,5,6,7,
            8,9,10,11,12,13,14,15,16,17,
            18,19,20,21,22,0,24,0,1,2,
            3,4,5,6,7,8,9,10,11,12,
            13,14,15,16,17,18,19,20,21,22,
            0,1,2,3,4,5,6,7,8,9,
            10,11,12,13,39,15,16,17,18,19,
            20,21,0,1,2,3,4,5,6,7,
            8,9,10,11,12,13,0,15,16,17,
            18,19,20,21,0,1,0,3,4,5,
            6,7,8,9,10,11,12,0,22,0,
            1,0,3,4,5,29,0,0,0,0,
            0,2,2,0,0,14,2,41,42,43,
            44,45,46,14,14,0,0,26,2,0,
            22,34,0,47,48,26,26,29,31,0,
            1,35,0,30,2,0,1,0,0,1,
            0,0,0,0,0,23,0,0,0,50,
            0,0,0,38,0,0,37,0,0,0,
            23,0,0,0,0,13,0,0,28,23,
            27,23,0,23,23,0,0,30,23,0,
            36,27,40,0,0,0,27,0,27,32,
            49,33,28,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0
        };
    };
    public final static byte termCheck[] = TermCheck.termCheck;
    public final int termCheck(int index) { return termCheck[index]; }

    public interface TermAction {
        public final static char termAction[] = {0,
            819,783,212,901,902,903,782,886,887,888,
            889,890,891,89,710,862,881,882,759,878,
            879,880,693,819,785,787,819,819,876,819,
            783,212,901,902,903,782,886,887,888,889,
            890,891,89,710,862,881,882,759,878,879,
            880,693,872,785,787,819,783,212,901,902,
            903,782,886,887,888,889,890,891,89,710,
            862,881,882,759,878,879,880,693,818,785,
            787,819,800,212,901,902,903,782,886,887,
            888,889,890,891,89,710,862,881,882,759,
            878,879,880,693,87,785,787,819,783,242,
            901,902,903,782,886,887,888,889,890,891,
            89,710,862,881,882,759,878,879,880,693,
            768,785,819,783,212,901,902,903,782,886,
            887,888,889,890,891,89,710,862,881,882,
            759,878,879,880,693,14,785,819,783,242,
            901,902,903,782,886,887,888,889,890,891,
            89,710,862,881,882,759,878,879,880,693,
            819,783,242,901,902,903,782,886,887,888,
            889,890,891,89,495,862,881,882,759,878,
            879,880,54,727,727,727,727,727,727,727,
            727,727,727,727,727,727,20,727,727,727,
            727,727,727,727,819,783,32,901,902,903,
            782,886,887,888,889,890,891,8,850,819,
            790,87,901,902,903,849,819,18,21,87,
            87,120,120,41,819,770,272,841,842,843,
            844,845,846,770,770,16,819,768,753,6,
            850,445,819,853,854,768,768,849,614,819,
            790,763,819,744,302,819,793,54,819,803,
            819,77,819,819,819,870,819,39,819,332,
            819,819,819,591,819,819,418,819,12,819,
            1110,819,819,819,819,773,819,819,875,885,
            470,883,819,871,810,819,819,744,884,819,
            900,390,362,819,819,819,543,819,567,814,
            151,519,829
        };
    };
    public final static char termAction[] = TermAction.termAction;
    public final int termAction(int index) { return termAction[index]; }

    public interface Asb {
        public final static char asb[] = {0,
            28,56,106,103,101,32,32,28,58,140,
            140,60,51,1,90,91,93,102,140,107,
            51,29,30,30,28,85,69,51,28,48,
            51,51,27,87,112,110,41,30,30,30,
            30,28,29,114,116,32,118,85,120,85,
            88,85,28,90,99,85,29,29,28,25,
            116,85,53,29,54,30,116,116,30,30,
            112,53
        };
    };
    public final static char asb[] = Asb.asb;
    public final int asb(int index) { return asb[index]; }

    public interface Asr {
        public final static byte asr[] = {0,
            2,14,22,15,1,3,4,5,6,7,
            8,9,10,11,12,18,21,17,16,19,
            20,24,25,28,13,0,23,25,24,14,
            22,15,2,18,13,21,17,16,19,20,
            6,7,8,9,10,11,12,3,4,5,
            1,0,33,32,0,51,0,35,0,32,
            33,27,28,49,51,2,14,26,31,34,
            37,38,39,41,42,43,44,45,46,29,
            22,47,48,30,23,0,14,36,26,30,
            47,48,41,42,43,44,45,46,29,22,
            31,38,32,33,39,34,27,51,37,23,
            49,28,0,40,0,27,0,36,0,31,
            34,23,37,38,39,41,42,43,44,45,
            46,29,22,47,48,30,50,14,26,2,
            0
        };
    };
    public final static byte asr[] = Asr.asr;
    public final int asr(int index) { return asr[index]; }

    public interface Nasb {
        public final static byte nasb[] = {0,
            1,12,12,12,12,1,1,5,12,12,
            12,12,13,1,18,20,15,12,12,12,
            12,1,1,1,1,12,12,13,1,6,
            22,22,1,12,12,12,9,1,1,1,
            1,1,1,12,12,1,12,12,12,12,
            12,12,1,18,16,12,1,1,1,12,
            12,12,24,1,12,1,12,12,1,1,
            12,24
        };
    };
    public final static byte nasb[] = Nasb.nasb;
    public final int nasb(int index) { return nasb[index]; }

    public interface Nasr {
        public final static byte nasr[] = {0,
            10,8,5,0,8,5,3,0,5,8,
            6,0,2,0,34,32,0,33,0,35,
            0,1,0,31,0
        };
    };
    public final static byte nasr[] = Nasr.nasr;
    public final int nasr(int index) { return nasr[index]; }

    public interface TerminalIndex {
        public final static byte terminalIndex[] = {0,
            29,4,42,43,44,45,46,47,48,49,
            50,51,6,11,30,31,32,36,37,38,
            39,22,5,34,33,2,3,7,21,25,
            35,40,41,1,8,9,10,12,13,14,
            15,16,17,18,19,20,23,24,26,27,
            52,53
        };
    };
    public final static byte terminalIndex[] = TerminalIndex.terminalIndex;
    public final int terminalIndex(int index) { return terminalIndex[index]; }

    public interface NonterminalIndex {
        public final static byte nonterminalIndex[] = {0,
            78,75,56,0,77,72,0,76,57,73,
            0,0,0,0,0,0,67,69,65,64,
            62,63,61,60,58,59,55,54,0,74,
            0,68,71,66,70,0,0,0
        };
    };
    public final static byte nonterminalIndex[] = NonterminalIndex.nonterminalIndex;
    public final int nonterminalIndex(int index) { return nonterminalIndex[index]; }

    public interface ScopePrefix {
        public final static byte scopePrefix[] = {
            37,47,7,78,1,18,71,59,13,22,
            25,30
        };
    };
    public final static byte scopePrefix[] = ScopePrefix.scopePrefix;
    public final int scopePrefix(int index) { return scopePrefix[index]; }

    public interface ScopeSuffix {
        public final static byte scopeSuffix[] = {
            16,54,5,83,5,5,75,63,16,5,
            28,33
        };
    };
    public final static byte scopeSuffix[] = ScopeSuffix.scopeSuffix;
    public final int scopeSuffix(int index) { return scopeSuffix[index]; }

    public interface ScopeLhs {
        public final static byte scopeLhs[] = {
            24,24,7,29,7,6,26,24,15,10,
            33,31
        };
    };
    public final static byte scopeLhs[] = ScopeLhs.scopeLhs;
    public final int scopeLhs(int index) { return scopeLhs[index]; }

    public interface ScopeLa {
        public final static byte scopeLa[] = {
            28,32,23,27,23,23,27,23,28,23,
            30,27
        };
    };
    public final static byte scopeLa[] = ScopeLa.scopeLa;
    public final int scopeLa(int index) { return scopeLa[index]; }

    public interface ScopeStateSet {
        public final static byte scopeStateSet[] = {
            20,20,7,25,7,7,22,20,8,8,
            4,1
        };
    };
    public final static byte scopeStateSet[] = ScopeStateSet.scopeStateSet;
    public final int scopeStateSet(int index) { return scopeStateSet[index]; }

    public interface ScopeRhs {
        public final static byte scopeRhs[] = {0,
            80,2,60,0,5,0,80,50,1,2,
            60,0,82,13,0,7,0,82,2,1,
            0,80,2,0,58,30,0,71,0,75,
            33,0,3,61,0,0,75,27,32,83,
            13,23,80,2,24,0,83,13,23,80,
            2,24,0,40,3,61,7,0,80,2,
            24,0,5,6,0,40,3,61,7,0,
            76,34,76,0,3,60,0,79,40,1,
            25,0,3,55,0
        };
    };
    public final static byte scopeRhs[] = ScopeRhs.scopeRhs;
    public final int scopeRhs(int index) { return scopeRhs[index]; }

    public interface ScopeState {
        public final static char scopeState[] = {0,
            776,773,0,772,766,0,744,567,543,519,
            727,591,635,674,655,614,495,710,693,470,
            445,390,362,418,332,151,302,120,272,242,
            89,212,182,0
        };
    };
    public final static char scopeState[] = ScopeState.scopeState;
    public final int scopeState(int index) { return scopeState[index]; }

    public interface InSymb {
        public final static byte inSymb[] = {0,
            0,80,76,73,72,22,14,2,57,60,
            6,1,18,13,62,70,71,74,24,78,
            25,34,39,31,2,80,55,35,2,2,
            26,14,2,1,82,80,30,87,84,86,
            38,2,37,1,76,23,54,80,1,55,
            1,82,49,58,71,80,40,27,50,23,
            79,80,13,27,83,33,32,75,27,27,
            75,75
        };
    };
    public final static byte inSymb[] = InSymb.inSymb;
    public final int inSymb(int index) { return inSymb[index]; }

    public interface Name {
        public final static String name[] = {
            "",
            "?",
            "::",
            ":",
            "(",
            ")",
            "{",
            "}",
            "[",
            "]",
            "->",
            "!",
            "&&",
            "||",
            "=",
            "==",
            "!=",
            ">=",
            "<=",
            ">",
            "<",
            "+",
            "-",
            "*",
            "/",
            ".",
            ",",
            "|",
            "$empty",
            "IDENT",
            "STRING",
            "INT_CONST",
            "REAL_CONST",
            "let",
            "switch",
            "implies",
            "new",
            "false",
            "true",
            "null",
            "default",
            "case",
            "Collection",
            "List",
            "Set",
            "typeSelect",
            "collect",
            "select",
            "reject",
            "exists",
            "notExists",
            "forAll",
            "EOF_TOKEN",
            "ERROR_TOKEN",
            "expression",
            "castedExpression",
            "type",
            "infixExpression",
            "chainExpression",
            "ifExpression",
            "switchExpression",
            "orExpression",
            "andExpression",
            "impliesExpression",
            "relationalExpression",
            "additiveExpression",
            "relationalOperator",
            "multiplicativeExpression",
            "additiveOperator",
            "unaryExpression",
            "multiplicativeOperator",
            "infixExpressionSuffix",
            "featureCall",
            "primaryExpression",
            "parameterList",
            "simpleType",
            "collectionExpressionName",
            "collectionTypeName",
            "qualifiedType"
        };
    };
    public final static String name[] = Name.name;
    public final String name(int index) { return name[index]; }

    public final static int
           ERROR_SYMBOL      = 52,
           SCOPE_UBOUND      = 11,
           SCOPE_SIZE        = 12,
           MAX_NAME_LENGTH   = 24;

    public final int getErrorSymbol() { return ERROR_SYMBOL; }
    public final int getScopeUbound() { return SCOPE_UBOUND; }
    public final int getScopeSize() { return SCOPE_SIZE; }
    public final int getMaxNameLength() { return MAX_NAME_LENGTH; }

    public final static int
           NUM_STATES        = 72,
           NT_OFFSET         = 52,
           LA_STATE_OFFSET   = 907,
           MAX_LA            = 2,
           NUM_RULES         = 88,
           NUM_NONTERMINALS  = 38,
           NUM_SYMBOLS       = 90,
           SEGMENT_SIZE      = 8192,
           START_STATE       = 182,
           IDENTIFIER_SYMBOL = 0,
           EOFT_SYMBOL       = 51,
           EOLT_SYMBOL       = 51,
           ACCEPT_ACTION     = 818,
           ERROR_ACTION      = 819;

    public final static boolean BACKTRACK = false;

    public final int getNumStates() { return NUM_STATES; }
    public final int getNtOffset() { return NT_OFFSET; }
    public final int getLaStateOffset() { return LA_STATE_OFFSET; }
    public final int getMaxLa() { return MAX_LA; }
    public final int getNumRules() { return NUM_RULES; }
    public final int getNumNonterminals() { return NUM_NONTERMINALS; }
    public final int getNumSymbols() { return NUM_SYMBOLS; }
    public final int getSegmentSize() { return SEGMENT_SIZE; }
    public final int getStartState() { return START_STATE; }
    public final int getStartSymbol() { return lhs[0]; }
    public final int getIdentifierSymbol() { return IDENTIFIER_SYMBOL; }
    public final int getEoftSymbol() { return EOFT_SYMBOL; }
    public final int getEoltSymbol() { return EOLT_SYMBOL; }
    public final int getAcceptAction() { return ACCEPT_ACTION; }
    public final int getErrorAction() { return ERROR_ACTION; }
    public final boolean isValidForParser() { return isValidForParser; }
    public final boolean getBacktrack() { return BACKTRACK; }

    public final int originalState(int state) {
        return -baseCheck[state];
    }
    public final int asi(int state) {
        return asb[originalState(state)];
    }
    public final int nasi(int state) {
        return nasb[originalState(state)];
    }
    public final int inSymbol(int state) {
        return inSymb[originalState(state)];
    }

    public final int ntAction(int state, int sym) {
        return baseAction[state + sym];
    }

    public final int tAction(int state, int sym) {
        int i = baseAction[state],
            k = i + sym;
        return termAction[termCheck[k] == sym ? k : i];
    }
    public final int lookAhead(int la_state, int sym) {
        int k = la_state + sym;
        return termAction[termCheck[k] == sym ? k : la_state];
    }
}
