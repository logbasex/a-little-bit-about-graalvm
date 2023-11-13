package com.logbasex.jit.optimization.escape_analysis;

import lombok.AllArgsConstructor;
import lombok.Data;

public class NoEscapeExample {
	@Data
	@AllArgsConstructor
	private static class Point {
		private int x, y;
		public void move(int dx, int dy) {
			this.x += dx;
			this.y += dy;
		}
	}
	
	/**
	 * Point object is created, modified, and used within the process() method only.
	 * GraalVM's escape analysis will recognize that p does not escape the process method since it's not returned,
	 * nor is it assigned to any variables outside the method's scope.
	 * The JIT compiler can optimize this by allocating p on the stack instead of the heap.
	 */
	public void process() {
		Point p = new Point(1, 1);
		p.move(1, 1);
		System.out.println("Point: (" + p.getX() + "," + p.getY() + ")");
	}
	
	public static void main(String[] args) {
		new NoEscapeExample().process();
	}
}
