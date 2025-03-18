public interface MyIntList{
	int get(int i) throws RuntimeException;
	void add(int x);
	void remove(int i) throws RuntimeException;
	int getSize();
	@Override
	String toString();
	void set(int i, int x) throws RuntimeException;
	boolean equals(MyIntArrayList myIntList);
	void addAll(MyIntArrayList myIntList);
	void clear();
}