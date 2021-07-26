import java.util.Scanner;

//    4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
class Math {
    public static void main(String[] args) {
        System.out.println("Введите 2 целых числа через пробел: ");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("Сумма: " + (n1 + n2));   // сумма
        System.out.println("Произведение: " + (n1 * n2));     // произведение
    }
}
