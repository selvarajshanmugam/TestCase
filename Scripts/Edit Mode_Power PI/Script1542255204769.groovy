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

WebUI.waitForElementPresent(findTestObject('Page_MultipleAxesChart - Power BI/div_chart'), 60)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/span_Edit report'))

WebUI.waitForPageLoad(60)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_MultipleAxesChart - Power BI/div_visualTitleBackground'))

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/div_visualTitleBackground'))

WebUI.waitForElementPresent(findTestObject('Page_MultipleAxesChart - Power BI/i__glyphicon pbi-glyph-more gl'), 60)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/i__glyphicon pbi-glyph-more gl'))

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/h6_Edit'))

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/i_sectionIcon format'))

