import java.util.Random;

public class RPS {
  public static GameNode ROCK, PAPER, SCISSORS;
  private final Random r;

  public RPS() {
    ROCK = new GameNode(SCISSORS);
    PAPER = new GameNode(ROCK);
    SCISSORS = new GameNode(PAPER);
    r = new Random();
  }

  private static class GameNode {
    private final GameNode next;
    private GameNode(GameNode next) {
      this.next = next;
    }
  }

  public String play(GameNode g) {
    GameNode com = new GameNode[]{ROCK, PAPER, SCISSORS}[r.nextInt(3)];
    return com == g ? "Tie!" : com.next == g ? "Computer wins!" : "You win!";
  }
}