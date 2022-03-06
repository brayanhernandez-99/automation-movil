package co.com.android.certification.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    public static final Target TXT_USER_NAME = Target.the("Name user text field").located(By.id("usernameTextField"));
    public static final Target TXT_PASSWORD = Target.the("Password user text field").located(By.id("passwordTextField"));
    public static final Target BTN_LOGIN = Target.the("Button login").located(By.id("loginButton"));
}