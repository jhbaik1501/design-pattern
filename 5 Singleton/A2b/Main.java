public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Triple a1 = Triple.getInstance("ALPHA");
        Triple b1 = Triple.getInstance("BETA");
        Triple c1 = Triple.getInstance("GAMMA");
        Triple a2 = Triple.getInstance("ALPHA");
        Triple b2 = Triple.getInstance("BETA");
        Triple c2 = Triple.getInstance("GAMMA");
        if (a1 == a2) {
            System.out.println("a1 == a2 (" + a1 + ")");
        } else {
            System.out.println("a1 != a2");
        }
        if (b1 == b2) {
            System.out.println("b1 == b2 (" + b1 + ")");
        } else {
            System.out.println("b1 != b2");
        }
        if (c1 == c2) {
            System.out.println("c1 == c2 (" + c1 + ")");
        } else {
            System.out.println("c1 != c2");
        }
        System.out.println("End.");
    }
}

