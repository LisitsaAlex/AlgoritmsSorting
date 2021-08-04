package myPackage;

public class InsertionSort extends TemplateSorting{
	
	@Override
	public void sort(Comparable[] a) {
		int N = a.length;
		
		for (int i=1;i<N;i++)
		{
			for (int j=i;j>0 && this.less(a[j], a[j-1]); j--)
				this.exch(a, j, j-1);
		}
	}

}
