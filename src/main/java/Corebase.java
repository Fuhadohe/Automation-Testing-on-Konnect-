import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Corebase {
    public static void main(String[] args){
        System.setProperty("webdriver.driver.chromedriver","./chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://konnect.csttestserver.com/student/login");
        /*driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.close();
        Dimension Size= driver.manage().window().getSize();
        System.out.println("the size of window is: "+Size);
        int Height= driver.manage().window().getSize().height;
        int Width= driver.manage().window().getSize().width;
        System.out.println("the height of the windows is :"+Height);
        System.out.println("the width of the windows is : "+Width);
        int Heightone= driver.manage().window().getSize().getHeight();
        int Widthone= driver.manage().window().getSize().getWidth();
        System.out.println(" Another Mathods");
        System.out.println("THE HEIGHT OF THE WINDOWS IS : "+Heightone);
        System.out.println("THE HEIGHT OF THE WINDOWS IS : "+Widthone);
        driver.manage().window().setSize(new Dimension(1000,1000));
        if(driver.getTitle().equals("konnect-CHT"))
        {
            System.out.println("title is konnect-CHT");
        }
        else {
            System.out.println("title is not konnect-CHT");
        }*/
        driver.findElement(By.xpath("//*[@id=\"nav-profile\"]/form/fieldset/div[1]/input")).sendKeys("ABC");
        driver.findElement(By.xpath("//*[@id=\"nav-profile\"]/form/fieldset/div[2]/input")).sendKeys("01708558531");
        driver.findElement(By.xpath("//*[@id=\"nav-profile\"]/form/fieldset/div[3]/input")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"nav-profile\"]/form/fieldset/div[4]/input")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"nav-profile\"]/form/button")).click();
    }
}
