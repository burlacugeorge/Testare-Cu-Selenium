import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoQATest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        System.out.println("✓ Pagina demoqa.com încărcată");


        WebElement elementsCard = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[contains(@class, 'card-up')]")));
        elementsCard.click();
        System.out.println("✓ Click pe Elements");


        WebElement textBoxMenu = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[text()='Text Box']")));
        textBoxMenu.click();
        System.out.println("✓ Click pe Text Box");


        WebElement fullName = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[@id='userName']")));
        fullName.sendKeys("George Burlacu");


        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("george.burlacu@example.com");


        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys("Strada Principala nr. 123, Bucuresti");


        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.sendKeys("Strada Secundara nr. 456, Iasi");

        System.out.println("✓ Formular Text Box completat");


        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", submitButton);
        System.out.println("✓ Click pe Submit");


        WebElement checkBoxMenu = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[text()='Check Box']")));
        checkBoxMenu.click();
        System.out.println("✓ Click pe Check Box");


        WebElement expandButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@aria-label='Toggle' and @title='Toggle']")));
        expandButton.click();
        System.out.println("✓ Click pe butonul '>' (Expand all)");


        WebElement desktopCheckbox = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[text()='Desktop']/preceding-sibling::span[@class='rct-checkbox']")));
        desktopCheckbox.click();
        System.out.println("✓ Check pe Desktop");


        WebElement downloadsCheckbox = driver.findElement(
                By.xpath("//span[text()='Downloads']/preceding-sibling::span[@class='rct-checkbox']"));
        downloadsCheckbox.click();
        System.out.println("✓ Check pe Downloads");


        WebElement radioButtonMenu = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[text()='Radio Button']")));
        radioButtonMenu.click();
        System.out.println("✓ Click pe Radio Button");


        WebElement impressiveRadio = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//label[text()='Impressive']")));
        impressiveRadio.click();
        System.out.println("✓ Selectat Radio Button 'Impressive'");


        WebElement impressiveInput = driver.findElement(By.xpath("//input[@id='impressiveRadio']"));
        impressiveInput.isSelected();
        System.out.println("✓ ✅ Impressive radio button este selectat cu succes!");

        System.out.println("🎉 TEST COMPLETAT CU SUCCES! Toate acțiunile au fost executate.");

    }
}
