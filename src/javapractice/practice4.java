package javapractice;

public class practice4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; ; i++) {
            if(i % 2 == 0){
                int num = -i;
                sum += num;
            }else{
                sum += i;
            }
            if (sum > 100){
                System.out.println(i);
                break;
            }
        }
    }
}
