
public class MyIntArrayList implements MyIntList{
	private int[] elements;
	private int size;
	private int capacity;

	public MyIntArrayList(int[] elements) {
        this.elements = new int[elements.length];
        for (int i = 0;i<elements.length;i++){
            this.elements[i] = elements[i];
        }
        this.capacity = elements.length;
        this.size = elements.length;
    }
    @Override
    public int get(int i) throws RuntimeException{
    	if (i<0 || i>= size){
    		throw new RuntimeException("Index: " + i + ", size: " + size);
    	}
    	return elements[i];
    }
    @Override
    public void add(int x) {
        if (size == capacity){
            increaseCapacity(size+1);
        }
        elements[size++] = x;
    }
    @Override
    public void remove(int i) throws RuntimeException{
        if (i<0 || i>=size){
            throw new RuntimeException("Index: " + i + ", size: " + size);
        }

        for (int j = i; j<size-1;j++){
            elements[j] = elements[j+1];
        }
        size--;
    }
    @Override
    public int getSize(){
        return size;
    }

    private String toMyString(){
        String str = "";
        for (int i = 0; i<size;i++){
            str+=elements[i] + " ";
        }
        return str;
    }
    @Override
    
    public boolean equals(MyIntArrayList myIntList){
        if (this.size!=myIntList.getSize()){
            return false;
        }
        for (int i=0;i<size;i++){
            if (this.elements[i]!= myIntList.get(i)){
                return false;
            }
        }
        return true;
    }
    @Override
    public void addAll(MyIntArrayList myIntList){
        int new_capacity = size+myIntList.getSize();
        if (new_capacity>capacity){
            increaseCapacity(new_capacity);
        }
        for (int i = 0; i<myIntList.getSize();i++){
            elements[size++] = myIntList.get(i);
        }
    }
    @Override
    public void clear(){
        size = 0;
    }
    private void increaseCapacity(int new_Capacity) {
        while (capacity < new_Capacity) {
            capacity = capacity * 2;
        }
        int[] newElements = new int[capacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }
    @Override
    public String toString(){
        return toMyString();
    }
    public void set(int i, int x) throws RuntimeException {
        if (i<0 || i>=size){
            throw new RuntimeException("Index: " + i + ", size: " + size);
        }
        elements[i] = x;
    }
}   
