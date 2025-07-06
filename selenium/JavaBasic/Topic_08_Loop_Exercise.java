package JavaBasic;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Topic_08_Loop_Exercise {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Topic_08_Loop_Exercise obj = new Topic_08_Loop_Exercise();
        //obj.TC_01();
        //obj.TC_02();
        //obj.TC_03();
        //obj.TC_04();
        //obj.TC_05();
        //obj.TC_06();
        obj.TC_07();
    }

    public void TC_01() {
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "");
        }
    }

    public void TC_02() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.println(i + "");
        }
    }

    public void TC_03() {
        int tongsochan = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                tongsochan += i;
            }
        }
        System.out.println(tongsochan);
    }

    public void TC_04() {
        int sumab = 0;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            sumab += i;
        }
        System.out.println("Tong cac so tu " + (a) + " den " + (b) + " la: " + (sumab));
    }

    public void TC_05() {
        int sumsole = 0;
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sumsole += i;
            }
        }
        System.out.println("Tong cac so le tu 0 den " + (n) + " la: " + (sumsole));
    }

    public void TC_06() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.println(i + "");
            }
        }
    }

    @Test
    public void TC_07() {
        long giaithua = 1;
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            giaithua *= i;
        }
        System.out.println(giaithua);
    }
}

