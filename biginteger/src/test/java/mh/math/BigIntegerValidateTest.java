package mh.math;

import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * User: mhudyma
 */
public class BigIntegerValidateTest {

    @Test
    public void validateBigInteger10() {
        assertTrue(BigInteger.isNumberValid10("1"));
    }

    @Test
    public void validateBigInteger10Zero() {
        assertTrue(BigInteger.isNumberValid10("0"));
    }

    @Test
    public void validateBigInteger10ManyZeros() {
        assertTrue(BigInteger.isNumberValid10("000000000000000000000000000000000"));
    }

    @Test
    public void validateBigInteger10ZeroPlus() {
        assertTrue(BigInteger.isNumberValid10("+0"));
    }

    @Test
    public void validateBigInteger10ManyZerosPlus() {
        assertTrue(BigInteger.isNumberValid10("+000000000000000000000000000000000"));
    }

    @Test
    public void validateBigInteger10ZeroMinus() {
        assertTrue(BigInteger.isNumberValid10("-0"));
    }

    @Test
    public void validateBigInteger10ManyZerosMinus() {
        assertTrue(BigInteger.isNumberValid10("-000000000000000000000000000000000"));
    }

    @Test
    public void validateBigInteger10LongNumber() {
        assertTrue(BigInteger.isNumberValid10("11111111111111111111111111111111111"));
    }

    @Test
    public void validateBigInteger10LongNumberWithAllDigits() {
        assertTrue(BigInteger.isNumberValid10("12345678901234567890123456789012345678901234567890"));
    }

    @Test
    public void validateBigInteger10LongNumberWithAllDigitsAndPlus() {
        assertTrue(BigInteger.isNumberValid10("+12345678901234567890123456789012345678901234567890"));
    }

    @Test
    public void validateBigInteger10LongNumberWithAllDigitsAndMinus() {
        assertTrue(BigInteger.isNumberValid10("-12345678901234567890123456789012345678901234567890"));
    }

    @Test
    public void validateBigInteger10ManyZeroslongNumber() {
        assertTrue(BigInteger.isNumberValid10("00000000001234567890123456789012345678901234567890"));
    }

    @Test
    public void validateBigInteger10MinusManyZeroslongNumber() {
        assertTrue(BigInteger.isNumberValid10("-00000000001234567890123456789012345678901234567890"));
    }

    @Test
    public void validateBigInteger10PlusManyZeroslongNumber() {
        assertTrue(BigInteger.isNumberValid10("+00000000001234567890123456789012345678901234567890"));
    }


}
