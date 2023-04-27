public class BigString {
    // 큰 문자의 배열 
    private BigChar[] bigchars;

    // 생성자(인수 없음, 공유한다)
    public BigString(String string) {
        initShared(string);
    }

    // 생성자(인수로 공유할지 말지 지정한다)
    public BigString(String string, boolean shared) {
        if (shared) {
            initShared(string);
        } else {
            initUnshared(string);
        }
    }

    // 공유하고 초기화 
    private void initShared(String string) {
        BigCharFactory factory = BigCharFactory.getInstance();
        bigchars = new BigChar[string.length()];
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    // 공유하지 않고 초기화 
    private void initUnshared(String string) {
        bigchars = new BigChar[string.length()];
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = new BigChar(string.charAt(i));
        }
    }

    // 표시
    public void print() {
        for (BigChar bc: bigchars) {
            bc.print();
        }
    }
}
