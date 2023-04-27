package language;

public class InterpreterFacade implements Executor {
    private ExecutorFactory factory;
    private Context context;
    private Node programNode;

    public InterpreterFacade(ExecutorFactory factory) {
        this.factory = factory;
    }

    public void parse(String text) throws ParseException {
        this.context = new Context(text);
        this.context.setExecutorFactory(factory);
        this.programNode = new ProgramNode();
        programNode.parse(context);
        System.out.println(programNode.toString());
    }

    @Override
    public void execute() {
        if (programNode != null) {
            programNode.execute();
        }
    }
}
