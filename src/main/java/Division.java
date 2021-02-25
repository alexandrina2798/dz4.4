package main.java;

public class Division extends Operation {
    public void execute(int a, int b) {
        //System.out.println(a + " / " + b + " = " + (a / b) + ", остаток " + (a % b));
        System.out.println(a + " / " + b + " = " + ((double)((double)a / (double) b)));
    }
}
