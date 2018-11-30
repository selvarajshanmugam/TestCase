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

CustomKeywords.'com.powerbi.components.ChartSelect.EnableSetting'(GlobalVariable.sec_DataLabel)

WebUI.delay(2)

List<String> initialValue = CustomKeywords.'com.powerbi.components.ChartSelect.getDataLabel'()

not_run: CustomKeywords.'com.powerbi.components.ChartSelect.setColor'(GlobalVariable.lbl_BackgroundColor, GlobalVariable.color)

not_run: WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeValue'('VisualObject/rect_highcharts-data-label', 
        GlobalVariable.attr_fill), GlobalVariable.color, false)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_Rotation, GlobalVariable.Rotation)

WebUI.delay(2)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkRotationValue'('VisualObject/text_highcharts data label series-0'), 
    GlobalVariable.Rotation, false)

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'(GlobalVariable.lbl_fontFamily, GlobalVariable.fontType)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeValue'('VisualObject/text_highcharts data label series-0', 
        GlobalVariable.attr_fontfamily), GlobalVariable.fontType, false)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_fontSize, GlobalVariable.fontSize)

WebUI.delay(2)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeValue'('VisualObject/text_highcharts data label series-0', 
        GlobalVariable.attr_fontsize), GlobalVariable.font_size_pxl, false)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_X, GlobalVariable.X)

WebUI.delay(2)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_Y, GlobalVariable.Y)

WebUI.delay(2)

CustomKeywords.'com.powerbi.components.ChartSelect.enableToggle'(GlobalVariable.toggle_Overlap)

WebUI.verifyElementNotHasAttribute(findTestObject('VisualObject/g_highcharts data label_2'), 'visibility', 30)

CustomKeywords.'com.powerbi.components.ChartSelect.enableToggle'(GlobalVariable.toggle_ShowFirstLast)

WebUI.verifyElementNotPresent(findTestObject('VisualObject/tspan_highcharts-data-label_2'), 30)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/div_Revert to default'))

WebUI.delay(2)

List<String> finalValue = CustomKeywords.'com.powerbi.components.ChartSelect.getDataLabel'()

CustomKeywords.'com.powerbi.components.ChartSelect.compareList'(initialValue, finalValue)

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'(GlobalVariable.sec_DataLabel)

