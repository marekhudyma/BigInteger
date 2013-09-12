package mh.math;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * User: mhudyma
 */
public class BigIntegerValidateTest {

    @Test
    public void validateBigInteger10() {

        for(String validNumber : BigIntegerNumbers.VALID_NUMBERS) {
            assertTrue(BigInteger.isNumberValid10(validNumber));
            assertTrue(javaMathBigIntegerIsValidNumber(validNumber));

        }

    }

    @Test
    public void invalidateBigInteger10() {

        for(String validNumber : BigIntegerNumbers.INVALID_NUMBERS) {
            System.out.println(validNumber);
            assertFalse(BigInteger.isNumberValid10(validNumber));
            //assertFalse(javaMathBigIntegerIsValidNumber(validNumber));
            
        }

    }
    
    private boolean javaMathBigIntegerIsValidNumber(String number){
        boolean isValid = true;
        try {
            new java.math.BigInteger(number);
        } catch(NumberFormatException e){
            isValid = false;
        }
        return isValid;
    }



}
