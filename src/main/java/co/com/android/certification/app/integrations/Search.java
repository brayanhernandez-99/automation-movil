package co.com.android.certification.app.integrations;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Search implements Interaction {

    private Target target;

    public Search(Target target) {
        this.target = target;
    }

    public static Search to(Target target) {
        return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < 10; i++) {
            if (target.resolveFor(actor).isVisible()) {
                actor.attemptsTo(
                        Click.on(target)
                );
                break;
            } else {
                actor.attemptsTo(
                        Scroll.to()
                );
            }
        }
    }
}