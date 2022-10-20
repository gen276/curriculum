package study;

public class Calculator {

    protected int plus(int a) {
      System.out.println("plusメソッドの引数が一つの場合:" + (a + 1) );
      return a + 1;
    }

    protected int plus(int a, int b) {
        System.out.println("plusメソッドの引数が二つの場合:"+ (a + b) );
        return a + b;
    }

    protected int plus(int a, int b, int c) {
        System.out.println("plusメソッドの引数が三つの場合:" + (a + b + c));
        return a + b + c;
    }

}