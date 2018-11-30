package rock.red;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("输入算式");
        Scanner scanner=new Scanner(System.in);
        Calculator calculator=new Calculator(scanner.nextLine());

    }
}
