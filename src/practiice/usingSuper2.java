package practiice;

public class usingSuper2 {

    public void E(){
        System.out.println("Метод без параметров");
    }
    public void E(int value){
        System.out.println("Метод Е с параметром " + value);
    }
}

class J extends usingSuper{
    public  J(){
        System.out.println("J - построение без параметров");
    }
    public J(int value){
        System.out.println("Метод построения J c параметром " + value);
    }
}
