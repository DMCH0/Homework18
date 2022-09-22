package mentor.lesson6;


    /*
 б) змінити закінчення в залежності від числа, яке стоїть перед словом гуска и вівця.
	“В хатинці є 1 гуска и 4 вівці”
	“В хатинці є 2 гускі и 3 вівці”
 */

    public class Animals2 {
        public static void main(String[] args) {
            int sheepCount = 4;
            for (int i = 1; i < 5; i++) {
                String duck = "Гуска";
                String sheep = "Вивци";
                if (i > 1) {
                    duck = "Гуска";
                }
                if (sheepCount > 1) {
                    sheep = "Вивци";

                }
                System.out.println("В хатинці є " + i + duck  +  sheepCount-- +  sheep);


            }
        }
    }