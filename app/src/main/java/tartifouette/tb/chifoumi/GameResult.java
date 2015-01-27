package tartifouette.tb.chifoumi;

/**
 * Created by thomas on 27/01/2015.
 */
public enum GameResult {

    PLAYER_WIN(R.string.PLAYER_WIN), IA_WIN(R.string.IA_WIN), DRAW(R.string.DRAW);

    private final int bundleCode;

    GameResult(int bundleCode) {
        this.bundleCode = bundleCode;
    }

    public int getBundleCode() {
        return bundleCode;
    }
}
