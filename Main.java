import java.util.*;

public class Main {
    public static void main(String... args) {
        System.out.println("hello, java10");

        // JEP 286: Local-Variable Type Inference
        var str = "abcde";
        System.out.println(str);

        // 不変コレクションの生成
        var list = List.of("333344445555");
        System.out.println(list);
    }
}
