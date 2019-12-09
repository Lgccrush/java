package day04;
/**
 * 泛型的原型是Object
 * 定义泛型这是编译器在做一些校验工作
 * 当我们对泛型类型设置值是,去检查是否满足类型要求
 * 当我们获得一个泛型类型的值是,会自动进行类型转换
 * @author L
 *
 */
public class PointTest2 {

	public static void main(String[] args) {
		/*
		 * 这里指定泛型的实际类型为Integer
		 * 但实际上,创建的Point对象中,x,y属性是Object类型
		 * 这里只是应当把它当做Integer看待
		 */
		Point<Integer> p1 = new Point<Integer>(1, 2);
		/*
		 * 由于参数是T,这里会验证实参是否为Integer
		 *如不是,编译失败
		 *可以传入基本类型,因为还会自动装箱 
		 */
		p1.setX(1);
		/*
		 * 获取时,也会自动装箱,这里无需显示的进行类型转换
		 */
		int x1 = p1.getX();
		/*
		 * 若不指定类型,则使用默认的Object类型
		 */
		Point p2 = p1;//p1把地址赋值给p2
		p2.setX("一");
		String x2 = (String)p2.getX();//X被强转为String类型
		System.out.println("x2:"+x2);
		//类转换异常
		x1 = p1.getX();
		System.out.println("x1:"+x1);
	}

}
