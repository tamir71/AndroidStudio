package org.pltw.examples.makingclasses;
import junit.framework.TestCase;
/**
 * Created by tamir71 on 4/17/2017.
 */
public class Arithmetic extends TestCase {
}

    private int mOperand1;
    private int mOperand2;

    public Arithmetic() {
        mOperand1 = 2;
        mOperand2 = 3;
    }

    public String toString() {
        return "Arithmetic Instance: mOperand1 = " + mOperand1
                + "; mOperand2 = " + mOperand2 + ".";

    }

    public int add() {
        return mOperand1 + mOperand2;
    }

    public int multiply() {
        return mOperand1 * mOperand2;
    }

    public int subtract() {
        return mOperand1 - mOperand2;
    }

    public long divide() {
        return mOperand1 / mOperand2;
    }