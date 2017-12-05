/* 이름:한병찬
 * 학번:60171665
 * 프로그램 설명: abstract class인  Shape 클래스를 이용하여 Drawable,Movable인터페이스들을를 구현하며 Shape의 하위 클래스인 
 * Rectangle,Circle,Triangle,Square등에 Shape를 상속시켜서   Rectangle,Circle은 좌표,넓이,길이를 Triangle,Square은 좌표만 출력하는 프로그램이다.
 */
public interface Drawable{
	void draw();
}
interface Moraable{
	void move(double dx,double dy);
}
abstract class Shape implements Moraable{
	public double x;
	public double y;
	abstract void area(); 
	abstract void length();
	void measure() {
		area();
		length();
		System.out.println();
	}
	public void draw(){
		System.out.println("Shape");
	}
	public String showRectangle1() {
		return null;
	}
	}

class Rectangle extends Shape implements Drawable {
	double side;
	double height;
	double x;
	double y;
	
	Rectangle(double x, double y, double s, double h) {
		this.x = x;
        this.y = y;
		side = s;
		height =h;
	}
	void area() {
		System.out.println("Area:" + (side*height));
	}
	void length() {
		System.out.println("Length:" + 2*(side + height));
	}
	 
	public String showRectangle() {
		return "Rectangle"+"("+this.x+","+ this.y +")";
	}
	public String showRectangle1() {
		return "("+((int)this.x + side)+","+((int)this.y+height)+")";	
	}
	
	public void draw() {		 	
	}
	
	public void move(double dx, double dy) {
		super.x = dx;
		super.y = dy;
	}
}
class Square extends Shape implements Drawable {
	double x;
	double y;
	private double w;
	
	public void move(double dx, double dy) {
		super.x = dx;
		super.y = dy;
	}
	Square(double x, double y, double width) {
		this.x = x;
        this.y = y;
		w = width;
	}
	void area() {
		System.out.println("Area:" + (w*w));
	}
	
	void length() {
		System.out.println("Length:" + 2*(w + w));
	}
	public String showSquare() {
		return "Square"+"("+this.x+","+ this.y +")";
	}
	public String showSquare1() {
		return "("+((int)this.x + w)+","+((int)this.y+ w)+")";	
	}
	}

class Circle extends Shape implements Drawable {
	final double pi = 3.1415;
	double radius;
	double x;
	double y;
	private Object center;
	
	Circle(double x, double y, double r){
		this.x = x;
        this.y = y;
		radius = r;
	}
	void area() {
		System.out.println("Area:"+Math.round((radius*radius*pi)*10)/10.0);
	}
	void length() {
		System.out.println("length:"+Math.round((2*radius*pi)*10)/10.0);
	}
	public String showCircle() {
		return "Circle center"+"("+this.x+","+ this.y +")";
	}
	public String getRadius() {
		return "("+radius+")";
	}
	public void draw() {
	}
	
	public void move(double dx, double dy) {
		super.x = dx;
		super.y = dy;
		}	
	}



class Triangle extends Shape implements Drawable {
	double x;
	double y;
	private double b;
	private double w;
	
	public void move(double dx, double dy) {
		super.x = dx;
		super.y = dy;
	}
	Triangle(double x, double y, double bottom, double width){
		this.x = x;
        this.y = y;
		b = bottom;
		w = width;
	}
	void area() {
		System.out.println("Area:"+ (b*w)/2);
	}
	
	void length() {
		System.out.println("length:"+ (b+(b/2*2)));
	}
	public String showTriangle() {
		return "Triangle"+"("+this.x+","+ this.y +")";
	}
	public String showTriangle1() {
		return "("+w+","+ this.x +")";
		}
	public String showTriangle2() {
		return "("+this.y+","+ b +")";
		}
}
class Bear extends Shape implements Drawable {
	public void move(double dx, double dy) {	
		super.x = dx;
		super.y = dy;
	}
	private double x;
	private double y;
	private double radius;
	final double pi = 3.1415;
	public Bear(double i, double j, double r) {
		this.x = i;
	    this.y = j;
		radius = r;
	}
	void area() {
		System.out.println("Area:" + (radius*radius)+ Math.round(((radius*radius*pi)*10)/10.0)*2);
	}
	void length() {		
		System.out.println("Length:" + 2*( radius + radius)+ Math.round(((2*radius*pi)*10)/10.0)*2);	
	}
	public String showBear() {
		return "("+((int)this.x + radius)+","+ ((int)this.x + radius) +")";
	}
	public String showBear1() {
		return "Rectangle" + "("+((int)this.x - radius)+","+ ((int)this.x - radius) +")";
	}
	public String showBear2() {
		return "Circle center" + "("+((int)this.x - radius)+","+ ((int)this.x - radius) +")";
	}
	public String getBear2() {
		return "("+radius/2+")";
	}
	public String showBear3() {
		return "Circle center" + "("+((int)this.x + radius)+","+ ((int)this.x - radius) +")";
	}
	public void draw() {	
		System.out.println("Bear");
	}
}
class Text implements Drawable {
	public Text(String string) {	
	}
	public void draw() {
		System.out.println("Sample Text");
	}
}

