package lesson.fourth;

import java.util.Arrays;
import java.util.List;

public class ExceptionsTest {

    void printUnchecked(String s) {
        if (s == null) {
            throw new NullPointerException("Exception: s is null!");
        }
        System.out.println("Inside method print: " + s);
    }

    void printChecked(String s) throws Exception {
        if (s == null) {
            throw new NullPointerException("Exception: s is null!");
        }
        System.out.println("Inside method print: " + s);
    }

    void printCheckedSelf(String s) throws MyException {
        if (s == null) {
            throw new NullPointerException("Exception: s is null!");
        }
        System.out.println("Inside method print: " + s);
    }

    public static void main(String[] args) {
        ExceptionsTest print = new ExceptionsTest();
        List<String> list = Arrays.asList("first step", null, "second step");

        for (String s : list) {
            try {
                //print.printChecked(s);
                print.printUnchecked(s);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Exception was processed. Program continues");
            } finally {
                System.out.println("Inside bloсk finally");
            }
            System.out.println("Go program....");
            System.out.println("-----------------");
        }

    }

    public class MyException extends Exception {
        public MyException() {
        }
    }


}