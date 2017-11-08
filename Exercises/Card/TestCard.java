public class TestCard {
  public static void main(String[] args) {
    Card[] cards = new Card[52];
    int index = 0;
    for (int suit = 0; suit <=3; suit++) {
      for (int rank = 1; rank <= 13; rank++) {
        cards[index] = new Card(rank, suit);
        index++;
      }
    }

    printDeck(cards);

    int found = search(cards, new Card(8, 2));
    System.out.println(found);
  }

  public static void printDeck(Card[] cards) {
    for (int i = 0; i < cards.length; i++) {
      System.out.println(cards[i]);
    }
  }

  public static int search(Card[] cards, Card target) {
    for (int i = 0; i < cards.length; i++) {
      if (cards[i].equals(target))
        return i;
    }
    return -1;
  }
}