package webdriver;

import org.testng.annotations.Test;

public class Topic_11_Array_Exercise {

    public void TC_01() {
        int[] arr = {2, 7, 6, 8, 9};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("So lon nhat trong mang: " + max);
    }

    public void TC_02() {
        int[] arr = {2, 7, 6, 8, 9};
        System.out.println("Tong phan tu dau tien va cuoi cung la: " + (arr[0] + arr[4]));
    }

    @Test
    public void TC_03() {
        int[] arr = {2, 7, 6, 8, 9, 16, 17, 20};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " ");
            }
        }
    }



}
