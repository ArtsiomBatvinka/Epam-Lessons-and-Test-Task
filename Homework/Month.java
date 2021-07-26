import java.util.Scanner;

//    5.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
class Month {
    public static void main(String[] args) {
        System.out.println("Введите номер: ");
        Scanner numberOfMounth = new Scanner(System.in);
        int number = numberOfMounth.nextInt();
        switch (number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Fabruary");
                break;
            case 3:
                System.out.println("Macrh");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                throw new IllegalArgumentException("Такого номера нет");
        }
    }
}
