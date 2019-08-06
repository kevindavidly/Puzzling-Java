import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJavaTest{
    public static void main(String[] args){

        PuzzleJava test = new PuzzleJava();

        int[] myArray = {3,5,1,2,7,238,8,13,25,32};
        System.out.println(test.printArr());
        test.shuffleArr();
        test.randomArray55To100();

        System.out.println("Sorted Array : "+ Arrays.toString(test.sortArray()));
        System.out.println("Random 5 characters : "+test.randStr5CharLong());
        System.out.println("Array of 10 random characters : " +Arrays.toString(test.random10StringArray()));
    
    }