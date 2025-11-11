import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class PrimaTemaCuSelenium {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        WebElement username = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[@name='username']")));
        username.sendKeys("Admin");


        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");


        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();


        WebElement pimMenu = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[text()='PIM']")));
        pimMenu.click();


        WebElement employeeName = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//label[text()='Employee Name']/following::input[1]")));
        employeeName.sendKeys("John");


        WebElement firstSuggestion = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@role='listbox']//div[1]")));
        firstSuggestion.click();


        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();


        WebElement firstRecord = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@class='oxd-table-card'][1]//div[@role='cell'][3]")));
        firstRecord.click();


        WebElement contactDetails = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[text()='Contact Details']")));
        contactDetails.click();


        WebElement street1 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//label[text()='Street 1']/following::div[1]/input")));
        street1.clear();
        street1.sendKeys("Strada Principala nr. 123");


        WebElement city = driver.findElement(By.xpath("//label[text()='City']/following::div[1]/input"));
        city.clear();
        city.sendKeys("Bucuresti");


        WebElement state = driver.findElement(By.xpath("//label[text()='State/Province']/following::div[1]/input"));
        state.clear();
        state.sendKeys("Bucuresti");


        WebElement zipCode = driver.findElement(By.xpath("//label[text()='Zip/Postal Code']/following::div[1]/input"));
        zipCode.clear();
        zipCode.sendKeys("123456");


        WebElement country = driver.findElement(By.xpath("//label[text()='Country']/following::div[1]"));
        country.click();


        WebElement romania = driver.findElement(By.xpath("//span[text()='Romania']"));
        romania.click();


        WebElement homePhone = driver.findElement(By.xpath("//label[text()='Home']/following::div[1]/input"));
        homePhone.clear();
        homePhone.sendKeys("0211234567");


        WebElement mobilePhone = driver.findElement(By.xpath("//label[text()='Mobile']/following::div[1]/input"));
        mobilePhone.clear();
        mobilePhone.sendKeys("0722123456");


        WebElement workEmail = driver.findElement(By.xpath("//label[text()='Work Email']/following::div[1]/input"));
        workEmail.clear();
        workEmail.sendKeys("test.user123@company.com");


        WebElement saveButton = driver.findElement(By.xpath("//button[@type='submit']"));
        saveButton.click();


        driver.quit();
    }
}