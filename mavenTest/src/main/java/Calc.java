import java.util.Scanner;

public class Calc {
    int a;
    int b;

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public  int sum(){
        return a+b;

    }
    public  int sub(){
        return a-b;

    }
    public  int div(){
        return a/b;

    }
    public  int multi(){
        return a*b;

    }
}
