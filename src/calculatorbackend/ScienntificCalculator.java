package calculatorbackend;

import calculatorfrontend.Addition;
import calculatorfrontend.Dividation;
import calculatorfrontend.Multification;
import calculatorfrontend.Substrcation;

public class ScienntificCalculator {

	public static void main(String[] args) {
		Addition add = new Addition();
		Substrcation sub = new Substrcation();
		Multification multi = new Multification();
		Dividation divid = new Dividation();

		int a = add.add(50, 10, 5, 2);
		int s = sub.sub(100, 20, 50, 200);
		int m = multi.multi(5, 5, 5, 5);
		int di = divid.divid(10000,10);

		System.out.println("Addition" + " " + "=" + " " + a);
		System.out.println("Substrcation" + " " + "=" + " " + s);
		System.out.println("Multification" + " " + "=" + " " + m);
		System.out.println("Dividation" + " " + "=" + di);
	}

}
