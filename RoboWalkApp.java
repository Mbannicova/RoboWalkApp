import java.util.Scanner;

public class RoboWalkApp {

	public static void main(String[] args) {
		final int W = 10 ;
		final int H = 10;
		      int rr = 7;
		      int rc = 2;
		      int gr = 7;
		      int gc = 7;
		      boolean garbageState = false;
		      
		      
		String dir;
		Scanner in = new Scanner(System.in);
		
		while(true) {
		renderMap(W,H, rr, rc, gr, gc, garbageState);
		System.out.println("directios: a,d,w,s");
		System.out.print("move >>> ");
		dir = in.next();
		if(dir.equals("a")) {
			rc--;
			if(rc < 0) {
				rc = 9;
			}
		}
		if(dir.equals("d")) {
			rc++;
			if(rc > 9) {
				rc = 0;}
		}
		if(dir.equals("w")) {
			rr--;
			if(rr < 0) {
				rr = 9;
			}
		}
		
		if(dir.equals("s")) {
			rr++;
			if(rr > 9) {
				rr = 0;
				}
			}
		if (rr == gr && rc == gc) {
			garbageState = true; 
		}
		}
		      }
	
		
 // custom methods
// NAMING 	
 static void renderMap(final int W, final int H, int rr, int rc, int gr, int gc, boolean garbageState) {
	 
      
	 for (int row = 0; row < W; row++) {
		 for (int col = 0; col < H; col++) {
			 if ( row == rr&& col == rc) {
				 System.out.print("R ");
				 
				 
			 } else if (row == gr && col == gc && garbageState == false){
				 System.out.print("X ");
				 
			 } else {
				 System.out.print(". ");
			 }
			 
			  }
		 System.out.println();
	 }
	 
 }	
 }
 
