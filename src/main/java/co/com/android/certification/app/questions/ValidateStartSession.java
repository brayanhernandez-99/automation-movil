package co.com.android.certification.app.questions;

import co.com.android.certification.app.userinterfaces.Account;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateStartSession implements Question {

    public static ValidateStartSession validate() {
        return new ValidateStartSession();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Account.BTN_LOGOUT.resolveFor(actor).isVisible();
    }
}