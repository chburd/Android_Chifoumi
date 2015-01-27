package tartifouette.tb.chifoumi;

import android.view.MotionEvent;
import android.view.View;

/**
 * Created by thomas on 27/01/2015.
 */
public class ResetListener implements View.OnClickListener, View.OnTouchListener {
    private final MainActivity activity;

    public ResetListener(MainActivity mainActivity) {
        this.activity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        GameStats.reset();
        GameStats.updateView(activity);
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        GameStats.reset();
        GameStats.updateView(activity);
        return true;
    }
}
