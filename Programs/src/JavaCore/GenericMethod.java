package JavaCore;
public class GenericMethod {
	static<T> void genericDisplay(T element) {
		System.out.println(element);
		System.out.println(element.getClass().getName()+" = "+element);
	}
	public static void main(String[] args) {
		genericDisplay(11);
	}
}