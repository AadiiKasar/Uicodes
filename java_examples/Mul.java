interface A
{
	void show();
}
interface B
{
	void show();
}
class C
{
	void show() {
		System.out.println("I am show from c");
	}
}
class D extends C implements A,B{
	public void show() {
		System.out.println("I am D");
	}
}
public class Mul {
	public static void main(String[] args) {
		D d1 = new C();
		d1.show();
	}
 }
