package Lessons.lesson11;

public class Ternar {
    public static void main(String[] args) {

        String str = "blablabla?";
        check(str);
    }

    public static void check(String str){
        char lastChar = str.charAt(str.length() - 1);
        if (lastChar == '?'){
            System.out.println("Question in the end");

        }else {
            System.out.println("Without question");
        }
    }
}
