package tartifouette.tb.chifoumi;

import android.widget.TextView;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by thomas on 27/01/2015.
 */
public class GameStats {

    public static final AtomicInteger playerWins = new AtomicInteger(0);
    public static final AtomicInteger iaWins = new AtomicInteger(0);
    public static final AtomicInteger draws = new AtomicInteger(0);

    public static void updateView(MainActivity activity) {
        TextView view = (TextView) activity.findViewById(R.id.nbVictoires);
        view.setText(String.valueOf(GameStats.playerWins.get()));

        view = (TextView) activity.findViewById(R.id.nbMatchNuls);
        view.setText(String.valueOf(GameStats.draws.get()));

        view = (TextView) activity.findViewById(R.id.nbDefaites);
        view.setText(String.valueOf(GameStats.iaWins.get()));
    }

    public static void reset() {
        iaWins.set(0);
        playerWins.set(0);
        draws.set(0);
    }
}
