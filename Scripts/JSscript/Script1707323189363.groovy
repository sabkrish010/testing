/*import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper*/

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI 
/*WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

String[] Argument = new String[10]

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Page_CURA Healthcare Service/btn-make-appointment'),30)

//println(Argument[0])Argument[0].

WebUI.executeJavaScript("Argument[0].click()", Arrays.asList(element))


//WebUI.executeJavaScript("alert('This is an alert')", null)*/

WebUI.openBrowser('')
WebUI.navigateToUrl('https://google.com')
WebUI.click('Object Repository/googlecheck/Dood_btn')
WebUI.delay(6)
/*WebDriver driver = DriverFactory.getWebDriver()
WebElement element = driver.findElement(By.xpath("(//input[@name='btnI'])[2]"))


//WebElement element = WebUiCommonHelper.findWebElement('Object Repository/Page_Google/doodle_btn',30)
String text = "ABC"
WebUI.executeJavaScript("arguments[0].click()'"+ text +"';", Arrays.asList(element))*/




