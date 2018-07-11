package TestListener;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class TestExtention implements BeforeEachCallback, AfterEachCallback {

    private long testStart;
    private long testEnd;

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        testStart = System.currentTimeMillis();
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        testEnd = System.currentTimeMillis();
        System.out.println("Test execution time is: " + (testEnd - testStart) + "milliseconds");

    }
}
