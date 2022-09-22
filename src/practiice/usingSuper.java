package practiice;

public class usingSuper {

    int value = 10;

}
class  B extends usingSuper{
    int value = 20;

    public void print(){
        int value = 30;
        System.out.println(value); // 30         int value = 30;
        System.out.println(this.value); // 20    int value = 20;
        System.out.println(super.value); //10    int value = 10;
    }
}