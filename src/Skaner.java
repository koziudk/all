import java.util.Scanner;
public class Skaner {

	public static void main(String[] args) 
	{
		java.util.Scanner input = new Scanner(System.in);
//	System.out.println("Podaj imi�");
//	String imi� = input.nextLine();
//	System.out.println("Witaj" + imi�);

	System.out.println("Podaj tw�j wzrost w cm");
	double wzrost = input.nextDouble();
	System.out.println("Podaj twoj� wag� w kg(bez oszust)");
	double waga = input.nextDouble();
	
	wzrost= wzrost / 100;
	double bmi = waga/(Math.pow(wzrost, 2));
	System.out.println("Tw�j indeks BMI wynosi: " + bmi);
	
	if (bmi<18.5)
	{
		System.out.println("Jeste� zbyt szczup�y/szczup�a");
	}
	else if (bmi>25)
	{
		System.out.println("Czas na odchudzanie");
	}
	else 
	{
		System.out.println("Gratulacje! Masz prawid�owy indeks BMI");
	}
	}

}
