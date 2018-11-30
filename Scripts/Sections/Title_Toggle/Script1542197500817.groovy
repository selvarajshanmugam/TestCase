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

CustomKeywords.'com.powerbi.components.ChartSelect.EnableTitleToggle'(GlobalVariable.sec_Title)

WebUI.delay(2)

List<String> initialValue = CustomKeywords.'com.powerbi.components.ChartSelect.getTitleToggle'()

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_titleText, GlobalVariable.titleText)

WebUI.delay(2)

WebUI.click(findTestObject('VisualObject/button_Back to report'))

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkTitleDiv'('VisualObject/div_visual Title'), GlobalVariable.titleText, 
    false)

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'(GlobalVariable.lbl_Fontcolor, GlobalVariable.color)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeDiv'('VisualObject/div_visual Title', 
        GlobalVariable.attr_color), GlobalVariable.color, false)

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'(GlobalVariable.lbl_backgroundcolor, GlobalVariable.color)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeDiv'('VisualObject/div_visual Title', 
        GlobalVariable.attr_backgroundColor), GlobalVariable.color, false)

CustomKeywords.'com.powerbi.components.ChartSelect.setAlignment'(GlobalVariable.Alignment)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeDiv'('VisualObject/div_visual Title', 
        GlobalVariable.attr_textAlign), GlobalVariable.textalign, false)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_TextSize, GlobalVariable.fontSize)

not_run: WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeDiv'('VisualObject/div_visual Title', 
        GlobalVariable.attr_fontsize), GlobalVariable.font_size_pxl, false)

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'(GlobalVariable.lbl_fontfamily, GlobalVariable.fontType)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeDiv'('VisualObject/div_visual Title', 
        GlobalVariable.attr_fontfamily), GlobalVariable.fontType, false)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/div_Revert to default'))


WebUI.delay(2)

List<String> finalValue = CustomKeywords.'com.powerbi.components.ChartSelect.getTitleToggle'()

CustomKeywords.'com.powerbi.components.ChartSelect.compareList'(initialValue, finalValue)

CustomKeywords.'com.powerbi.components.ChartSelect.hideTitleToggle'(GlobalVariable.sec_Title)

