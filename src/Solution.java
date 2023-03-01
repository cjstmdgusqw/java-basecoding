import java.util.Arrays;
import java.lang.*;

public class Solution {
    public static void main(String[] args) {
        int result = 0;
        String before = "";
        String after = "";
        if (before.length() != after.length()){
            result = 0;
        }else{
            for (int i = 0; i < before.length(); i++) {
                if (before.charAt(i) == after.charAt(before.length()-1-i)){
                    result = 0;
                }else{
                    result++;
                }
            }
            if (result >= 1){
                result = 0;
            }else{
                result = 1;
            }
        }
        System.out.println(result);
    }
}
