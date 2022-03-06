package co.com.android.certification.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Account {
    public static final Target BTN_MAKE_PAYMENT = Target.the("Button Make Payment").located(By.id("makePaymentButton"));
    public static final Target LBL_BALANCE = Target.the("Text balance field").located(By.id(""));
    public static final Target BTN_LOGOUT = Target.the("Button logout").located(By.id("logoutButton"));
}