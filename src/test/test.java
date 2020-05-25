package test;

/**
 * @ClassName test
 * @Description TOOD
 * Date 2020/5/25 8:58
 **/
public class test {
    public static void main(String[] args) {
        int i = 2;
        int i2 = 0101;
        System.out.println("10进制:"+i);
        System.out.println("16进制:"+Integer.toHexString(i));
        System.out.println("2进制:"+Integer.toBinaryString(i));
        System.out.println("2->10:"+Integer.parseInt("11",2));
    }
}
