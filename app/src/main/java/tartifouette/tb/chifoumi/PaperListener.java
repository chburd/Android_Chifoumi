package tartifouette.tb.chifoumi;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by thomas on 26/01/2015.
 */
public class PaperListener extends AbstractButtonListener {


    public PaperListener(MainActivity activity) {
        super(activity);
    }

    @Override
    protected String getUserPlay() {
        return activity.getString(R.string.Papier);
    }

    @Override
    protected Choice getPlayerChoice() {
        return Choice.Papier;
    }


}

