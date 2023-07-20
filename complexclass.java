package com.gurukul.daay4;

class Complex
{
	private double real,img;
	
	Complex(){}
	Complex(double a,double b)
	{
		real= a;
		img= b;
	}
	 public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImg() {
		return img;
	}
	public void setImg(double img) {
		this.img = img;
	}
	public String toString()
	 {
		if(img==-1)
			return real+"- i";
		if(img==1)
			return real+"+ i";
		if(img<0)
			return real+"- i"+(-1*img);
		else
		 return real+"+ i"+img;
	 }
	public Complex add(Complex y)
	{
		
		double a=this.getReal()+y.getReal();
		double b=this.getImg()+y.getImg();
		Complex x=new Complex(a,b);
		return x;
	}
	public Complex sub(Complex y)
	{
		double a=this.getReal()-y.getReal();
		double b=this.getImg()-y.getImg();
		Complex x=new Complex(a,b);
		return x;

	}
	public Complex mul(Complex y)
	{
		
		double treal= (getReal()*y.getReal())-(getImg()*y.getImg());
		double tImag=(getReal()*y.getImg())+(getImg()*y.getReal());
		Complex x=new Complex(treal,tImag);
		return x;
	}
	public Complex div(Complex y)
	{
	
		double a=(getReal()*y.getReal())+(getImg()*y.getImg());
		double b=(Math.pow(y.getReal(),2)+Math.pow(y.getImg(), 2));
		double treal=a/b;
		double c=(getImg()*y.getReal())-(getReal()*y.getImg());
		double d=(Math.pow(y.getReal(),2)+Math.pow(y.getImg(), 2));
		double timag= c/d;
		Complex x=new Complex(treal,timag);
		return x;
	}
	 
}

public class complexclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex x=new Complex(3,4);
        Complex y=new Complex(4,5);
        Complex a=x.add(y);
        Complex s=x.sub(y);
        Complex m=x.mul(y);
        Complex d=x.div(y);
        System.out.println(x); //3+i4
        System.out.println(y); //4+i5
        System.out.println(a);//7+i9
        System.out.println(s);//-1-i
        System.out.println(m);//-8+i31
        System.out.println(d);//.78+i0.02

	}

}
