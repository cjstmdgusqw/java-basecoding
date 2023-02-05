package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("java")); //문자열이 같으면 True, 다르면 flase

        //대소문자 구문없이 문자열 내용이 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("python"));

        //문자열 비교 심화
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        s1 = new String("1234"); // 서로 값은 같지만 메모리상에 저장된 데이터는 다르기 때문에 다르다
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false


    }
}
