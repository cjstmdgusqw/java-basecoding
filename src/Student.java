public class Student {
    String name;
    String number;
    int birthYear;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍길동";
        s1.number = "1234";
        s1.birthYear = 1995;

        Student s2 = new Student();
        s2.name = "홍길동";
        s2.number = "1234";
        s2.birthYear = 1995;
        if(s1.equals(s2)){
            System.out.println("둘이같아요");
        }else{
            System.out.println("둘이 달라요");
        }

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }


}
