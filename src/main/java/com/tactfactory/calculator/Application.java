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

		add.make(2);
		System.out.println(add.getValue());

		add.make(3);
		System.out.println(add.getValue());

		System.out.println("Hello W !!!");
	}

}
