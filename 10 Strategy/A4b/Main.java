import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 작은 순서
        list.sort((a, b) -> a.compareTo(b));
        System.out.println(list);

        // 사전식 순으로 큰 순서
        list.sort((a, b) -> b.compareTo(a));
        System.out.println(list);
    }
}
