public interface State {
    public abstract void doClock(Context context, int hour);	// 시간 설정
    public abstract void doUse(Context context);		// 금고 사용 
    public abstract void doAlarm(Context context);		// 비상벨 
    public abstract void doPhone(Context context);		// 일반 통화 
}
