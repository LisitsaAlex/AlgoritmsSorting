package myPackage;

public class Date implements Comparable<Date>{
	
	private final int day;
	private final int mounth;
	private final int year;
	
	public Date(int d, int m, int y) {
		
		this.day=d;
		this.mounth=m;
		this.year=y;
		
		// TODO Auto-generated constructor stub
	}
	
	public int getDay() { return this.day;}
	public int getMounth() { return this.mounth;}
	public int getYear() {return this.year;}
	
	
	@Override
	public int compareTo(Date that) {
		// TODO Auto-generated method stub
		
		if(this.year>that.year) return +1;
		if(this.year<that.year) return -1;
		
		if(this.mounth>that.mounth) return +1;
		if(this.mounth<that.mounth) return -1;
		
		if(this.day>that.day) return +1;
		if(this.day<that.day) return -1;
		
		return 0;
	}
	
	public String toString()
	{
		return this.mounth+"/"+this.day+"/"+this.year;
	}
	

}
