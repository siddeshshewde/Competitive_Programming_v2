import java.util.ArrayList;
import java.util.List;

/**
 * Created by magonye on 1/3/17.
 */
public class SumDigPower {
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<>();
        for (long i=a;i<=b;i++){
           if (isRuleNumber(i)){
               result.add(i);
           }
        }
        return result;

    }

    private static boolean isRuleNumber(long number){
        String stringNumber = String.valueOf(number);
        long newNumber = getSumDigPowerFromString(stringNumber);
        return number == newNumber;
    }

    private static long getSumDigPowerFromString(String stringNumber) {
        long newNumber = 0;
        for (int i=0;i<stringNumber.length();i++){
            newNumber += Math.pow(new Long(stringNumber.substring(i,i+1)),i+1);
        }
        return newNumber;
    }
}