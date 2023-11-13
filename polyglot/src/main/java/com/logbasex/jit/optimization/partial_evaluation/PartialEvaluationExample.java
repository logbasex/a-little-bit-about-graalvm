package com.logbasex.jit.optimization.partial_evaluation;

public class PartialEvaluationExample {
	public static int add(int x, int y) {
		return x + y;
	}
	
	/**
	 * Without partial evaluation, every time you call addTen, it has to call add() method, which then computes the sum.
	 */
	public static int addTen(int x) {
		return add(x, 10);
	}
	
	/**
	 * With partial evaluation, the GraalVM compiler can recognize that addTen() always adds 10 to its argument.
	 * So, during the compilation, it can partially evaluate the add() method with 10.
	 * The compiler essentially rewrites the addTen() method into something like this:
	 */
	public static int addTenPartialEvaluation(int x) {
		return x + 10;
	}
	
	public static void main(String[] args) {
		int result = addTenPartialEvaluation(5);
		System.out.println(result);
	}
}

