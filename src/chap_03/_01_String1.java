package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like JAVA and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length());

        //대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        //포함 관계
        System.out.println(s.contains("JAVA")); // 포함된다면 True / 포함되지 않는다면 false
        System.out.println(s.contains("C#"));
        System.out.println(s.indexOf("JAVA")); // S의 문자열 중 java글자 위치가 어디인지
        System.out.println(s.indexOf("and")); //
        System.out.println(s.lastIndexOf("and")); //마지막 일치하는 위치정보
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true (아니면 false)

    }
}
