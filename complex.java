public class Complex{
	int real;
	int imaginery;
	


public Complex(int real,int imaginery){
	this.real=real;
	this.imaginery=imaginery;
}

public void display(){
	System.out.println(real+"+"+imaginery+"i");
}

public static void add(int r1,int r2,int i1,int i2){
	int sumReal=r1+r2;
	int sumImaginery=i1+i2;
	System.out.println("after addition="+sumReal+"+"+sumImaginery+"i");
	
}

public static void main(String[] args){
	Scanner sc=new Scanne(System.in);
	System.out.println("Enter the real part of the first complex number");
	int real1=sc.nextIn();
	System.out.println("Enter the imaginery part of the first complex number");
	int img1=sc.nextIn();
	System.out.println("Enter the real part of the second complex number");
	int real2=sc.nextIn();
	System.out.println("Enter the imaginery part of the second complex number");
	int img2=sc.nextIn();
	
	
	Complex first =new Complex(real1,img1);
	Complex second=new Complex(real2,img2);
	
	System.out.println("complex numbers are");
	first.display();
	second.display();
	
	add(first.real,first.imaginery,second.real,second.imaginery);
}

}
