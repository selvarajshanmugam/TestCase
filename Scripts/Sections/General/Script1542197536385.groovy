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

CustomKeywords.'com.powerbi.components.ChartSelect.showSetting'(GlobalVariable.sec_general)

WebUI.delay(2)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_XPosition, GlobalVariable.X)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_YPosition, GlobalVariable.Y)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_Width, GlobalVariable.Width)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_Height, GlobalVariable.Height)

WebUI.setText(findTestObject('Page_MultipleAxesChart - Power BI/textarea_Alt Text_paragraph ng'), GlobalVariable.lbl_titleText)

WebUI.delay(2)

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'(GlobalVariable.sec_general)

