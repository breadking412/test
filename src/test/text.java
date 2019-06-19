package test;
import java.util.Scanner;



interface Geometricinterface{
	void perimeter();
	void area();
}

class triangle implements Geometricinterface{
	double a,b,c;
	triangle(int x, int y, int z){
		a = x;
		b = y;
		c = z;
	}
	public void perimeter(){
		System.out.println("�������ܳ�Ϊ"+(a+b+c));
	}

	public void area() {
		double p = (a+b+c)/2;
		double s;
		s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("���������Ϊ"+s);
	}
}

class rectangle implements Geometricinterface{
	double h,l;
	rectangle(int x, int y){
		h = x;
		l = y;
	}
	public void perimeter(){
		System.out.println("�����ܳ�Ϊ"+(2*(h+l)));
	}

	public void area() {
		System.out.println("�������Ϊ"+(h*l));
	}
}

public class text {

	public static void main(String[] args) {
		int a,b,c,h,l;
		Scanner sc = new Scanner(System.in);
		
		//������
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		triangle s = new triangle(a,b,c);
		
		s.perimeter();
		s.area();
		
		//���� 
		h = sc.nextInt();
		l = sc.nextInt();
		rectangle t = new rectangle(h,l);
		
		t.perimeter();
		t.area();
		
		sc.close();
	}

}
