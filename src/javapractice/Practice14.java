package javapractice;

public class Practice14 {
    public static void main(String[] args) {
        int answer = (int)(Math.random()*100) + 1;
        int input = 0; // 사용자입력을 저장할 공간
        int count = 0; // 시도횟수를 세기위한 변수
// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
        java.util.Scanner s = new java.util.Scanner(System.in);
        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 :");
            input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
            if(input > answer){
                System.out.println("너무 크게 적으셨어요 조금만 낮춰보아요");
            }else if(input < answer){
                System.out.println("조금만 높여적어볼까요");
            }else{
                System.out.println("정답입니다!");
                break;
            }
        } while(true); // 무한반복문
    }
}
