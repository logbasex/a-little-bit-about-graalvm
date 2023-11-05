package com.logbasex.jit.optimization.loop_unrolling;

public class LoopUnrollingExample {
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	public static void loopSayHello() {
		/*
		  This loop can be unrolled by replicating the loop body three times
		  and eliminating the loop control instructions
		 */
		for (int i = 0; i < 3; i++) {
			sayHello();
		}
	}
	public static void loopUnrollingSayHello() {
		sayHello();
		sayHello();
		sayHello();
	}
	public static void main(String[] args) {
		loopUnrollingSayHello();
	}
}



