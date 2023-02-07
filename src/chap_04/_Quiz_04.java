package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차요금은 시간당 4000원 (일일 최대요금은 30000원)
        // 경차 또는 장애인 차량은 최종요금에서 50%할인

        int hour = 0; // 주차한 시간
        int Cost = 0; //최종요금
        int hourCost = 4000; // 시간당 요금
        int maxCost = 30000; // 맥시멈요금
        boolean LightCar = true;
        boolean Disabled = true; // 장애인 차량

        for (hour = 0; hour <= 5; hour++) {
            Cost = hour * hourCost;
            if (Cost > maxCost) {
                Cost = 30000;
            } else{
                Cost = Cost;
            }
        } if (LightCar || Disabled) {
            Cost = Cost / 2;
        }
        System.out.println(Cost);
    }
}
