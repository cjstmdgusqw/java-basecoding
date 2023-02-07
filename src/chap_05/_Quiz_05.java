package chap_05;
//배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오.
public class _Quiz_05 {
    public static void main(String[] args) {
        int[] sizeArray = new int[10];

        for (int i = 0; i <= sizeArray.length; i++) {
            sizeArray[0] = 250;
            sizeArray[i+1]  = sizeArray[i] + 5;
            System.out.println("신발사이즈는" + sizeArray[i]+"입니다");
        }

    }
}
