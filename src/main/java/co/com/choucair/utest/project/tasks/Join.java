package co.com.choucair.utest.project.tasks;

import co.com.choucair.utest.project.userinterface.JoinAddressPage;
import co.com.choucair.utest.project.userinterface.JoinCompletePage;
import co.com.choucair.utest.project.userinterface.JoinDevicesPage;
import co.com.choucair.utest.project.userinterface.JoinPersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Join implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strLanguasges;
    private String strCity;
    private String strPostal;
    private String strCountry;
    private String strComputer;
    private String strVersion;
    private String strLanguage;
    private String strMobile;
    private String strModel;
    private String strOperatingSystem;
    private String strCreatePassword;
    private String strPassword;

    public Join(String strFirstName ,String strLastName,String strEmail,String strMonth,String strDay,String strYear,String strLanguasges,String strCity,String strPostal,String strCountry,String strComputer,String strVersion, String strLanguage, String strMobile, String strModel ,String strOperatingSystem, String strCreatePassword,String strPassword) {
        this.strFirstName = strFirstName;
        this.strLastName =strLastName;
        this.strEmail =strEmail;
        this.strMonth =strMonth;
        this.strDay =strDay;
        this.strYear=strYear;
        this.strLanguasges = strLanguasges;
        this.strCity = strCity;
        this.strPostal =strPostal;
        this.strCountry=strCountry;
        this.strComputer=strComputer;
        this.strVersion=strVersion;
        this.strLanguage=strLanguage;
        this.strMobile=strMobile;
        this.strModel=strModel;
        this.strOperatingSystem=strOperatingSystem;
        this.strCreatePassword=strCreatePassword;
        this.strPassword=strPassword;
    }

    public static Join onThePage (String strFirstName ,String strLastName,String strEmail,String strMonth,String strDay,String strYear,String strLanguasges){
        return Tasks.instrumented(Join.class,strFirstName ,strLastName,strEmail,strMonth,strDay,strYear,strLanguasges);
    }

    public static Join information (String strCity,String strPostal,String strCountry,String strComputer,String strVersion, String strLanguage, String strMobile, String strModel ,String strOperatingSystem, String strCreatePassword,String strPassword) {
        return Tasks.instrumented(Register.class, strCity, strPostal, strCountry, strComputer, strVersion, strLanguage, strMobile, strModel, strOperatingSystem, strCreatePassword, strPassword);
    }

        @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JoinPersonalPage.JOIN_BUTTON),
                Enter.theValue(strFirstName).into(JoinPersonalPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(JoinPersonalPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(JoinPersonalPage.INPUT_EMAIL),
                Enter.theValue(strMonth).into(JoinPersonalPage.INPUT_BIR_MONTH),
                Enter.theValue(strDay).into(JoinPersonalPage.INPUT_BIR_DAY),
                Enter.theValue(strYear).into(JoinPersonalPage.INPUT_BIR_YEAR),
                Enter.theValue(strLanguasges).into(JoinPersonalPage.INPUT_LANGUAGES),
                Click.on(JoinPersonalPage.NEXT_LOCATION_BUTTON),
                Enter.theValue(strCity).into(JoinAddressPage.INPUT_CITY),
                Enter.theValue(strPostal).into(JoinAddressPage.INPUT_POSTAL),
                Enter.theValue(strCountry).into(JoinAddressPage.INPUT_COUNTRY),
                Click.on(JoinAddressPage.NEXT_DEVICES_BUTTON),
                Enter.theValue(strComputer).into(JoinDevicesPage.INPUT_COMPUTER),
                Enter.theValue(strVersion).into(JoinDevicesPage.INPUT_VERSION),
                Enter.theValue(strLanguage).into(JoinDevicesPage.INPUT_LANGUAGE),
                Enter.theValue(strMobile).into(JoinDevicesPage.INPUT_MOBILE),
                Enter.theValue(strModel).into(JoinDevicesPage.INPUT_MODEL),
                Enter.theValue(strOperatingSystem).into(JoinDevicesPage.INPUT_OPERATING_SYSTEM),
                Click.on(JoinDevicesPage.NEXT_STEP_BUTTON),
                Enter.theValue(strCreatePassword).into(JoinCompletePage.INPUT_CREATE_PASSWORD),
                Enter.theValue(strPassword).into(JoinCompletePage.INPUT_CONFIRM_PASSWORD),
                Click.on(JoinCompletePage.SETUP_BUTTON)


        );

    }
}
