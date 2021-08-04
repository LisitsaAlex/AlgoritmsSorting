package myPackage;

public class FastSort extends TemplateSorting{
	
	Comparable []aux;
	
	@Override
	public void sort(Comparable [] a)
	{
		
		this.sort(a,0,a.length-1);
		
		
		
	}
	
	public int spitting(Comparable [] a, int lo, int hi)
	{
		int i=lo, j=hi+1;
		Comparable tmp = a[lo];
		
		while (true)
		{
			while(this.less(a[++i],tmp)) if (i==hi) break;
			while (this.less(tmp, a[--j])) if (j==lo) break; 
			
			if(i>=j) break;
			this.exch(a, i, j);
			
		}
		this.exch(a, lo, j);
		
		return j;
	}
	
	
	public void sort(Comparable []a, int lo, int hi)
	{
		if (hi<=lo) return;
		int j=this.spitting(a, lo, hi);
		this.sort(a, lo, j-1);
		this.sort(a, j+1, hi);
	   
		
	}
	
	

}
