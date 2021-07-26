import java.util.Scanner;
//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
public class LongShortNumbers {
    public static void main(String[] args) {
        System.out.println("введите 2 числа через пробел: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String longNum = "", shortNum = line;
        for (String s : line.split(" ")) {
            if (s.length() > longNum.length()) longNum = s;
            if (s.length() < shortNum.length()) shortNum = s;
        }
        System.out.println("Самое длинное ' " + longNum + "'");
        System.out.println("Длина: " + longNum.length());
        System.out.println("Самое короткое: '" + shortNum + "'");
        System.out.println("Длина: " + shortNum.length());

    }

}
