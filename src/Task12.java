import java.util.*;


public class Task12 {
        /*******Задание 1******
         На вход через консоль принимается размер массива,
         вывод: массив, макс и мин число, количество повторений числа 5 */
    //    static   int check = 0; //счетчик для элементов массива
     //   static int five = 0; //счетчик для числа 5
    //    static int arraySize; //размер массива
    static int check;
        static int maxRepeat;//максимальное число повторений
        static int minRepeat;//минимальное число повторений
        static int max; //максимальный элемент
  int [] arrS = arrayWithSize();



        int[] arrayWithSize() {
            System.out.print("Input array size: ");
            Scanner scanner = new Scanner(System.in);
         int arraySize = scanner.nextInt();
            int[] newArr = new int[arraySize];
            System.out.println("Input numbers with a space: ");
            while (check <arraySize) {
                Scanner sc = new Scanner(System.in);
                newArr[check] = sc.nextInt();
            }
                check++;
//            Scanner sc = new Scanner(System.in);
        return newArr;
        }


        void minNum(int[] newArr) {
            //Вывод массива с учетом заданного размера
            System.out.println("Your array: ");
            System.out.println(Arrays.toString(newArr));
            //Минимальное число в массиве
            int min = newArr[0];
            int max = newArr[0];
            int five = 0;
            for (int i : newArr) {

                if (min >= newArr[i]) {
                    min = newArr[i];
                }
                if (max <= newArr[i]) {
                    max = newArr[i];
                }
                //Количество повторений числа 5
                if (newArr[i] == 5) {
                    five++;
                }
            }

            System.out.println("Maximum " + max); //Вывод максимального
            System.out.println("Minimum " + min); //Вывод минимального
            System.out.println("5 repeated " + five); //Количество повторений числа 5*/
        }
                /********Задание 2*******
         Ввывести в консоль максимальное и минимальное кол-во повторений чисел в массиве*/
        void repeatItem(int[] newArr) {
            int [] repArr = new int[max-1];
            for (int i=0; i<newArr.length-1;i++) {
                if (repArr[i] == i) {
                    repArr[i]++;
                }
                Arrays.sort(repArr);
                int maxRepeat = repArr [0];
                int minRepeat = repArr [max-1];
            }
            System.out.println("Max repeat " + maxRepeat);
            System.out.println("Min repeat " + minRepeat);
        }
    }

