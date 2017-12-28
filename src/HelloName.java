import java.util.Scanner; ;
public class HelloName {

	public static void main(String[] args) 
	{
		java.util.Scanner input = new Scanner(System.in);
		System.out.println("Podaj imiê");
		String imiê = input.nextLine();
        System.out.println("Witaj " + imiê);
	}

}
