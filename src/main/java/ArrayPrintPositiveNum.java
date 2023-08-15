public class ArrayPrintPositiveNum {
    public static void main(String[] args) {
        int arr [] = {5,-2,-8,6,-7,11};
        //print the positive number in the arrays

        for(int itr : arr){
            if(itr>=0)
            System.out.println(itr);
        }

    }
}
