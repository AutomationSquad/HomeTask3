package tests;


import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class TestExtension implements AfterEachCallback {
    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        System.out.println("Test was run is " + System.currentTimeMillis() + " milli seconds");
    }
}


