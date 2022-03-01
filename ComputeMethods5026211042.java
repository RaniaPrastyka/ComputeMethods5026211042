import java.util.Random;
public class ComputeMethods5026211042 {

	public double fToC(double degreesF){
		return (degreesF-32)*5/9;
	}

	public double hypotenuse(int a, int b){
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
	
	public int roll(){
		Random acak = new Random();
		int dice1 = acak.nextInt(6)+1;
		int dice2 = acak.nextInt(6)+1;
		return dice1 + dice2;
	}
} 
 