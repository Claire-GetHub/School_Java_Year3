public class RandCard {
    
    public static void main(String[] args) {
        int bound = 52;
        int randInt = (int) (Math.random() * bound);

        String suit;
        switch(randInt / 13) {
            case 0 -> {
                suit = "Spades";
            }
            case 1 -> {
                suit = "Hearts";
            }
            case 2 -> {
                suit = "Diamonds";
            }
            case 3 -> {
                suit = "Clubs";
            }
            default -> {
                suit = "SUIT ERROR";
            }
        }

        String rank;
        switch(randInt % 13) {
            case 12 -> {
                rank = "King";
            }
            case 11 -> {
                rank = "Queen";
            }
            case 10 -> {
                rank = "Jack";
            }
            default -> {
                rank = Integer.toString((randInt % 13) + 1);
            }
        }

        System.out.println("The card is " + rank +  " of " + suit);
    }

    
}
