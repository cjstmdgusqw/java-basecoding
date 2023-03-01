package javapractice;

public class Practice10 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while(num > 0){
            int namo = num % 10;
            num = num / 10;
            sum += namo;
        }
        System.out.println(sum);
    }
}
