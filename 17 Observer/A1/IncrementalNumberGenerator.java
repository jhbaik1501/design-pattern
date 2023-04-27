public class IncrementalNumberGenerator extends NumberGenerator {
    private int number;	// 현재 수 
    private int end;		// 종룟값(이 값은 포함하지 않는다)
    private int inc;		// 증갓값 

    public IncrementalNumberGenerator(int start, int end, int inc) {
        this.number = start;
        this.end = end;
        this.inc = inc;
    }

    // 수를 취득한다 
    @Override
    public int getNumber() {
        return number;
    }

    // 수를 생성한다 
    @Override
    public void execute() {
        while (number < end) {
            notifyObservers();
            number += inc;
        }
    }
}
