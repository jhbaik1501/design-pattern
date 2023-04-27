public abstract class Display {
    public abstract int getColumns();              // 가로 문자 수를 얻는다
    public abstract int getRows();                   // 세로 행수를 얻는다 
    public abstract String getRowText(int row); // row행째 문자열을 얻는다

    // 모든 행을 표시한다
    public void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
