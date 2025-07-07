package javabasic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Topic_07_Condition_Exercise {
    WebDriver driver;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Topic_07_Condition_Exercise obj = new Topic_07_Condition_Exercise();
        //obj.TC_01();
        //obj.TC_02();
        obj.TC_03();
    }


    public void TC_01() {
        int x = scanner.nextInt();

        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Khong hop le");
                break;
        }
    }

    public void TC_02() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String operator = scanner.next();

        switch (operator) {
            case "+":
                System.out.println("Tong cua a + b: " + (a + b));
                break;
            case "-":
                System.out.println("Hieu cua a - b: " + (a - b));
                break;
            case "*":
                System.out.println("Tich cua a*b bang: " + (a * b));
                break;
            case "/":
                System.out.println("Thuong cua a/b bang: " + (a / b));
                break;
            case "%":
                System.out.println("Thuong cua a%b bang: " + (a % b));
                break;
        }

    }

    @Test
    public void TC_03() {
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + month + " co 31 ngay");
                break;
            case 2:
                System.out.println("Thang " + month + " co 28 hoac 29 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + month + " co 30 ngay");
                break;
            default:
                System.out.println("Thang nhap vao khong hop le");
                break;
        }
    }
}
