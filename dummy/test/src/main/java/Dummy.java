import java.util.Scanner;

public class Dummy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.Zahl");
        int num1 = in.nextInt();
        System.out.println( "2.Zahl");
        int num2 = in.nextInt();
        System.out.println("Rechensymbol (+-*/)");
        String cal = in.next();
        Calc calc = new Calc(num1,num2);
        int out = 0;
        switch(cal) {
            case "+": out = calc.sum();break;
            case "-": out = calc.sub();break;
            case "*": out = calc.multi();break;
            case "/": out = calc.div();break;
        }
        System.out.println(out);

    }
}
