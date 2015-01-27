package tartifouette.tb.chifoumi;

/**
 * Created by thomas on 26/01/2015.
 */
public class IA {

    public static Choice getChoice(){
        Choice[] range = Choice.values();
        int choiceNumber = (int) (Math.random()*range.length);

        return range[choiceNumber];
    }
}
