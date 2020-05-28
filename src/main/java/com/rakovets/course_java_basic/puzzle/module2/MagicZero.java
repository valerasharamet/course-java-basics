package com.rakovets.course_java_basic.puzzle.module2;

public class MagicZero {
	public static void main(String[] args) {
		System.out.println(0 == -0);
		Integer f1 = Integer.valueOf(0);
		Integer f2 = Integer.valueOf(-0);
		System.out.println(f1 == f2);
		System.out.println(f1.equals(f2));
	}
}
