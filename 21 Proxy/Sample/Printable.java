public interface Printable {
    public abstract void setPrinterName(String name);		// 이름 설정 
    public abstract String getPrinterName();		// 이름 획득 
    public abstract void print(String string);			// 문자열 표시(프린트 아웃)
}
