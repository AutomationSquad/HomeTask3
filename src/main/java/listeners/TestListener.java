package listeners;

import org.junit.jupiter.api.extension.*;

public class TestListener implements AfterEachCallback, AfterAllCallback, BeforeEachCallback, BeforeAllCallback {

    public long timeStart, timeAllStart, timeStop;

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        timeAllStart = System.currentTimeMillis();
        System.out.println("START TIME OF THE TEST SUITE -  " + timeAllStart + "\n");

    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        timeStart = System.currentTimeMillis();
        System.out.println("\nSTART TIME OF THIS TEST - " + timeStart);

    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        timeStop = System.currentTimeMillis();
        System.out.println("STOP TIME OF THIS TEST - " + timeStop);
        System.out.println("THIS TEST LASTED - " + (timeStop - timeStart) + " ms");
    }

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        timeStop = System.currentTimeMillis();
        System.out.println("\nSTOP TIME OF THE TEST SUITE - " + timeStop);
        System.out.println("THE TEST SUITE LASTED - " + (timeStop - timeAllStart) + " ms");
    }

}

