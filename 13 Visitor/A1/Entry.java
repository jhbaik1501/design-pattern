public abstract class Entry implements Element {
    public abstract String getName();	// 이름을 얻는다 
    public abstract int getSize();		// 크기를 얻는다  

    // 문자열 표현 
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}

