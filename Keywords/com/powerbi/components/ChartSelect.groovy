package com.powerbi.components

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.util.concurrent.locks.Condition

import org.openqa.selenium.WebDriver
import org.openqa.selenium.By.ByCssSelector
import org.openqa.selenium.By.ByXPath

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys

import internal.GlobalVariable

import org.openqa.selenium.By
public class ChartSelect {

	WebDriver driver = DriverFactory.getWebDriver()
	@Keyword
	public setTitleText(String inputValue){
		String titleTextEl = "//label[.=\"Title Text\"]/..//input"
		TestObject dynamicObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, titleTextEl)
		WebUI.scrollToElement(dynamicObject, 30)
		WebUI.clearText(dynamicObject)
		WebUI.sendKeys(dynamicObject, inputValue)
		}
	@Keyword
	boolean setFontFamily(String fontName){
		String fontEleValue = "//label[.=\"Font Family\"]/..//select-menu/span"
		TestObject dynamicObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, fontEleValue)
		WebUI.scrollToElement(dynamicObject, 30)
		driver.findElement(By.xpath(fontEleValue)).click()
		driver.findElement(By.xpath("//li[@title=\""+fontName+"\"]")).click()
	}
	@Keyword
	boolean enableToggle(String toggleName){
		String toggleElValue ="//label[.=\""+toggleName+"\"]/..//input/parent::div"
		TestObject dynamicObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, toggleElValue)
		WebUI.scrollToElement(dynamicObject, 30)
		String toggleStatus =driver.findElement(By.xpath(toggleElValue)).getAttribute("aria-checked")
		String toggleEnableEl ="//label[.=\""+toggleName+"\"]/..//div//label/span[1]"
		if(toggleStatus == "false"){
			driver.findElement(By.xpath(toggleEnableEl)).click()
		}else{
			driver.findElement(By.xpath(toggleEnableEl)).click()
			driver.findElement(By.xpath(toggleEnableEl)).click()
		}
	}

	@Keyword
	boolean EnableSetting(String settingName){
		String dynSettingName = "//header[.=\""+settingName+"\"]/..//input/parent::div"
		String enableSettingEl = "//header[.=\""+settingName+"\"]/..//label/span[1]"
		String displaySettingEl ="//header[.=\""+settingName+"\"]"
		TestObject dynamicObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, displaySettingEl)
		WebUI.scrollToElement(dynamicObject, 30)
		String settingStatus = driver.findElement(By.xpath(dynSettingName)).getAttribute("aria-checked")
		if(settingStatus == 'false'){
			driver.findElement(By.xpath(enableSettingEl)).click()
		}
		driver.findElement(By.xpath(displaySettingEl)).click()
	}
	@Keyword
	boolean selectValue(String name,String option){
		//WebUI.scrollToElement(findTestObject('Page_MultipleAxesChart - Power BI/div_Revert to default'), 30)
		String dropDownEl ="//*[.=\""+name+"\"]/..//span/span[1]"
		TestObject dynamicObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, dropDownEl)
		WebUI.scrollToElement(dynamicObject, 30)
		String selectElValue ="//li[.=\""+option+"\"]"
		driver.findElement(By.xpath(dropDownEl)).click()
		driver.findElement(By.xpath(selectElValue)).click()
		//WebUI.scrollToElement(findTestObject('Page_MultipleAxesChart - Power BI/div_Revert to default'), 30)
	}
	@Keyword
	public setValue(String name,String inputValue){
		String dynElValue = "//label[.=\""+name+"\"]/..//input"
		TestObject dynamicObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, dynElValue)
		WebUI.scrollToElement(dynamicObject, 30)
		driver.findElement(By.xpath(dynElValue)).clear()
		driver.findElement(By.xpath(dynElValue)).sendKeys(inputValue)
	}
	@Keyword
	boolean hideSetting(String name){
		String dynSettingElName = "//header[.=\""+name+"\"]"
		TestObject dynamicObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, dynSettingElName)
		WebUI.scrollToElement(dynamicObject, 30)
		WebUI.click(dynamicObject)
	}
	@Keyword
	boolean setColor(String name,String colorName){
		String colorElValue ="//label[.=\""+name+"\"]/..//div[@class=\"colorpicker\"]"
		TestObject dynamicObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, colorElValue)
		WebUI.scrollToElement(dynamicObject, 30)
		driver.findElement(By.xpath(colorElValue)).click()
		String dynElColorValue ="//div[@class=\"flyout\"]//div[@title=\""+colorName+"\"]"
		driver.findElement(By.xpath(dynElColorValue)).click()
	}
	@Keyword
	boolean showSetting(String name){
		String dynSettingElName = "//header[.=\""+name+"\"]"
		TestObject dynamicObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, dynSettingElName)
		WebUI.scrollToElement(dynamicObject, 30)
		driver.findElement(By.xpath(dynSettingElName)).click()
	}
	@Keyword
	boolean EnableTitleToggle(String name){
		String dynSettingName = "//header[.=\""+name+"\"]/..//input/parent::div"
		String enableSettingEl = "//header[.=\""+name+"\"]/..//label/span[1]"
		String displaySettingEl ="//header[.=\""+name+"\"]/..//div[@aria-checked]/../../../../../preceding-sibling::div"
		
		TestObject dynamicObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, dynSettingName)
		WebUI.scrollToElement(dynamicObject, 30)
		
		String settingStatus = driver.findElement(By.xpath(dynSettingName)).getAttribute("aria-checked")
		if(settingStatus == 'false'){
			driver.findElement(By.xpath(enableSettingEl)).click()
		}
		driver.findElement(By.xpath(displaySettingEl)).click()
	}
	@Keyword
	boolean setAlignment(String alignDirection){
		String alignDirEl ="//*[.=\"Alignment\"]//span[@title=\""+alignDirection+"\"]"
		TestObject dynamicObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, alignDirEl)
		WebUI.scrollToElement(dynamicObject, 30)
		driver.findElement(By.xpath(alignDirEl)).click()
	}

	@Keyword
	boolean hideTitleToggle(String name){
		String titleElValue ="//header[.=\""+name+"\"]/..//div[@aria-checked]/../../../../../preceding-sibling::div"
		
		TestObject dynamicObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, titleElValue)
		WebUI.scrollToElement(dynamicObject, 30)	
		
		driver.findElement(By.xpath(titleElValue)).click()
	}
	@Keyword
	boolean getReadingView(){
		WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/span_Reading view'))
		WebUI.focus(findTestObject('Page_MultipleAxesChart - Power BI/div_infonav-dialog'))
		WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/input_button_Save'))
		WebUI.waitForPageLoad(45)
	}
	@Keyword
	boolean checkChartContextMenu(String option){
		String contextMenuElValue ="//div[@class=\"highcharts-menu\"]/div[.=\""+option+"\"]"
		WebUI.switchToFrame(findTestObject('Page_MultipleAxesChart - Power BI/iframe_visual-sandbox'), 30)
		WebUI.delay(5)
		WebUI.waitForElementVisible(findTestObject('Page_MultipleAxesChart - Power BI/rect_Chart context menu'), 30)
		WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/rect_Chart context menu'))
		driver.findElement(By.xpath(contextMenuElValue))
	}
	@Keyword
	boolean getEditReport(){
		WebUI.switchToDefaultContent()
		WebUI.delay(2)
		WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/span_Edit report'))
		WebUI.waitForPageLoad(35)
		WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/i_sectionIcon format'))
	}
	@Keyword
	boolean selectChart(String chartName){
		String chartNameEl ="//*[@title=\""+chartName+"\"]"
		driver.findElement(By.xpath(chartNameEl)).click()
	}
	@Keyword
	boolean changeSlider(String name,String inputvalue){		
		String dynElValue = "//slider/div/div[1]/div"		
		TestObject dynamicObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, dynElValue)
		String styleValue =WebUI.getAttribute(dynamicObject, "style")
		int currentSliderValue = getCurrentValue(styleValue)
		int positionMoveValue =Integer.parseInt(inputvalue) - currentSliderValue  
		if(positionMoveValue>0){
			movePositionRight(positionMoveValue)
		}else if(positionMoveValue<0){
		movePositionLeft(positionMoveValue)
		}else{
		WebUI.comment("The value is set already")
		}
	
	}
		int getCurrentValue(String styleValue){
		int currentStyleValue =Integer.parseInt(styleValue.replaceAll("\\D+",""))
        return 100 - currentStyleValue
		}	
		
		void movePositionRight(int value){
		String sliderEl ="//slider/div/div[1]/input"		
		for(int i=0;i<value;i++){
		driver.findElement(By.xpath(sliderEl)).sendKeys(Keys.ARROW_RIGHT)
		}
		}
		
		void movePositionLeft(int negativeValue){
			int value =negativeValue * -1
			String sliderEl ="//slider/div/div[1]/input"
			for(int i=0;i<value;i++){
			driver.findElement(By.xpath(sliderEl)).sendKeys(Keys.ARROW_LEFT)
			}
			}
	
	}

