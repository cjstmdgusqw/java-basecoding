package javapractice;

public class Practice1 {
    public static void main(String[] args) {
        int x = 0;
        String result = "";
        if(10 < x && x < 20){
            result = "true";
        }

        char ch = ' ';
        if(ch != ' ' || ch != '\t'){
            result = "true";
        }
        if(ch == 'x' || ch == 'X'){
            result = "true";
        }

        if(ch >= '0' && ch <= '9'){
            result = "true";
        }
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            result = "true";
        }

        int year = 36;
        String resut = " ";
        if(((year % 400 == 0) || (year % 4 == 0)) && (year % 100 != 0)){
            resut = "true";
        }
        boolean powerOn = false;
        if (! powerOn){
            System.out.println("true");
        }

        String str = "yes";
        if(str == "yes"){
            result = "true";
        }
    }
}
