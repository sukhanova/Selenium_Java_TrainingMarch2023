package javasessions;

public class ArraysConcept {

    public static void main(String[] args){

        // static Array: size is fixed
        // can store only similar type of data
        // index starts with 0

        // int array:

//        int arrayOfInt[] = new int[4]; // Array declaration and instantiation
//        arrayOfInt[0] = 3;  // Array initialization
//        arrayOfInt[1] = arrayOfInt[0]+4;
//        arrayOfInt[2] = 11;
//        arrayOfInt[3] = arrayOfInt[2]*100;

        //Array declaration, instantiation and initialization in one line
        int arrayOfInt[] = {3, 7, 11, 1100};


        // Print data located at an index position:
//        System.out.println(arrayOfInt[3]); //1100
//        System.out.println(arrayOfInt[6]); //ArrayIndexOutOfBoundsException --> AIOB

        for (int element:arrayOfInt){
            System.out.println(element);
        }
    }
}
