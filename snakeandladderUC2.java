package snakeandladder;

public class snakeandladderUC2 {
	public static void main(String[] args){
		int start = 0;
		System.out.println("Starting position of player is: " + start);
		
		double ranvalue = Math.random();
		System.out.println("Random Value : "+ ranvalue);
	
		int roll  = (int) (Math.floor(ranvalue * 10) % 6 + 1);
		System.out.println(roll);
	}
}


