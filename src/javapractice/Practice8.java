package javapractice;

public class Practice8 {
    public static void main(String[] args) {
        int y = 0;
        // x + 2y = 5;
        for (int x = 0; x<=5; x++) {
            if((5-x) % 2 == 0){
                y = (5 - x) / 2;
                System.out.println("x=" + x  + ", y=" + y);
            }
        }
    }
}
