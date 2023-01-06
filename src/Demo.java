import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/filizsav/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver(); //Instantiating chrome driver
        driver.get("https://www.google.com/"); //navigate to url
    }
}
