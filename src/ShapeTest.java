/* �̸�:�Ѻ���
 * �й�:60171665
 * ���α׷� ����: abstract class��  Shape Ŭ������ �̿��Ͽ� Drawable,Movable�������̽������� �����ϸ� Shape�� ���� Ŭ������ 
 * Rectangle,Circle,Triangle,Square� Shape�� ��ӽ��Ѽ�   Rectangle,Circle�� ��ǥ,����,���̸� Triangle,Square�� ��ǥ�� ����ϴ� ���α׷��̴�.
 */
public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[5];
		shapes[0] = new Rectangle(10,20,30,40);
		shapes[1] = new Rectangle(30,30,10,10);
		shapes[2] = new Circle(50,20,30);
		shapes[3] = new Square(30,30,40);
		shapes[4] = new Triangle(20,30,20,10);
		shapes[0].measure();
		shapes[1].measure();
		shapes[2].measure();
		System.out.println(((Rectangle)shapes[0]).showRectangle()+"-"+ shapes[0].showRectangle1());
		System.out.println(((Rectangle)shapes[1]).showRectangle()+"-"+ shapes[1].showRectangle1());
		System.out.println(((Circle)shapes[2]).showCircle()+"-"+ "radius"+((Circle)shapes[2]).getRadius());
		System.out.println(((Square)shapes[3]).showSquare()+"-"+ ((Square)shapes[3]).showSquare1());
		System.out.println(((Triangle)shapes[4]).showTriangle()+"-"+ ((Triangle)shapes[4]).showTriangle1()+"-"+((Triangle)shapes[4]).showTriangle2());

		Drawable[] drawables = new Drawable[5];
		for(int i = 0; i<shapes.length; i++) {
			drawables[i] = (Drawable)shapes[i];
		}
		drawables[3] = new Text("Sample Text");
		drawables[4] = new Bear(100,100,20);
		for(Drawable d: drawables) {
			d.draw();
		}
		System.out.println(((Bear)drawables[4]).showBear1() + "-" + ((Bear)drawables[4]).showBear());
		System.out.println(((Bear)drawables[4]).showBear2() + "-" +"radius"+ ((Bear)drawables[4]).getBear2());
		System.out.println(((Bear)drawables[4]).showBear3()+ "-" +"radius"+ ((Bear)drawables[4]).getBear2());
		}
	}
	

