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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode

Mobile.startApplication('D:\\sabar\\Documents\\ApiDemos-WhiteScreen.apk', true)

Mobile.tap(findTestObject('Object Repository/android/android.widget.TextView - Views'), 0)

Mobile.scrollToText('TextFields')

Mobile.tap(findTestObject('Object Repository/android/android.widget.TextView - TextFields'), 0)

Mobile.setText(findTestObject('Object Repository/android/android.widget.EditText - hint text'), 'test1', 0)

AndroidDriver driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)



Mobile.setText(findTestObject('Object Repository/android/android.widget.EditText'), 'press enter before set text', 0)  

driver.pressKeyCode(AndroidKeyCode.ENTER)
Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/android/android.widget.EditText (1)'), 'space', 0)

driver.pressKeyCode(AndroidKeyCode.SPACE)
Mobile.closeApplication()

