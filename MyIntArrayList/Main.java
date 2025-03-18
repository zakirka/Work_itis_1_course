public class Main{
	public static void main(String[] args){
		int[] myArray = {515,124,1251,7247,348};
		MyIntArrayList myList = new MyIntArrayList(myArray);
		System.out.print("myList: ");
		printarray(myArray);
		System.out.println("\nЭлемент по индексу 4: " + myList.get(4));
		myList.add(123);
		System.out.println("Список после добавления элемента: " + myList);
		myList.remove(4);
        System.out.println("Список после удаления элемента по индексу 4: " + myList);
        System.out.println("Размер списка: " + myList.getSize());
        myList.set(1,716);
		System.out.println("Замена элемента по индекcу на элемент: " + myList);
		int[] array1 = {515, 716, 1251, 7247, 123};
		int[] array2 = {515,113,7448,256793,25662};
		int[] array3 = {5125,1264,343236243,7235};
		MyIntArrayList list1 = new MyIntArrayList(array1);
		MyIntArrayList list2 = new MyIntArrayList(array2);
		MyIntArrayList list3 = new MyIntArrayList(array3);

		System.out.println("");
		System.out.println("myList: " + myList);
		System.out.print("Array_1: ");
		printarray(array1);
		System.out.print("\nArray_2: ");
        printarray(array2);
        System.out.println("");
		System.out.println("myList equals Array_1: " + myList.equals(list1));
		System.out.println("myList equals Array_2: " + myList.equals(list2));
		System.out.println("");
		System.out.print("Array_3: ");
		printarray(array3);
		System.out.println("");
		myList.addAll(list3);

		System.out.println("myList add Array_3: " + myList);
		System.out.println("");
		myList.clear();
		System.out.println("Список после очистки: " + myList);
		System.out.println("Размер списка после очистки: " + myList.getSize());
		
	}

	public static void printarray(int[] array){
		for (int i:array){
			System.out.print(i + " ");
		}
	}
}