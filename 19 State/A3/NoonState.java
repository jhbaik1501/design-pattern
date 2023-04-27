public class NoonState implements State {
    private static NoonState singleton = new NoonState();

    private NoonState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        } else if (9 <= hour && hour < 12 || 13 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("비상：점심 시간에 금고 사용！");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(점심 시간)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("점심 시간 통화 녹음");
    }

    @Override
    public String toString() {
        return "[점심 시간]";
    }
}
