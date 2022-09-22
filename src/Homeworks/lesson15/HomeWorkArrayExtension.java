package Homeworks.lesson15;
public class HomeWorkArrayExtension {

    static int[] arrExtension(int []array, int value){
        int[] arrayExtend = new int[7];
        for (int i = 0 ; i < 6; i++){
            arrayExtend[i] = array[i];
        }
        arrayExtend[6] = value;
        return arrayExtend;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};

        int[] extendedArray = arrExtension(a,7);
        for (int i = 0 ; i < 7; i++) {
            System.out.print(extendedArray[i] + " ");
        }
    }
}
