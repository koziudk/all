import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HelloListName {

	public static void main(String[] args)
	
	{
		java.util.Scanner input = new Scanner(System.in);
		System.out.println("Podaj imi�");
		String imi� = input.nextLine();
		List<String> lista = new ArrayList<String>();
		lista.add("imi�");
		
		System.out.println(" Hello " + imi� );
	}

}
