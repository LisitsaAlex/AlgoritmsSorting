package myPackage;

public class ShellSort extends TemplateSorting {
	
	public void sort(Comparable [] a)
	{
		int N = a.length;
		int h=1;
		
		while (h<N/3)
			h=3*h+1;
		System.out.println("h = "+h);
		while(h>=1)
		{
			for (int i=h;i<N;i++)
			{	this.show(a);
				for (int j=i;j>=h && this.less(a[j], a[j-h]); j-=h)
					this.exch(a, j, j-h);
			}
		
			h=h/3;
			
		}
		
	}

}
