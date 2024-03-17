/*
 * this is the word counter to take all the file outpurs from the novelprocessor and count how many times between all the books the words where used
 * @ <benjamin powell>
 * @version 1.0
 * Assignment 4
 * Cs322 CompilerConstruction
 * Spring 2024
 *  
 * 
 */


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.io.*;
import java.util.*;

public class WordCounter {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        String file1 = "";
        String file2 = "";
        String file3 = "";
        String file4 = "";
        String file5 = "";
        String file6 = "";

        System.out.println(" please input the name of the first file (/home/benjamin/KnightCode_BDP/Dracula.txt_wc.txt as a example)");
        file1 = scan.nextLine();
        System.out.println(" please input the name of the second file (/home/benjamin/KnightCode_BDP/Dracula.txt_wc.txt as a example)");
        file2 = scan.nextLine();
        System.out.println(" please input the name of the third file (/home/benjamin/KnightCode_BDP/Dracula.txt_wc.txt as a example)");
        file3 = scan.nextLine();
        System.out.println(" please input the name of the 4th file (/home/benjamin/KnightCode_BDP/Dracula.txt_wc.txt as a example)");
        file4 = scan.nextLine();
        System.out.println(" please input the name of the 5th file (/home/benjamin/KnightCode_BDP/Dracula.txt_wc.txt as a example)");
        file5 = scan.nextLine();
        System.out.println(" please input the name of the 6th file (/home/benjamin/KnightCode_BDP/Dracula.txt_wc.txt as a example)");
        file6 = scan.nextLine();

        System.out.println("you put "+file1);

        HashMap <String , Integer> bookHashMap1 = new HashMap<String, Integer>();



        try{
            BufferedReader reader = new BufferedReader(new FileReader(file1));

            String words; 

            while ((words = reader.readLine()) != null) {

                

                bookHashMap1.put(words,words);




                
            }//end of while




            




        }//end of try
        catch(IOException e ){
            e.printStackTrace();
        }//end of catch


        System.out.println("the program ran");

        System.out.println(bookHashMap1);

    }//end of main
    
}//end of WordCounter 
