package tests;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class Listener extends RunListener {

    public long timeStart, timeFinish;
    @Override
    public void testFailure(Failure fail) throws Exception {
        System.out.println("Failure: " + fail.getDescription().getDisplayName() + " [" + fail.getMessage()+"]");
    }
    @Override
    public void testStarted(Description desc) throws Exception{
        timeStart = System.currentTimeMillis();
        System.out.println("Started: " + desc.getDisplayName()+"  Start Time: "+timeStart);
    }
    @Override
    public void testFinished(Description desc) throws Exception{
        timeFinish = System.currentTimeMillis();
        System.out.println("Finished: " + desc.getDisplayName()+"  Finish Time: "+timeFinish+" Test took time: "+(timeFinish-timeStart)+" milliseconds");
    }

}
