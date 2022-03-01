import java.util.Scanner;
public class ProcessAName5026211042 {

	public static void main (String[] args){
		Scanner name = new Scanner(System.in);
		System.out.print("Type your full name: ");
		String Fullname = name.nextLine();
		
      		int lastIndex = Fullname.lastIndexOf(" ");
      		System.out.println(lastIndex);
		int a = Fullname.lastIndexOf(" ");
		String b = Fullname.substring(a+1);
		System.out.println("Your name is " +b+ ", " +Fullname.charAt(0)+ ".");
	}
}
		