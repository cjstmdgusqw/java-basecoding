package OOP;

public class Sample4 {
    // 입력값도 리턴값도 없는 메서드
    void say(){ // 리턴값이 없을경우 void 를 사용
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        Sample4 sample = new Sample4();
        sample.say();
    }
}
