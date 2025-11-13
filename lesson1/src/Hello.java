import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello Java");
//        test();
//        test2();
//        test3();
        test4();
    }
    public static void test(){
        System.out.println("byte type size:"+Byte.SIZE);
        System.out.println("wrapper class:java.lang.Byte");
        System.out.println("byte type min value:"+Byte.MIN_VALUE);
        System.out.println("byte type max value:"+Byte.MAX_VALUE);
        System.out.println("===========================");
        System.out.println("short type size:"+Short.SIZE);
        System.out.println("wrapper class:java.lang.Short");
        System.out.println("short type min value:"+Short.MIN_VALUE);
        System.out.println("short type max value:"+Short.MAX_VALUE);
        System.out.println("===========================");
        //int
        System.out.println("int type size:"+Integer.SIZE);
        System.out.println("wrapper class:java.lang.Integer");
        System.out.println("int type min value:"+Integer.MIN_VALUE);
        System.out.println("int type max value:"+Integer.MAX_VALUE);
        System.out.println("===========================");
        // long
        System.out.println("type long size:" + Long.SIZE);
        System.out.println("wrapper class:java.lang.Long");
        System.out.println("min value:Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("max value:Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println("========================");
        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
    }

    public static void test2() {
        int x = 1;
        while (x<10){
            System.out.println("x="+x);
            x++;

        }
    }

    public static void test3() {
        System.out.println("Please Enter a number:");
        Scanner s = new Scanner(System.in);
        int i = Integer.parseInt(s.next());
        if(i<0){
            System.out.println("You Entered a negative value");
        } else if(i > 0){
            System.out.println("You Entered a positive value");
        } else {
            System.out.println("You Entered 0");
        }
    }
    public static void test4() {
        System.out.println("Please Enter a number:");
        Scanner s = new Scanner(System.in);
        int i = Integer.parseInt(s.next());
        switch (i){
            case 50:
                System.out.println("Very bad score");
                break;
            case 60:
                System.out.println("Score eligible");
                break;
            case 70:
                System.out.println("Not too bad");
                break;
            case 80:
                System.out.println("Good Score");
                break;
            case 90:
                System.out.println("Very good!");
                break;
            case 100:
                System.out.println("Perfect!!!");
                break;
            default:
                System.out.println("Score is not acceptable");
                break;
        }

    }
}
