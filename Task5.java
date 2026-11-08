package test;

public class Task5 {
	public static void main(String[] args) {
		int highest = Integer.parseInt(args[0]);
		boolean areAllEqual = true;
		if(args.length != 3) {
			System.out.println("Please input 3 numbers\nPlease rerun");
			return;
		}
		for(int x = 1; x < 3; x++ ){
			int it = Integer.parseInt(args[x]);
			int comp = Integer.compare(highest, it);
			if( comp > 0) {
				areAllEqual = false;
			}
			else if( comp < 0 ) {
				areAllEqual = false;
				highest = it;
			}
		}
		if(areAllEqual) System.out.println("All numbers are equal.");
		System.out.println("highest: " + highest);
	}
}
