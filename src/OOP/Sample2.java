package OOP;

public class Sample2 {
    // 입력값이 없는 메서드
    // 리턴값받을변수 = 객체. 메서드명()
    String say(){
        return "Hi";
    }

    public static void main(String[] args) {
        Sample2 sample = new Sample2();
        String a = sample.say();
        System.out.println(a);
    }
}
