//    3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
class Stroki {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        for (int i : num) {
            System.out.print(i);   // без перехода
            //System.out.println(i);  // с переходом
        }
    }
}
