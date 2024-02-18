public abstract class Game {

	public Game() {
	}

	protected abstract void initializeGame();

	protected abstract void playingGame();

	protected abstract void ShowResult();

	public final void play() {
		initializeGame();
		playingGame();
		ShowResult();
	}
}
