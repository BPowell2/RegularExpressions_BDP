/*
 * this is the novelProcessor its job is to take files and then find how many time each phrase is used in the book file passed
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
 
 //standard imports i used most of them at first i started with trying to read the text files with a scanner but then found it wouldnt work unless i used buffered readers and writers instead
 
 
 
 public class NovelProcessor {
 
     public static void main (String [] args){
 
         Scanner scan = new Scanner(System.in);
 
         int howManyLines=0;
         int howManyGloomys =0;
         int howManyHaunting =0;
         int howManyMysterious =0;
         int howManyForbode =0;
         int howManyMelancholic=0;
         int howManyTerror =0;
         int howManyDesolate =0;
 
         //setting up the counter for each word
 
         
         
         ///home/benjamin/KnightCode_BDP/Dracula.txt
 
         
 
         System.out.println("please enter the name of the text (please put exact file name /home/benjamin/KnightCode_BDP/Dracula.txt as a example)");
 
         String Bookname = scan.nextLine();
 
 
 
         System.out.println("please enter the regex file name (please put exact path /home/benjamin/KnightCode_BDP/Regex.txt for example)");
 
 
         String RegexFileName = scan.nextLine();
 
         System.out.println("you entered " +RegexFileName);
 
         //just having the user pass the file names they want searched 
 
        
         
 
         try{
 
 
         // here i made the buffered reader for the book file and the regex file so we can read it 
         // and use the regex to find how many times its used
         BufferedReader reader = new BufferedReader(new FileReader(Bookname));
 
         BufferedReader readerReg = new BufferedReader(new FileReader(RegexFileName));
 
         BufferedWriter writer = new BufferedWriter(new FileWriter(Bookname+"_wc.txt"));
 
         String CurrentLineOFBook;
         
 
         //here i set up the patterns for each word passing each word i want to find not worrying about if its capitol or not 
 
         Pattern pattern = Pattern.compile(readerReg.readLine(), Pattern.CASE_INSENSITIVE);
         Pattern pattern2 = Pattern.compile("haunting", Pattern.CASE_INSENSITIVE);
         Pattern pattern3 = Pattern.compile("Mysterious", Pattern.CASE_INSENSITIVE);
         Pattern pattern4 = Pattern.compile("Foreboding", Pattern.CASE_INSENSITIVE);
         Pattern pattern5 = Pattern.compile("Meloncholic", Pattern.CASE_INSENSITIVE);
         Pattern pattern6 = Pattern.compile("Terror", Pattern.CASE_INSENSITIVE);
         Pattern pattern7 = Pattern.compile("Desolate", Pattern.CASE_INSENSITIVE);
         
 
         System.out.println(reader.readLine());
 
         
 
       
 
         
             //this is a while statement to go though every line of text file passed
         
         while ((CurrentLineOFBook = reader.readLine()) != null) {
             
 
             
             //here for each pattern i go though the text file and each time the word appears i then increment the
             //how many int varibles made at the start of the code by one so we can keep track of 
             //how many times they each appear
             Matcher matcher = pattern.matcher(CurrentLineOFBook);
             boolean matchFound = matcher.find();
             if (matchFound) {
                 System.out.println(" a gloomy was found ");
                 howManyGloomys++;
                 
             }//end of if statement
             Matcher matcher2 = pattern2.matcher(CurrentLineOFBook);
             boolean matchFound2 = matcher2.find();
 
             if(matchFound2){
 
                 howManyHaunting++;
 
             }//end of second if statement
             Matcher matcher3 = pattern3.matcher(CurrentLineOFBook);
             boolean matchFound3 = matcher3.find();
 
             if(matchFound3){
 
                 howManyMysterious++;
 
             }//end of third if statement
 
             Matcher matcher4 = pattern4.matcher(CurrentLineOFBook);
             boolean matchFound4 = matcher4.find();
 
             if(matchFound4){
 
                 howManyForbode++;
 
             }//end of 4th if statement
 
             Matcher matcher5 = pattern5.matcher(CurrentLineOFBook);
             boolean matchFound5 = matcher5.find();
 
             if(matchFound5){
 
                 howManyMelancholic++;
 
             }//end of 5th if statement
 
             Matcher matcher6 = pattern6.matcher(CurrentLineOFBook);
             boolean matchFound6 = matcher6.find();
 
             if(matchFound6){
 
                 howManyTerror++;
 
             }//end of 6th if statement
 
             Matcher matcher7 = pattern7.matcher(CurrentLineOFBook);
             boolean matchFound7 = matcher7.find();
 
             if(matchFound7){
 
                 howManyDesolate++;
 
             }//end of 7th if statement
 
             System.out.println(CurrentLineOFBook);
             howManyLines++;
             
 
             
       
         }//end of first while loop
 
         //here i then use the bufferedWriter from eailer to write each word then how many times they where used
         //to a file with the name of the file passed though at the start with _wc.txt at the end to keep them seprate
 
             writer.write("Gloomy|"+howManyGloomys);
             writer.write("\n Haunting|"+howManyHaunting);
             writer.write("\n Mysterious|"+howManyMysterious);
             writer.write("\n Foreboding|"+howManyForbode);
             writer.write("\n Melancholic|"+howManyMelancholic);
             writer.write("\n Terror|"+howManyTerror);
             writer.write("\n Desolate|"+howManyDesolate);
 
             writer.close();
             reader.close();
 
         }//end of try
         catch(IOException e){
             e.printStackTrace();
 
         }//end of catch
 
         //generic catch statement since buffered readers and writer force u to be inside of a try catch
 
 
 
         System.out.println("you wrote " +Bookname+" there where "+howManyLines+" lines of text in this book and the word gloomy was used "+howManyGloomys+"  times"+" and haunting was said "+howManyHaunting+" the word Mysterious was said "+howManyMysterious+" times"+" forbode was said "+howManyForbode+" times"+" the word Meloncholic was said "+howManyMelancholic+" times"+" the word terror was said "+howManyTerror+" times "+" the word desolate was said "+howManyDesolate+" times" );
 
 
        
 
 
         System.out.println("the program ran");
 
     }//end of main
     
 }//end of NovelProcessor
 
