class Over{
	float pi=3.14f;
	int length,breadth,r;
	void area(int r)
	{
		System.out.println("area of cirle:"+(pi*r*r));
	}
	void area(int length,int breadth){
		System.out.println("area of rectangle:"+(length*breadth));
	}
}
class Overload{
public static void main(String[]args){
	Over O=new Over();
	O.area(2);
	O.area(2,4);
 	}
}

