public class Card{

	public enum Suit {
		Club, Diamond,Heart,Spade}

	private Suit thissuit; //Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
	private int rank; //1~13
	public Card(Suit suit1,int r){
		
		switch(suit1){
		case Club:
			thissuit=Suit.Club;
		break;	
		case Diamond :
			thissuit=Suit.Diamond;
		break;	
		case Heart:
			thissuit=Suit.Heart;
		break;	
		case Spade :
			thissuit=Suit.Spade;
		break;
		}
		
		rank=r;
	}	
	//TODO: 1. Please implement the printCard method (20 points, 10 for suit, 10 for rank)
	public void printCard(Suit gg,int inin){
		//Hint: print (System.out.println) card as suit,rank, for example: print 1,1 as Clubs Ace
		switch(gg){
		case Club:
			System.out.print("<"+gg.toString()+"   ");
		break;	
		case Diamond :
			System.out.print("<"+gg.toString());
		break;	
		case Heart :
			System.out.print("<"+gg.toString()+"  ");
		break;	
		case Spade :
			System.out.print("<"+gg.toString()+"  ");
		break;
			}
		
			System.out.print(inin+"> ");
			while(inin==13) {
			System.out.println("");
			break;
			}

			
	}
	public Suit getSuit(){
		return thissuit;
	}
	public int getRank(){
		return rank;
	}
}