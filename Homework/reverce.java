import java.util.Scanner;

//    2.Отобразить в окне консоли аргументы командной строки в обратном порядке.
class reverce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        String rev = new StringBuffer(num).reverse().toString();
        System.out.println("ДО " + num);
        System.out.println("После " + rev);
    }
}
