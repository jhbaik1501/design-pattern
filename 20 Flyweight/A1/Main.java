public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        BigString bs;
        bs = new BigString(args[0], false);     // 공유하지 않는다 
        bs.print();
        bs = new BigString(args[0], true);      // 공유한다 
        bs.print();
    }
}
