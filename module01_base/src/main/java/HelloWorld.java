import java.util.HashMap;
import java.util.Map;

public class HelloWorld {

    /*
    多行注释
     */
    public static void main(String[] args) {
        // 单行注释
        System.out.println("hello world!");

        /*List list = new ArrayList<>();*/
        test();

        System.out.println("111111");
        System.out.println("hot-fix");
        System.out.println("master test!");
        System.out.println("master test2");
        System.out.println("hot-fix test2!");
        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("123");
    }

    public void method() {
        System.out.println("method");
    }

    public static void test() {

        String str = "test";
        if (str != null) {

        }

        if (str == null) {

        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        String ss = new String("111");
        System.out.println("ss = " + ss);

        System.out.printf("test", ss);
        System.out.println(ss);

        Map map = new HashMap();

        test2();
    }

    private static void test2() {
        String test = "zhangsan";
        System.out.println(test);
        System.out.println(test);
        System.out.println(test);
        System.out.println(test);
    }

    private static void method3(int a, int b) {
        String strs = new String();
        new String("hello");
    }
}
