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

CustomKeywords.'com.powerbi.components.ChartSelect.showSetting'(GlobalVariable.sec_Deviation)

WebUI.delay(2)

List<String> initialValue = CustomKeywords.'com.powerbi.components.ChartSelect.getDeviation'()

CustomKeywords.'com.powerbi.components.ChartSelect.enableToggle'(GlobalVariable.toggle_enableDeviation)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('VisualObject/rect_highcharts series group series-0'))

WebUI.click(findTestObject('VisualObject/rect_highcharts series group series-0'))

WebUI.mouseOver(findTestObject('VisualObject/text_highcharts data label series -2'))

WebUI.verifyElementPresent(findTestObject('VisualObject/rect_deviation'), 30)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/div_Revert to default'))

WebUI.delay(2)

List<String> finalValue = CustomKeywords.'com.powerbi.components.ChartSelect.getDeviation'()

CustomKeywords.'com.powerbi.components.ChartSelect.compareList'(initialValue, finalValue)

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'(GlobalVariable.sec_Deviation)

