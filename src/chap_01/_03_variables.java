package chap_01;

public class _03_variables {
    public static void main(String[] args) {
        String name = "천승현";
        int hour = 15;

        System.out.println(name +  " "+ hour +"시 이후에 배송이 됩니다 ");
        System.out.println("배공이 완료가 되었씁니다. ");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는" + score + "점입니다");
        System.out.println("학점은" +  grade + "입니다");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F; /*소수점 6자리수까지만 나옴*/
        System.out.println(d);
        System.out.println(f);

        /*long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
*/

    }
}
