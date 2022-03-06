package co.com.android.certification.app.tasks;

import co.com.android.certification.app.integrations.Search;
import co.com.android.certification.app.models.Payment;
import co.com.android.certification.app.userinterfaces.Account;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class InsertPayment implements Task {

    private String phone;
    private String name;
    private String amount;
    private String country;

    public InsertPayment(List<Payment> payment) {
        this.phone = payment.get(0).getPhone();
        this.name = payment.get(0).getName();
        this.amount = payment.get(0).getAmount();
        this.country = payment.get(0).getCountry();
    }

    public static InsertPayment payment(List<Payment> payment) {
        return Tasks.instrumented(InsertPayment.class, payment);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Account.BTN_MAKE_PAYMENT),
                Enter.theValue(phone).into(co.com.android.certification.app.userinterfaces.Payment.TXT_PHONE),
                Enter.theValue(name).into(co.com.android.certification.app.userinterfaces.Payment.TXT_NAME),
                Enter.theValue(amount).into(co.com.android.certification.app.userinterfaces.Payment.SLC_AMOUNT),
                Click.on(co.com.android.certification.app.userinterfaces.Payment.BTN_COUNTRY),
                new Search(co.com.android.certification.app.userinterfaces.Payment.SLC_COUNTRY.of(country))
        );
    }
}