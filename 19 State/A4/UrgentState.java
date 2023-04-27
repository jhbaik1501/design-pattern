public class UrgentState implements State {
    private static UrgentState singleton = new UrgentState();

    private UrgentState() {			// 생성자는 private
    }

    public static State getInstance() {		// 유일한 인스턴스를 얻는다
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {	// 시간 설정 
        // 시간 설정에서는 아무 처리도 하지 않는다 
    }

    @Override
    public void doUse(Context context) {		// 금고 사용 
        context.callSecurityCenter("비상:비상시 금고 사용!");
    }

    @Override
    public void doAlarm(Context context) {              // 비상벨 
        context.callSecurityCenter("비상벨(비상시)");
    }

    @Override
    public void doPhone(Context context) {              // 일반 통화 
        context.callSecurityCenter("일반 통화(비상시)");
    }

    @Override
    public String toString() {			// 문자열 표현 
        return "[비상시]";
    }
}
