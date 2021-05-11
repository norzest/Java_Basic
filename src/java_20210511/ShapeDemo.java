package java_20210511;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape s1 = new Rectangle();
		Shape s2 = new Triangle();
		Shape s3 = new Circle();
		
		s1.draw();
		s2.draw();
		s3.draw();
		
		
		// 싱글톤
		ShapeManager manager = ShapeManager.getInstance();
		manager.run(new Circle());
		
	}
}
