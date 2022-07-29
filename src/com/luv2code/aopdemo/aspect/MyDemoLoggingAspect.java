package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
//	// appliqué sur méthodes de type void commençant par "add"
//	 @Before("execution(public void add*())")

//	// appliqué sur toutes les types de méthodes (commençant par "add")
//	@Before("execution(* add*())")

//	// appliqué sur les méthodes "add" qui ont un seul paramètre: Account
//	@Before("execution(* add*(com.luv2code.aopdemo.Account))")

//	// appliqué sur les methodes "add" qui ont Account ou plus de paramètres
//	@Before("execution(* add*(com.luv2code.aopdemo.Account,..))")

//	// appliqué sur les méthodes "add" qui ont n'importe quel paramètre
//	@Before("execution(* add*(..))")

//	// appliqué sur tt les méthodes d'un même package
//	// n'importe la classe(*.), methode(*) ou paramètre((..))
	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("\n----------> Executing @Before advice on addAccount()");
	}

	// Pour pouvoir réutiliser et mettre à jour le pointcut facilement on stocke sa
	// portée dans une *déclaration de pointcut*.
	// Elle a un peu l'air d'une méthode annoté de @Pointcut("execution (dont on
	// veut tenir compte)") mais elle agit plus comme une déclaration de variable.
	// Cette manière de faire permet en plus de combiner des expressions pointcut
	// entre eux.
}
