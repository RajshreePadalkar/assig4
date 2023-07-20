package com.gurukul.daay4;

class Time1 {
	private int hour;
	private int mint;
	private int sec;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMint() {
		return mint;
	}
	public void setMint(int mint) {
		this.mint = mint;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}

	
	
	Time1(){}
	Time1(int h,int m, int s)
	{
		hour=h;
		mint=m;
		sec=s;
	}
	
	public int getTimeInSecond()
	{
		return hour*3600+mint*60+sec;
	}
	
	public void setTimeInSecond(int second)
	{
		hour= second/3600%24;
		second=second%3600;
		mint= second/60;
		sec= second%60;
	}
	
	public String convertIn12Hours()
	{
		int h= hour%12;
		String s;
		if(hour>=12)
		{
			if(h==0)
				h=12;	
			s= h+":"+mint+":"+ sec +" pm";
			}
		else
			s= h+":"+mint+":"+ sec +" am";
		return s;
	}
	
	public Time1 add(Time1 t)
	{
		Time1 a=new Time1();
		int total;
		total=(this.getTimeInSecond()+t.getTimeInSecond());
		a.setTimeInSecond(total);
		return a;
	}
	public String toString()
	{
		return (this.hour + ":" +this.mint+" :"+this.sec);
	}
	

}


public class timeclass {
	
	
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time1 x=new Time1(12,30,25);
		Time1 y=new Time1(19,20,35);
		Time1 z=x.add(y);
		String timeMessage1= x.convertIn12Hours();
		String timeMessage2=y.convertIn12Hours();
		System.out.println(x);  // 12:30:25
		System.out.println(y);  //19:20:35
		System.out.println(z);  // 7:51:10
		System.out.println(timeMessage1);  //12:30:25 PM
		System.out.println(timeMessage2);  //7:20:35 PM

	}

}
