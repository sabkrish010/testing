import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode

Mobile.startApplication('D:\\sabar\\Documents\\ApiDemos-WhiteScreen.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Views'), 0)

Mobile.scrollToText('TextFields')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - TextFields'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - hint text'), 'abc', 0)

AndroidDriver driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

//Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - hint text'), Keys.chord(Keys.ENTER))

Mobile.setText(findTestObject('Object Repository/android.widget.EditText'), 'press enter before set text', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (1)'), 'space', 0)

driver.pressKeyCode(AndroidKeyCode.SPACE)

Mobile.closeApplication()

