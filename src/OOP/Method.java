package OOP;

import java.awt.image.SampleModel;

// 메서드의 종류
// 입력과 출력이 모두 있는 메서드
// 입력과 출력이 모두 없는 메서드
// 입력은 없고 출력이 있는 메서드
// 입력은 있고 출력이 없는 메서드

public class Method {
    // 믹서기 == 메서드
    // 메서드를 사용하는 이유는 유지보수성을 높일 수 있고 반복되는작업을 줄일 수 있어 코딩량도 줄어듡다는 장점이 있음
    int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 6;

        Method sample = new Method();
        int c = sample.sum(3, 4);
        System.out.println(c);

    }
}
