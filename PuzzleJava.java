import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
// ● Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)

    public static ArrayList printSum(int[] myArray){
        double sum = 0;
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i=0;i<myArray.length;i++){
            sum += myArray[i];
            if (myArray[i]>10){
                newArray.add(myArray[i]);
            }
        }
        System.out.println("sum of given array: "+sum);
        return newArray;
    }

// ● Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.

    public static ArrayList printArr(){
        ArrayList<String> myArray = new ArrayList<String>();
        myArray.add("Nancy");
        myArray.add("Jinichi");
        myArray.add("Fujibayashi");
        myArray.add("Momochi");
        myArray.add("Ishikawa");
        Collections.shuffle(myArray);
        for (int i=0;i<myArray.size();i++){
            if (myArray.get(i).length()>5){
                myArray.remove(i);
            }
        }
        return myArray;

// ● Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.
// To shuffle a collection, you can use the shuffle method of the Collections class. Collections Class documentation

    public static void shuffleArr(){
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Collections.shuffle(Arrays.asList(alphabet));
        
        String letter = alphabet[0];
        
        System.out.println(letter);
        System.out.println("first letter of Array : "+ letter);
        System.out.println("Last letter of Array : "+ alphabet[25]);
        if (letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u"){
            System.out.println("The first letter is a vowel");
        }
    }

// ● Generate and return an array with 10 random numbers between 55-100.
// To get a random integer, you can use the nextInt method of the Random class. Random Class documentation

    public static int[] randomArray55To100(){
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i=0; i<10;i++){
            arr[i] = rand.nextInt(49)+55; // nextInt(49) -> random 0-49
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

// ● Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
// To sort a collection, you can use the sort method of the Collections class.

    public static int[] sortedArray(){
        int[] newArray = randomArray55To100();
        Arrays.sort(newArray);
        System.out.println("Minimum value in an array : "+ newArray[0]);
        System.out.println("Maximum value in an array : "+ newArray[newArray.length-1]);
        return newArray;
    }

// ● Create a random string that is 5 characters long.

    public static String randStr5CharLong(){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int alphaLength = alphabet.length();
        String newstr = "";
        Random rand = new Random();
        for (int i = 0; i<5; i++){
            newstr += alphabet.charAt(rand.nextInt(alphaLength));
        }
        return newstr;
    }

// ● Generate an array with 10 random strings that are each 5 characters long

    public static String[] random10StringArray(){
        String[] myArray = new String[10];
        for(int i=0;i<10; i++){
            String randStr = randStr5CharLong();
            myArray[i] = randStr;
        }
        return myArray;
    }
}



