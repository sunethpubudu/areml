import java.util.ArrayList;
import java.util.List;

/**
 * Created by suneth on 7/13/2017.
 */
public class TestAREMLlistener extends AREMLBaseListener {
    private final String setText = "\033[31m";
    private final String setPlainText = "\033[0m";
    @Override
    public void enterConnectionType(AREMLParser.ConnectionTypeContext ctx) {
        System.out.print(setText+"<Connection type>"+setPlainText + ctx.getText() + " ");
    }

    @Override
    public void enterPerson(AREMLParser.PersonContext ctx) {
        System.out.print(setText + "<Person>"+setPlainText+ctx.getText()+" ");
    }

    @Override
    public void enterAction(AREMLParser.ActionContext ctx) {
        System.out.print(setText + "<Action>"+setPlainText + ctx.getText() + " ");
    }

    @Override public void enterObject(AREMLParser.ObjectContext ctx) {
        System.out.print(setText + "<Object>" +setPlainText+ ctx.getText() + " ");
    }

    @Override public void enterLastLocation(AREMLParser.LastLocationContext ctx) {
        System.out.print(setText + "<Location>" +setPlainText + ctx.getText() + " ");
    }

}
