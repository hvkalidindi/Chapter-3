

/**
 * Ham Kalidindi
 * 10/20/16
 * FileIO Program
 * Counts how many times a word is said in a speech
 */
import java.util.Scanner;
import java.io.*;
public class FileIO_Program
{
   public static void main (String[] args) throws IOException
   {
       
        //Initializes variable for the length of the word
        int wordlength = 0;
        
        //Initializes variable for average word length
        int avgwordlength = 0;
        
        //Initializes vairiable for total words
        int totalwords = 0;
        
        //Initializes the counts for all three words
        int wordcount1 = 0;
        int wordcount2 = 0;
        int wordcount3 = 0;
        
        
        String date, name, word;
        
        String word1 = "people", word2 = "america", word3 = "right";
        Scanner file = new Scanner(new File ("speaches/jfk.txt"));
        
        date = file.nextLine();
        name = file.nextLine();
        
        System.out.println("\n\n");
        
        //While loop runs through speech and finds the words and adds to the count
        while (file.hasNext())
        {
            word = file.next();
            
            totalwords++;
            wordlength = word.length();
            
            avgwordlength += wordlength;
            
            if (word.equalsIgnoreCase(word1))
                wordcount1++;
            if (word.equalsIgnoreCase(word2))
                wordcount2++;
            if (word.equalsIgnoreCase(word3))
                wordcount3++;
            }
        
        avgwordlength = avgwordlength/totalwords;
        
        System.out.println(date + "\n" + name);
        System.out.println("People: " + wordcount1);
        System.out.println("America: " + wordcount2);
        System.out.println("Right: " + wordcount3);
        
        System.out.println("Total Words: " + totalwords);
        System.out.println("Average Word Length: " + avgwordlength);
       
       
    }

}
