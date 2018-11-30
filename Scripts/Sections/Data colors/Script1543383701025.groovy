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

CustomKeywords.'com.powerbi.components.ChartSelect.showSetting'(GlobalVariable.sec_DataColors)

WebUI.delay(2)

List<String> initialValue = CustomKeywords.'com.powerbi.components.ChartSelect.getDataColors'()

List<String> inputFieldName = CustomKeywords.'com.powerbi.components.ChartSelect.getInputFieldName'()

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'(inputFieldName.get(0), GlobalVariable.color)

WebUI.mouseOver(findTestObject('VisualObject/g_highcharts series group'))

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttribute'('VisualObject/rect_highchart series group_1', 
        GlobalVariable.attr_fill), GlobalVariable.color, false)

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'(inputFieldName.get(1), GlobalVariable.color)

WebUI.mouseOver(findTestObject('VisualObject/g_highcharts series group'))

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttribute'('VisualObject/rect_highcharts legend item', 
        GlobalVariable.attr_fill), GlobalVariable.color, false)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/div_Revert to Default_Title'))

WebUI.delay(2)

List<String> finalValue = CustomKeywords.'com.powerbi.components.ChartSelect.getDataColors'()

CustomKeywords.'com.powerbi.components.ChartSelect.compareList'(initialValue, finalValue)



CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'(GlobalVariable.sec_DataColors)

