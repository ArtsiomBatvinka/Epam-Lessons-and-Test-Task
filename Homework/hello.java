import org.apache.tools.ant.taskdefs.optional.jsp.compilers.JspCompilerAdapter;

import java.util.Scanner;

public class hello {
    //    1.Приветствовать любого пользователя при вводе его имени через командную строку.
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name + "!");
    }
}

