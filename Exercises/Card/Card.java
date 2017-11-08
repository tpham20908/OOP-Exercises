public class Card {
  // class variables
  public static final String[] RANKS = {
      null, "Ace", "2", "3", "4", "5", "6", "7",
      "8", "9", "10", "Jack", "Queen", "King"
  };
  public static final String[] SUITS = {
      "Clubs", "Diamonds", "Hearts", "Spades"
  };

  // instance variables
  private int rank;
  private int suit;
  // constructor
  public Card(int rank, int suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public String toString() {
    return RANKS[this.rank] + " of " + SUITS[this.suit];
  }

  public boolean equals(Card that) {
    return this.rank == that.rank && this.suit == that.suit;
  }
}