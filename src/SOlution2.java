import java.util.Arrays;

public class SOlution2 {
    public static void main(String[] args) {
        int[] result = {0,0};
        int[] board = {11,11};
        String[] keyinput = {"left", "right", "up", "right", "right"};
        for (String s : keyinput) {
            switch (s){
                case "up" -> {
                    if (result[1] >= board[1]/2){
                        continue;
                    }
                    result[1] += 1;
                }
            }
        }
    }
}
