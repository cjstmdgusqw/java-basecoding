package chap_04;

import java.lang.ref.PhantomReference;

public class _03_elseif {
    public static void main(String[] args) {
        // 조건문 Elseif
        // 한라봉 에이드가 있으면 +1
        // 망고 주스가 있으면 +1
        // 아이스 아메리카노 + 1
        boolean hallabongAde = false;
        boolean Mangojuice = true;

        if (hallabongAde){
            System.out.println("한라봉 에이드");
        } else if (Mangojuice) {
            System.out.println("망고주스");
        } else {
            System.out.println("아이스 아메리카노");
        }
        System.out.println("주문 완료 #1");

        hallabongAde = false;
        Mangojuice = false;
        boolean orangeJuice = false;

        if (hallabongAde){
            System.out.println("한라봉 에이드");
        } else if (Mangojuice) {
            System.out.println("망고주스");
        } else if (orangeJuice) {
            System.out.println("오렌지 주스");
        } else {
            System.out.println("아이스 아메리카노");
        }
        System.out.println("주문 완료 #2");

    }
}
