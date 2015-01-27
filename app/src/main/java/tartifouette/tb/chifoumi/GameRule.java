package tartifouette.tb.chifoumi;

/**
 * Created by thomas on 27/01/2015.
 */
public enum GameRule {

    RULE1(Choice.Papier, Choice.Pierre),
    RULE2(Choice.Pierre, Choice.Ciseau),
    RULE3(Choice.Ciseau, Choice.Papier);


    private final Choice winner;
    private final Choice looser;

    GameRule(Choice winner, Choice looser) {
        this.winner = winner;
        this.looser = looser;
    }


    public static GameResult getGameResult(Choice playerChoice, Choice iaChoice) {
        GameResult result = GameResult.DRAW;
        for (GameRule rule : GameRule.values()) {
            if (rule.winner == playerChoice && rule.looser == iaChoice) {
                result = GameResult.PLAYER_WIN;
                GameStats.playerWins.incrementAndGet();
            } else if (rule.winner == iaChoice && rule.looser == playerChoice) {
                result = GameResult.IA_WIN;
                GameStats.iaWins.incrementAndGet();
            }
        }
        if(result == GameResult.DRAW){
            GameStats.draws.incrementAndGet();
        }
        return result;
    }
}
