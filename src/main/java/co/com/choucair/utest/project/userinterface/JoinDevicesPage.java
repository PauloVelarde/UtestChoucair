package co.com.choucair.utest.project.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinDevicesPage {

    public static final Target INPUT_COMPUTER = Target.the("Write Operating system computer ").located(By.name("osId"));
    public static final Target INPUT_VERSION = Target.the("Wrirte Operating system version").located(By.name("osVersionId"));
    public static final Target INPUT_LANGUAGE = Target.the("Write language what is it in computer").located(By.name("osLanguageId"));
    public static final Target INPUT_MOBILE = Target.the("Write phone brand").located(By.name("handsetMakerId"));
    public static final Target INPUT_MODEL = Target.the("Write phone model").located(By.name("handsetModelId"));
    public static final Target INPUT_OPERATING_SYSTEM = Target.the("Write Phone Operating System").located(By.name("handsetOSId"));
    public static final Target BACK_DEVICES_BUTTON= Target.the("return to previous page").located(By.xpath("div[@class='btn btn-grey btn-rounded pull-left]\""));
    public static final Target NEXT_STEP_BUTTON = Target.the("skip to next page").located(By.xpath("//div [class='pull-right next-step'//class='btn btn-blue pull-right']"));
}
