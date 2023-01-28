package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(...), 문자, 숫자 사용 가능 (공백은 사용불가능하다)
        // 3. 밑줄 또는 문자로 시작가능
        // 4. 한 단어 또는 2개이상 단어의 연속으로 짓는다
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자(첫 문자는 제외)
        // 6. 예약어는 사용 불가 (public, staic, void, int, double, float, ...

        // 예) 입국 신고서 (여행)
        String nationality = "대한민국" ;// 국적
        String firstname = "현성"; // 이름
        String lastname = "김";
        String dateOfBirth = "1998-06-04";
        String residentialAddress = "무슨 호텔";
        String purposeOfVisit = "관광";
        String flightNo = "KE657"; //항공 편명
        String _flightNo = "KE657";
        String flight_no_2 = "KE657";
       /* String -flightNo = "KE657";*/

        int accompany = 2;
        int lengthOFStay = 5;

        String item1 = "시계";
        String item2 = "가방";

        int i = 0;
        String s = "";
        String str = " ";

        //절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
    }
}
