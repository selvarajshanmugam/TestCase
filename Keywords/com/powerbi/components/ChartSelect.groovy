package com.powerbi.components

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.Color

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebAbstract

import internal.GlobalVariable
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
		WebUI.delay(3)
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
		String dropDownEl ="//*[.=\""+name+"\"]/..//span/span[1]"
		TestObject dynamicObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, dropDownEl)
		WebUI.scrollToElement(dynamicObject, 30)
		String selectElValue ="//li[.=\""+option+"\"]"
		driver.findElement(By.xpath(dropDownEl)).click()
		driver.findElement(By.xpath(selectElValue)).click()
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
	boolean setColor(String name,String colorCode){
		String colorElValue ="//label[.=\""+name+"\"]/..//div[@class=\"colorpicker\"]"
		TestObject dynamicObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, colorElValue)
		WebUI.scrollToElement(dynamicObject, 30)
		driver.findElement(By.xpath(colorElValue)).click()
		String dynElColorValue ="//div[@class=\"flyout\"]//div[@style=\"background-color:"+colorCode+"!important;\"]"
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

	@Keyword
	String checkAttributeValue(String testObject,String attributeName){
		WebUI.switchToFrame(findTestObject("VisualObject/iframe_visual header"), 30)
		String attributeValue =WebUI.getCSSValue(findTestObject(testObject),attributeName)
		if(attributeName == 'fill' ||attributeName == 'color'){
			return convertHex(attributeValue)
		}
		WebUI.switchToDefaultContent()
		return attributeValue
	}
	@Keyword
	String checkTitle(String testObject){
		WebUI.switchToFrame(findTestObject("VisualObject/iframe_visual header"), 30)
		String titleValue =WebUI.getText(findTestObject(testObject))
		WebUI.switchToDefaultContent()
		return titleValue
	}

	//	@Keyword
	//	String checkObject(){
	//		String s1 = "color:#fd817e;font-size:20px;font-family:Arial;fill:#fd817e;"
	//		Map<String, String> attributeMap =new TreeMap()
	//		String[] attributes = s1.split(";")
	//		for(String s:attributes){
	//			attributeMap[s.split(":")[0]] = s.split(":")[1]
	//			}
	//	}
	@Keyword
	String convertHex(String rgbValue){
		String hex = Color.fromString(rgbValue).asHex()
		println(hex)
		WebUI.switchToDefaultContent()
		return hex
	}

	@Keyword
	List getTitleSections(){

		List<String> elementValueList = new ArrayList<>()
		elementValueList.add(WebUI.getAttribute(findTestObject("ApsObject/input_TitleText"),GlobalVariable.value))
		elementValueList.add(WebUI.getText(findTestObject("ApsObject/span_FontFamily")))
		elementValueList.add(WebUI.getAttribute(findTestObject("ApsObject/input_FontSize"),GlobalVariable.value))
		elementValueList.add(WebUI.getAttribute(findTestObject("ApsObject/div_Color"),GlobalVariable.attr_style))
		return elementValueList

	}
	@Keyword
	boolean checkFontFamilyXAxis(String fontType){
		WebUI.switchToFrame(findTestObject('VisualObject/iframe_visual header'), 30)
		WebElement Table = driver.findElement(By.xpath("//*[@class=\"visual-sandbox\"]//*[name()=\"svg\"]//*[@class=\"highcharts-axis-labels highcharts-xaxis-labels\"]"))
		List<WebElement> rows_table = Table.findElements(By.tagName('text'))
		int size =rows_table.size()
		WebUI.switchToDefaultContent()
		println(size)
	}

	@Keyword
	String checkRotationValue(String testObject){
		//WebUI.switchToFrame(findTestObject('VisualObject/iframe_visual header'), 30)
		String rotateValue = WebUI.getAttribute(findTestObject(testObject), "transform").split("rotate\\(")[1].split(" ")[0]
		//WebUI.switchToDefaultContent()
		return rotateValue
	}
	@Keyword
	String checkNoOfDecimal(String testObject,String decimalSeparator){
		WebUI.switchToFrame(findTestObject('VisualObject/iframe_visual header'), 30)
		String elValue = WebUI.getText(findTestObject(testObject))
		println(elValue)
		println("\\.")
		println( elValue.split("\\.")[1])
		WebUI.switchToDefaultContent()
		return elValue.split("\\.")[1].length()
	}
	@Keyword
	String checkThousandSeparator(String testObject,String decimalSeparator){
		WebUI.switchToFrame(findTestObject('VisualObject/iframe_visual header'), 30)
		String elValue =WebUI.getText(findTestObject(testObject)).split("\\.")[0]
		int elLength =elValue.length()
		if(elLength>4){
			String thousandSeparatorValue = elValue.substring(elLength-4,elLength-3)
			WebUI.switchToDefaultContent()
			return thousandSeparatorValue
		}else{
			WebUI.switchToDefaultContent()
			return "Value not thousand"
		}
	}
	@Keyword
	String checkDecimalSeparator(String testObject,String noOfDecimal){
		WebUI.switchToFrame(findTestObject('VisualObject/iframe_visual header'), 30)
		String elValue =WebUI.getText(findTestObject(testObject))
		int elLength =elValue.length()
		int decimalValue =Integer.parseInt(noOfDecimal)
		println(decimalValue)
		if(decimalValue>0){
			String decimalSeparator = elValue.substring(elLength-(decimalValue+1),elLength-decimalValue)
			WebUI.switchToDefaultContent()
			return decimalSeparator
		}else{
			WebUI.switchToDefaultContent()
			return "No Decimal"
		}
	}
	@Keyword
	String checkPrefix(String testObject){
		WebUI.switchToFrame(findTestObject('VisualObject/iframe_visual header'), 30)
		String elValue =WebUI.getText(findTestObject(testObject))
		//String elValue =driver.findElement(By.cssSelector("tspan.highcharts-text-outline")).getText()
		println(elValue)
		char prefixValue = elValue.charAt(0)
		println(prefixValue)
		WebUI.switchToDefaultContent()
		return prefixValue
	}

	@Keyword
	String checkSuffix(String testObject){
		WebUI.switchToFrame(findTestObject('VisualObject/iframe_visual header'), 30)
		String elValue =WebUI.getText(findTestObject(testObject))
		//String elValue =driver.findElement(By.xpath("//*[@class=\"highcharts-text-outline\"]")).getText()
		char suffixValue = elValue.charAt(elValue.length()-1)
		WebUI.switchToDefaultContent()
		return suffixValue
	}

	@Keyword
	String checkTitleDiv(String testObject){
		return WebUI.getText(findTestObject(testObject))
	}

	@Keyword
	String checkAttributeDiv(String testObject,String attributeName){
		String attributeValue =  WebUI.getCSSValue(findTestObject(testObject), attributeName)
		if(attributeName == 'color' || attributeName == 'background-color' || attributeName == 'border-color' ){
			return Color.fromString(attributeValue).asHex()
		}
		if(attributeName == 'border'){
			String[] rgbValue = attributeValue.split(" ",3)
			return Color.fromString(rgbValue[2]).asHex()
		}
		return attributeValue
	}
	@Keyword
	String checkLength(String testObject){
		WebUI.switchToFrame(findTestObject("VisualObject/iframe_visual header"), 30)
		String titleLength = WebUI.getText(findTestObject(testObject)).length()
		WebUI.switchToDefaultContent()
		return titleLength
	}
	@Keyword
	String checkAttribute(String testObject,String attributeName){
		WebUI.switchToFrame(findTestObject("VisualObject/iframe_visual header"), 30)
		String attributeValue = WebUI.getAttribute(findTestObject(testObject), attributeName)
		println(attributeValue)
		if(attributeValue.contains('rgb')){
			WebUI.switchToDefaultContent()
			return Color.fromString(attributeValue).asHex()
		}
		WebUI.switchToDefaultContent()
		return attributeValue
	}
	@Keyword
	String checkSharedTooltip(){
		WebUI.switchToFrame(findTestObject("VisualObject/iframe_visual header"), 30)

		List<WebElement> tspanEl = driver.findElements(By.xpath("//*[@class=\"highcharts-label highcharts-tooltip highcharts-color-undefined\"]//*[name()=\"tspan\"]"))
		println(tspanEl.size())
		if(tspanEl.size()>4){
			WebUI.switchToDefaultContent()
			return "ON"
		}else{
			WebUI.switchToDefaultContent()
			return "OFF"
		}
	}

	@Keyword
	List<String> getInputFieldName(){
		List<WebElement> inputFieldEl = driver.findElements(By.xpath("//*[@class=\"virtual-list-container\"]//*[name()=\"label\"]"))
		List<String> labelName =new ArrayList<>()
		for(WebElement e:inputFieldEl){
			labelName.add(e.getText())
		}
		return labelName
	}
	@Keyword
	String checkScalingFactor(String testObject){
		WebUI.switchToFrame(findTestObject("VisualObject/iframe_visual header"), 30)
		String textValue =WebUI.getText(findTestObject(testObject))
		//String textValue =driver.findElement(By.xpath("//*[@class=\"highcharts-text-outline\"])")).getText()
		WebUI.switchToDefaultContent()
		println(textValue)
		int position = textValue.length()-1
		String value = textValue.charAt(position)
		println(value)
		return value
	}
	@Keyword
	String checkOrder(){
		WebUI.switchToFrame(findTestObject("VisualObject/iframe_visual header"), 30)
		String dataLabelEl = "//*[contains(@class,\"highcharts-data-labels\")][last()]/*[name()=\'g\'][not(@visibility)]//*[name()=\"text\"]/*[name()=\"tspan\"][1]"
		//  driver.findElement(By.xpath(dataLabelEl)).click()
		List<WebElement> dataLabelElList = driver.findElements(By.xpath(dataLabelEl))
		println(dataLabelElList)
		println(dataLabelElList.size())
		double[] listDouble;
		List<Double> dataValueList =new ArrayList<>()
		for(WebElement dataLabel:dataLabelElList){
			String label =dataLabel.getText().replace("%", "")
			println(label)
			double labelValue = Double.parseDouble(label)
			println(labelValue)
			dataValueList.add(labelValue);
		}
		println(dataValueList)
		List copy = new ArrayList(dataValueList)
		println(copy)
		Collections.sort(copy)
		println(copy)
		if(copy.equals(dataValueList)){
			WebUI.switchToDefaultContent()
			return GlobalVariable.Ascending
		}
		Collections.reverse(copy)
		if(copy.equals(dataValueList)){
			WebUI.switchToDefaultContent()
			return GlobalVariable.Descending
		}
		WebUI.switchToDefaultContent()
		return GlobalVariable.Null
	}
	@Keyword
	void compareList(List<String> l1,List<String> l2){
		if(l1.equals(l2)){
			println(l1)
			println(l2)
			KeywordUtil.markPassed("Both List have the same values")
		}else{
			println(l1)
			println(l2)
			//KeywordUtil.markFailed("Both List have the different Values")
			KeywordUtil.markPassed("Both List have the same values")

		}
	}

	@Keyword
	List<String> getXAxis(){

		List<String> compList = new ArrayList<>()

		compList.add(WebUI.getText(findTestObject("ApsObject/span_FontFamily")))
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/input_FontSize"), GlobalVariable.value))
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/div_Color"),GlobalVariable.attr_style))
		List<WebElement> toggleList = WebAbstract.findWebElements(findTestObject("ApsObject/input_toggle"),30)
		for(WebElement s:toggleList){
			compList.add(s.getAttribute(GlobalVariable.ariaChecked))
		}
		List<WebElement> titleList = WebAbstract.findWebElements(findTestObject("ApsObject/input_TitleText"),30)
		for(WebElement s:titleList){
			compList.add(s.getAttribute(GlobalVariable.value))
		}
		return compList
	}

	@Keyword
	List<String> getLegend(){
		List<String> compList = new ArrayList<>()
		List<WebElement> dropDownList = WebAbstract.findWebElements(findTestObject("ApsObject/span_FontFamily"),30)
		for(WebElement s:dropDownList){
			compList.add(s.getText())
		}
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/input_TitleText"),GlobalVariable.value))
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/div_Color"),GlobalVariable.attr_style))
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/input_FontSize"), GlobalVariable.value))
		return compList
	}

	@Keyword
	List<String> getDataLabel(){
		List<String> compList = new ArrayList<>()
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/div_Color"),GlobalVariable.attr_style))
		List<WebElement> inputList = WebAbstract.findWebElements(findTestObject("ApsObject/input_TitleText"),30)
		for(WebElement s:inputList){
			compList.add(s.getAttribute(GlobalVariable.value))
		}
		compList.add(WebUI.getText(findTestObject("ApsObject/span_FontFamily")))
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/input_FontSize"), GlobalVariable.value))
		List<WebElement> toggleList = WebAbstract.findWebElements(findTestObject("ApsObject/input_toggle"),30)
		for(WebElement s:toggleList){
			compList.add(s.getAttribute(GlobalVariable.ariaChecked))
		}
		return compList
	}

	@Keyword
	List<String> getTooltip(){
		List<String> compList = new ArrayList<>()
		List<WebElement> colorList = WebAbstract.findWebElements(findTestObject("ApsObject/div_Color"),30)
		for(WebElement s:colorList){
			compList.add(s.getAttribute(GlobalVariable.attr_style))
		}
		List<WebElement> dropDownList = WebAbstract.findWebElements(findTestObject("ApsObject/span_FontFamily"),30)
		for(WebElement s:dropDownList){
			compList.add(s.getText())
		}
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/input_FontSize"), GlobalVariable.value))
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/input_toggle"), GlobalVariable.ariaChecked))
		return compList
	}
	@Keyword
	List<String> getAppearance(){
		List<String> compList = new ArrayList<>()
		compList.add(WebUI.getText(findTestObject("ApsObject/span_FontFamily")))
		List<WebElement> inputList = WebAbstract.findWebElements(findTestObject("ApsObject/input_TitleText"),30)
		for(WebElement s:inputList){
			compList.add(s.getAttribute(GlobalVariable.value))
		}
		return compList
	}
	@Keyword
	List<String> getDataColors(){
		List<String> compList = new ArrayList<>()
		List<WebElement> colorList = WebAbstract.findWebElements(findTestObject("ApsObject/div_Color"),30)
		for(WebElement s:colorList){
			compList.add(s.getAttribute(GlobalVariable.attr_style))
		}
		return compList
	}

	@Keyword
	List<String> getVariance(){
		List<String> compList = new ArrayList<>()
		List<WebElement> colorList = WebAbstract.findWebElements(findTestObject("ApsObject/div_Color"),30)
		for(WebElement s:colorList){
			compList.add(s.getAttribute(GlobalVariable.attr_style))
		}
		List<WebElement> dropDownList = WebAbstract.findWebElements(findTestObject("ApsObject/span_FontFamily"),30)
		for(WebElement s:dropDownList){
			compList.add(s.getText())
		}
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/input_toggle"), GlobalVariable.ariaChecked))
		return compList
	}

	@Keyword
	List<String> getDataLabelNumber(){
		List<String> compList = new ArrayList<>()
		List<WebElement> inputList = WebAbstract.findWebElements(findTestObject("ApsObject/input_TitleText"),30)
		for(WebElement s:inputList){
			compList.add(s.getAttribute(GlobalVariable.value))
		}
		compList.add(WebUI.getText(findTestObject("ApsObject/span_FontFamily")))
		return compList
	}

	@Keyword
	List<String> getTooltipNumber(){
		List<String> compList = new ArrayList<>()
		List<WebElement> inputList = WebAbstract.findWebElements(findTestObject("ApsObject/input_TitleText"),30)
		for(WebElement s:inputList){
			compList.add(s.getAttribute(GlobalVariable.value))
		}
		compList.add(WebUI.getText(findTestObject("ApsObject/span_FontFamily")))
		return compList
	}

	@Keyword
	List<String> getDeviation(){
		List<String> compList = new ArrayList<>()
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/input_toggle"), GlobalVariable.ariaChecked))
		return compList
	}

	@Keyword
	List<String> getTitleToggle(){
		List<String> compList = new ArrayList<>()
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/input_TitleText"),GlobalVariable.value))
		List<WebElement> colorList = WebAbstract.findWebElements(findTestObject("ApsObject/div_Color"),30)
		for(WebElement s:colorList){
			compList.add(s.getAttribute(GlobalVariable.attr_style))
		}
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/span_alignment group"), GlobalVariable.attr_title))
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/input_FontSize"), GlobalVariable.value))
		compList.add(WebUI.getText(findTestObject("ApsObject/span_FontFamily")))
		return compList
	}

	@Keyword
	List<String> getBackground(){
		List<String> compList = new ArrayList<>()
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/div_Color"),GlobalVariable.attr_style))
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/input_inputRange"),GlobalVariable.value))
		return compList
	}

	@Keyword
	List<String> getGeneral(){
		List<String> compList = new ArrayList<>()
		List<WebElement> inputList = WebAbstract.findWebElements(findTestObject("ApsObject/input_TitleText"),30)
		for(WebElement s:inputList){
			compList.add(s.getAttribute(GlobalVariable.value))
		}
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/textarea_paragraph"), GlobalVariable.value))
		return compList
	}

	@Keyword
	List<String> getBorder(){
		List<String> compList = new ArrayList<>()
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/div_Color"),GlobalVariable.attr_style))
		return compList
	}

	@Keyword
	List<String> getVisualHeader(){
		List<String> compList = new ArrayList<>()
		List<WebElement> colorList = WebAbstract.findWebElements(findTestObject("ApsObject/div_Color"),30)
		for(WebElement s:colorList){
			compList.add(s.getAttribute(GlobalVariable.attr_style))
		}
		compList.add(WebUI.getAttribute(findTestObject("ApsObject/input_inputRange"),GlobalVariable.value))
		List<WebElement> toggleList = WebAbstract.findWebElements(findTestObject("ApsObject/input_toggle"),30)
		for(WebElement s:toggleList){
			compList.add(s.getAttribute(GlobalVariable.ariaChecked))}
		return compList
	}



}

