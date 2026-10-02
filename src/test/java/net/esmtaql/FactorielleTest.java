package net.esmtaql;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorielleTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/factorial_data.csv")
    protected void factorialTest(int input, int expected){

       Factorielle calculator = new Factorielle();

        int result = calculator.factorielle(input);

        assertEquals(expected, result);
    }
}