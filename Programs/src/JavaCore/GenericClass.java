package JavaCore;

class Demo<T>{
	private T t;
	public void set(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}
}
public class GenericClass {
	public static void main(String[] args) {
		Demo<Integer> obj=new Demo<Integer>();
		obj.set(25);
		System.out.println(obj.get());
		Demo<String> obj2=new Demo<String>();
		obj2.set("Demo");
		System.out.println(obj2.get());
	}
}