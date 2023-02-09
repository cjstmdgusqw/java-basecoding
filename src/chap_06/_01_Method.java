package chap_06;

public class _01_Method {
    public static void sayHello(){ // sayhello라는 메소드 생성
        System.out.println("안녕하세요 메소드 입니다");
    }

    public static void main(String[] args) {
        // 메소드 ---> 기능을 하는 코드들의 묶음이라고 한다
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
