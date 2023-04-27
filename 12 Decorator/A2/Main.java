public class Main {
    public static void main(String[] args) {
        MultiStringDisplay md = new MultiStringDisplay();

        md.add("Hi!");
        md.add("Good morning.");
        md.add("Good night!");
        md.show();

        Display d1 = new SideBorder(md, '#');
        d1.show();

        Display d2 = new FullBorder(md);
        d2.show();
    }
}
