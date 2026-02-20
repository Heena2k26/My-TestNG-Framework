package retrysingletest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryOnlyFailedTests {
    @Test(retryAnalyzer = Retry.class)
    public void test1() {
        //Negative Scenario
        Assert.assertEquals(2+2,5,"Addition Problem! 2+2 must be 4!\n");
        
    }

    @Test(retryAnalyzer = Retry.class)
    public void test2() {
        //Negative Scenario
        Assert.assertEquals(2+2,3,"Addition Problem! 2+2 must be 4!\n");
    }

    @Test(retryAnalyzer = Retry.class)
    public void test3() {
        //Postive Scenario
        Assert.assertEquals(2+2,4,"Addition Problem! 2+2 must be 4!\n");
    }
}