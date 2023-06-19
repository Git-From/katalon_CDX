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

Mobile.startApplication('/Users/rajatrawat/Desktop/app-release_run.apk', true)

Mobile.tap(findTestObject('Object Repository/Object CDX/android.widget.Button - OK'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/Object CDX/android.widget.Image'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/Object CDX/android.widget.Image (1)'), 0, 0)

Mobile.setText(findTestObject('Object Repository/Object CDX/android.widget.EditText'), 'ras', 0)

Mobile.setText(findTestObject('Object Repository/Object CDX/android.widget.EditText (1)'), 'sar', 0)

Mobile.setText(findTestObject('Object Repository/Object CDX/android.widget.EditText (2)'), '7898789887', 0)

Mobile.setText(findTestObject('Object Repository/Object CDX/android.widget.EditText (3)'), 'waseq.s@gmail.com', 0)

Mobile.tap(findTestObject('Object Repository/Object CDX/android.widget.EditText (4)'), 0)

Mobile.tap(findTestObject('Object CDX/android.widget.TextView - aksarben ARS'), 0)

Mobile.tap(findTestObject('Object Repository/Object CDX/android.widget.TextView - SAVE'), 0)

Mobile.tap(findTestObject('Object Repository/Object CDX/android.widget.TextView - UPDATE NOW'), 0)

Mobile.delay(40)

Mobile.tap(findTestObject('Object Repository/Object CDX/android.widget.TextView - FINISH'), 0)

Mobile.tap(findTestObject('Object Repository/Object CDX/android.widget.TextView - GOT IT'), 0)

Mobile.tap(findTestObject('Object Repository/Object CDX/android.widget.TextView - MY APPOINTMENTS'), 0)

Mobile.tap(findTestObject('Object CDX/android.widget.TextView - Shelagh F Gallego'), 0)

Mobile.tap(findTestObject('Object Repository/Object CDX/android.widget.TextView - REVIEW APPOINTMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Object CDX/android.widget.TextView - Comfort Design Preferences'), 0)

float device_Height = Mobile.getDeviceHeight()

float device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 2

int endX = startX

int startY = device_Height * 0.30

int endY = device_Height * 0.70

Mobile.swipe(startX, endY, endX, startY)

Mobile.verifyElementExist(findTestObject('Object CDX/android.widget.TextView - -75 mo'), 10)

Mobile.verifyElementExist(findTestObject('Object CDX/android.widget.TextView - 201 - 360 mo'), 10)

Mobile.closeApplication()

