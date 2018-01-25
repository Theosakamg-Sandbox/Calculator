package com.tactfactory.calculator;

/**
 * Command to Addition a value.
 */
public class Addition extends CommandBase {

    /**
     * Constructor of command with initial value.
     * @param a Initial value.
     */
    public Addition(final int a) {
        super(a);
    }

    @Override
    public void make(final int b) {
        this.value = this.value + b;
    }

    @Override
    public int getValue() {
        return this.value;
    }
}
