package mh.math;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * User: mhudyma
 */
public class FastBigIntegerValidateTest {

    @Test
    public void validateBigInteger10() {

        for(String validNumber : FastBigIntegerNumbers.VALID_NUMBERS) {
            assertTrue(FastBigInteger.isNumberValid10(validNumber));
            assertTrue(javaMathBigIntegerIsValidNumber(validNumber));

        }

    }

    @Test
    public void invalidateBigInteger10() {

        for(String validNumber : FastBigIntegerNumbers.INVALID_NUMBERS) {
            System.out.println(validNumber);
            assertFalse(FastBigInteger.isNumberValid10(validNumber));
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
