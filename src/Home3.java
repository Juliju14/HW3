public class Home3 {
    public static void main(String[] args) {
        Task12 arr = new Task12();

        int [] arrS = arr.arrayWithSize();
      arr.minNum(arrS);//минимальное число в массиве
      arr.maxNum(arrS);//максимальное число в массиве
      arr.repeatItem(arrS);//количество повторений
      arr.fiveCheck(arrS);//количество повторений числа 5
        arr.sortArr(arrS);//вывод отсортированного массива

      Task3 line = new Task3();
      line.task3();//числа в одну строку в массив
    }
}
