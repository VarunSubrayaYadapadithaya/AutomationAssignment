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
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('Page_Book London Theater Tickets  Get Exclusive Deals  Offers/input_SearchBar'), 
    30)

'Search for The Simon and Garfunkel Story '
WebUI.setText(findTestObject('Page_Book London Theater Tickets  Get Exclusive Deals  Offers/input_SearchBar'), ShowName)

WebUI.sendKeys(findTestObject('Page_Book London Theater Tickets  Get Exclusive Deals  Offers/input_SearchBar'), Keys.chord(
        Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Book London Theater Tickets  Get Exclusive Deals  Offers/h1_The Simon and Garfunkel Story'), 
    30)

WebUI.waitForElementVisible(findTestObject('Page_Book London Theater Tickets  Get Exclusive Deals  Offers/div_Book Now'), 
    30)

WebUI.waitForElementClickable(findTestObject('Page_Book London Theater Tickets  Get Exclusive Deals  Offers/div_Book Now'), 
    30)

WebUI.click(findTestObject('Page_Book London Theater Tickets  Get Exclusive Deals  Offers/div_Book Now'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementPresent(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/div_DateSelection'), 
    30)

WebUI.scrollToElement(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/div_DateSelection'), 
    30)

'Pick a date'
WebUI.click(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/div_DateSelection'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForElementNotPresent(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/div_SpinningLoader'), 
    30)

WebUI.switchToFrame(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/iframe_seatBooking'), 
    30)

'Pick a seat'
WebUI.click(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/circle_SeatSelection', 
        [('x') : 1]), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToDefaultContent()

WebUI.delay(3)

WebUI.click(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/span_SeatSelectionNextButton'), 
    FailureHandling.STOP_ON_FAILURE)

'Fill form details ( CC details are junk )'
WebUI.waitForElementVisible(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/input_First Name'), 
    30)

WebUI.setText(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/input_First Name'), 
    FirstName)

WebUI.setText(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/input_Last Name'), 
    LastName)

WebUI.setText(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/input_Email'), 
    Email)

WebUI.setText(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/input_Confirm Email'), 
    Email)

WebUI.setText(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/input_Phone'), 
    PhoneNumber)

WebUI.scrollToElement(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/input_Card Number'), 
    10)

WebUI.setText(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/input_Card Number'), 
    CCNumber)

WebUI.setText(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/input_Card Number_Expiry (MMYY)'), 
    CCExpiry)

WebUI.setText(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/input_CVV'), CVV)

WebUI.setText(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/input_Card Holder Name'), 
    CardHolderName)

WebUI.delay(2)

'Click on next'
WebUI.click(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/span_COMPLETE MY BOOKING'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/span_Invalid card details'), 
    30)

WebUI.verifyElementVisible(findTestObject('Page_The Simon and Garfunkel Story London  Best Prices on West End Tickets/span_Invalid card details'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.delay(1)

