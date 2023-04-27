public enum Triple {
    ALPHA, BETA, GAMMA;

    private Triple() {
        System.out.println("The instance " + this + " is created.");
    }

    public static Triple getInstance(String name) {
        return valueOf(name);
    }
}
