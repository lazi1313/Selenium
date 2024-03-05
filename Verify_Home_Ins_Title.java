import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Home_Ins_Title  {
    public static void main(String[] args) throws InterruptedException {


    WebDriverManager.chromedriver().setup();

    //define the web drive
    WebDriver driver = new ChromeDriver();





        //navigate to bing.com web page
        driver.navigate().to("https://www.shelterinsurance.com");

        //maximize the window for better vision
        driver.manage().window().maximize();

        //wait for 1 seconds
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id='nav-bar-insurance']")).click();

        //Click Home Insurance button
        driver.findElement(By.xpath("//*[@id='map-side-bar']/div/div[2]/div[2]/div/div/div[2]/a/b")).click();


        String searchResult_02 = driver.findElement(By.xpath("//*[@id='top']/div[2]/div/div[1]/div/div/h1")).getText();
        String actualTitle = driver.getTitle();
        //store the expected title
       // String expectedTitle = "Home Insurance";
      //  SoftAssert softie = new SoftAssert();
      //  softie.assertEquals(actualTitle, expectedTitle);
      //  softie.assertAll();

        System.out.println("The name " + " is " + searchResult_02);

        driver.quit();//quit the browser
    }

}