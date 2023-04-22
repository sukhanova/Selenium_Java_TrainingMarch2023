package javasessions;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemoveConcept {

    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("Oliver"); // 0
        nameList.add("Julia"); // 1
        nameList.add("Tom"); // 2
        nameList.add("Sam"); // 3
        nameList.add("Martha"); // 4

        System.out.println(nameList);

        // adding name to the end of ArrayList
        nameList.add("Paul");
        System.out.println(nameList);

        // adding name at specified position in ArrayList
        // you cannot skip any segments in arrayList because of continuous memory allocation
        nameList.add(1, "Roxanne");
        System.out.println(nameList);

        // remove element from array at specified index
        nameList.remove(3);
        System.out.println(nameList);

        nameList.remove("Sam");
        System.out.println(nameList);


        nameList.add(3, "Craig");
        nameList.add("Craig");

        System.out.println(nameList);
        System.out.println("There is " + nameList.size() + " names in a list");
        String namaToDelete = "Craig";
        String str = "";
        Iterator i = nameList.iterator();
        while (i.hasNext()){
            str = (String) i.next();
            if(str.equals(namaToDelete)){
                i.remove(); // delete both names
               // break; // delete first match in ArrayList
            }
        }
        System.out.println(nameList);
        System.out.println("There is " + nameList.size() + " names in a list");
    }
}
