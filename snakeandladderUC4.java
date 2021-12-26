package snakeandladder;

public class snakeandladderUC4 {
	  public static final int NO_PLAY = 0;
	   public static final int LADDER = 1;
	   public static final int SNAKE = 2;
	   public static final int START = 0;


	   public static void main(String[] args){
	      int position = 0;
	      System.out.println("Starting positionition of player is: " + START);
	      while(position <= 100){
	      int roll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
	      System.out.println("Number on rolled dice is : " +roll);
	      int condition = (int) (Math.floor(Math.random() * 10) % 3);
	      System.out.println("condition: " +condition);
	      switch (condition){
	            case NO_PLAY:
	                  System.out.println("New No Play position is: " + position);
	                  break;
	            case LADDER:
	                  position = position + roll;
	                  System.out.println("New Ladder position is: " + position);
	                  break;
	            case SNAKE:
	                  position = position - roll;
	                  if (position >= 0 )
	                  System.out.println("New Snake position is: " + position);
	                  else
	                  position = 0;
	                  System.out.println("New Snake position is: " + position);
	                  break;
	            default:
	                  System.out.println("Default");
	                  break;
	         }
	      }
	      System.out.println();
	      if (position >= 100)
	      System.out.println("-------------------");
	      System.out.println("    PLAYER WON");
	      System.out.println("-------------------");
	      }
}
