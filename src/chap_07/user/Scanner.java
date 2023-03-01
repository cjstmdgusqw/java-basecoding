package chap_07.user;

public class Scanner {
    public static void main(String[] args) {
        int[] arr = new int[0];
        int n1 = 0;
        int n = 24;
        for (int i = 1; i <= 24; i++) {
            if(n % i == 0){
                arr[n1] = i;
                n1++;
            }
        }
        System.out.println(arr);
    }
}
