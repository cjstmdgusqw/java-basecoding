package chap_06;

public class _Quiz_06 {

    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0, index); // 나코딩 ---> 나
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*"; // 문자열을 더할 땐  +를 쓴다
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        String name = "나코딩"; // 이름
        String id = "980604-1171821";
        String phone = "010-4670-5838";

        System.out.println("이름:" + getHiddenData(name, 1));
        System.out.println("주민등록번호" + getHiddenData(id, 8));
    }
}
