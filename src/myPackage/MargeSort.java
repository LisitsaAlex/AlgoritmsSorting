package myPackage;

public class MargeSort extends TemplateSorting{
	
	
	private Comparable []aux;
	
	
	
	public void sort (Comparable [] a)
	{		
		aux = new Comparable[a.length];
		this.sort(a, 0, a.length-1);
			
		
	}

	public void marge(Comparable [] a, int lo, int mid, int hi)
	
	{
		System.out.println("merge lo="+lo+" mid="+mid+" hi="+hi);
		int i=lo, j=mid+1;
		for (int k=lo;k<=hi;k++)
		aux[k]=a[k];
		
		for (int k=lo;k<=hi;k++)
			if (i>mid) a[k]=aux[j++];
			else if (j>hi) a[k]=aux[i++];
			else if (this.less(aux[j], aux[i])) a[k]=aux[j++];
			else a[k]=aux[i++];
		
	}
	
	private void sort(Comparable []a, int lo, int hi)
	{
		if(hi<=lo) {
			System.out.println("end return");
			return;}
		int mid = lo+(hi-lo)/2;
		System.out.println("sort lo="+lo+" hi="+hi);
			this.sort(a,lo, mid);
			this.sort(a,mid+1,hi);
			this.marge(a, lo, mid, hi);
			
	}
	
	public void upwardSort(Comparable [] a)
	{
		int n = a.length;
		aux = new Comparable[a.length];
		for (int i=1; i<n; i=i+i)
			for (int j=0;j<n-i; j+=i+i)
				this.marge(a, j, j+i-1, Math.min(j+i+i-1, n-1));
		
		
	}
	
	
	
}
