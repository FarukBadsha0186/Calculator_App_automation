import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class CalcRunner extends SetUp {


    @BeforeClass
    public void setUpClass() throws MalformedURLException {
        driver = setup();
    }
    @Test
    public void doSum(){
        CalcScreen calcScreen=new CalcScreen(driver);
        int res = calcScreen.doSum(1,0,5,6);
        System.out.println(res);
        Assert.assertEquals(res,100);


    }

}
