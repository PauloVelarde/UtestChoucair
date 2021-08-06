package co.com.choucair.utest.project.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinAddressPage {

    public static final Target INPUT_CITY = Target.the("Write your city ").located(By.id("city"));
    public static final Target INPUT_POSTAL = Target.the("Write postal code").located(By.id("zip"));
    public static final Target INPUT_COUNTRY= Target.the("Write your country").located(By.xpath("//div[@ class='ui-select'//@class='ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid ng-valid-required auto-detected']"));
    public static final Target BACK_BUTTON= Target.the("return to previous page").located(By.xpath("//div[@class='btn btn-grey btn-rounded pull-left]"));
    public static final Target NEXT_DEVICES_BUTTON = Target.the("skip to next page").located(By.xpath("//div [class='pull-right next-step'//class='btn btn-blue pull-right']"));
}
