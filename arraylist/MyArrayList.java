
public class MyArrayList<T> extends MyAbstractArrayList<T> {
	public static final int INITIAL = 16;
	private T[] = (T[]) new Object[INITIAL];

	public MyArrayList() {}

	public MyArrayList(T[] data) {
		for (int i =0 ; i < data.length; i++) {
			add(data[i]);
		}
	}

	public void add(int index T t) {
		ensureCapacity();

		for (int i = 0; i >= index; i-- )
			data[i+1] = data[i]

		data[index] = t;
		size++;
	}
}
