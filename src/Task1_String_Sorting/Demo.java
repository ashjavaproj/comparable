package Task1_String_Sorting;

import java.util.TreeSet;

public class Demo {

	//default natural sorting order
			public static void main(String[] args) {
			//no need to implement comparable interface because String is  allready implement comparable interface.
			TreeSet t=new TreeSet<>();
			t.add("A");
			t.add("Z");
			t.add("B");
			t.add("A");
			System.out.println(t);  //Ascending order
		}
		}

	
	
	