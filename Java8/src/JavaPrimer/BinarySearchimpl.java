package JavaPrimer;

public class BinarySearchimpl {
    private Sortalgo sortalgo;

    public BinarySearchimpl(Sortalgo sortalgo) {
        this.sortalgo = sortalgo;
    }



    public int search(int[] array, int number){
        int array1 = sortalgo.sort(array);
         return array1;
    }

}


/** Sortalgo
 *  bubblesort method sort
 *  quicksort method sort
 */

class Test{

    public static void main(String[] args) {
       BinarySearchimpl bina = new BinarySearchimpl(new QuickSort());

       System.out.println(bina.search(new int[] {1,2,3,5}, 5)) ;
    }
}