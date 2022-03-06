package co.com.android.certification.app.integrations;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Scroll implements Interaction {
    private int x;
    private int y;
    private int z;

    public static Scroll to() {
        return Tasks.instrumented(Scroll.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        x = BrowseTheWeb.as(actor).getDriver().manage().window().getSize().width / 2;
        y = BrowseTheWeb.as(actor).getDriver().manage().window().getSize().height / 2;
        z = y / 2;
        new TouchAction<>((PerformsTouchActions) BrowseTheWeb.as(actor).getDriver()).press(PointOption.point(x, y)).moveTo(PointOption.point(x, z)).release().perform();
    }
}