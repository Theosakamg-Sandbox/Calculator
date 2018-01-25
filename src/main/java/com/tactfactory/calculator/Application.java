/**
 *
 */
package com.tactfactory.calculator;

/**
 * Entry point of application.
 */
public final class Application {

    private Application() { }

    /**
     * Entry-point function of Application.
     * @param args Arguments from CLI.
     */
    public static void main(final String[] args) {
        final Command add = new Addition(1);

        add.make(2);
        System.out.println(add.getValue());

        add.make(3);
        System.out.println(add.getValue());

        final Command div = new Divide(add.getValue());

        div.make(2);
        System.out.println(div.getValue());

        System.out.println("Hello W !!!");
    }
}
