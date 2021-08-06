package co.com.choucair.utest.project.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinCompletePage {

    public static final Target INPUT_CREATE_PASSWORD = Target.the("create password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("confirm password").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_OPTIONAL = Target.the("accept informed").located(By.name("newsletterOptIn"));
    public static final Target CHECBOX_CONDUCT = Target.the("accept conditions").located(By.id("termOfUse"));
    public static final Target CHECBOX_PRIVACY = Target.the("accept conditions")located(By.id("privacySetting"));
    public static final Target BACK_BUTTON= Target.the("return to previous page").located(By.xpath("//div[@class='btn btn-grey btn-rounded pull-left]"));
    public static final Target SETUP_BUTTON= Target.the("Register new user").located(By.xpath("//div[@class='pull-right next-step'//@class='btn btn-blue pull-right']"))
}
