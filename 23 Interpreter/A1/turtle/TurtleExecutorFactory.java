package turtle;

import language.Executor;
import language.ExecutorFactory;

public class TurtleExecutorFactory implements ExecutorFactory {
    private final TurtleCanvas canvas;

    // 내부 클래스("go"를 실행)
    private class GoExecutor implements Executor {
        @Override
        public void execute() {
            canvas.go(TurtleCanvas.UNIT_LENGTH);
        }
    }

    // 내부 클래스("left"를 실행) 
    private class LeftExecutor implements Executor {
        @Override
        public void execute() {
            canvas.setRelativeDirection(TurtleCanvas.RELATIVE_DIRECTION_LEFT);
        }
    }

    // 내부 클래스("right"를 실행)
    private class RightExecutor implements Executor {
        @Override
        public void execute() {
            canvas.setRelativeDirection(TurtleCanvas.RELATIVE_DIRECTION_RIGHT);
        }
    }

    // 생성자 
    public TurtleExecutorFactory(TurtleCanvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public Executor createExecutor(String name) {
        if (name.equals("go")) {
            return new GoExecutor();
        } else if (name.equals("right")) {
            return new RightExecutor();
        } else if (name.equals("left")) {
            return new LeftExecutor();
        } else {
            throw new IllegalArgumentException("Error: Unknown <primitive command>: '" + name + "'");
        }
    }
}
