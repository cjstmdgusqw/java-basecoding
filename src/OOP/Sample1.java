package OOP;

public class Sample1 {
    // 입력과 출력이 모두 존재하는 메서드
    int sum(int a, int b){ // 입력자료형 매개변수 --- > int a
        return a+b;
    }

    public static void main(String[] args) {
        Sample1 sample = new Sample1();
        int c = sample.sum(3,4);
        System.out.println(c);
    }
}
