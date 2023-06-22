package com.gc.simplegc;

public class TestGarbageCollector {
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]) {
		TestGarbageCollector s1 = new TestGarbageCollector();
		TestGarbageCollector s2 = new TestGarbageCollector();

		s1 = null;
		s2 = null;

		System.gc();
	}

}
