package com.tactfactory.calculator;

/**
 * Command to Divide a value.
 */
public class Divide extends CommandBase {

    /**
     * Constructor of command with initial value.
     * @param a Initial value.
     */
    public Divide(final int a) {
        super(a);
    }

    @Override
    public void make(final int b) {
        if (b == 0) {
            this.value = Integer.MIN_VALUE;
        } else {
            this.value = this.value / b;
        }
    }

    @Override
    public int getValue() {
        return this.value;
    }
}
