package co.com.android.certification.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Payment {
    public static final Target TXT_PHONE = Target.the("Phone user text field").located(By.id("phoneTextField"));
    public static final Target TXT_NAME = Target.the("Name user text field").located(By.id("nameTextField"));
    public static final Target SLC_AMOUNT = Target.the("Select amount field").located(By.id("amount"));
    public static final Target BTN_COUNTRY = Target.the("Country button").located(By.id("countryButton"));
    public static final Target SLC_COUNTRY = Target.the("Select country").locatedBy("//android.widget.TextView[contains(@text,'{0}')]");
    public static final Target BTN_SEND_PAYMENT = Target.the("Button Send Payment").located(By.id("sendPaymentButton"));
    public static final Target BTN_CANCEL = Target.the("Button cancel Send Payment").located(By.id("cancelButton"));
}