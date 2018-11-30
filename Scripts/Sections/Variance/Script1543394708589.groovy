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

CustomKeywords.'com.powerbi.components.ChartSelect.showSetting'(GlobalVariable.sec_Variance)

WebUI.delay(2)

List<String> initialValue = CustomKeywords.'com.powerbi.components.ChartSelect.getVariance'()

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'(GlobalVariable.lbl_VariancePlus, GlobalVariable.color)

CustomKeywords.'com.powerbi.components.ChartSelect.enableToggle'(GlobalVariable.toggle_Negative)

WebUI.delay(2)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttribute'('VisualObject/rect_highcharts series group', 
        GlobalVariable.attr_fill), GlobalVariable.color, false)

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'(GlobalVariable.lbl_VarianceMinus, GlobalVariable.color)

WebUI.click(findTestObject('VisualObject/span_Negative is Good Toggle'))

WebUI.delay(2)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttribute'('VisualObject/rect_highcharts series group', 
        GlobalVariable.attr_fill), GlobalVariable.color, false)

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'(GlobalVariable.lbl_SortVariance, GlobalVariable.SortVariance)

WebUI.delay(2)

not_run: WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkOrder'(), GlobalVariable.Null, false, 
    FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'(GlobalVariable.lbl_ShapeType, GlobalVariable.ShapeType)

WebUI.delay(2)

WebUI.verifyElementAttributeValue(findTestObject('VisualObject/rect_highcharts annotation label'), GlobalVariable.ShapeTypeAttribute, 
    GlobalVariable.ShapeTypeAttValue, 30)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/div_Revert to Default_Title'))

WebUI.delay(2)

List<String> finalValue = CustomKeywords.'com.powerbi.components.ChartSelect.getVariance'()

CustomKeywords.'com.powerbi.components.ChartSelect.compareList'(initialValue, finalValue)

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'(GlobalVariable.sec_Variance)

