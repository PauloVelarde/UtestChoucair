package co.com.choucair.utest.project.stepdefinitions;


import co.com.choucair.utest.project.model.ChoucairUtestData;
import co.com.choucair.utest.project.tasks.Join;
import co.com.choucair.utest.project.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairUtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than paul wants create an new user$")
    public void thanPaulWantsCreateAnNewUser(List<ChoucairUtestData> choucairUtestData) throws Exception {
        OnStage.theActorCalled("paul").wasAbleTo(OpenUp.thePage(),(Join.onThePage(choucairUtestData.get(0).getStrFirstName(),choucairUtestData.get(0).getStrLastName(),choucairUtestData.get(0).getStrEmail(),choucairUtestData.get(0).getStrMonth(),choucairUtestData.get(0).getStrDay(),choucairUtestData.get(0).getStrYear(),choucairUtestData.get(0).getStrLanguasges())));
    }


    @When("^he enter on the Utest platform$")
    public void heEnterOnTheUtestPlatform(List<ChoucairUtestData> choucairUtestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Join.information(choucairUtestData.get(0).getStrCity(),choucairUtestData.get(0).getStrPostal(),choucairUtestData.get(0).getStrCountry(),choucairUtestData.get(0).getStrComputer(),choucairUtestData.get(0).getStrVersion(),choucairUtestData.get(0).getStrLanguage(),choucairUtestData.get(0).getStrMobile(),choucairUtestData.get(0).getStrModel(),choucairUtestData.get(0).getStrOperatingSystem(),choucairUtestData.get(0).getStrCreatePassword(),choucairUtestData.get(0).getStrPassword()));
    }

    @Then("^he register an new user$")
    public void heRegisterAnNewUser(List<ChoucairUtestData> choucairUtestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(choucairUtestData.get(0).getStrPassword())));
    }
}
