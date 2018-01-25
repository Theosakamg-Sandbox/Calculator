/**
 *
 */
package com.tactfactory.calculator;

/**
 * @author Mickael Gaillard <mickael.gaillard@tactfactory.com>
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Addition add = new Addition(1);

		String tt = "toto";
		Object ii = new Object();

		if (tt.equals(ii)) {
			System.out.println("same !!!");
		}

		add.make(2);
		System.out.println(add.getValue());

		add.make(3);
		System.out.println(add.getValue());

		System.out.println("Hello W !!!");
	}

}
