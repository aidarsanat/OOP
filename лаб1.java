package Prob1;

import java.util.Scanner;

public class Xz {
	public static void main(String[] args) throws InterruptedException{
		Data d = new Data();
		while(true) {
			Scanner n = new Scanner(System.in);
			System.out.print("Enter number(Q to quit): ");
			String x =  n.next();
			if(x.equals("Q")) {
				Analyzer xD = new Analyzer();
				break;
			}
			else {
				int m = Integer.parseInt(x);
				d.determineNum(m);
			}
		}
		System.out.println(d);
		System.out.println(d.toString());
	}
}

class Data{
	static int max=0;
	static int i=0;
	static double sum = 0;
	int num;
	Data(){
		sum +=0;
		i++;
	}
	void determineNum(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
		if(num>max) {
			max= num;
		}
		i++;
		sum+=num;
	}
	double determineClassAverage(){
		return sum/i;
	}
	int determineMax() {
		return max;
	}


}
class Analyzer{
	Data d = new Data();
	public Analyzer() {
		System.out.println("Average is: "+d.determineClassAverage());
		System.out.println("Maximum is: " + d.determineMax());
	}
}
