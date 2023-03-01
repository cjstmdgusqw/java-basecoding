package OOP;

public class Sample5 {
    int varTest(int a){
        a++;
        return a;
    }

    public static void main(String[] args) {
        int a = 1;
        Sample5 sample = new Sample5();
        a = sample.varTest(a);
        System.out.println(a);
    }
}
