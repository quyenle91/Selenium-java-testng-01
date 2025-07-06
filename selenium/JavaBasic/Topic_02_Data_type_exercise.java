package JavaBasic;

import org.testng.annotations.Test;

public class Topic_02_Data_type_exercise {
    @Test
    public void TC_01() {
        int a = 6;
        int b = 2;

        System.out.println("Tong cua a va b " + (a + b));
        System.out.println("Hieu cua a va b " + (a - b));
        System.out.println("Tich cua a va b " + (a * b));
        System.out.println("Thuong cua a va b " + (a / b));
    }

    @Test
    public void TC_02(){
        float chieu_dai =7.5f;
        float chieu_rong = 3.8f;

        System.out.println("Area "+(chieu_dai*chieu_rong));
    }

    @Test
    public void TC_03(){
        String name ="Automation Testing";

        System.out.println("Hello "+ name);
    }

}
