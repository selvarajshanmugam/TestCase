import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.navigateToUrl(GlobalVariable.loginURLAdvanced)

WebUI.waitForPageLoad(10)

WebUI.waitForElementVisible(findTestObject('Page_Sign in  Microsoft Power BI/a_Sign in'), 30)

WebUI.click(findTestObject('Page_Sign in  Microsoft Power BI/a_Sign in'))

WebUI.setText(findTestObject('Page_Sign in to your account/input_Sign in_loginfmt'), GlobalVariable.userName)

WebUI.click(findTestObject('Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Page_Sign in to your account/input_Enter password_passwd'), GlobalVariable.password)

WebUI.click(findTestObject('Page_Sign in to your account/input_Forgot my password_idSIB'))

WebUI.click(findTestObject('Page_Sign in to your account/input_concat(Don  t show this'))

