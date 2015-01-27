package tartifouette.tb.chifoumi;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by thomas on 27/01/2015.
 */
public abstract class AbstractButtonListener implements View.OnTouchListener, View.OnClickListener {

    protected final MainActivity activity;

    public AbstractButtonListener(MainActivity activity) {
        this.activity = activity;
    }


    @Override
    public void onClick(View v) {
        play();
    }


    private void play() {
        TextView view = (TextView) activity.findViewById(R.id.playerChoice);
        view.setText(getUserPlay());
        Choice iaChoice = IA.getChoice();
        Choice playerChoice = getPlayerChoice();
        view = (TextView) activity.findViewById(R.id.iaResult);
        view.setText(iaChoice.name());

        GameResult result = GameRule.getGameResult(playerChoice, iaChoice);
        view = (TextView) activity.findViewById(R.id.gameResult);
        view.setText(activity.getString(result.getBundleCode()));

        GameStats.updateView(activity);

    }

    protected abstract String getUserPlay();

    protected abstract Choice getPlayerChoice();

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_UP){
            play();
        }
        return true;

    }
}
