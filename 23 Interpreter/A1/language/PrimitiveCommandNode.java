package language;

// <primitive command> ::= go | right | left
public class PrimitiveCommandNode extends Node {
    private String name;
    private Executor executor;

    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        if (name == null) {
            throw new ParseException("Error: Missing <primitive command>");
        } else if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new ParseException("Error: Unknown <primitive command>: '" + name + "'");
        }
        context.skipToken(name);
        executor = context.createExecutor(name);
    }

    @Override
    public void execute() {
        executor.execute();
    }

    @Override
    public String toString() {
        return name;
    }
}
