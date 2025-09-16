public class RandCard {
    
    public static void main(String[] args) {
        int bound = 52;
        int randInt = (int) (Math.random() * bound);

        String suit;
        suit = switch (randInt / 13) {
            case 0 -> "Spades";
            case 1 -> "Hearts";
            case 2 -> "Diamonds";
            case 3 -> "Clubs";
            default -> "SUIT ERROR";
        };

        String rank;
        rank = switch (randInt % 13) {
            case 12 -> "King";
            case 11 -> "Queen";
            case 10 -> "Jack";
            default -> Integer.toString((randInt % 13) + 1);
        };

        System.out.println("The card is " + rank +  " of " + suit);
    }

    
}
