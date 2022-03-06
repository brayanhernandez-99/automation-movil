package co.com.android.certification.app.tasks;

import co.com.android.certification.app.models.User;
import co.com.android.certification.app.userinterfaces.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class InsertCredentials implements Task {
    private String username;
    private String password;

    public InsertCredentials(List<User> user) {
        this.username = user.get(0).getUsername();
        this.password = user.get(0).getPassword();
    }

    public static InsertCredentials login(List<User> user) {
        return Tasks.instrumented(InsertCredentials.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(Login.TXT_USER_NAME),
                Enter.theValue(password).into(Login.TXT_PASSWORD),
                Click.on(Login.BTN_LOGIN)
        );
    }
}