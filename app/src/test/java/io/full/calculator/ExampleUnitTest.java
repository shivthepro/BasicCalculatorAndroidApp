package io.full.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameters;


import java.util.Arrays;
import java.util.List;

import io.full.calculator.ui.MainActivity;
import io.full.calculator.util.Calculator;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(Parameterized.class)
public class ExampleUnitTest {

    private double d1;
    private double d2;

    @Parameters
    public static List<double[]> testConditions() {

        double expectedOutputs[][] = {
                {-1.0, Calculator.calculate(1, -2, MainActivity.OperatorsEnum.ADD)},
                {5.0, Calculator.calculate(2, 3, MainActivity.OperatorsEnum.ADD)},
                {2.0, Calculator.calculate(1, 1, MainActivity.OperatorsEnum.ADD)},
                {11.0, Calculator.calculate(5, 6, MainActivity.OperatorsEnum.ADD)}
        };

        return Arrays.asList(expectedOutputs);
    }

    public ExampleUnitTest(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }


    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(d1, d2,0.01);
    }

}