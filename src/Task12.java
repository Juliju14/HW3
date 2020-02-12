import java.util.*;


public class Task12 {
    static int check;
    static int max;

    int[] arrayWithSize() {
        System.out.print("Input array size: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] newArr = new int[arraySize];
        int check = 0;
        System.out.println("Input numbers with a space: ");
        while (check < arraySize) {
            newArr[check] = scanner.nextInt();
            check++;
        }
        System.out.println("Your array: ");
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }


    void minNum(int[] newArr) {
        int min = newArr[0];
        for (int i = 0; i < newArr.length - 1; i++) {
            if (min >= newArr[i]) {
                min = newArr[i];
            }
        }
        System.out.println("min = " + min);

    }

    void maxNum(int[] newArr) {
        int max = newArr[0];
        for (int i = 0; i < newArr.length - 1; i++) {
            if (max <= newArr[i]) {
                max = newArr[i];
                this.max = max;
            }
        }
        System.out.println("max = " + max);
    }

    void fiveCheck(int[] newArr) {
        int five = 0;
        for (int i = 0; i < newArr.length - 1; i++) {
            if (newArr[i] == 5) {
                five++;
            }
        }
        System.out.println("Five repeat = " + five);
    }

    void repeatItem(int[] newArr) {
        int[] repArr = new int[max + 1];
        for (int i = 0; i < newArr.length; i++) {
            repArr[newArr[i]]++;
        }
        Arrays.sort(repArr);
        int minRepeat = repArr[0];
        int maxRepeat = repArr[max];

        System.out.println("Max repeat " + maxRepeat);
        System.out.println("Min repeat " + minRepeat);
    }
    int [] sortArr(int[] newArr){
        //System.out.println(Arrays.sort(newArr));
        Arrays.sort(newArr);
        System.out.println("Sorting Array is: ");
                System.out.println(Arrays.toString(newArr));

                return newArr;
    }
}

