package com.methods.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class testpage {

    @FindBy(css = "input[id='InputFrom']")
    WebElement enterFromData;
    public  void clickFromField(String input) {
        enterFromData.sendKeys(input,Keys.ESCAPE);
    }
    @FindBy(css ="input[id='InputTo']")
    WebElement enterToData;
    public void clickToField(String input) {
        enterToData.sendKeys(input, Keys.ESCAPE);
    }

    @FindBy(css ="input[class='primary-button plan-journey-button'][type='submit']")
    WebElement planMyJourney;
    public void planMyJourney(){
        planMyJourney.click();
    }

    @FindBy(css ="span[class='hero-headline']")
    WebElement checkedAcceptedResult;
    public void checkedAcceptedResult (String Expected) {
        String actualResult= checkedAcceptedResult.getText();
        System.out.println("Expected Result------>"+Expected);
        System.out.println("Actual Result----->"+actualResult);
        assertEquals(Expected,actualResult);
    }



    
    @FindBy(xpath = ".//*[@id='plan-a-journey']/div[1]/div[1]/div[1]/strong")
    WebElement seeHeaderTextJourneyFrom;
    public void seeHeaderTextJourneyFrom (String ResultFrom){
        String headerTextFrom = seeHeaderTextJourneyFrom.getText();
        System.out.println("Expected Result From Header Text------>"+ResultFrom);
        System.out.println("Actual Result From Header Text----->"+headerTextFrom);
        assertEquals(ResultFrom,headerTextFrom);
    }
    @FindBy (xpath = ".//*[@id='plan-a-journey']/div[1]/div[1]/div[2]/strong")
    WebElement seeHeaderTextJourneyTo;
    public void seeHeaderTextJourneyTo(String ResultTo){
        String headerTextTo = seeHeaderTextJourneyTo.getText();
        System.out.println("Expected Result To From Header Text----->"+ResultTo);
        System.out.println("Actual Result To From Header Text----->"+headerTextTo);
    }
    @FindBy(css =".edit-journey>span")
    WebElement editJourney;
    public void eidtJourney(){
        editJourney.click();
    }

    @FindBy(css=".switch-button.hide-text")
    WebElement selectSwitchButton;
    public void selectSwitchButton(){
        selectSwitchButton.click();
    }

    @FindBy(xpath = "//*[@id=\"more-journey-options\"]/div/fieldset/ul[2]/li[2]/fieldset/div/div/div[1]/label[3]")
    WebElement accessibilityPreference_3;
    public void accessibilityPreference_3(){
       accessibilityPreference_3.click();
    }

    @FindBy(xpath = ".//*[@id='plan-a-journey']/div[3]/div[2]/div/div")
    WebElement travelPreferencesAndAccessibility;
    public void travelPreferencesAndAccessibility(){
        String travelPreference = travelPreferencesAndAccessibility.getText();
        System.out.println("Travel Preference----->"+travelPreference);
    }


}

