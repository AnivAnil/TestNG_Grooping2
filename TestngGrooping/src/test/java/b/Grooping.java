package b;

import org.testng.annotations.Test;

public class Grooping {

	@Test(groups= {"regression"})
	private void testa() {
		System.out.println("a");

	}
	@Test(groups= {"retest","retest"})
	private void testb() {
		System.out.println("b");

	}
	@Test(groups= {"regression"})
	private void testc() {
		System.out.println("c");

	}
	@Test(groups= {"retest","retest"})
	private void testd() {
		System.out.println("d");

	}
	@Test(groups= {"regression"})
	private void teste() {
		System.out.println("e");

	}
}
