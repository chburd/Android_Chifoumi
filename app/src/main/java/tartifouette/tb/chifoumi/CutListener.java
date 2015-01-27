package tartifouette.tb.chifoumi;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by thomas on 26/01/2015.
 */
public class CutListener extends AbstractButtonListener {


    public CutListener(MainActivity activity) {
        super(activity);
    }

    @Override
    protected String getUserPlay() {
        return activity.getString(R.string.Ciseau);
    }

    @Override
    protected Choice getPlayerChoice() {
        return Choice.Ciseau;
    }
}