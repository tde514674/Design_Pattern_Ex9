public class FootballGame extends Game {

	public FootballGame() {
		super();
	}

	@Override
	protected void initializeGame() {
		System.out.println("Initalizing football game...");
	}

	@Override
	protected void playingGame() {
		System.out.println("Playing football game...");
	}

	@Override
	protected void ShowResult() {
		System.out.println("Showing the results for the football game...");
	}
}
