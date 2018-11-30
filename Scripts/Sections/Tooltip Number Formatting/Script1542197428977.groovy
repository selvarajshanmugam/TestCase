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

CustomKeywords.'com.powerbi.components.ChartSelect.showSetting'(GlobalVariable.sec_TooltipNumber)

WebUI.delay(2)

List<String> initialValue = CustomKeywords.'com.powerbi.components.ChartSelect.getTooltipNumber'()

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_noOfDecimal, GlobalVariable.NumberOfDecimal)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('VisualObject/rect_highcharts series group series-0'))

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkNoOfDecimal'('VisualObject/tspan_highcharts tooltip value', 
        GlobalVariable.DecimalSeparator), GlobalVariable.NumberOfDecimal, false)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_thousandSeparator, GlobalVariable.ThousandSeparator)

WebUI.mouseOver(findTestObject('VisualObject/rect_highcharts series group series-0'))

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkThousandSeparator'('VisualObject/tspan_highcharts tooltip value', 
        GlobalVariable.DecimalSeparator), GlobalVariable.ThousandSeparator, false)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_decimalSeparator, GlobalVariable.DecimalSeparator)

WebUI.mouseOver(findTestObject('VisualObject/rect_highcharts series group series-0'))

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkDecimalSeparator'('VisualObject/tspan_highcharts tooltip value', 
        GlobalVariable.NumberOfDecimal), GlobalVariable.DecimalSeparator, false)

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'(GlobalVariable.lbl_scalingFactor, GlobalVariable.ScalingFactor)

WebUI.mouseOver(findTestObject('VisualObject/rect_highcharts series group series-0'))

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkScalingFactor'('VisualObject/tspan_highcharts tooltip value'), 
    GlobalVariable.ScalingFactorSuffix, false)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_Prefix, GlobalVariable.Prefix)

WebUI.delay(2)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkPrefix'('VisualObject/tspan_highcharts tooltip value'), 
    GlobalVariable.Prefix, false)

WebUI.mouseOver(findTestObject('VisualObject/rect_highcharts series group series-0'))

WebUI.delay(2)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_suffix, GlobalVariable.Suffix)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('VisualObject/rect_highcharts series group series-0'))

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkSuffix'('VisualObject/tspan_highcharts tooltip value'), 
    GlobalVariable.Suffix, false)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/div_Revert to default'))

WebUI.delay(2)

List<String> finalValue = CustomKeywords.'com.powerbi.components.ChartSelect.getTooltipNumber'()

CustomKeywords.'com.powerbi.components.ChartSelect.compareList'(initialValue, finalValue)

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'(GlobalVariable.sec_TooltipNumber)

