/open RPS.java

RPS r = new RPS();

int win = 0;
int draw = 0;
int loss = 0;

int tests = 1000000000; // Modify this to change the number of tests being run.

for (int i = 0; i < tests; i++) {
  String result = r.play(r.PAPER);

  if (result == "You win!") {
    win++;
  } else if (result == "Computer wins!") {
    loss++;
  } else {
    draw++;
  }
}

System.out.println("Wins: " + win + "\nLosses: " + loss + "\nDraws: " + draw);
