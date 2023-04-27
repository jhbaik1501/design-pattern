public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Bye");
        builder.makeString("헤어질 때 하는 가벼운 인삿말");
        builder.makeItems(new String[]{
            "See you.",
            "Take care.",
            "Bye."
        });
        builder.makeString("헤어질 때 하는 정중한 인삿말");
        builder.makeItems(new String[]{
            "It was nice to see you.",
            "I'm looking forward to seeing you again.",
        });
        builder.close();
    }
}
