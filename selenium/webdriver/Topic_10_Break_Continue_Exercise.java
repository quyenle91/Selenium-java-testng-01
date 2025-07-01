package webdriver;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Topic_10_Break_Continue_Exercise {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Topic_10_Break_Continue_Exercise obj = new Topic_10_Break_Continue_Exercise();
        //obj.TC_01();
        obj.TC_02();
    }

    @Test
    public void TC_01() {
        String browser_name = scanner.nextLine();
        while (true) {
            if (browser_name.equalsIgnoreCase("IE")) {
                System.out.println("bỏ qua");
                break;
            }
            System.out.println("Ten trinh duyet duoc nhap la: " + browser_name);
            break;
        }
    }

    public void TC_02() {
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("JAN");
                break;
            case 2:
                System.out.println("FEB");
                break;
            case 3:
                System.out.println("MAR");
                break;
            case 4:
                System.out.println("APR");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUN");
                break;
            case 7:
                System.out.println("JUL");
                break;
            case 8:
                System.out.println("AUG");
                break;
            case 9:
                System.out.println("SEP");
                break;
            case 10:
                System.out.println("OCT");
                break;
            case 11:
                System.out.println("NOV");
                break;
            case 12:
                System.out.println("DEC");
                break;
            default:
                System.out.println("Thang nhap vao khong hop le");
                break;

        }
    }

}
