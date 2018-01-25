package com.tactfactory.calculator;

/**
 * Abstract of Design Pattern Command.
 */
public abstract class CommandBase implements Command {

    /** Internal value. */
    protected int value = 0;

    /**
     * Constructor of command with initial value.
     * @param a Initial value.
     */
    public CommandBase(int a) {
        this.value = a;
    }
}
