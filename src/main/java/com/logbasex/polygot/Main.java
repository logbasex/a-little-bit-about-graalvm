package com.logbasex.polygot;

import org.graalvm.polyglot.Context;

public class Main {
 
	/**
	 * <a href="https://github.com/graalvm/polyglot-embedding-demo/blob/main/pom.xml">...</a>
	 */
//	public static void main(String[] args) throws IOException {
//		try (Context context = Context.newBuilder().allowAllAccess(true).build()) {
//			Set<String> languages = context.getEngine().getLanguages().keySet();
//			for (String id : languages) {
//				System.out.println("Initializing language " + id);
//				context.initialize(id);
//				switch (id) {
//					case "python" -> context.eval("python", "print('Hello Python!')");
//					case "js" -> context.eval("js", "print('Hello JavaScript!');");
//					case "ruby" -> context.eval("ruby", "puts 'Hello Ruby!'");
//					case "wasm" -> {
//						// with wasm, we compute factorial
//						context.eval(Source
//								             .newBuilder("wasm", Objects.requireNonNull(Main.class.getResource("factorial.wasm"))).build());
//						Value factorial = context
//								.getBindings("wasm")
//								.getMember("main")
//								.getMember("fac");
//						System.out.println("wasm: factorial(20) = " + factorial.execute(20L));
//					}
//					case "java" -> {
//						// with Java, we invoke System.out.println reflectively.
//						Value out = context
//								.getBindings("java")
//								.getMember("java.lang.System")
//								.getMember("out");
//						out.invokeMember("println", "Hello Espresso Java!");
//					}
//				}
//			}
//		}
//	}
	
	public static void main(String[] args) {
		try (Context context = Context.create()) {
			context.eval("js", "console.log('Hello from JavaScript!')");
			context.eval("python", "print('Hello from Python!')");
		}
	}
}
