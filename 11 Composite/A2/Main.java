public class Main {
    public static void main(String[] args) {
        Directory rootdir = new Directory("root");

        Directory usrdir = new Directory("usr");
        rootdir.add(usrdir);

        Directory youngjin = new Directory("youngjin");
        usrdir.add(youngjin);

        File file = new File("Composite.java", 100);
        youngjin.add(file);
        rootdir.printList();

        System.out.println();
        System.out.println("file = " + file.getFullName());
        System.out.println("youngjin = " + youngjin.getFullName());
    }
}
