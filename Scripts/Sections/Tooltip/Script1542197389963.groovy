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

CustomKeywords.'com.powerbi.components.ChartSelect.EnableSetting'(GlobalVariable.sec_Tooltip)

WebUI.delay(2)

List<String> initialValue = CustomKeywords.'com.powerbi.components.ChartSelect.getTooltip'()

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'(GlobalVariable.lbl_BackgroundColor, GlobalVariable.color)

WebUI.mouseOver(findTestObject('VisualObject/rect_highcharts series group series-0'))

WebUI.delay(2)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttribute'('VisualObject/path_highchart tooltip_last', 
        GlobalVariable.attr_fill), GlobalVariable.color, false)

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'(GlobalVariable.lbl_fontFamily, GlobalVariable.fontType)

WebUI.mouseOver(findTestObject('VisualObject/rect_highcharts series group series-0'))

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeValue'('VisualObject/text_highchart tooltip', 
        GlobalVariable.attr_fontfamily), GlobalVariable.fontType, false)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_fontSize, GlobalVariable.fontSize)

WebUI.mouseOver(findTestObject('VisualObject/rect_highcharts series group series-0'))

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeValue'('VisualObject/text_highchart tooltip', 
        GlobalVariable.attr_fontsize), GlobalVariable.font_size_pxl, false)

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'(GlobalVariable.lbl_color, GlobalVariable.color)

WebUI.mouseOver(findTestObject('VisualObject/rect_highcharts series group series-0'))

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeValue'('VisualObject/text_highchart tooltip', 
        GlobalVariable.attr_color), GlobalVariable.color, false)

CustomKeywords.'com.powerbi.components.ChartSelect.enableToggle'(GlobalVariable.toggle_sharedTooltip)

WebUI.mouseOver(findTestObject('VisualObject/rect_highcharts series group series-0'))

WebUI.delay(2)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkSharedTooltip'(), GlobalVariable.sharedTooltipStatus, 
    false)

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'(GlobalVariable.lbl_shape, GlobalVariable.Shape)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/div_Revert to default'))

WebUI.delay(2)

List<String> finalValue = CustomKeywords.'com.powerbi.components.ChartSelect.getTooltip'()

CustomKeywords.'com.powerbi.components.ChartSelect.compareList'(initialValue, finalValue)

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'(GlobalVariable.sec_Tooltip)

