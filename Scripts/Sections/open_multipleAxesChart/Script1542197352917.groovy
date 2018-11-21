import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.gargoylesoftware.htmlunit.javascript.host.dom.Comment as Comment
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.StrURL)

WebUI.click(findTestObject('Object Repository/Page_Sign in  Microsoft Power BI/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt'), 'selvarajs@visualbi.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd'), 'UR99BsDpRtLYSIlAg+vC9A==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Forgot my password_idSIB'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_concat(Don  t show this'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Page_Power BI/div_report'))

WebUI.click(findTestObject('Page_Power BI/a_chart'))

WebUI.waitForElementPresent(findTestObject('null'), 60)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/span_Edit report'))

WebUI.waitForPageLoad(60)

String titleLabel = WebUI.getText(findTestObject('Page_MultipleAxesChart - Power BI/div_visualTitleBackground'))

KeywordLogger log = new KeywordLogger()

log.logInfo(titleLabel)

WebUI.mouseOver(findTestObject('Page_MultipleAxesChart - Power BI/div_visualTitleBackground'))

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/div_visualTitleBackground'))

WebUI.waitForElementPresent(findTestObject('Page_MultipleAxesChart - Power BI/i__glyphicon pbi-glyph-more gl'), 60)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/i__glyphicon pbi-glyph-more gl'))

not_run: WebUI.delay(60)

not_run: WebUI.waitForElementVisible(findTestObject('Page_MultipleAxesChart - Power BI/div_default context menu'), 45)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/h6_Edit'))

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/i_sectionIcon format'))

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/header_Title '))

not_run: CustomKeywords.'com.powerbi.components.ChartSelect.showSetting'('Title')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Title Text', 'Sample MultipleAxes')

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'('Font Family', 'Arial')

WebUI.waitForPageLoad(40)

WebUI.setText(findTestObject('Page_MultipleAxesChart - Power BI/input_fontSize'), '20')

WebUI.delay(2)

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'('Color', 'Black, 20% lighter')

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/div_Revert to Default_Title'))

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'('Title')

WebUI.waitForPageLoad(45)

not_run: String xAxisToggle = WebUI.getAttribute(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/div_On toggle'), 
    'aria-checked')

not_run: if (xAxisToggle == 'false') {
    WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/span_On'))
}

not_run: WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/header_X Axis'))

not_run: CustomKeywords.'com.powerbi.components.ChartSelect.setFontFamily'('Corbel')

CustomKeywords.'com.powerbi.components.ChartSelect.EnableSetting'('X Axis')

WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'('Font Family', 'Arial')

not_run: WebUI.setText(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/input_fontSize_inputField'), '20')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('fontSize', '20')

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'('Color', 'Black, 20% lighter')

CustomKeywords.'com.powerbi.components.ChartSelect.enableToggle'('Title')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Axis Title', 'Sample Title')

WebUI.delay(5)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/div_Revert to default'))

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'('X Axis')

not_run: WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/header_X Axis'))

WebUI.waitForPageLoad(45)

CustomKeywords.'com.powerbi.components.ChartSelect.EnableSetting'('Legend')

not_run: WebUI.scrollToElement(findTestObject(null), 150)

WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'('Vertical Alignment', 'Bottom')

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'('Horizontal Alignment', 'Center')

CustomKeywords.'com.powerbi.components.ChartSelect.enableToggle'('Title')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Legend Title', 'Sample')

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'('Color', 'Black, 20% lighter')

WebUI.scrollToPosition(0, 80)

not_run: WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'('Font Family', 'Arial')

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/div_Revert to default'))

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'('Legend')

not_run: WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.EnableSetting'('Data Label')

WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'('Background Color', 'Black, 20% lighter')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Rotation', '20')

not_run: WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'('Font Family', 'Arial')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('fontSize', '20')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('X', '20')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Y', '20')

CustomKeywords.'com.powerbi.components.ChartSelect.enableToggle'('Overlap')

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/div_Revert to default'))

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'('Data Label')

CustomKeywords.'com.powerbi.components.ChartSelect.EnableSetting'('Tooltip')

WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'('Background Color', 'Black, 20% lighter')

not_run: WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'('Font Family', 'Arial')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('fontSize', '20')

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'('Color', 'Black, 20% lighter')

CustomKeywords.'com.powerbi.components.ChartSelect.enableToggle'('Shared Tooltip')

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'('Shape', 'Square')

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/div_Revert to default'))

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'('Tooltip')

CustomKeywords.'com.powerbi.components.ChartSelect.showSetting'('Data Label Number Formatting')

WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Number of Decimal', '3')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Thousand Seperator', '.')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Decimal Seperator', ',')

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'('Scaling Factor', 'Million')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Prefix', 'P')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Suffix', 'S')

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/div_Revert to default'))

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'('Data Label Number Formatting')

CustomKeywords.'com.powerbi.components.ChartSelect.showSetting'('Tooltip Number Formatting')

WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Number of Decimal', '3')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Thousand Seperator', '.')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Decimal Seperator', ',')

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'('Scaling Factor', 'Million')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Prefix', 'P')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Suffix', 'S')

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/div_Revert to default'))

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'('Tooltip Number Formatting')

CustomKeywords.'com.powerbi.components.ChartSelect.showSetting'('Threshold')

WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.enableToggle'('Align Threshold')

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/div_Revert to default'))

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'('Threshold')

CustomKeywords.'com.powerbi.components.ChartSelect.showSetting'('Deviation')

WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.enableToggle'('Enable Deviation')

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/div_Revert to default'))

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'('Deviation')

CustomKeywords.'com.powerbi.components.ChartSelect.showSetting'('Hierarchy')

WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.enableToggle'('Enable Hierarchy')

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/div_Revert to default'))

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'('Hierarchy')

CustomKeywords.'com.powerbi.components.ChartSelect.EnableTitleToggle'('Title')

WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Title Text', 'Sample Title')

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'('Font color', 'Black, 20% lighter')

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'('Background color', 'Black, 20% lighter')

CustomKeywords.'com.powerbi.components.ChartSelect.setAlignment'('Right')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Text size', '14')

not_run: WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'('Font family', 'Arial')

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/div_Revert to default'))

CustomKeywords.'com.powerbi.components.ChartSelect.hideTitleToggle'('Title')

CustomKeywords.'com.powerbi.components.ChartSelect.EnableSetting'('Background')

WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'('Color', 'Black, 20% lighter')

WebUI.setText(findTestObject('Page_MultipleAxesChart - Power BI/Background/span_Transparency'), '75')

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/div_Revert to default'))

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'('Background')

CustomKeywords.'com.powerbi.components.ChartSelect.EnableSetting'('Lock aspect')

WebUI.delay(5)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/div_Revert to default'))

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'('Lock aspect')

CustomKeywords.'com.powerbi.components.ChartSelect.showSetting'('General')

WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('X Position', '14')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Y Position', '28')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Width', '1200')

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'('Height', '680')

WebUI.setText(findTestObject('Page_MultipleAxesChart - Power BI/General/textarea_Alt Text_paragraph ng'), 'Sample Title Check')

WebUI.delay(2)

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'('General')

CustomKeywords.'com.powerbi.components.ChartSelect.EnableSetting'('Border')

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'('Color', 'Black, 20% lighter')

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/div_Revert to default'))

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'('Border')

CustomKeywords.'com.powerbi.components.ChartSelect.EnableSetting'('Visual header')

WebUI.delay(5)

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'('Background color', 'Black, 20% lighter')

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'('Border', 'Black, 20% lighter')

WebUI.setText(findTestObject('Page_MultipleAxesChart - Power BI/Background/span_Transparency'), '65')

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'('Icon color', 'Black, 20% lighter')

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/X-Axis/div_Revert to default'))

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'('Visual header')

