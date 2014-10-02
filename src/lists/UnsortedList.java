package lists;

public class UnsortedList extends DynamicList {

	public UnsortedList() {
	}

	public UnsortedList(int initialCapacity) {
		super(initialCapacity);
	}

	public void insert(CompanyElement elem) {
		if (size >= elements.length) {
			increaseCapacity();
		}
		elements[size] = elem;
		size++;
	}

}
