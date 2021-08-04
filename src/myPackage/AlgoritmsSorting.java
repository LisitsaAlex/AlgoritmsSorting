package myPackage;

public class AlgoritmsSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShellSort shell = new ShellSort();
		
		Integer [] a = new Integer[13];
		a[0]=50;
		a[1]=5;
		a[2]=18;
		a[3]=33;
		a[4]=69;
		a[5]=15;
		a[6]=32;
		a[7]=4;
		a[8]=1;
		a[9]=8;
		a[10]=11;
		a[11]=7;
		a[12]=5;
		shell.show(a);

		//shell.sort(a);
	    //shell.show(a);
		/*
		Factorial fact = new Factorial();
		System.out.println(" fact "+fact.calculate(3));
		System.out.println(" eiler "+fact.eiler(9133));
		System.out.println(" fibonachi "+fact.fibonachi(8));
		*/
		//MargeSort marge = new MargeSort();
		//marge.sort(a);
		//marge.upwardSort(a);
		//marge.show(a);
		FastSort fast = new FastSort();
		fast.sort(a);
		fast.show(a);

		
	}

}
