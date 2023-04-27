import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement


WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.edureka.co')

WebDriver driver = DriverFactory.getWebDriver()

WebElement login = driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/span"))

login.click()

WebUI.delay(2)

WebElement email = driver.findElement(By.xpath("//*[@id='si_popup_email']"))
email.sendKeys("quang@gmail.com")

WebElement password = driver.findElement(By.xpath("//*[@id='si_popup_passwd']"))
password.sendKeys("admin123")

driver.findElement(By.xpath("//*[@id='new_sign_up_optim']/div/div/div[2]/div[3]/form/button")).click()
WebUI.delay(3)
WebUI.verifyTextPresent("Sign In Failed. Invalid login credentials.", true)

WebUI.closeBrowser()
