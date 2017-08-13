package com.stepdefs;

import com.methods.page.testpage;
import com.utils.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;

import static com.utils.opendriver.driver;
import static org.junit.Assert.assertEquals;

public class MyStepdefs_sd extends BasePage{

    private testpage testpage = PageFactory.initElements(driver,testpage.class);

    @Given("^I entered url$")
    public void iEnteredUrl() {
        openurl();
    }

    @And("^I entered journey from \"([^\"]*)\"$")
    public void i_entered(String from) {
        testpage.clickFromField(from);
    }

    @And("^I entered journey to \"([^\"]*)\"$")
    public void iEnteredTo(String to) {
        testpage.clickToField(to);
   }

    @When("^I clicked plan my journey button$")
    public void i_clicked_plan_my_journey() {
        testpage.planMyJourney();
    }

    @And("^I should see expected result \"([^\"]*)\"$")
    public void iCheckedAcceptedResult(String Expected) {
        testpage.checkedAcceptedResult(Expected);
    }

    @Then("^I should see header text journey from \"([^\"]*)\"$")
    public void iShouldSeeHeaderTextJourneyFrom(String ResultFrom) {
        testpage.seeHeaderTextJourneyFrom(ResultFrom);
    }

    @And("^I should see header text journey to \"([^\"]*)\"$")
    public void iShouldSeeHeaderTextJourneyTo(String ResultTo) {
        testpage.seeHeaderTextJourneyTo(ResultTo); }

    @And("^I should see header text Travel preferences & accessibility:$")
    public void iShouldSeeHeaderTextTravelPreferencesAndAccessibility(){
        testpage.travelPreferencesAndAccessibility();
    }

    @And("^I clicked edit journey hyperlink$")
    public void iClickedEditJourneyHyperlink() {
        testpage.eidtJourney();
    }

    @And("^I should switch journey plan$")
    public void iShouldSwitchJourneyPlan(){
        testpage.selectSwitchButton();
    }
    @And(("^I should select option Step-free to platform only$"))

    public void iShouldSelectOptionStepFreeToPlatformOnly() {
        testpage.accessibilityPreference_3();
        System.out.println("Stepfree");
//        boolean displayStatus =driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div[3]/div[2]/form/div/div[3]/div/fieldset/ul[2]/li[2]/fieldset/div/div/div[1]/label[4]")).isDisplayed();
//        driver.findElement(By.xpath("//*[@id=\"more-journey-options\"]/div/fieldset/ul[2]/li[2]/fieldset/div/div/div[1]/label[3]")).click();

//        System.out.println("Finish Status");

//        List<WebElement> radio= driver.findElements(By.xpath("//*[@id=\"more-journey-options\"]/div/fieldset/ul[2]/li[2]/fieldset"));
//          for (int i=0;i<radio.size();i++)
//          {
//              WebElement local_radio=radio.get(i);
//              String value=local_radio.getAttribute("value");
//              System.out.println("Value from radio button are ====>"+value);
//          }
    }

    @And("^I clicked Edit preferences and accessibility$")
    public void iClickedEditPreferencesAndAccessbility() {
        driver.findElement(By.xpath(".//*[@id='plan-a-journey']/fieldset/div[3]/a")).click();
    }
    @And("I should see the current url$")
    public void iShouldSeeTheCurrenturl(){
        String url = driver.getCurrentUrl();
        System.out.println(url);

        driver.quit();
    }
}


//2nd type
// package com.methods.page;
//import com.utils.BasePage;
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.PageFactory;
//import static com.utils.opendriver.driver;
//
//public class tfl_page  extends BasePage{
//
//    public testpage tflPage = PageFactory.initElements(driver,testpage.class);
//
//    public void enterFromField(String from){
//           tflPage.clickFromField(from);
//    }
//    public void enterToField(String to){
//       driver.findElement(By.id("InputTo")).sendKeys(to);
//    }
//    public void clickPlanMyJourney(){
//        driver.findElement(By.xpath("//*[@id=\"plan-a-journey\"]/fieldset/input")).click();
//    }
//}
//