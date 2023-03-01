package javapractice;

public class practice3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= i+1; j++) {
                sum+=j;
            }
        }
        System.out.println(sum);
    }
}
