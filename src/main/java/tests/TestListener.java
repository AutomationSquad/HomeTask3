package tests;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class TestListener implements AfterEachCallback, BeforeEachCallback {

    public long startRunTime, finishRunTime, testRunTime;

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        startRunTime = System.currentTimeMillis();
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        finishRunTime = System.currentTimeMillis();
        testRunTime = finishRunTime - startRunTime;
        System.out.println("Execution time for " + context.getTestMethod().get().getName() + context.getDisplayName() + " is " + testRunTime + " ms");
    }
}


