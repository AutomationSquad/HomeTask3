package calculator;

public class Listener {

    public static long timeBefore, timeAfter;

    public static void getTimeBefore() {
        timeBefore = System.currentTimeMillis();
        try {
            Thread.sleep(50);
        }catch(Exception e){}
    } 

    public static void getTimeAfter() {
        timeAfter = System.currentTimeMillis();
    }

    public static long getDelta() {
        return (timeAfter - timeBefore);
    }
}
