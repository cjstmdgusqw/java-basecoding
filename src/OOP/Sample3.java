package OOP;

public class Sample3 {
    // 리턴값이 없는 메서드
    void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Sample3 sample = new Sample3();
        sample.sum(3,4);
    }
}
