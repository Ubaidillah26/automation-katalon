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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/loginPage_OrangeHRM/inputUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('loginPage_OrangeHRM/inputPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/loginPage_OrangeHRM/btn_Login'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Object Repository/Home_OrangeHRM/Page_OrangeHRM/img'))

WebUI.click(findTestObject('Object Repository/Home_OrangeHRM/Page_OrangeHRM/menuAdmin'))

WebUI.click(findTestObject('Object Repository/Home_OrangeHRM/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Home_OrangeHRM/Page_OrangeHRM/btnCombo_UserRole'))

WebUI.click(findTestObject('Home_OrangeHRM/Page_OrangeHRM/div_Admin'))

WebUI.click(findTestObject('Home_OrangeHRM/Page_OrangeHRM/btnCombo_Status'))

WebUI.click(findTestObject('Home_OrangeHRM/Page_OrangeHRM/div_Enabled'))

WebUI.setText(findTestObject('Object Repository/Home_OrangeHRM/Page_OrangeHRM/txtEmployeeName'), 'Lisa  Andrews')

WebUI.delay(2)

WebUI.click(findTestObject('Home_OrangeHRM/Page_OrangeHRM/div_Lisa  Andrews'))

WebUI.setText(findTestObject('Object Repository/Home_OrangeHRM/Page_OrangeHRM/txtUsername'), 'Fulanah')

WebUI.setEncryptedText(findTestObject('Home_OrangeHRM/Page_OrangeHRM/txtPassword'), '5wDvdGfyrpt1xtujkDV8bA==')

WebUI.setEncryptedText(findTestObject('Home_OrangeHRM/Page_OrangeHRM/txtConfirmPassword'), '5wDvdGfyrpt1xtujkDV8bA==')

WebUI.click(findTestObject('Object Repository/Home_OrangeHRM/Page_OrangeHRM/button_Save'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Home_OrangeHRM/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus_1'), 
    'Fulanah')

WebUI.click(findTestObject('Object Repository/Home_OrangeHRM/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

WebUI.click(findTestObject('Home_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/div_Admin'))

WebUI.setText(findTestObject('Home_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input'), 'Lisa  Andrews')

WebUI.delay(3)

WebUI.click(findTestObject('Home_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/div_Lisa  Andrews'))

WebUI.click(findTestObject('Home_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('Home_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/div_Enabled'))

WebUI.click(findTestObject('Object Repository/Home_OrangeHRM/Page_OrangeHRM/button_Search'))

WebUI.scrollToPosition(100, 200)

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Home_OrangeHRM/Page_OrangeHRM/verifyName'), 'Fulanah')

WebUI.closeBrowser()

