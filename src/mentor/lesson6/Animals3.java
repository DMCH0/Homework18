package mentor.lesson6;


    /*
в) Порахувати кількість ніг у кожного із наборів із розрахунку, що гуска має 2 ноги, а вівця чотири
Доповнити висновок на консоль:
“В хатинці є 1 гуска та 4 вівці. Кількість ніг = 18”
     “В хатинці є 2 гуски та 3 вівці. Кількість ніг = 16”
*/
    public class Animals3 {
        public static void main(String[] args) {
            int sheepCount = 4;
            int duckLegs = 2;
            int sheepLegs = 4;

            for (int i = 1; i < 5; i++) {
                String duck = "Гуска";
                String sheep = "Вивци";
                if (i > 1) {
                    duck = "Гуска";
                }
                if (sheepCount > 1) {
                    sheep = "Вивци";

                }
                System.out.println("В хатинці є " + i + duck + sheepCount-- + sheep);


            }
        }

    }