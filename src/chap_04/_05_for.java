package chap_04;

public class _05_for {
    public static void main(String[] args) {

        // 반복문 사용 For
        for (int i = 0; i < 10; i++) {
//            System.out.println("어서오세요 나코입니다" + i);
            System.out.println("환영합니다. 나코입니다" + i);
        }

        //짝수만 출력
        for (int i = 0; i < 11; i += 2) {
            System.out.print(i);
        }
        System.out.println();

        // 홀수만 출력
        //1,3,5,7,9f
        for (int i = 1; i < 11; i += 2) {
            System.out.print(i);
        }
        System.out.println();

        // 거꾸로 출력
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }
        System.out.println();

        String[] arr = {"1", "2", "3", "4"};
        for (String s: arr) {
            System.out.println(s);
        }

        //1부터 10까지의 합
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum = sum + i;
            System.out.println("현재까지의 총합은" + sum + "입니다");
        }
        System.out.println(sum);


        // for (타입 변수명 : 배열 또는 컬렉션){
        // 배열 또는 컬렉션에 저장된 값이 매 반복마다 하나씩 순서대로 읽혀져
        // 변수에 저장이 된다
    }
}
