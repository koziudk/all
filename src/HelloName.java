import java.util.Scanner; ;
public class HelloName {

	public static void main(String[] args) 
	{
		java.util.Scanner input = new Scanner(System.in);
		System.out.println("Podaj imi�");
		String imi� = input.nextLine();
        System.out.println("Witaj " + imi�);
	}

}
