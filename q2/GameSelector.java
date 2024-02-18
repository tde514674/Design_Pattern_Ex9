public class GameSelector {
    private Game game;

    public GameSelector(Game game) {
        this.game = game;
    }

    public final void play() {
        this.game.initializeGame();
        this.game.playingGame();
        this.game.ShowResult();
    }

}
