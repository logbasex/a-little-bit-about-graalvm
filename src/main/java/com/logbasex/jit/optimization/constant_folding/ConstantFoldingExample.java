package com.logbasex.jit.optimization.constant_folding;

@SuppressWarnings("All")
public class ConstantFoldingExample {
	/**
	 * Constant folding is an optimization technique used by compilers to eliminate run-time computations by
	 * evaluating constant expressions at compile time. This means that instead of evaluating an expression like 2 + 3
	 * at runtime, the compiler can evaluate it at compile time and replace it with the value 5. This can improve the
	 * performance of the code by reducing the number of instructions that need to be executed at runtime.
	 */
	public static void main(String[] args) {
		System.out.println(2 + 3);
		System.out.println(5 < 4);
	}
}
