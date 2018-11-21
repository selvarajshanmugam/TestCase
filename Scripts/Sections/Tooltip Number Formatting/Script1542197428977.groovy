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

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_noOfDecimal, GlobalVariable.NumberOfDecimal)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_thousandSeparator, GlobalVariable.ThousandSeparator)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_decimalSeparator, GlobalVariable.DecimalSeparator)

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'(GlobalVariable.lbl_scalingFactor, GlobalVariable.ScalingFactor)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_Prefix, GlobalVariable.Prefix)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_suffix, GlobalVariable.Suffix)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/div_Revert to default'))

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'(GlobalVariable.sec_TooltipNumber)

