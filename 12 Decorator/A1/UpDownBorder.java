public class UpDownBorder extends Border {
    private char borderChar;  // 장식 문자 

    // 내용물이 될 Display와 장식 문자를 지정
    public UpDownBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }

    @Override
    public int getColumns() {
        // 문자 수는 내용물의 문자 수와 같다 
        return display.getColumns();
    }

    @Override
    public int getRows() {
        // 행수는 내용물의 행수에 상하 장식 문자 수를 더한 것 
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == getRows() - 1) {
            // 맨 위와 맨 아래는 장식 문자만의 행
            return makeLine(borderChar, getColumns());
        } else {
            // 내용물의 행(맨 위 행수만큼 행 번호를 줄인다
            return display.getRowText(row - 1);
        }
    }

    // 문자 ch로 count 수만큼 연속한 문자열을 만든다
    private String makeLine(char ch, int count) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < count; i++) {
            line.append(ch);
        }
        return line.toString();
    }
}
