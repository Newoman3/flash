package forgit;

class Parent{
	public void sings() {
		System.out.println("parent sings");
	}
	public void does() {
		System.out.println("parent does");
	}
}
class Child extends Parent{
	public void sings() {
		System.out.println("child sings");
	}
	public void plays() {
		System.out.println("child plays");
	}
}
public class MethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj = new Parent();
		obj.sings();
		obj.does();
		obj = new Child();
		obj.sings();
		obj.does();
	}

}
