package tests;
import org.junit.jupiter.api.extension.*;

public class Listener implements AfterEachCallback, BeforeEachCallback {

    public long timeStart, timeFinish;

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        timeStart = System.currentTimeMillis();
        System.out.println("Started: " + context.getTestMethod().get().getName()+"  Start Time: "+timeStart);
    }
    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        timeFinish = System.currentTimeMillis();
        System.out.println("Finished: " + context.getTestMethod().get().getName()+"  Finish Time: "+timeFinish+" Test took time: "+(timeFinish-timeStart)+" milliseconds");
    }
}
