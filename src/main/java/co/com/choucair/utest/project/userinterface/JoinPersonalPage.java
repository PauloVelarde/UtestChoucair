package co.com.choucair.utest.project.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinPersonalPage {

    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to register").located(By.xpath("//div[@class='nav navbar-nav'//@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_FIRST_NAME = Target.the("Write First Name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Write Last Name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Write Email").located(By.id("email"));
    public static final Target INPUT_BIR_MONTH = Target.the("Write date of birth month").located(By.id("birthMonth"));
    public static final Target INPUT_BIR_DAY = Target.the("Write date of birth day").located(By.id("birthDay"));
    public static final Target INPUT_BIR_YEAR = Target.the("Write date of birth year").located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGES = Target.the("Write your languages").located(By.id("languages"));
    public static final Target NEXT_LOCATION_BUTTON = Target.the("Skip of Page ").located(By.xpath("//div[@class='form-group col-xs-12 text-right'//@class='btn btn-blue']"));
}
