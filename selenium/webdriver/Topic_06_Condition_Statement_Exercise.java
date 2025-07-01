package webdriver;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Topic_06_Condition_Statement_Exercise {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Topic_06_Condition_Statement_Exercise obj = new Topic_06_Condition_Statement_Exercise();
        //obj.TC_01();
        //obj.TC_02();
        //obj.TC_03();
        //obj.TC_04();
        //obj.TC_05();
        //obj.TC_06();
        obj.TC_07();
    }


    public void TC_01() {
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("So " + (number) + " la so chan");
        } else {
            System.out.println("So " + (number) + " la so le");
        }
    }

    public void TC_02() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("So " + (a) + " lon hon hoac bang so " + (b));
        } else {
            System.out.println("So " + (a) + " nho hon so " + (b));
        }
    }

    public void TC_03() {
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        if (name1.equals(name2)) {
            System.out.println("2 nguoi trung ten");
        } else {
            System.out.println("2 nguoi khac ten");
        }
    }

    public void TC_04() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("So lon nhat trong 3 so la: " + (a));
        } else if (b > a && b > c) {
            System.out.println("So lon nhat trong 3 so la: " + (b));
        } else if (c > a && c > b) {
            System.out.println("So lon nhat trong 3 so la: " + (c));
        } else {
            System.out.println("3 so bang nhau: " + (a) + ", " + (b) + "," + (c));
        }
    }

    public void TC_05() {
        int x = scanner.nextInt();

        if (x >= 10 && x <= 100) {
            System.out.println("So: " + (x) + " nam trong [10,100]");
        } else {
            System.out.println("So: " + (x) + " nam ngoai khoang [10,100]");
        }
    }

    public void TC_06() {
        float y = scanner.nextFloat();

        if (y >= 0 && y < 5) {
            System.out.println("Diem D");
        } else if (y > 5 && y <= 7.5) {
            System.out.println("Diem C");
        } else if (y > 7.5 && y <= 8.5) {
            System.out.println("Diem B");
        } else if (y > 8.5 && y <= 10) {
            System.out.println("Diem A");
        } else {
            System.out.println("Gia tri nhap vao khong hop le");
        }
    }

    @Test
    public void TC_07(){
        int month = scanner.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("Thang " +month + " co 31 ngay");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Thang " +month + " co 30 ngay");
        } else if (month == 2) {
            System.out.println("Thang " +month +" co 28 hoac 29 ngay");
        }else {
            System.out.println("Thang khong hop le");
        }
    }
}
