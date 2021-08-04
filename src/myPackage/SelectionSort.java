package myPackage;

public class SelectionSort extends TemplateSorting{

	public void sort(Comparable[] a) {
		
		int N = a.length;
		for (int i=0; i<N; i++)
		{
			int min=i;
			for (int j=i+1;j<N;j++)
				if(this.less(a[i],a[min]))min=j;
			exch(a,i,min);
		}
		// TODO Auto-generated method stub
		
	}

}
