package Utility;

import Base.BaseUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CommonUtil extends BaseUtil {
    public static void waitUntilElementIsDisplayed(WebElement element, long seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilElementIsClickable(WebElement element, long seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitUntilElementTextPresent(WebElement element, long seconds, String text) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public static void clickUsingJS(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        //element.click();
    }

    public static void selectDropDownByVisibleText(WebElement element, String name) {
        Select item = new Select(element);
        item.selectByVisibleText(name);
    }

    public static boolean getCheckboxSelectStatus(WebElement element) {
        return element.isSelected();
    }

    public static void selectDropDownByValue(WebElement element, String value) {
        Select item = new Select(element);
        item.selectByValue(value);
    }

    public static void selectDropDownByIndex(WebElement element, int index) {
        Select item = new Select(element);
        item.selectByIndex(index);
    }

    public static void selectRadioButton(WebElement element) {
        boolean status;
        status = element.isSelected();
        if (!status) {
            element.click();
        }
    }

    public static void deselectRadioButton(WebElement element) {
        boolean status;
        status = element.isSelected();
        if (status) {
            element.click();
        }
    }

    public static boolean isElementPresent(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        }
        return false;
    }

    public static void acceptAlert() {
        int timeout = 10;
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert a = driver.switchTo().alert();
        a.accept();
    }

    public static void dismissAlert() {
        int timeout = 10;
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert a = driver.switchTo().alert();
        a.dismiss();
    }

    public static void switchToChildWindow() {
        String parentWindow = driver.getWindowHandle();
        // It returns no. of windows opened by WebDriver and will return Set of Strings
        Set<String> set = driver.getWindowHandles();
        // Using Iterator to iterate with in windows
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String childWindow = itr.next();
            // Compare whether the main windows is not equal to child window. If not equal, we will close.
            if (!parentWindow.equals(childWindow)) {
                driver.switchTo().window(childWindow);
            }
        }
    }

    public static void switchToParentWindow() {
        Set<String> s = driver.getWindowHandles();
        Iterator<String> itr = s.iterator();
        String w1 = (String) itr.next();
        driver.switchTo().window(w1);
        System.out.println("PARENT WINDOW: " + w1);
    }

    public static boolean isAlertPresent() {
        try {
            int timeout = 10;
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.alertIsPresent());
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean verifyPageContainsText(String pageText) {
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + pageText + "')]"));
        if (list.size() > 0) {
            return true;
        }
        return false;
    }

    public static boolean verifyElementIsVisible(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        }
        return false;
    }

    public static boolean verifyElementIsEnabled(WebElement element) {
        if (element.isEnabled()) {
            return true;
        }
        return false;
    }

    public static boolean verifyElementIsDisabled(WebElement element) {
        if (!element.isEnabled()) {
            return true;
        }
        return false;
    }

    public static boolean verifyTextFieldContainsValue(WebElement element, String value) {
        if (element.getAttribute("value").equals(value)) {
            return true;
        }

        return false;
    }


    public static boolean verifyFrameContainsTextUsingIndex(int index, String pageText) {
        driver.switchTo().frame(index);
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + pageText + "')]"));
        if (list.size() > 0) {
            return true;
        }
        return false;
    }

    public static boolean verifyFrameContainsTextUsingName(String name, String pageText) {
        driver.switchTo().frame(name);
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + pageText + "')]"));
        if (list.size() > 0) {
            return true;
        }
        return false;
    }


    public static boolean verifyEditBoxFieldIsEmpty(WebElement element) {
        String fieldValue = element.getAttribute("value");
        if (fieldValue.isEmpty()) {
            return true;
        }
        return false;
    }

    public static String getDefaultValueOfDropdown(WebElement element) {
        String defaultSelectedValue;
        Select item = new Select(element);
        WebElement defaultSelectedElement = item.getFirstSelectedOption();
        defaultSelectedValue = defaultSelectedElement.getText();
        return defaultSelectedValue;
    }


    public static void waitForPresenceOfElements(int timeout, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    //New methods = 17/7/2020

    public static void moveToElement (WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    public static void contextClick (WebElement element) {
        Actions action = new Actions(driver);
        action.contextClick(element).perform();
    }

    public static void doubleClick (WebElement element) {
        Actions action = new Actions(driver);
        action.doubleClick(element).perform();
    }






    public static void clickOnElement(WebElement element) {
        if (element.isDisplayed()) {
            element.click();
        }
        waitUntilElementIsDisplayed(element, 15);

    }

    public static void selectRadioButtonByName(String Userinput) {
        List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[@type= 'radio']"));
        for (WebElement button : radiobuttons) {
            if (button.getAttribute("value").equalsIgnoreCase(Userinput))
                button.click();
            else {
                 button.getText().equalsIgnoreCase(Userinput);
                 button.click();
            }
        }
    }

    public static String getAlerttext() {
        int timeout = 10;
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.alertIsPresent());
        String a = driver.switchTo().alert().getText();
        return a;
    }

    public static void performScrolldownToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    public static void performScrollHorizontally(WebElement Element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }

    public static boolean captureTooltip(WebElement Element, WebElement toolTipElement, String tooltipText) {
        Actions actions = new Actions(driver);
        actions.moveToElement(Element).perform();
        if (!toolTipElement.getText().equalsIgnoreCase(tooltipText)) {
            waitUntilElementIsDisplayed(toolTipElement, 15);
        }
        System.out.println("Fail : Tooltip NOT matching expected value");
        return false;
    }

    public static boolean performMouseHover(WebElement element) {
        Actions actions = new Actions(driver);
        if (element.isEnabled()) {
            actions.moveToElement(element).perform();
        }
        return false;
    }
}
