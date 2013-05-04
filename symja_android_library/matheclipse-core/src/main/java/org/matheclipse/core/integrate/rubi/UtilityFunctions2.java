package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;

import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
/** 
 * UtilityFunctions rules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class UtilityFunctions2 { 
  final public static IAST RULES = List( 
SetDelayed(TrigSimplifyAux(Times(Times($p("u",true),Power(Sin($p("v")),$p("m",true))),Power(Plus(Plus($p("a",true),Times($p("b",true),Power(Cot($p("v")),$p("n",true)))),Times($p("c",true),Power(Csc($p("v")),$p("n",true)))),$p("p",true)))),
    Condition(Times(Times($s("u"),Power(Sin($s("v")),Plus($s("m"),Times(CN1,Times($s("n"),$s("p")))))),Power(Plus(Plus($s("c"),Times($s("b"),Power(Cos($s("v")),$s("n")))),Times($s("a"),Power(Sin($s("v")),$s("n")))),$s("p"))),IntegerQ(List($s("m"),$s("n"),$s("p"))))),
SetDelayed(TrigSimplifyAux(Times(Times($p("u",true),Power(Csc($p("v")),$p("m",true))),Power(Plus(Plus($p("a",true),Times($p("b",true),Power(Cot($p("v")),$p("n",true)))),Times($p("c",true),Power(Csc($p("v")),$p("n",true)))),$p("p",true)))),
    Condition(Times(Times($s("u"),Power(Csc($s("v")),Plus($s("m"),Times($s("n"),$s("p"))))),Power(Plus(Plus($s("c"),Times($s("b"),Power(Cos($s("v")),$s("n")))),Times($s("a"),Power(Sin($s("v")),$s("n")))),$s("p"))),IntegerQ(List($s("m"),$s("n"),$s("p"))))),
SetDelayed(TrigSimplifyAux(Times($p("u",true),Times(Power(Tan($p("v")),$p("n",true)),Power(Plus($p("a"),Times($p("b",true),Power(Sec($p("v")),$p("n",true)))),CN1)))),
    Condition(Times($s("u"),Times(Power(Sin($s("v")),$s("n")),Power(Plus($s("b"),Times($s("a"),Power(Cos($s("v")),$s("n")))),CN1))),And(And(IntegerQ($s("n")),Greater($s("n"),C0)),NonsumQ($s("a"))))),
SetDelayed(TrigSimplifyAux(Times($p("u",true),Times(Power(Cot($p("v")),$p("n",true)),Power(Plus($p("a"),Times($p("b",true),Power(Csc($p("v")),$p("n",true)))),CN1)))),
    Condition(Times($s("u"),Times(Power(Cos($s("v")),$s("n")),Power(Plus($s("b"),Times($s("a"),Power(Sin($s("v")),$s("n")))),CN1))),And(And(IntegerQ($s("n")),Greater($s("n"),C0)),NonsumQ($s("a"))))),
SetDelayed(TrigSimplifyAux(Times(Power(Sin($p("v")),$p("m",true)),Power(Plus(Times($p("a",true),Power(Cos($p("v")),$p("n",true))),Times($p("b",true),Power(Sin($p("v")),$p("n",true)))),$p("p")))),
    Condition(Power(Plus($s("b"),Times($s("a"),Power(Cot($s("v")),$s("n")))),$s("p")),And(And(And(IntegerQ(List($s("m"),$s("n"),$s("p"))),Greater($s("n"),C0)),Less($s("p"),C0)),Equal($s("m"),Times(Times(CN1,$s("n")),$s("p")))))),
SetDelayed(TrigSimplifyAux(Times(Power(Cos($p("v")),$p("m",true)),Power(Plus(Times($p("a",true),Power(Cos($p("v")),$p("n",true))),Times($p("b",true),Power(Sin($p("v")),$p("n",true)))),$p("p")))),
    Condition(Power(Plus($s("a"),Times($s("b"),Power(Tan($s("v")),$s("n")))),$s("p")),And(And(And(IntegerQ(List($s("m"),$s("n"),$s("p"))),Greater($s("n"),C0)),Less($s("p"),C0)),Equal($s("m"),Times(Times(CN1,$s("n")),$s("p")))))),
SetDelayed(TrigSimplifyAux(Power(Plus(Times($p("a",true),Cos($p("v"))),Times($p("b",true),Sin($p("v")))),$p("n"))),
    Condition(Power(Plus(Times(Cos($s("v")),Power($s("a"),CN1)),Times(Sin($s("v")),Power($s("b"),CN1))),Times(CN1,$s("n"))),And(And(IntegerQ($s("n")),Less($s("n"),C0)),ZeroQ(Plus(Power($s("a"),C2),Power($s("b"),C2)))))),
SetDelayed(TrigSimplifyAux(Plus(Plus(Times($p("u",true),Power(Cosh($p("z")),C2)),Times($p("v",true),Power(Sinh($p("z")),C2))),$p("w",true))),
    Condition(Plus($s("u"),$s("w")),SameQ($s("u"),Times(CN1,$s("v"))))),
SetDelayed(TrigSimplifyAux(Plus(Plus(Times($p("u",true),Power(Sech($p("z")),C2)),Times($p("v",true),Power(Tanh($p("z")),C2))),$p("w",true))),
    Condition(Plus($s("u"),$s("w")),SameQ($s("u"),$s("v")))),
SetDelayed(TrigSimplifyAux(Plus(Plus(Times($p("u",true),Power(Coth($p("z")),C2)),Times($p("v",true),Power(Csch($p("z")),C2))),$p("w",true))),
    Condition(Plus($s("u"),$s("w")),SameQ($s("u"),Times(CN1,$s("v"))))),
SetDelayed(TrigSimplifyAux(Plus(Plus($p("u"),Times($p("v",true),Power(Sinh($p("z")),C2))),$p("w",true))),
    Condition(Plus(Times($s("u"),Power(Cosh($s("z")),C2)),$s("w")),SameQ($s("u"),$s("v")))),
SetDelayed(TrigSimplifyAux(Plus(Plus($p("u"),Times($p("v",true),Power(Cosh($p("z")),C2))),$p("w",true))),
    Condition(Plus(Times($s("v"),Power(Sinh($s("z")),C2)),$s("w")),SameQ($s("u"),Times(CN1,$s("v"))))),
SetDelayed(TrigSimplifyAux(Plus(Plus($p("u"),Times($p("v",true),Power(Tanh($p("z")),C2))),$p("w",true))),
    Condition(Plus(Times($s("u"),Power(Sech($s("z")),C2)),$s("w")),SameQ($s("u"),Times(CN1,$s("v"))))),
SetDelayed(TrigSimplifyAux(Plus(Plus($p("u"),Times($p("v",true),Power(Coth($p("z")),C2))),$p("w",true))),
    Condition(Plus(Times($s("v"),Power(Csch($s("z")),C2)),$s("w")),SameQ($s("u"),Times(CN1,$s("v"))))),
SetDelayed(TrigSimplifyAux(Plus(Plus($p("u"),Times($p("v",true),Power(Sech($p("z")),C2))),$p("w",true))),
    Condition(Plus(Times($s("u"),Power(Tanh($s("z")),C2)),$s("w")),SameQ($s("u"),Times(CN1,$s("v"))))),
SetDelayed(TrigSimplifyAux(Plus(Plus($p("u"),Times($p("v",true),Power(Csch($p("z")),C2))),$p("w",true))),
    Condition(Plus(Times($s("u"),Power(Coth($s("z")),C2)),$s("w")),SameQ($s("u"),$s("v")))),
SetDelayed(TrigSimplifyAux(Times($p("u",true),Times(Power(Sinh($p("v")),C2),Power(Plus($p("a"),Times($p("b",true),Cosh($p("v")))),CN1)))),
    Condition(Times($s("u"),Plus(Times(CN1,Power($s("a"),CN1)),Times(Cosh($s("v")),Power($s("b"),CN1)))),ZeroQ(Plus(Power($s("a"),C2),Times(CN1,Power($s("b"),C2)))))),
SetDelayed(TrigSimplifyAux(Times($p("u",true),Times(Power(Cosh($p("v")),C2),Power(Plus($p("a"),Times($p("b",true),Sinh($p("v")))),CN1)))),
    Condition(Times($s("u"),Plus(Times(C1,Power($s("a"),CN1)),Times(Sinh($s("v")),Power($s("b"),CN1)))),ZeroQ(Plus(Power($s("a"),C2),Power($s("b"),C2))))),
SetDelayed(TrigSimplifyAux(Times($p("u",true),Times(Power(Tanh($p("v")),$p("n",true)),Power(Plus($p("a"),Times($p("b",true),Power(Tanh($p("v")),$p("n",true)))),CN1)))),
    Condition(Times($s("u"),Power(Plus($s("b"),Times($s("a"),Power(Coth($s("v")),$s("n")))),CN1)),And(And(IntegerQ($s("n")),Greater($s("n"),C0)),NonsumQ($s("a"))))),
SetDelayed(TrigSimplifyAux(Times($p("u",true),Times(Power(Coth($p("v")),$p("n",true)),Power(Plus($p("a"),Times($p("b",true),Power(Coth($p("v")),$p("n",true)))),CN1)))),
    Condition(Times($s("u"),Power(Plus($s("b"),Times($s("a"),Power(Tanh($s("v")),$s("n")))),CN1)),And(And(IntegerQ($s("n")),Greater($s("n"),C0)),NonsumQ($s("a"))))),
SetDelayed(TrigSimplifyAux(Times($p("u",true),Times(Power(Sech($p("v")),$p("n",true)),Power(Plus($p("a"),Times($p("b",true),Power(Sech($p("v")),$p("n",true)))),CN1)))),
    Condition(Times($s("u"),Power(Plus($s("b"),Times($s("a"),Power(Cosh($s("v")),$s("n")))),CN1)),And(And(IntegerQ($s("n")),Greater($s("n"),C0)),NonsumQ($s("a"))))),
SetDelayed(TrigSimplifyAux(Times($p("u",true),Times(Power(Csch($p("v")),$p("n",true)),Power(Plus($p("a"),Times($p("b",true),Power(Csch($p("v")),$p("n",true)))),CN1)))),
    Condition(Times($s("u"),Power(Plus($s("b"),Times($s("a"),Power(Sinh($s("v")),$s("n")))),CN1)),And(And(IntegerQ($s("n")),Greater($s("n"),C0)),NonsumQ($s("a"))))),
SetDelayed(TrigSimplifyAux(Power(Plus(Times($p("a",true),Csch($p("v"))),Times($p("b",true),Coth($p("v")))),$p("n"))),
    Condition(Times(Power($s("a"),$s("n")),Power(Coth(Times($s("v"),C1D2)),$s("n"))),And(EvenQ($s("n")),ZeroQ(Plus($s("a"),Times(CN1,$s("b"))))))),
SetDelayed(TrigSimplifyAux(Power(Plus(Times($p("a",true),Csch($p("v"))),Times($p("b",true),Coth($p("v")))),$p("n"))),
    Condition(Times(Power($s("b"),$s("n")),Power(Tanh(Times($s("v"),C1D2)),$s("n"))),And(EvenQ($s("n")),ZeroQ(Plus($s("a"),$s("b")))))),
SetDelayed(TrigSimplifyAux(Times(Times($p("u",true),Power(Sinh($p("v")),$p("m",true))),Power(Plus($p("a",true),Times($p("b",true),Power(Coth($p("v")),$p("n",true)))),$p("p",true)))),
    Condition(Times(Times($s("u"),Power(Sinh($s("v")),Plus($s("m"),Times(CN1,Times($s("n"),$s("p")))))),Power(Plus(Times($s("b"),Power(Cosh($s("v")),$s("n"))),Times($s("a"),Power(Sinh($s("v")),$s("n")))),$s("p"))),IntegerQ(List($s("m"),$s("n"),$s("p"))))),
SetDelayed(TrigSimplifyAux(Times(Times($p("u",true),Power(Cosh($p("v")),$p("m",true))),Power(Plus($p("a",true),Times($p("b",true),Power(Tanh($p("v")),$p("n",true)))),$p("p",true)))),
    Condition(Times(Times($s("u"),Power(Cosh($s("v")),Plus($s("m"),Times(CN1,Times($s("n"),$s("p")))))),Power(Plus(Times($s("b"),Power(Sinh($s("v")),$s("n"))),Times($s("a"),Power(Cosh($s("v")),$s("n")))),$s("p"))),IntegerQ(List($s("m"),$s("n"),$s("p"))))),
SetDelayed(TrigSimplifyAux(Times(Times($p("u"),Power(Sech($p("v")),$p("m",true))),Power(Plus($p("a",true),Times($p("b",true),Power(Tanh($p("v")),C2))),$p("p",true)))),
    Condition(Times($s("u"),Power(Plus(Times($s("b"),Power(Sinh($s("v")),C2)),Times($s("a"),Power(Cosh($s("v")),C2))),$s("p"))),And(IntegerQ(List($s("m"),$s("p"))),Equal(Plus($s("m"),Times(C2,$s("p"))),C0)))),
SetDelayed(TrigSimplifyAux(Times(Times($p("u"),Power(Csch($p("v")),$p("m",true))),Power(Plus($p("a",true),Times($p("b",true),Power(Coth($p("v")),C2))),$p("p",true)))),
    Condition(Times($s("u"),Power(Plus(Times($s("b"),Power(Cosh($s("v")),C2)),Times($s("a"),Power(Sinh($s("v")),C2))),$s("p"))),And(IntegerQ(List($s("m"),$s("p"))),Equal(Plus($s("m"),Times(C2,$s("p"))),C0)))),
SetDelayed(TrigSimplifyAux(Times(Times($p("u",true),Power(Cosh($p("v")),$p("m",true))),Power(Plus(Plus($p("a",true),Times($p("b",true),Power(Tanh($p("v")),$p("n",true)))),Times($p("c",true),Power(Sech($p("v")),$p("n",true)))),$p("p",true)))),
    Condition(Times(Times($s("u"),Power(Cosh($s("v")),Plus($s("m"),Times(CN1,Times($s("n"),$s("p")))))),Power(Plus(Plus($s("c"),Times($s("b"),Power(Sinh($s("v")),$s("n")))),Times($s("a"),Power(Cosh($s("v")),$s("n")))),$s("p"))),IntegerQ(List($s("m"),$s("n"),$s("p"))))),
SetDelayed(TrigSimplifyAux(Times(Times($p("u",true),Power(Sech($p("v")),$p("m",true))),Power(Plus(Plus($p("a",true),Times($p("b",true),Power(Tanh($p("v")),$p("n",true)))),Times($p("c",true),Power(Sech($p("v")),$p("n",true)))),$p("p",true)))),
    Condition(Times(Times($s("u"),Power(Sech($s("v")),Plus($s("m"),Times($s("n"),$s("p"))))),Power(Plus(Plus($s("c"),Times($s("b"),Power(Sinh($s("v")),$s("n")))),Times($s("a"),Power(Cosh($s("v")),$s("n")))),$s("p"))),IntegerQ(List($s("m"),$s("n"),$s("p"))))),
SetDelayed(TrigSimplifyAux(Times(Times($p("u",true),Power(Sinh($p("v")),$p("m",true))),Power(Plus(Plus($p("a",true),Times($p("b",true),Power(Coth($p("v")),$p("n",true)))),Times($p("c",true),Power(Csch($p("v")),$p("n",true)))),$p("p",true)))),
    Condition(Times(Times($s("u"),Power(Sinh($s("v")),Plus($s("m"),Times(CN1,Times($s("n"),$s("p")))))),Power(Plus(Plus($s("c"),Times($s("b"),Power(Cosh($s("v")),$s("n")))),Times($s("a"),Power(Sinh($s("v")),$s("n")))),$s("p"))),IntegerQ(List($s("m"),$s("n"),$s("p"))))),
SetDelayed(TrigSimplifyAux(Times(Times($p("u",true),Power(Csch($p("v")),$p("m",true))),Power(Plus(Plus($p("a",true),Times($p("b",true),Power(Coth($p("v")),$p("n",true)))),Times($p("c",true),Power(Csch($p("v")),$p("n",true)))),$p("p",true)))),
    Condition(Times(Times($s("u"),Power(Csch($s("v")),Plus($s("m"),Times($s("n"),$s("p"))))),Power(Plus(Plus($s("c"),Times($s("b"),Power(Cosh($s("v")),$s("n")))),Times($s("a"),Power(Sinh($s("v")),$s("n")))),$s("p"))),IntegerQ(List($s("m"),$s("n"),$s("p"))))),
SetDelayed(TrigSimplifyAux(Times($p("u",true),Times(Power(Tanh($p("v")),$p("n",true)),Power(Plus($p("a"),Times($p("b",true),Power(Sech($p("v")),$p("n",true)))),CN1)))),
    Condition(Times($s("u"),Times(Power(Sinh($s("v")),$s("n")),Power(Plus($s("b"),Times($s("a"),Power(Cosh($s("v")),$s("n")))),CN1))),And(And(IntegerQ($s("n")),Greater($s("n"),C0)),NonsumQ($s("a"))))),
SetDelayed(TrigSimplifyAux(Times($p("u",true),Times(Power(Coth($p("v")),$p("n",true)),Power(Plus($p("a"),Times($p("b",true),Power(Csch($p("v")),$p("n",true)))),CN1)))),
    Condition(Times($s("u"),Times(Power(Cosh($s("v")),$s("n")),Power(Plus($s("b"),Times($s("a"),Power(Sinh($s("v")),$s("n")))),CN1))),And(And(IntegerQ($s("n")),Greater($s("n"),C0)),NonsumQ($s("a"))))),
SetDelayed(TrigSimplifyAux(Times(Power(Sinh($p("v")),$p("m",true)),Power(Plus(Times($p("a",true),Power(Cosh($p("v")),$p("n",true))),Times($p("b",true),Power(Sinh($p("v")),$p("n",true)))),$p("p")))),
    Condition(Power(Plus($s("b"),Times($s("a"),Power(Coth($s("v")),$s("n")))),$s("p")),And(And(And(IntegerQ(List($s("m"),$s("n"),$s("p"))),Greater($s("n"),C0)),Less($s("p"),C0)),Equal($s("m"),Times(Times(CN1,$s("n")),$s("p")))))),
SetDelayed(TrigSimplifyAux(Times(Power(Cosh($p("v")),$p("m",true)),Power(Plus(Times($p("a",true),Power(Cosh($p("v")),$p("n",true))),Times($p("b",true),Power(Sinh($p("v")),$p("n",true)))),$p("p")))),
    Condition(Power(Plus($s("a"),Times($s("b"),Power(Tanh($s("v")),$s("n")))),$s("p")),And(And(And(IntegerQ(List($s("m"),$s("n"),$s("p"))),Greater($s("n"),C0)),Less($s("p"),C0)),Equal($s("m"),Times(Times(CN1,$s("n")),$s("p")))))),
SetDelayed(TrigSimplifyAux(Power(Plus(Times($p("a",true),Cosh($p("v"))),Times($p("b",true),Sinh($p("v")))),$p("n"))),
    Condition(Power(Plus(Times(Cosh($s("v")),Power($s("a"),CN1)),Times(CN1,Times(Sinh($s("v")),Power($s("b"),CN1)))),Times(CN1,$s("n"))),And(And(IntegerQ($s("n")),Less($s("n"),C0)),ZeroQ(Plus(Power($s("a"),C2),Times(CN1,Power($s("b"),C2))))))),
SetDelayed(TrigSimplifyAux($p("u")),
    $s("u")),
SetDelayed(SmartTrigExpand(Times(Sec($p("u")),Sin(Times($p("n"),$p("u")))),$p("x",$s("Symbol"))),
    Condition(Sum(Times(Times(Power(CN1,Plus($s("k"),Times($s("n"),C1D2))),C2),Sin(Times(Plus(Times(C2,$s("k")),Times(CN1,C1)),$s("u")))),List($s("k"),C1,Times($s("n"),C1D2))),And(And(EvenQ($s("n")),Greater($s("n"),C1)),Not(FreeQ($s("u"),$s("x")))))),
SetDelayed(SmartTrigExpand(Times(Sec($p("u")),Sin(Times($p("n"),$p("u")))),$p("x",$s("Symbol"))),
    Condition(Plus(Times(Power(CN1,Times(Plus($s("n"),Times(CN1,C1)),C1D2)),Tan($s("u"))),Sum(Times(Times(Power(CN1,Plus($s("k"),Times(Plus($s("n"),Times(CN1,C1)),C1D2))),C2),Sin(Times(Times(C2,$s("k")),$s("u")))),List($s("k"),C1,Times(Plus($s("n"),Times(CN1,C1)),C1D2)))),And(And(OddQ($s("n")),Greater($s("n"),C1)),Not(FreeQ($s("u"),$s("x")))))),
SetDelayed(SmartTrigExpand(Times(Csc($p("u")),Cos(Times($p("n"),$p("u")))),$p("x",$s("Symbol"))),
    Condition(Plus(Csc($s("u")),Times(CN1,Sum(Times(C2,Sin(Times(Plus(Times(C2,$s("k")),Times(CN1,C1)),$s("u")))),List($s("k"),C1,Times($s("n"),C1D2))))),And(And(EvenQ($s("n")),Greater($s("n"),C1)),Not(FreeQ($s("u"),$s("x")))))),
SetDelayed(SmartTrigExpand(Times(Csc($p("u")),Cos(Times($p("n"),$p("u")))),$p("x",$s("Symbol"))),
    Condition(Plus(Cot($s("u")),Times(CN1,Sum(Times(C2,Sin(Times(Times(C2,$s("k")),$s("u")))),List($s("k"),C1,Times(Plus($s("n"),Times(CN1,C1)),C1D2))))),And(And(OddQ($s("n")),Greater($s("n"),C1)),Not(FreeQ($s("u"),$s("x")))))),
SetDelayed(SmartTrigExpand(Times(Sech($p("u")),Sinh(Times($p("n"),$p("u")))),$p("x",$s("Symbol"))),
    Condition(Sum(Times(Times(Power(CN1,Plus($s("k"),Times($s("n"),C1D2))),C2),Sinh(Times(Plus(Times(C2,$s("k")),Times(CN1,C1)),$s("u")))),List($s("k"),C1,Times($s("n"),C1D2))),And(And(EvenQ($s("n")),Greater($s("n"),C1)),Not(FreeQ($s("u"),$s("x")))))),
SetDelayed(SmartTrigExpand(Times(Sech($p("u")),Sinh(Times($p("n"),$p("u")))),$p("x",$s("Symbol"))),
    Condition(Plus(Times(Power(CN1,Times(Plus($s("n"),Times(CN1,C1)),C1D2)),Tanh($s("u"))),Sum(Times(Times(Power(CN1,Plus($s("k"),Times(Plus($s("n"),Times(CN1,C1)),C1D2))),C2),Sinh(Times(Times(C2,$s("k")),$s("u")))),List($s("k"),C1,Times(Plus($s("n"),Times(CN1,C1)),C1D2)))),And(And(OddQ($s("n")),Greater($s("n"),C1)),Not(FreeQ($s("u"),$s("x")))))),
SetDelayed(SmartTrigExpand(Times(Csch($p("u")),Cosh(Times($p("n"),$p("u")))),$p("x",$s("Symbol"))),
    Condition(Plus(Csch($s("u")),Sum(Times(C2,Sinh(Times(Plus(Times(C2,$s("k")),Times(CN1,C1)),$s("u")))),List($s("k"),C1,Times($s("n"),C1D2)))),And(And(EvenQ($s("n")),Greater($s("n"),C1)),Not(FreeQ($s("u"),$s("x")))))),
SetDelayed(SmartTrigExpand(Times(Csch($p("u")),Cosh(Times($p("n"),$p("u")))),$p("x",$s("Symbol"))),
    Condition(Plus(Coth($s("u")),Sum(Times(C2,Sinh(Times(Times(C2,$s("k")),$s("u")))),List($s("k"),C1,Times(Plus($s("n"),Times(CN1,C1)),C1D2)))),And(And(OddQ($s("n")),Greater($s("n"),C1)),Not(FreeQ($s("u"),$s("x")))))),
SetDelayed(SmartTrigExpand(Times(Power(Csch($p("u")),C2),Cosh(Times($p("n"),$p("u")))),$p("x",$s("Symbol"))),
    Condition(Plus(Plus($s("n"),Power(Csch($s("u")),C2)),Sum(Times(Times(C4,Plus(Times($s("n"),C1D2),Times(CN1,$s("k")))),Cosh(Times(Times(C2,$s("k")),$s("u")))),List($s("k"),C1,Times($s("n"),C1D2)))),And(And(EvenQ($s("n")),Greater($s("n"),C1)),Not(FreeQ($s("u"),$s("x")))))),
SetDelayed(SmartTrigExpand(Times(Power(Csch($p("u")),C2),Cosh(Times($p("n"),$p("u")))),$p("x",$s("Symbol"))),
    Condition(Plus(Times(Coth($s("u")),Csch($s("u"))),Sum(Times(Times(C4,Plus(Times(Plus($s("n"),C1),C1D2),Times(CN1,$s("k")))),Cosh(Times(Plus(Times(C2,$s("k")),Times(CN1,C1)),$s("u")))),List($s("k"),C1,Times(Plus($s("n"),C1),C1D2)))),And(And(OddQ($s("n")),Greater($s("n"),C1)),Not(FreeQ($s("u"),$s("x")))))),
SetDelayed(SmartTrigExpand(Times(Power(Csch($p("u")),C3),Cosh(Times($p("n"),$p("u")))),$p("x",$s("Symbol"))),
    Condition(Plus(Plus(Times(Plus(Power($s("n"),C2),Times(CN1,C1)),Times(Coth($s("u")),C1D2)),Times(Coth($s("u")),Power(Csch($s("u")),C2))),Sum(Times(Times(integer(8L),Binomial(Plus(Times(Plus($s("n"),C1),C1D2),Times(CN1,$s("k"))),C2)),Sinh(Times(Times(C2,$s("k")),$s("u")))),List($s("k"),C1,Times(Plus($s("n"),Times(CN1,C3)),C1D2)))),And(And(OddQ($s("n")),Greater($s("n"),C1)),Not(FreeQ($s("u"),$s("x")))))),
SetDelayed(SmartTrigExpand(Power($p("u"),$p("n")),$p("x",$s("Symbol"))),
    Condition(Module(List(Set($s("tmp"),SmartTrigExpand($s("u"),$s("x")))),Condition(Expand(Power($s("tmp"),$s("n")),$s("x")),SumQ($s("tmp")))),And(And(NonsumQ($s("u")),IntegerQ($s("n"))),Greater($s("n"),C1)))),
SetDelayed(SmartTrigExpand(Times($p("u"),$p("v")),$p("x",$s("Symbol"))),
    Condition(Module(List(Set($s("tmp1"),SmartTrigExpand($s("u"),$s("x"))),Set($s("tmp2"),SmartTrigExpand($s("v"),$s("x")))),Condition(Distribute(Times($s("tmp1"),$s("tmp2"))),Or(SumQ($s("tmp1")),SumQ($s("tmp2"))))),And(NonsumQ($s("u")),NonsumQ($s("v"))))),
SetDelayed(SmartTrigExpand($p("u"),$p("x",$s("Symbol"))),
    $s("u")),
SetDelayed(Simp($p("expn")),
    If(AtomQ($s("expn")),$s("expn"),If(Or(Or(SameQ(Head($s("expn")),$s("If")),SameQ(Head($s("expn")),$s("Int"))),SameQ(Head($s("expn")),$s("Dif"))),$s("expn"),SimpAux(Map($s("Integrate::Simp"),$s("expn")))))),
SetDelayed(SimpAux($p("expn")),
    Condition(Module(List(Set($s("tmp"),ContentFactor($s("expn"))),$s("lst"),Set($s("i"),C1),$s("j")),If(UnsameQ($s("tmp"),$s("expn")),CompoundExpression(Set($s("tmp"),Simp($s("tmp"))),If(ProductQ($s("tmp")),ContentFactor($s("tmp")),$s("tmp"))),CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(Set($s("lst"),Apply($s("List"),$s("expn"))),If(And(And(And(And(And(And(And(And(GreaterEqual(Length($s("lst")),C4),RationalQ(Part($s("lst"),C1))),PowerQ(Part($s("lst"),C2))),RationalQ(Part(Part($s("lst"),C2),C1))),RationalQ(Part(Part($s("lst"),C2),C2))),SqrtNumberSumQ(Part($s("lst"),C3))),PowerQ(Part($s("lst"),C4))),SqrtNumberSumQ(Part(Part($s("lst"),C4),C1))),RationalQ(Part(Part($s("lst"),C4),C2))),Set($s("lst"),Join(List(Part($s("lst"),C3),Part($s("lst"),C4),Part($s("lst"),C1),Part($s("lst"),C2)),Drop($s("lst"),C4))))),If(And(And(And(And(And(And(And(GreaterEqual(Length($s("lst")),C3),PowerQ(Part($s("lst"),C1))),RationalQ(Part(Part($s("lst"),C1),C1))),RationalQ(Part(Part($s("lst"),C1),C2))),SqrtNumberSumQ(Part($s("lst"),C2))),PowerQ(Part($s("lst"),C3))),SqrtNumberSumQ(Part(Part($s("lst"),C3),C1))),RationalQ(Part(Part($s("lst"),C3),C2))),Set($s("lst"),Join(List(Part($s("lst"),C2),Part($s("lst"),C3),Part($s("lst"),C1)),Drop($s("lst"),C3))))),While(True,If(Equal($s("i"),Length($s("lst"))),Break(),CompoundExpression(Set($s("j"),Plus($s("i"),C1)),While(True,If(Greater($s("j"),Length($s("lst"))),CompoundExpression(Increment($s("i")),Break()),CompoundExpression(Set($s("tmp"),SimpProduct(Part($s("lst"),$s("i")),Part($s("lst"),$s("j")))),If(UnsameQ($s("tmp"),Times(Part($s("lst"),$s("i")),Part($s("lst"),$s("j")))),If(ProductQ($s("tmp")),CompoundExpression(CompoundExpression(Set(Part($s("lst"),$s("i")),First($s("tmp"))),Set(Part($s("lst"),$s("j")),Rest($s("tmp")))),Break()),CompoundExpression(CompoundExpression(CompoundExpression(Set(Part($s("lst"),$s("i")),$s("tmp")),Set($s("lst"),Delete($s("lst"),$s("j")))),Set($s("i"),C1)),Break())),CompoundExpression(Set($s("tmp"),SimpProduct(Part($s("lst"),$s("j")),Part($s("lst"),$s("i")))),If(UnsameQ($s("tmp"),Times(Part($s("lst"),$s("j")),Part($s("lst"),$s("i")))),If(ProductQ($s("tmp")),CompoundExpression(CompoundExpression(Set(Part($s("lst"),$s("i")),First($s("tmp"))),Set(Part($s("lst"),$s("j")),Rest($s("tmp")))),Break()),CompoundExpression(CompoundExpression(CompoundExpression(Set(Part($s("lst"),$s("i")),$s("tmp")),Set($s("lst"),Delete($s("lst"),$s("j")))),Set($s("i"),C1)),Break())),Increment($s("j")))))))))))),Set($s("tmp"),Apply($s("Times"),$s("lst")))),If(ProductQ($s("tmp")),ContentFactor($s("tmp")),$s("tmp"))))),ProductQ($s("expn")))),
SetDelayed(SimpAux($p("expn")),
    Condition(Module(List(Set($s("lst"),Apply($s("List"),$s("expn"))),Set($s("i"),C1),$s("j"),$s("tmp")),CompoundExpression(While(True,If(Equal($s("i"),Length($s("lst"))),Break(),CompoundExpression(Set($s("j"),Plus($s("i"),C1)),While(True,If(Greater($s("j"),Length($s("lst"))),CompoundExpression(Increment($s("i")),Break()),CompoundExpression(Set($s("tmp"),SimpSum(Part($s("lst"),$s("i")),Part($s("lst"),$s("j")))),If(UnsameQ($s("tmp"),Plus(Part($s("lst"),$s("i")),Part($s("lst"),$s("j")))),If(SumQ($s("tmp")),CompoundExpression(CompoundExpression(Set(Part($s("lst"),$s("i")),First($s("tmp"))),Set(Part($s("lst"),$s("j")),Rest($s("tmp")))),Break()),CompoundExpression(CompoundExpression(Set(Part($s("lst"),$s("i")),$s("tmp")),Set($s("lst"),Delete($s("lst"),$s("j")))),Break())),CompoundExpression(Set($s("tmp"),SimpSum(Part($s("lst"),$s("j")),Part($s("lst"),$s("i")))),If(UnsameQ($s("tmp"),Plus(Part($s("lst"),$s("j")),Part($s("lst"),$s("i")))),If(SumQ($s("tmp")),CompoundExpression(CompoundExpression(Set(Part($s("lst"),$s("i")),First($s("tmp"))),Set(Part($s("lst"),$s("j")),Rest($s("tmp")))),Break()),CompoundExpression(CompoundExpression(Set(Part($s("lst"),$s("i")),$s("tmp")),Set($s("lst"),Delete($s("lst"),$s("j")))),Break())),Increment($s("j"))))))))))),Apply($s("Plus"),$s("lst")))),SumQ($s("expn")))),
SetDelayed(SimpAux(Power(Plus($p("a"),$p("b")),$p("m"))),
    Condition(SimpAux(Power(Plus(Times($s("a"),Power(Plus(Power($s("a"),C2),Times(CN1,Power($s("b"),C2))),CN1)),Times(CN1,Times($s("b"),Power(Plus(Power($s("a"),C2),Times(CN1,Power($s("b"),C2))),CN1)))),Times(CN1,$s("m")))),And(And(And(IntegerQ($s("m")),Less($s("m"),C0)),SqrtNumberQ($s("a"))),SqrtNumberQ($s("b"))))),
SetDelayed(SimpAux(Power($p("u"),$p("m"))),
    Condition(Expand(Power($s("u"),$s("m"))),And(And(IntegerQ($s("m")),Greater($s("m"),C0)),SqrtNumberSumQ($s("u"))))),
SetDelayed(SimpAux(Power($p("u"),$p("m"))),
    Condition(Times(Power(CN1,$s("m")),SimpAux(Power(Times(CN1,$s("u")),$s("m")))),And(And(FractionQ($s("m")),SqrtNumberSumQ($s("u"))),NegativeQ($s("u"))))),
SetDelayed(SimpAux(Power($p("u"),$p("m"))),
    Condition(SimpAux(Power(Expand(Power($s("u"),Denominator(Times(C1,Power($s("m"),CN1))))),Times(C1,Power(Numerator(Times(C1,Power($s("m"),CN1))),CN1)))),And(And(And(FractionQ($s("m")),Greater(Denominator(Times(C1,Power($s("m"),CN1))),C1)),SqrtNumberSumQ($s("u"))),PositiveQ($s("u"))))),
SetDelayed(SimpAux(Power(Plus($p("a"),$p("b")),$p("m"))),
    Condition(Module(List(Set($s("tmp"),CommonNumericFactors(List($s("a"),$s("b"))))),CompoundExpression(Set($s("tmp"),Abs(NumericFactor(Power(Part($s("tmp"),C1),Times(C1,Power(Denominator($s("m")),CN1)))))),Condition(Times(Power($s("tmp"),Numerator($s("m"))),SimpAux(Power(Plus(Times($s("a"),Power(Power($s("tmp"),Denominator($s("m"))),CN1)),Times($s("b"),Power(Power($s("tmp"),Denominator($s("m"))),CN1))),$s("m")))),Unequal($s("tmp"),C1)))),And(And(And(FractionQ($s("m")),Equal(Denominator(Times(C1,Power($s("m"),CN1))),C1)),SqrtNumberQ($s("a"))),SqrtNumberQ($s("b"))))),
SetDelayed(SimpAux(Power(Plus($p("a"),$p("b")),$p("m"))),
    Condition(Module(List(Set($s("tmp1"),Abs(Numerator(NumericFactor(Power(Plus(Power($s("a"),C2),Times(CN1,Power($s("b"),C2))),Times(C1,Power(Denominator($s("m")),CN1))))))),$s("tmp2")),CompoundExpression(Set($s("tmp2"),Times(Plus(Power($s("a"),C2),Times(CN1,Power($s("b"),C2))),Power(Power($s("tmp1"),Denominator($s("m"))),CN1))),Condition(Times(Power($s("tmp1"),Numerator($s("m"))),SimpAux(Power(Plus(Times($s("a"),Power($s("tmp2"),CN1)),Times(CN1,Times($s("b"),Power($s("tmp2"),CN1)))),Times(CN1,$s("m"))))),And(And(IntegerQ(Times(Power($s("a"),C2),Power(Power($s("tmp2"),C2),CN1))),IntegerQ(Times(Power($s("b"),C2),Power(Power($s("tmp2"),C2),CN1)))),Or(And(Equal(Power($s("tmp2"),C2),C1),Less($s("m"),C0)),Greater(Power($s("tmp2"),C2),C1)))))),And(And(And(And(And(And(FractionQ($s("m")),Equal(Denominator(Times(C1,Power($s("m"),CN1))),C1)),SqrtNumberQ($s("a"))),SqrtNumberQ($s("b"))),PositiveQ(Plus(Power($s("a"),C2),Times(CN1,Power($s("b"),C2))))),IntegerQ(Power($s("a"),C2))),IntegerQ(Power($s("b"),C2))))),
SetDelayed(SimpAux(Power(Times($p("c"),Plus($p("a"),$p("b"))),$p("m"))),
    Condition(SimpAux(Power(Plus(Times($s("c"),$s("a")),Times($s("c"),$s("b"))),$s("m"))),And(And(And(FractionQ($s("m")),SqrtNumberQ($s("a"))),SqrtNumberQ($s("b"))),SqrtNumberQ($s("c"))))),
SetDelayed(SimpAux(Power(Plus($p("a"),$p("b")),$p("m"))),
    Condition(Module(List(Set($s("q"),Sqrt(Plus(Power($s("a"),C2),Times(CN1,Power($s("b"),C2)))))),Condition(SimpAux(Power(Plus(Sqrt(Times(Plus($s("a"),$s("q")),C1D2)),Sqrt(Times(Plus($s("a"),Times(CN1,$s("q"))),C1D2))),Times(C2,$s("m")))),RationalQ($s("q")))),And(And(And(And(And(EvenQ(Times(C1,Power($s("m"),CN1))),RationalQ($s("a"))),Greater($s("a"),C0)),SqrtNumberQ($s("b"))),PositiveQ($s("b"))),PositiveQ(Plus(Power($s("a"),C2),Times(CN1,Power($s("b"),C2))))))),
SetDelayed(SimpAux(Power(Plus($p("a"),$p("b")),$p("m"))),
    Condition(Module(List(Set($s("q"),Sqrt(Plus(Power($s("a"),C2),Times(CN1,Power($s("b"),C2)))))),Condition(SimpAux(Power(Plus(Sqrt(Times(Plus($s("a"),$s("q")),C1D2)),Times(CN1,Sqrt(Times(Plus($s("a"),Times(CN1,$s("q"))),C1D2)))),Times(C2,$s("m")))),RationalQ($s("q")))),And(And(And(And(And(EvenQ(Times(C1,Power($s("m"),CN1))),RationalQ($s("a"))),Greater($s("a"),C0)),SqrtNumberQ($s("b"))),NegativeQ($s("b"))),PositiveQ(Plus(Power($s("a"),C2),Times(CN1,Power($s("b"),C2))))))),
SetDelayed(SimpProduct($p("c"),Plus($p("a"),$p("b"))),
    Condition(Plus(Times($s("c"),$s("a")),Times($s("c"),$s("b"))),And(And(SqrtNumberQ($s("a")),SqrtNumberQ($s("b"))),SqrtNumberQ($s("c"))))),
SetDelayed(SimpProduct($p("c"),Power($p("u"),$p("m"))),
    Condition(Times(CN1,SimpProduct(Times(CN1,$s("c")),Power($s("u"),$s("m")))),And(And(And(RationalQ($s("m")),SqrtNumberSumQ($s("u"))),SqrtNumberQ($s("c"))),NegativeQ($s("c"))))),
SetDelayed(SimpProduct(Power($p("u"),$p("m")),Power($p("v"),$p("n"))),
    Condition(Times(Power(CN1,$s("m")),SimpProduct(Power(Times(CN1,$s("u")),$s("m")),Power($s("v"),$s("n")))),And(And(And(RationalQ(List($s("m"),$s("n"))),SqrtNumberSumQ($s("u"))),SqrtNumberSumQ($s("v"))),NegativeQ($s("u"))))),
SetDelayed(SimpProduct($p("c"),Power(Plus($p("a"),$p("b")),$p("m"))),
    Condition(SimpAux(Power(Plus(Times($s("a"),Power($s("c"),Times(C1,Power($s("m"),CN1)))),Times($s("b"),Power($s("c"),Times(C1,Power($s("m"),CN1))))),$s("m"))),And(And(And(And(And(RationalQ($s("m")),SqrtNumberQ($s("a"))),SqrtNumberQ($s("b"))),SqrtNumberQ(Power($s("c"),Times(C1,Power($s("m"),CN1))))),PositiveQ($s("c"))),Not(RationalQ($s("c")))))),
SetDelayed(SimpProduct(Power($p("u"),$p("m")),$p("v")),
    Condition(Module(List(Set($s("gcd"),GCD($s("m"),C1)),$s("w")),CompoundExpression(Set($s("w"),Expand(Times(Power($s("u"),Times($s("m"),Power($s("gcd"),CN1))),Power(Times(CN1,$s("v")),Times(C1,Power($s("gcd"),CN1)))))),Condition(Times(CN1,SimpAux(Power($s("w"),$s("gcd")))),Or(SqrtNumberQ($s("w")),SqrtNumberSumQ(NonnumericFactors($s("w"))))))),And(And(And(And(And(RationalQ($s("m")),Greater($s("m"),C0)),SqrtNumberSumQ($s("u"))),SqrtNumberSumQ($s("v"))),PositiveQ($s("u"))),NegativeQ($s("v"))))),
SetDelayed(SimpProduct(Power($p("u"),$p("m")),$p("v")),
    Condition(Module(List(Set($s("gcd"),GCD($s("m"),C1)),$s("w")),CompoundExpression(Set($s("w"),Simp(Times(Power($s("u"),Times($s("m"),Power($s("gcd"),CN1))),Power(Times(CN1,$s("v")),Times(C1,Power($s("gcd"),CN1)))))),Condition(Times(CN1,SimpAux(Power($s("w"),$s("gcd")))),Or(SqrtNumberQ($s("w")),SqrtNumberSumQ(NonnumericFactors($s("w"))))))),And(And(And(And(And(RationalQ($s("m")),Less($s("m"),C0)),SqrtNumberSumQ($s("u"))),SqrtNumberSumQ($s("v"))),PositiveQ($s("u"))),NegativeQ($s("v"))))),
SetDelayed(SimpProduct(Power($p("u"),$p("m",true)),Power($p("v"),$p("n",true))),
    Condition(Module(List(Set($s("gcd"),GCD($s("m"),$s("n"))),$s("w")),CompoundExpression(Set($s("w"),Expand(Times(Power($s("u"),Times($s("m"),Power($s("gcd"),CN1))),Power($s("v"),Times($s("n"),Power($s("gcd"),CN1)))))),Condition(SimpAux(Power($s("w"),$s("gcd"))),Or(SqrtNumberQ($s("w")),SqrtNumberSumQ($s("w")))))),And(And(And(And(And(And(RationalQ(List($s("m"),$s("n"))),Greater($s("m"),C0)),Greater($s("n"),C0)),SqrtNumberSumQ($s("u"))),SqrtNumberSumQ($s("v"))),PositiveQ($s("u"))),PositiveQ($s("v"))))),
SetDelayed(SimpProduct(Power($p("u"),$p("m")),Power($p("v"),$p("n",true))),
    Condition(Module(List(Set($s("gcd"),GCD($s("m"),$s("n"))),$s("w")),CompoundExpression(Set($s("w"),Simp(Times(Power($s("u"),Times($s("m"),Power($s("gcd"),CN1))),Power($s("v"),Times($s("n"),Power($s("gcd"),CN1)))))),Condition(SimpAux(Power($s("w"),$s("gcd"))),Or(SqrtNumberQ($s("w")),SqrtNumberSumQ($s("w")))))),And(And(And(And(And(And(RationalQ(List($s("m"),$s("n"))),Less($s("m"),C0)),Greater($s("n"),C0)),SqrtNumberSumQ($s("u"))),SqrtNumberSumQ($s("v"))),PositiveQ($s("u"))),PositiveQ($s("v"))))),
SetDelayed(SimpAux(Power($p("u"),$p("n"))),
    Condition(Times(Power(CN1,$s("n")),SimpAux(Power(Map($s("Minus"),$s("u")),$s("n")))),And(And(SumQ($s("u")),IntegerQ($s("n"))),Less(NumericFactor(Part($s("u"),C1)),C0)))),
SetDelayed(SimpProduct($p("u"),$p("v")),
    Condition(Times(CN1,SimpAux(Times(Map($s("Minus"),$s("u")),$s("v")))),And(And(SumQ($s("u")),Less(NumericFactor(Part($s("u"),C1)),C0)),Not(And(SqrtNumberSumQ($s("u")),SqrtNumberSumQ($s("v"))))))),
SetDelayed(SimpAux(Power($p("u"),$p("n"))),
    Condition(Module(List(Set($s("lst"),CommonFactors(Apply($s("List"),$s("u"))))),Condition(Times(Simp(Power(Part($s("lst"),C1),$s("n"))),SimpAux(Power(Apply($s("Plus"),Rest($s("lst"))),$s("n")))),UnsameQ(Part($s("lst"),C1),C1))),And(SumQ($s("u")),IntegerQ($s("n"))))),
SetDelayed(SimpAux(Power($p("u"),$p("n"))),
    Condition(Module(List(Set($s("lst"),CommonNumericFactors(Apply($s("List"),$s("u"))))),Condition(Times(Power(Part($s("lst"),C1),$s("n")),SimpAux(Power(Apply($s("Plus"),Rest($s("lst"))),$s("n")))),UnsameQ(Part($s("lst"),C1),C1))),And(And(SumQ($s("u")),Not(IntegerQ($s("n")))),Not(SqrtNumberSumQ($s("u")))))),
SetDelayed(SimpProduct(Power(Plus($p("a"),$p("b")),$p("m")),Power(Plus($p("c"),$p("d")),$p("n",true))),
    Condition(Simp(Times(Power(Plus($s("a"),$s("b")),Plus($s("m"),$s("n"))),Power(Times($s("d"),Power($s("b"),CN1)),$s("n")))),And(And(IntegerQ($s("n")),ZeroQ(Plus(Times($s("a"),$s("d")),Times(CN1,Times($s("b"),$s("c")))))),Not(SqrtNumberSumQ(Plus($s("a"),$s("b"))))))),
SetDelayed(SimpProduct(Power($p("u"),$p("m",true)),Power($p("v"),$p("n",true))),
    Condition(Times(Power(CN1,$s("n")),Power($s("u"),Plus($s("m"),$s("n")))),And(And(And(IntegerQ($s("n")),ZeroQ(Plus($s("u"),$s("v")))),Not(RationalQ($s("u")))),Or(Not(IntegerQ($s("m"))),LessEqual(SmartLeafCount($s("u")),SmartLeafCount($s("v"))))))),
SetDelayed(SimpProduct(Power(Plus($p("a"),$p("b")),$p("n",true)),Power(Plus($p("c"),$p("d")),$p("n",true))),
    Condition(Simp(Power(Plus(Power($s("a"),C2),Times(CN1,Power($s("b"),C2))),$s("n"))),And(And(ZeroQ(Plus($s("a"),Times(CN1,$s("c")))),ZeroQ(Plus($s("b"),$s("d")))),IntegerQ($s("n"))))),
SetDelayed(SimpSum(Times($p("a"),Power($p("u"),CN1)),Times($p("b"),Power($p("u"),CN1))),
    Condition(C1,SameQ(Plus($s("a"),$s("b")),$s("u")))),
SetDelayed(SimpSum($p("a"),Times($p("b",true),Power(Plus($p("c"),$p("d")),C2))),
    Condition(Simp(Times(Times($s("b"),$s("d")),Plus(Times(C2,$s("c")),$s("d")))),ZeroQ(Plus($s("a"),Times($s("b"),Power($s("c"),C2)))))),
SetDelayed(SimpSum($p("a"),Times($p("b",true),Times(Plus($p("c",true),$p("d")),Power(Plus($p("e"),$p("f")),CN1)))),
    Condition(SimpAux(Times(ContentFactor(Plus(Times($s("a"),$s("e")),Times($s("b"),$s("c")))),Power(Plus($s("e"),$s("f")),CN1))),And(And(And(And(And(And(NonsumQ($s("a")),NonsumQ($s("b"))),NonsumQ($s("c"))),NonsumQ($s("d"))),NonsumQ($s("e"))),NonsumQ($s("f"))),ZeroQ(Plus(Times($s("a"),$s("f")),Times($s("b"),$s("d"))))))),
SetDelayed(SimpProduct(Power($p("v"),$p("m",true)),Power(Plus($p("a"),Times($p("b",true),Power($p("v"),$p("n")))),$p("p",true))),
    Condition(SimpAux(Times(Power($s("v"),Plus($s("m"),Times($s("n"),$s("p")))),Simp(Power(Plus(Times($s("a"),Power($s("v"),Times(CN1,$s("n")))),$s("b")),$s("p"))))),And(And(And(IntegerQ($s("p")),RationalQ(List($s("m"),$s("n")))),Less($s("n"),C0)),Not(SqrtNumberSumQ(Plus($s("a"),Times($s("b"),Power($s("v"),$s("n"))))))))),
SetDelayed(SimpProduct(Power($p("c"),$p("m",true)),Power(Plus(Times($p("a",true),Power($p("c"),$p("p",true))),Times($p("b",true),Power($p("c"),$p("q",true)))),$p("n",true))),
    Condition(SimpAux(Power(Plus(Times($s("a"),Power($s("c"),Plus($s("p"),Times($s("m"),Power($s("n"),CN1))))),Times($s("b"),Power($s("c"),Plus($s("q"),Times($s("m"),Power($s("n"),CN1)))))),$s("n"))),And(IntegerQ($s("n")),RationalQ(List($s("m"),$s("p"),$s("q")))))),
SetDelayed(SimpSum(Times($p("u",true),Power(Sqrt($p("n")),CN1)),Times($p("v",true),Sqrt($p("n")))),
    Condition(Times(Plus(C1,Times($s("n"),Times(NumericFactor($s("v")),Power(NumericFactor($s("u")),CN1)))),Times($s("u"),Power(Sqrt($s("n")),CN1))),And(RationalQ($s("n")),SameQ(NonnumericFactors($s("u")),NonnumericFactors($s("v")))))),
SetDelayed(SimpSum($p("u"),Times($p("v"),Plus($p("a"),$p("b")))),
    Condition(Module(List(Set($s("tmp"),SimpAux(Times($s("v"),$s("a"))))),Condition(SimpAux(Plus(Times(Plus(C1,Times(NumericFactor($s("tmp")),Power(NumericFactor($s("u")),CN1))),$s("u")),SimpAux(Times($s("v"),$s("b"))))),SameQ(NonnumericFactors($s("tmp")),NonnumericFactors($s("u"))))),And(And(NonsumQ($s("a")),NonsumQ($s("u"))),NonsumQ($s("v"))))),
SetDelayed(SimpSum(Times($p("u",true),Plus($p("a"),$p("b"))),Times($p("v"),Plus($p("c"),$p("d")))),
    Condition(Module(List(Set($s("tmp1"),SimpAux(Times($s("v"),$s("c")))),Set($s("tmp2"),SimpAux(Times($s("u"),$s("a"))))),Condition(CompoundExpression(Set($s("tmp1"),Times(NumericFactor($s("tmp1")),Power(NumericFactor($s("tmp2")),CN1))),If(Or(IntegerQ($s("tmp1")),Less(Less(integer(-2L),$s("tmp1")),C0)),SimpAux(Plus(Times($s("u"),Plus(Times(Plus(C1,$s("tmp1")),$s("a")),$s("b"))),SimpAux(Times($s("v"),$s("d"))))),SimpAux(Plus(SimpAux(Times($s("u"),$s("b"))),Times($s("v"),Plus(Times(Plus(C1,Times(C1,Power($s("tmp1"),CN1))),$s("c")),$s("d"))))))),SameQ(NonnumericFactors($s("tmp1")),NonnumericFactors($s("tmp2"))))),And(And(And(NonsumQ($s("a")),NonsumQ($s("c"))),NonsumQ($s("u"))),NonsumQ($s("v"))))),
SetDelayed(SimpAux(Power(E,Times($p("c",true),Plus(Times($p("a",true),Log($p("v"))),$p("b"))))),
    Times(SimpAux(Power($s("v"),Times($s("a"),$s("c")))),SimpAux(Power(E,Times($s("b"),$s("c")))))),
SetDelayed(SimpAux(Power(E,Times($p("n"),ArcTanh($p("v"))))),
    Condition(Simp(Power(Plus(CN1,Times(C2,Power(Plus(C1,Times(CN1,$s("v"))),CN1))),Times($s("n"),C1D2))),EvenQ($s("n")))),
SetDelayed(SimpProduct(Power(E,Times($p("n",true),ArcTanh($p("v")))),Power(Plus(C1,$p("w")),$p("m"))),
    Condition(Simp(Times(Power(Plus(C1,Times(CN1,$s("v"))),Plus($s("m"),Times(CN1,Times($s("n"),C1D2)))),Power(Plus(C1,$s("v")),Plus($s("m"),Times($s("n"),C1D2))))),And(And(OddQ($s("n")),HalfIntegerQ($s("m"))),ZeroQ(Plus(Power($s("v"),C2),$s("w")))))),
SetDelayed(SimpAux(Power(E,Times($p("n"),ArcCoth($p("v"))))),
    Condition(Simp(Power(Plus(C1,Times(CN1,Times(C2,Power(Plus(C1,Times(CN1,$s("v"))),CN1)))),Times($s("n"),C1D2))),EvenQ($s("n")))),
SetDelayed(SimpProduct(Power(E,Times($p("n",true),ArcCoth($p("v")))),Power(Plus(C1,$p("w")),$p("m"))),
    Condition(Simp(Times(Power(Plus(CN1,$s("v")),Plus($s("m"),Times(CN1,Times($s("n"),C1D2)))),Times(Power(Plus(C1,$s("v")),Plus($s("m"),Times($s("n"),C1D2))),Power(Power($s("v"),Times(C2,$s("m"))),CN1)))),And(And(OddQ($s("n")),HalfIntegerQ($s("m"))),ZeroQ(Plus(Power($s("v"),C2),Times(C1,Power($s("w"),CN1))))))),
SetDelayed(SimpAux(Power(E,Times($p("n",true),ProductLog($p("v"))))),
    Condition(Simp(Times(Power($s("v"),$s("n")),Power(Power(ProductLog($s("v")),$s("n")),CN1))),And(IntegerQ($s("n")),Greater($s("n"),C0)))),
SetDelayed(SimpSum(Times($p("u",true),Power(Cos($p("z")),C2)),Times($p("v",true),Power(Sin($p("z")),C2))),
    Condition($s("u"),SameQ($s("u"),$s("v")))),
SetDelayed(SimpSum(Times($p("u",true),Power(Sec($p("z")),C2)),Times($p("v",true),Power(Tan($p("z")),C2))),
    Condition($s("u"),SameQ($s("u"),Times(CN1,$s("v"))))),
SetDelayed(SimpSum(Times($p("u",true),Power(Csc($p("z")),C2)),Times($p("v",true),Power(Cot($p("z")),C2))),
    Condition($s("u"),SameQ($s("u"),Times(CN1,$s("v"))))),
SetDelayed(SimpSum($p("u"),Times($p("v",true),Power(Sin($p("z")),C2))),
    Condition(Times($s("u"),Power(Cos($s("z")),C2)),SameQ($s("u"),Times(CN1,$s("v")))))
  );
}
