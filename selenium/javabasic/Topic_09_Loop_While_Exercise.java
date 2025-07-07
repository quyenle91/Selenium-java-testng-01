package JavaBasic;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Topic_09_Loop_While_Exercise {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Topic_09_Loop_While_Exercise obj = new Topic_09_Loop_While_Exercise();
        //obj.TC_01();
    }

    @Test
    public void TC_01() {
        int n = scanner.nextInt();
        for (int i = n; i <= 100; i++) {
            while (i % 2 == 0) {
                System.out.println(i + " ");
                i++;
            }
        }
    }
}
