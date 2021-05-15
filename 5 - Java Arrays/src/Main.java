public class Main {

    public static void main(String[] args) {

        int[] int_arr; // This is actually a REFERENCE. Because Java arrays are NOT simple types,
        // and all the other/complex types will be declared as REFERENCE !

        /*
         * In this assignment
         * 1-) int_arr is a REFERENCE
         * 2-) An Array Object for int array will be created by "new"
         * 3-) The adress of the created object will be assigned to int_arr REFERENCE;
         */
        int_arr = new int[10];

        // Java array know their own LENGTH/ITEM COUNT
        // Java guarantee that if you define local variable. It has 0 (zero) value.
        for(int i = 0; i < int_arr.length; i++){
            int_arr[i] = i + 1;
            //System.out.printf("int_arr[%d]..: %d\n",i,int_arr[i]);
        }

        PrintIntArray(int_arr);

    }

    // commend line for C language
    public static void PrintIntArray(int[] arr /* , int arrSize */){
        for(int i = 0; i < arr.length; i++){
            System.out.printf("int_arr[%d]..: %d\n",i,arr[i]);
        }
    }
}
