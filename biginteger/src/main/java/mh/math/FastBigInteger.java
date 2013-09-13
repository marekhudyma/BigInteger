package mh.math;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FastBigInteger {

    public FastBigInteger(String number) {
        if(number == null){
            throw new NullPointerException();
        }

        if(isNumberValid10(number)){
            throw new NumberFormatException();
        }

    }


    public static boolean isNumberValid10(String number){
        if(number == null || number.length() == 0){
            return false;
        }

        int position = 0;
        char c[] = number.toCharArray();

        if(c[0] == '-' || c[0] == '+'){
            position++;
        }
        for(;position<c.length; position++) {

            char tmp = c[position];
            if(!(tmp >= '0' && tmp <= '9')){
                return false;
            }

        }

        return true;
    }
}
