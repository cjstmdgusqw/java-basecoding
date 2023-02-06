package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue
        //치킨 주문 손님중에 노쇼 손님이 있다고 가정
        //for

        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17;
        for (int i = 0; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            //손님이 없다면:
            if (i == noShow){
                System.out.println(i + "번 손님 노쇼로 인해 다음손님에게 기회가 넘어갑니다");
                continue; //반드시 해줘야함 어떻게 보면 예외처리인듯?
            }

            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다");
                break;
            }
            System.out.println("영업을 종료합니다.");

            System.out.println("-------------------");
            // While 문
            sold = 0;
            int index = 1; // 손님 번호
            while (index <= 50) {
                System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다");
                if (index == noShow){
                    System.out.println("노쇼가 발생했으므로 다음손님에게 치킨이 넘어갑니다ㅣ");
                    index++;
                    continue;
                }

                sold++; // 판매처리
                if (sold == max){
                    System.out.println("금일 재료가 모두 소진되었습니다");
                    break;
                }
                index++;
            }
            System.out.println("영업을 종료합니다");
        }
    }
}
