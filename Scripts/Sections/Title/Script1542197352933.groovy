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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/header_Title '), FailureHandling.CONTINUE_ON_FAILURE)

List<String> initialValue = CustomKeywords.'com.powerbi.components.ChartSelect.getTitleSections'()

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_titleText, GlobalVariable.titleText)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkTitle'('VisualObject/tspan_highcharts-title'), 
    GlobalVariable.titleText, false, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'(GlobalVariable.lbl_fontFamily, GlobalVariable.fontType)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeValue'('VisualObject/text_highcharts-title', 
        GlobalVariable.attr_fontfamily), 'Arial', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(30, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Page_MultipleAxesChart - Power BI/input_fontSize'), GlobalVariable.fontSize, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeValue'('VisualObject/text_highcharts-title', 
        GlobalVariable.attr_fontsize), GlobalVariable.font_size_pxl, false, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'(GlobalVariable.lbl_color, GlobalVariable.color)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeValue'('VisualObject/text_highcharts-title', 
        GlobalVariable.attr_fill), GlobalVariable.color, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/div_Revert to Default_Title'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

List<String> finalValue = CustomKeywords.'com.powerbi.components.ChartSelect.getTitleSections'()

CustomKeywords.'com.powerbi.components.ChartSelect.compareList'(initialValue, finalValue)

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'(GlobalVariable.sec_Title)

