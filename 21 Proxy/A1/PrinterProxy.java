public class PrinterProxy implements Printable {
    private String name;	// 이름 
    private Printable real;	// 본인 
    private String className;	// 본인의 클래스 이름 

    // 생성자(이름과 클래스 이름 지정)
    public PrinterProxy(String name, String className) {
        this.name = name;
        this.real = null;
        this.className = className;
    }

    // 이름 설정 
    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            // 본인에게도 설정한다
            real.setPrinterName(name);
        }
        this.name = name;
    }

    // 이름 취득
    @Override
    public String getPrinterName() {
        return name;
    }

    // 표시 
    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    // 본인 생성 
    private synchronized void realize() {
        if (real == null) {
            try {
                real = (Printable)Class.forName(className).getDeclaredConstructor().newInstance();
                real.setPrinterName(name);
            } catch (ClassNotFoundException e) {
                System.out.println("클래스 " + className + " 가 발견되지 않습니다.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
