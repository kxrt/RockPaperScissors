import java.util.Random;

public class RPS {
  public GameNode ROCK, PAPER, SCISSORS;
  private final Random r;

  public RPS(int seed) {
    ROCK = new GameNode(SCISSORS);
    PAPER = new GameNode(ROCK);
    SCISSORS = new GameNode(PAPER);
    r = new Random(seed);
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