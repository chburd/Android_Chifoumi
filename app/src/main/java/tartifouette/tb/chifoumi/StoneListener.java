package tartifouette.tb.chifoumi;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by thomas on 26/01/2015.
 */
public class StoneListener extends AbstractButtonListener {


    public StoneListener(MainActivity activity) {
        super(activity);
    }

    @Override
    protected String getUserPlay() {
        return activity.getString(R.string.Pierre);
    }

    @Override
    protected Choice getPlayerChoice() {
        return Choice.Pierre;
    }
}
