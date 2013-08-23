package mh.math;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BigInteger {

    private static final Set<Character> digits10 = new HashSet<Character>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '0'));

    public BigInteger(String number) {

        if(isNumberValid10(number)){
            throw new IllegalArgumentException();
        }

    }

    public static boolean isNumberValid10(String number){

        if(number == null || number.length() == 0){
            return false;
        }

        int position = 0;
        for(char c : number.toCharArray()) {

            if(position == 0  && number.startsWith("-") || number.startsWith("+")){
                position++;
                continue;
            }
            if(!digits10.contains(c)) {
               return false;
            }


            position++;
        }

        return true;
    }
}
