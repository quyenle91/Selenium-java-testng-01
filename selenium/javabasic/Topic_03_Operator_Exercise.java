package JavaBasic;

import org.testng.annotations.Test;

public class Topic_03_Operator_Exercise {
    @Test
    public void TC_01() {
        String name = "Quyen";
        int age = 34;

        System.out.println("After 15 years, age of " + (name) + " will be " + (age + 15));
    }

    @Test
    public void TC_02() {
        int a = 3;
        int b = 4;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping then a = " + (a) + ", b = " + (b));
    }

    @Test
    public void TC_03() {
        int a = 5;
        int b = 4;
        boolean bValue1;
        boolean bValue2;

        bValue1 = (a > b) ? true : false;
        System.out.println("So a lon hon b: " + (bValue1));

        bValue2 = (b > a) ? true : false;
        System.out.println("So b lon hon a: " + (bValue2));
    }
}
