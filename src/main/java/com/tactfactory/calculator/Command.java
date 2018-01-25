/****************************************************************
 *
 ****************************************************************/

package com.tactfactory.calculator;

/**
 * Base of Design Pattern Command.
 */
public interface Command { // geyfggzif

    /**
     * Apply value in command.
     * @param b value to apply.
     */
    void make(final int b);

    /**
     * Get Value generated by command.
     * @return Current value.
     */
    int getValue();
}
