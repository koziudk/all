import java.util.Scanner;
public class Skaner {

	public static void main(String[] args) 
	{
		java.util.Scanner input = new Scanner(System.in);
//	System.out.println("Podaj imiê");
//	String imiê = input.nextLine();
//	System.out.println("Witaj" + imiê);

	System.out.println("Podaj twój wzrost w cm");
	double wzrost = input.nextDouble();
	System.out.println("Podaj twoj¹ wagê w kg(bez oszust)");
	double waga = input.nextDouble();
	
	wzrost= wzrost / 100;
	double bmi = waga/(Math.pow(wzrost, 2));
	System.out.println("Twój indeks BMI wynosi: " + bmi);
	
	if (bmi<18.5)
	{
		System.out.println("Jesteœ zbyt szczup³y/szczup³a");
	}
	else if (bmi>25)
	{
		System.out.println("Czas na odchudzanie");
	}
	else 
	{
		System.out.println("Gratulacje! Masz prawid³owy indeks BMI");
	}
	}

}
