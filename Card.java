public class Card {
    private int suit;
    private int rank;

    public Card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }

    public Card(){
        this(3,13);
        // Same as...
        // this.suit = 3;
        // this.rank = 13;


    }
    public void setSuit(int suit){
        this.suit = suit;
    }

    public void setRank(int rank){
        this.rank = rank;
    }

    public int getSuit(){
        return suit;
    }

    public int getRank(){
        return rank;
    }
    
    
}
