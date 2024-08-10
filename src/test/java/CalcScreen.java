import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {

    AndroidDriver driver;
    @FindBy(id="com.google.android.calculator:id/digit_1")
    WebElement btn1;

    @FindBy(id="com.google.android.calculator:id/digit_0")
    WebElement btn0;

    @FindBy(id="com.google.android.calculator:id/digit_5")
    WebElement btn5;

    @FindBy(id="com.google.android.calculator:id/digit_6")
    WebElement btn6;

    @FindBy(id="com.google.android.calculator:id/op_add")
    WebElement btnAdd;

    @FindBy(id="com.google.android.calculator:id/op_div")
    WebElement btnDivide;

    @FindBy(id="com.google.android.calculator:id/op_mul")
    WebElement btnMultiplication;

    @FindBy(id="com.google.android.calculator:id/op_sub")
    WebElement btnMinus;

    @FindBy(id="com.google.android.calculator:id/eq")
    WebElement btnEqual;

   @FindBy (id = "com.google.android.calculator:id/result_final")
   WebElement btnFinal;

    public CalcScreen(AndroidDriver driver) {
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);


    }




    public int doSum(int num1,int num2,int num3,int num4){

        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnDivide.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnMultiplication.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num3)).click();
        btnMinus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnAdd.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num4)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnEqual.click();
        return Integer.parseInt(btnFinal.getText());


    }

}
