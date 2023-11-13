package com.logbasex.jit;

/**
 * How JIT Enhances Performance:
 * <p>
 * 1. Interpretation: JVM starts by interpreting the bytecode of the factorial method.
 * 2. Hot Spot Detection: JVM identifies frequently called methods, like factorial, as hot spots.
 * 3. Compilation to Native Code: JIT compiles hot spots into optimized machine code specific to the host CPU.
 * 4. Runtime Optimizations: JIT applies optimizations such as method inlining for small methods.
 * 5. Execution: Machine code is executed directly by the CPU, leading to faster performance.
 * 6. Adaptive Optimization: JIT continuously optimizes based on runtime behavior.
 * 7. Deoptimization: If necessary, JIT deoptimizes and recompiles the code.
 */
public class FactorialCalculator {
	public static int factorial(int n) {
		if (n <= 1) return 1;
		
		return n * factorial(n - 1);
	}
}
