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

        for(String validNumber : BigIntegerNumbers.validNumbers) {
            assertTrue(BigInteger.isNumberValid10(validNumber));
            new java.math.BigInteger(validNumber);
        }

    }


}
