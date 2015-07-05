package org.matheclipse.core.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules33 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Times(b,c,Log(FSymbol)),-1)),FreeQ(List(FSymbol,a,b,c),x))),
ISetDelayed(Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,x)),m),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Times(b,c,Log(FSymbol)),-1)),Times(CN1,e,m,Power(Times(b,c,Log(FSymbol)),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(FSymbol,Times(c,Plus(a,Times(b,x))))),x))),And(And(And(FreeQ(List(FSymbol,a,b,c,d,e),x),IntegerQ(Times(C2,m))),Not(SameQ($s("§$usegamma"),True))),Greater(m,C0)))),
ISetDelayed(Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Times(Power(e,-1),Power(FSymbol,Times(c,Plus(a,Times(CN1,b,d,Power(e,-1))))),ExpIntegralEi(Times(b,c,Plus(d,Times(e,x)),Log(FSymbol),Power(e,-1)))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),Not(SameQ($s("§$usegamma"),True))))),
ISetDelayed(Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),CN1D2)),x_Symbol),
    Condition(Times(C2,Power(e,-1),Subst(Int(Power(FSymbol,Plus(Times(c,Plus(a,Times(CN1,b,d,Power(e,-1)))),Times(b,c,Sqr(x),Power(e,-1)))),x),x,Sqrt(Plus(d,Times(e,x))))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),Not(SameQ($s("§$usegamma"),True))))),
ISetDelayed(Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Times(e,Plus(m,C1)),-1)),Times(CN1,b,c,Log(FSymbol),Power(Times(e,Plus(m,C1)),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(FSymbol,Times(c,Plus(a,Times(b,x))))),x))),And(And(And(FreeQ(List(FSymbol,a,b,c,d,e),x),IntegerQ(Times(C2,m))),Not(SameQ($s("§$usegamma"),True))),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Negate(e),m),Power(FSymbol,Times(c,Plus(a,Times(CN1,b,d,Power(e,-1))))),Power(Times(Power(b,Plus(m,C1)),Power(c,Plus(m,C1)),Power(Log(FSymbol),Plus(m,C1))),-1),Gamma(Plus(m,C1),Times(CN1,b,c,Log(FSymbol),Power(e,-1),Plus(d,Times(e,x))))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Times(Power(Negate(e),Plus(m,Negate(C1D2))),Power(FSymbol,Times(c,Plus(a,Times(CN1,b,d,Power(e,-1))))),Sqrt(Plus(d,Times(e,x))),Power(Times(Power(b,Plus(m,C1D2)),Power(c,Plus(m,C1D2)),Power(Log(FSymbol),Plus(m,C1D2)),Sqrt(Times(CN1,b,c,Log(FSymbol),Power(e,-1),Plus(d,Times(e,x))))),-1),Gamma(Plus(m,C1),Times(CN1,b,c,Log(FSymbol),Power(e,-1),Plus(d,Times(e,x))))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),PositiveIntegerQ(Plus(m,C1D2))))),
ISetDelayed(Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Times(Power(Negate(e),Plus(m,C1D2)),Power(FSymbol,Times(c,Plus(a,Times(CN1,b,d,Power(e,-1))))),Sqrt(Times(CN1,b,c,Log(FSymbol),Power(e,-1),Plus(d,Times(e,x)))),Power(Times(Power(b,Plus(m,QQ(3L,2L))),Power(c,Plus(m,QQ(3L,2L))),Power(Log(FSymbol),Plus(m,QQ(3L,2L))),Sqrt(Plus(d,Times(e,x)))),-1),Gamma(Plus(m,C1),Times(CN1,b,c,Log(FSymbol),Power(e,-1),Plus(d,Times(e,x))))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),NegativeIntegerQ(Plus(m,Negate(C1D2)))))),
ISetDelayed(Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(E,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(E,Times(c,Plus(a,Times(CN1,b,d,Power(e,-1))))),Power(Plus(d,Times(e,x)),m),Power(Times(b,c,Power(Times(CN1,b,c,Power(e,-1),Plus(d,Times(e,x))),m)),-1),Gamma(Plus(m,C1),Times(CN1,b,c,Power(e,-1),Plus(d,Times(e,x))))),And(FreeQ(List(a,b,c,d,e,m),x),Not(SumSimplerQ(m,C1))))),
ISetDelayed(Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Times(CN1,Power(FSymbol,Times(c,Plus(a,Times(CN1,b,d,Power(e,-1))))),Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Times(e,Power(Times(CN1,b,c,Log(FSymbol),Plus(d,Times(e,x)),Power(e,-1)),Plus(m,C1))),-1),Gamma(Plus(m,C1),Times(CN1,b,c,Log(FSymbol),Plus(d,Times(e,x)),Power(e,-1)))),FreeQ(List(FSymbol,a,b,c,d,e,m),x))),
ISetDelayed(Int(Times(Power(F_,Times(c_DEFAULT,v_)),Power(u_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(NormalizePowerOfLinear(u,x),m),Power(FSymbol,Times(c,ExpandToSum(v,x)))),x),And(And(And(And(FreeQ(List(FSymbol,c),x),LinearQ(v,x)),PowerOfLinearQ(u,x)),Not(And(LinearMatchQ(v,x),PowerOfLinearMatchQ(u,x)))),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(F_,Times(c_DEFAULT,v_)),Power(u_,m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set($s("uu"),NormalizePowerOfLinear(u,x)),z),CompoundExpression(Set(z,If(And(PowerQ($s("uu")),FreeQ(Part($s("uu"),C2),x)),Power(Part($s("uu"),C1),Times(m,Part($s("uu"),C2))),Power($s("uu"),m))),Times(Power($s("uu"),m),Power(z,-1),Int(Times(z,Power(FSymbol,Times(c,ExpandToSum(v,x)))),x)))),And(And(And(And(FreeQ(List(FSymbol,c,m),x),LinearQ(v,x)),PowerOfLinearQ(u,x)),Not(And(LinearMatchQ(v,x),PowerOfLinearMatchQ(u,x)))),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(u_,Power(F_,Times(c_DEFAULT,v_))),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(u,Power(FSymbol,Times(c,ExpandToSum(v,x)))),x),x),And(And(And(FreeQ(List(FSymbol,c),x),PolynomialQ(u,x)),LinearQ(v,x)),SameQ($s("§$usegamma"),True)))),
ISetDelayed(Int(Times(u_,Power(F_,Times(c_DEFAULT,v_))),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(FSymbol,Times(c,ExpandToSum(v,x))),u,x),x),And(And(And(FreeQ(List(FSymbol,c),x),PolynomialQ(u,x)),LinearQ(v,x)),Not(SameQ($s("§$usegamma"),True))))),
ISetDelayed(Int(Times(Power(F_,Times(c_DEFAULT,v_)),Power(u_,m_DEFAULT),w_),x_Symbol),
    Condition(Times(Coefficient(w,x,C1),Power(u,Plus(m,C1)),Power(FSymbol,Times(c,v)),Power(Times(Coefficient(v,x,C1),c,Coefficient(u,x,C1),Log(FSymbol)),-1)),And(And(FreeQ(List(FSymbol,c,m),x),LinearQ(List(u,v,w),x)),ZeroQ(Plus(Times(Coefficient(u,x,C1),Coefficient(w,x,C1),Plus(m,C1)),Times(CN1,Coefficient(v,x,C1),c,Plus(Times(Coefficient(u,x,C1),Coefficient(w,x,C0)),Times(CN1,Coefficient(u,x,C0),Coefficient(w,x,C1))),Log(FSymbol))))))),
ISetDelayed(Int(Times(w_,Power(u_,m_DEFAULT),Power(F_,Times(c_DEFAULT,v_))),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(w,Power(NormalizePowerOfLinear(u,x),m),Power(FSymbol,Times(c,ExpandToSum(v,x)))),x),x),And(And(And(And(And(FreeQ(List(FSymbol,c),x),PolynomialQ(w,x)),LinearQ(v,x)),PowerOfLinearQ(u,x)),IntegerQ(m)),SameQ($s("§$usegamma"),True)))),
ISetDelayed(Int(Times(w_,Power(u_,m_DEFAULT),Power(F_,Times(c_DEFAULT,v_))),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(FSymbol,Times(c,ExpandToSum(v,x))),Times(w,Power(NormalizePowerOfLinear(u,x),m)),x),x),And(And(And(And(And(FreeQ(List(FSymbol,c),x),PolynomialQ(w,x)),LinearQ(v,x)),PowerOfLinearQ(u,x)),IntegerQ(m)),Not(SameQ($s("§$usegamma"),True))))),
ISetDelayed(Int(Times(w_,Power(u_,m_DEFAULT),Power(F_,Times(c_DEFAULT,v_))),x_Symbol),
    Condition(Module(List(Set($s("uu"),NormalizePowerOfLinear(u,x)),z),CompoundExpression(Set(z,If(And(PowerQ($s("uu")),FreeQ(Part($s("uu"),C2),x)),Power(Part($s("uu"),C1),Times(m,Part($s("uu"),C2))),Power($s("uu"),m))),Times(Power($s("uu"),m),Power(z,-1),Int(ExpandIntegrand(Times(w,z,Power(FSymbol,Times(c,ExpandToSum(v,x)))),x),x)))),And(And(And(And(FreeQ(List(FSymbol,c,m),x),PolynomialQ(w,x)),LinearQ(v,x)),PowerOfLinearQ(u,x)),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Plus(e_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Log(Times(d_DEFAULT,x_)))),Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Log(Times(d_DEFAULT,x_)),n_DEFAULT)),x_Symbol),
    Condition(Times(e,x,Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Log(Times(d,x)),Plus(n,C1)),Power(Plus(n,C1),-1)),And(And(And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,h,n),x),ZeroQ(Plus(e,Times(CN1,f,h,Plus(n,C1))))),ZeroQ(Plus(Times(g,h,Plus(n,C1)),Times(CN1,b,c,e,Log(FSymbol))))),NonzeroQ(Plus(n,C1))))),
ISetDelayed(Int(Times(Plus(e_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Log(Times(d_DEFAULT,x_)))),Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(x_,m_DEFAULT),Power(Log(Times(d_DEFAULT,x_)),n_DEFAULT)),x_Symbol),
    Condition(Times(e,Power(x,Plus(m,C1)),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Log(Times(d,x)),Plus(n,C1)),Power(Plus(n,C1),-1)),And(And(And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,h,m,n),x),ZeroQ(Plus(Times(e,Plus(m,C1)),Times(CN1,f,h,Plus(n,C1))))),ZeroQ(Plus(Times(g,h,Plus(n,C1)),Times(CN1,b,c,e,Log(FSymbol))))),NonzeroQ(Plus(n,C1))))),
ISetDelayed(Int(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(FSymbol,Plus(a,Times(b,Plus(c,Times(d,x))))),Power(Times(b,d,Log(FSymbol)),-1)),FreeQ(List(FSymbol,a,b,c,d),x))),
ISetDelayed(Int(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),x_Symbol),
    Condition(Times(Power(FSymbol,a),Sqrt(Pi),Erfi(Times(Plus(c,Times(d,x)),Rt(Times(b,Log(FSymbol)),C2))),Power(Times(C2,d,Rt(Times(b,Log(FSymbol)),C2)),-1)),And(FreeQ(List(FSymbol,a,b,c,d),x),PosQ(b)))),
ISetDelayed(Int(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),x_Symbol),
    Condition(Times(Power(FSymbol,a),Sqrt(Pi),Erf(Times(Plus(c,Times(d,x)),Rt(Times(CN1,b,Log(FSymbol)),C2))),Power(Times(C2,d,Rt(Times(CN1,b,Log(FSymbol)),C2)),-1)),And(FreeQ(List(FSymbol,a,b,c,d),x),NegQ(b)))),
ISetDelayed(Int(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),x_Symbol),
    Condition(Plus(Times(Plus(c,Times(d,x)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),Power(d,-1)),Times(CN1,b,n,Log(FSymbol),Int(Times(Power(Plus(c,Times(d,x)),n),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n))))),x))),And(And(FreeQ(List(FSymbol,a,b,c,d),x),IntegerQ(Times(C2,Power(n,-1)))),NegativeIntegerQ(n)))),
ISetDelayed(Int(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),x_Symbol),
    Condition(Module(List(Set(k,Denominator(n))),Times(k,Power(d,-1),Subst(Int(Times(Power(x,Plus(k,Negate(C1))),Power(FSymbol,Plus(a,Times(b,Power(x,Times(k,n)))))),x),x,Power(Plus(c,Times(d,x)),Power(k,-1))))),And(And(FreeQ(List(FSymbol,a,b,c,d),x),IntegerQ(Times(C2,Power(n,-1)))),Not(IntegerQ(n))))),
ISetDelayed(Int(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),x_Symbol),
    Condition(Times(CN1,Power(FSymbol,a),Plus(c,Times(d,x)),Gamma(Power(n,-1),Times(CN1,b,Power(Plus(c,Times(d,x)),n),Log(FSymbol))),Power(Times(d,n,Power(Times(CN1,b,Power(Plus(c,Times(d,x)),n),Log(FSymbol)),Power(n,-1))),-1)),And(FreeQ(List(FSymbol,a,b,c,d,n),x),Not(IntegerQ(Times(C2,Power(n,-1))))))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Plus(e,Times(f,x)),n),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),Power(Times(b,f,n,Power(Plus(c,Times(d,x)),n),Log(FSymbol)),-1)),And(And(FreeQ(List(FSymbol,a,b,c,d,e,f,n),x),ZeroQ(Plus(m,Negate(Plus(n,Negate(C1)))))),ZeroQ(Plus(Times(d,e),Times(CN1,c,f)))))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Times(Power(FSymbol,a),ExpIntegralEi(Times(b,Power(Plus(c,Times(d,x)),n),Log(FSymbol))),Power(Times(f,n),-1)),And(FreeQ(List(FSymbol,a,b,c,d,e,f,n),x),ZeroQ(Plus(Times(d,e),Times(CN1,c,f)))))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(d,Plus(m,C1)),-1),Subst(Int(Power(FSymbol,Plus(a,Times(b,Sqr(x)))),x),x,Power(Plus(c,Times(d,x)),Plus(m,C1)))),And(FreeQ(List(FSymbol,a,b,c,d,m,n),x),ZeroQ(Plus(n,Times(CN1,C2,Plus(m,C1))))))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(n),C1)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),Power(Times(b,d,n,Log(FSymbol)),-1)),Times(CN1,Plus(m,Negate(n),C1),Power(Times(b,n,Log(FSymbol)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(n))),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n))))),x))),And(And(And(And(And(FreeQ(List(FSymbol,a,b,c,d),x),RationalQ(m)),IntegerQ(Times(C2,Plus(m,C1),Power(n,-1)))),Less(Less(C0,Times(Plus(m,C1),Power(n,-1))),C5)),IntegerQ(n)),Or(Less(Less(C0,n),Plus(m,C1)),Less(Less(m,n),C0))))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(n),C1)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),Power(Times(b,d,n,Log(FSymbol)),-1)),Times(CN1,Plus(m,Negate(n),C1),Power(Times(b,n,Log(FSymbol)),-1),Int(Times(Power(Plus(c,Times(d,x)),Simplify(Plus(m,Negate(n)))),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n))))),x))),And(And(And(And(FreeQ(List(FSymbol,a,b,c,d,m,n),x),IntegerQ(Times(C2,Simplify(Times(Plus(m,C1),Power(n,-1)))))),Less(Less(C0,Simplify(Times(Plus(m,C1),Power(n,-1)))),C5)),Not(RationalQ(m))),SumSimplerQ(m,Negate(n))))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),Power(Times(d,Plus(m,C1)),-1)),Times(CN1,b,n,Log(FSymbol),Power(Plus(m,C1),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,n)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n))))),x))),And(And(And(And(And(FreeQ(List(FSymbol,a,b,c,d),x),RationalQ(m)),IntegerQ(Times(C2,Plus(m,C1),Power(n,-1)))),Less(Less(CN4,Times(Plus(m,C1),Power(n,-1))),C5)),IntegerQ(n)),Or(And(Greater(n,C0),Less(m,CN1)),And(Less(C0,Negate(n)),LessEqual(Negate(n),Plus(m,C1))))))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),Power(Times(d,Plus(m,C1)),-1)),Times(CN1,b,n,Log(FSymbol),Power(Plus(m,C1),-1),Int(Times(Power(Plus(c,Times(d,x)),Simplify(Plus(m,n))),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n))))),x))),And(And(And(And(FreeQ(List(FSymbol,a,b,c,d,m,n),x),IntegerQ(Times(C2,Simplify(Times(Plus(m,C1),Power(n,-1)))))),Less(Less(CN4,Simplify(Times(Plus(m,C1),Power(n,-1)))),C5)),Not(RationalQ(m))),SumSimplerQ(m,n)))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(k,Denominator(n))),Times(k,Power(d,-1),Subst(Int(Times(Power(x,Plus(Times(k,Plus(m,C1)),Negate(C1))),Power(FSymbol,Plus(a,Times(b,Power(x,Times(k,n)))))),x),x,Power(Plus(c,Times(d,x)),Power(k,-1))))),And(And(And(And(FreeQ(List(FSymbol,a,b,c,d),x),RationalQ(m,n)),IntegerQ(Times(C2,Plus(m,C1),Power(n,-1)))),Less(Less(C0,Times(Plus(m,C1),Power(n,-1))),C5)),Not(IntegerQ(n))))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Plus(e,Times(f,x)),m),Power(Power(Plus(c,Times(d,x)),m),-1),Int(Times(Power(Plus(c,Times(d,x)),m),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n))))),x)),And(And(And(And(And(FreeQ(List(FSymbol,a,b,c,d,e,f,m,n),x),ZeroQ(Plus(Times(d,e),Times(CN1,c,f)))),IntegerQ(Times(C2,Simplify(Times(Plus(m,C1),Power(n,-1)))))),NonzeroQ(Plus(f,Negate(d)))),Not(IntegerQ(m))),NonzeroQ(Times(c,e))))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Power(FSymbol,a),Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Times(f,n,Power(Times(CN1,b,Power(Plus(c,Times(d,x)),n),Log(FSymbol)),Times(Plus(m,C1),Power(n,-1)))),-1),Gamma(Times(Plus(m,C1),Power(n,-1)),Times(CN1,b,Power(Plus(c,Times(d,x)),n),Log(FSymbol)))),And(FreeQ(List(FSymbol,a,b,c,d,e,f,m,n),x),ZeroQ(Plus(Times(d,e),Times(CN1,c,f)))))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(f,Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Power(FSymbol,Plus(a,Times(b,Sqr(Plus(c,Times(d,x)))))),Power(Times(C2,b,Sqr(d),Log(FSymbol)),-1)),Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Power(FSymbol,Plus(a,Times(b,Sqr(Plus(c,Times(d,x))))))),x)),Times(CN1,Plus(m,Negate(C1)),Sqr(f),Power(Times(C2,b,Sqr(d),Log(FSymbol)),-1),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C2))),Power(FSymbol,Plus(a,Times(b,Sqr(Plus(c,Times(d,x))))))),x))),And(And(And(FreeQ(List(FSymbol,a,b,c,d,e,f),x),NonzeroQ(Plus(Times(d,e),Times(CN1,c,f)))),FractionQ(m)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(f,Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,Sqr(Plus(c,Times(d,x)))))),Power(Times(Plus(m,C1),Sqr(f)),-1)),Times(C2,b,d,Plus(Times(d,e),Times(CN1,c,f)),Log(FSymbol),Power(Times(Sqr(f),Plus(m,C1)),-1),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,Sqr(Plus(c,Times(d,x))))))),x)),Times(CN1,C2,b,Sqr(d),Log(FSymbol),Power(Times(Sqr(f),Plus(m,C1)),-1),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C2)),Power(FSymbol,Plus(a,Times(b,Sqr(Plus(c,Times(d,x))))))),x))),And(And(And(FreeQ(List(FSymbol,a,b,c,d,e,f),x),NonzeroQ(Plus(Times(d,e),Times(CN1,c,f)))),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),Power(Times(f,Plus(m,C1)),-1)),Times(CN1,b,d,n,Log(FSymbol),Power(Times(f,Plus(m,C1)),-1),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),Plus(n,Negate(C1))),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n))))),x))),And(And(And(And(And(FreeQ(List(FSymbol,a,b,c,d,e,f),x),NonzeroQ(Plus(Times(d,e),Times(CN1,c,f)))),IntegerQ(n)),Greater(n,C2)),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Times(d,Power(f,-1),Int(Times(Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),-1)))),Power(Plus(c,Times(d,x)),-1)),x)),Times(CN1,Plus(Times(d,e),Times(CN1,c,f)),Power(f,-1),Int(Times(Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),-1)))),Power(Times(Plus(c,Times(d,x)),Plus(e,Times(f,x))),-1)),x))),And(FreeQ(List(FSymbol,a,b,c,d,e,f),x),NonzeroQ(Plus(Times(d,e),Times(CN1,c,f)))))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),-1)))),Power(Times(f,Plus(m,C1)),-1)),Times(b,d,Log(FSymbol),Power(Times(f,Plus(m,C1)),-1),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),-1)))),Power(Plus(c,Times(d,x)),-2)),x))),And(And(And(FreeQ(List(FSymbol,a,b,c,d,e,f),x),NonzeroQ(Plus(Times(d,e),Times(CN1,c,f)))),IntegerQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(F_,v_),Power(u_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(FSymbol,ExpandToSum(v,x))),x),And(And(And(FreeQ(List(FSymbol,m),x),LinearQ(u,x)),BinomialQ(v,x)),Not(And(LinearMatchQ(u,x),BinomialMatchQ(v,x)))))),
ISetDelayed(Int(Times(u_,Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_))))),x_Symbol),
    Condition(Int(ExpandLinearProduct(Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),u,c,d,x),x),And(FreeQ(List(FSymbol,a,b,c,d,n),x),PolynomialQ(u,x)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,v_)))),x_Symbol),
    Condition(Int(Times(u,Power(FSymbol,Plus(a,Times(b,NormalizePowerOfLinear(v,x))))),x),And(And(And(FreeQ(List(FSymbol,a,b),x),PolynomialQ(u,x)),PowerOfLinearQ(v,x)),Not(PowerOfLinearMatchQ(v,x))))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)))),Power(Times(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),Plus(g_DEFAULT,Times(h_DEFAULT,x_))),-1)),x_Symbol),
    Condition(Times(CN1,d,Power(Times(f,Plus(Times(d,g),Times(CN1,c,h))),-1),Subst(Int(Times(Power(FSymbol,Plus(a,Times(CN1,b,h,Power(Plus(Times(d,g),Times(CN1,c,h)),-1)),Times(d,b,x,Power(Plus(Times(d,g),Times(CN1,c,h)),-1)))),Power(x,-1)),x),x,Times(Plus(g,Times(h,x)),Power(Plus(c,Times(d,x)),-1)))),And(FreeQ(List(FSymbol,a,b,c,d,e,f),x),ZeroQ(Plus(Times(d,e),Times(CN1,c,f)))))),
ISetDelayed(Int(Times(Power(F_,Plus(e_DEFAULT,Times(f_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(FSymbol,Plus(e,Times(f,b,Power(d,-1)))),Int(Power(Plus(g,Times(h,x)),m),x)),And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,h,m),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Times(Power(F_,Plus(e_DEFAULT,Times(f_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(g,Times(h,x)),m),Power(FSymbol,Plus(Times(Plus(Times(d,e),Times(b,f)),Power(d,-1)),Times(CN1,f,Plus(Times(b,c),Times(CN1,a,d)),Power(Times(d,Plus(c,Times(d,x))),-1))))),x),And(And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,h,m),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,g),Times(CN1,c,h)))))),
ISetDelayed(Int(Times(Power(F_,Plus(e_DEFAULT,Times(f_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Times(d,Power(h,-1),Int(Times(Power(FSymbol,Plus(e,Times(f,Plus(a,Times(b,x)),Power(Plus(c,Times(d,x)),-1)))),Power(Plus(c,Times(d,x)),-1)),x)),Times(CN1,Plus(Times(d,g),Times(CN1,c,h)),Power(h,-1),Int(Times(Power(FSymbol,Plus(e,Times(f,Plus(a,Times(b,x)),Power(Plus(c,Times(d,x)),-1)))),Power(Times(Plus(c,Times(d,x)),Plus(g,Times(h,x))),-1)),x))),And(And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,h),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Times(d,g),Times(CN1,c,h)))))),
ISetDelayed(Int(Times(Power(F_,Plus(e_DEFAULT,Times(f_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(g,Times(h,x)),Plus(m,C1)),Power(FSymbol,Plus(e,Times(f,Plus(a,Times(b,x)),Power(Plus(c,Times(d,x)),-1)))),Power(Times(h,Plus(m,C1)),-1)),Times(CN1,f,Plus(Times(b,c),Times(CN1,a,d)),Log(FSymbol),Power(Times(h,Plus(m,C1)),-1),Int(Times(Power(Plus(g,Times(h,x)),Plus(m,C1)),Power(FSymbol,Plus(e,Times(f,Plus(a,Times(b,x)),Power(Plus(c,Times(d,x)),-1)))),Power(Plus(c,Times(d,x)),-2)),x))),And(And(And(And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,h),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Times(d,g),Times(CN1,c,h)))),IntegerQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(F_,Plus(e_DEFAULT,Times(f_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)))),Power(Times(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),Plus(i_DEFAULT,Times(j_DEFAULT,x_))),-1)),x_Symbol),
    Condition(Times(CN1,d,Power(Times(h,Plus(Times(d,i),Times(CN1,c,j))),-1),Subst(Int(Times(Power(FSymbol,Plus(e,Times(f,Plus(Times(b,i),Times(CN1,a,j)),Power(Plus(Times(d,i),Times(CN1,c,j)),-1)),Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),f,x,Power(Plus(Times(d,i),Times(CN1,c,j)),-1)))),Power(x,-1)),x),x,Times(Plus(i,Times(j,x)),Power(Plus(c,Times(d,x)),-1)))),And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,h),x),ZeroQ(Plus(Times(d,g),Times(CN1,c,h)))))),
ISetDelayed(Int(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),x_Symbol),
    Condition(Times(Power(FSymbol,Plus(a,Times(CN1,Sqr(b),Power(Times(C4,c),-1)))),Int(Power(FSymbol,Times(Sqr(Plus(b,Times(C2,c,x))),Power(Times(C4,c),-1))),x)),FreeQ(List(FSymbol,a,b,c),x))),
ISetDelayed(Int(Power(F_,v_),x_Symbol),
    Condition(Int(Power(FSymbol,ExpandToSum(v,x)),x),And(And(FreeQ(FSymbol,x),QuadraticQ(v,x)),Not(QuadraticMatchQ(v,x))))),
ISetDelayed(Int(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Times(e,Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c,Log(FSymbol)),-1)),And(FreeQ(List(FSymbol,a,b,c,d,e),x),ZeroQ(Plus(Times(b,e),Times(CN1,C2,c,d)))))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c,Log(FSymbol)),-1)),Times(CN1,Plus(m,Negate(C1)),Sqr(e),Power(Times(C2,c,Log(FSymbol)),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x))))),x))),And(And(And(FreeQ(List(FSymbol,a,b,c,d,e),x),ZeroQ(Plus(Times(b,e),Times(CN1,C2,c,d)))),RationalQ(m)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Times(Power(Times(C2,e),-1),Power(FSymbol,Plus(a,Times(CN1,Sqr(b),Power(Times(C4,c),-1)))),ExpIntegralEi(Times(Sqr(Plus(b,Times(C2,c,x))),Log(FSymbol),Power(Times(C4,c),-1)))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),ZeroQ(Plus(Times(b,e),Times(CN1,C2,c,d)))))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(e,Plus(m,C1)),-1)),Times(CN1,C2,c,Log(FSymbol),Power(Times(Sqr(e),Plus(m,C1)),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C2)),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x))))),x))),And(And(And(FreeQ(List(FSymbol,a,b,c,d,e),x),ZeroQ(Plus(Times(b,e),Times(CN1,C2,c,d)))),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Times(e,Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c,Log(FSymbol)),-1)),Times(CN1,Plus(Times(b,e),Times(CN1,C2,c,d)),Power(Times(C2,c),-1),Int(Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x)))),x))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),NonzeroQ(Plus(Times(b,e),Times(CN1,C2,c,d)))))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c,Log(FSymbol)),-1)),Times(CN1,Plus(Times(b,e),Times(CN1,C2,c,d)),Power(Times(C2,c),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x))))),x)),Times(CN1,Plus(m,Negate(C1)),Sqr(e),Power(Times(C2,c,Log(FSymbol)),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x))))),x))),And(And(And(FreeQ(List(FSymbol,a,b,c,d,e),x),NonzeroQ(Plus(Times(b,e),Times(CN1,C2,c,d)))),RationalQ(m)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(e,Plus(m,C1)),-1)),Times(CN1,Plus(Times(b,e),Times(CN1,C2,c,d)),Log(FSymbol),Power(Times(Sqr(e),Plus(m,C1)),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x))))),x)),Times(CN1,C2,c,Log(FSymbol),Power(Times(Sqr(e),Plus(m,C1)),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C2)),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x))))),x))),And(And(And(FreeQ(List(FSymbol,a,b,c,d,e),x),NonzeroQ(Plus(Times(b,e),Times(CN1,C2,c,d)))),RationalQ(m)),Less(m,CN1))))
  );
}
