package chap_03;

public class _04_eacapeSequence {
    public static void main(String[] args) {
        // 특수 문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'
        System.out.println("자바가 \n너무 \n재미있어요"); //줄바꿈
        
        // 해물파전 9000원 
        // 김치전 8000원
        // 부추전 8000원
        System.out.println("해물파전\t9000원"); // TAP기능으로 줄맞춤
        System.out.println("김치전\t\t8000원");

        System.out.println("C:\\Program Files\\Java"); // \\: 역슬래쉬

        //단비가 "냐옹"이라고 했어요
        // \" : 큰 따옴표
        System.out.println("단비가 \"냐용\"이라고 했어요 ");

        // \' : 작은 따옴표
        // 단비가 '뭘봐?'라는 표정을 지었어요
        System.out.println("단비가 \'뭘봐\' 라는 표정을 지었어요");

        char c = 'A';
        c = '\'';
    }
}
