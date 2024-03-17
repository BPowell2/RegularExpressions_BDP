import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.io.IOException;

public class LogFileProcessor {

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);

        String filename = "";

        int printFlag = 0;

        int howmany = 0;

        System.out.println("please input file name ");

        filename = scan.nextLine();

        System.out.println("please input the state you wish the printflag to be ");

        printFlag=scan.nextInt();

        

        String Currentline;



        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            Pattern pattern = Pattern.compile("1");

            while (( Currentline = reader.readLine()) != null) {

                Matcher matcher = pattern.matcher(Currentline);
                Boolean matchfound = matcher.find();

                if (matchfound) {
                    howmany++;
                }//end of if 

               



            }//end of while

            System.out.println("the amount of ips are "+howmany);




        }//end of try
        catch(IOException e){
            e.printStackTrace();
        }//end of catch





        System.out.println("the program has ran");

    }//end of main
    
}//end of LogFileProcessor
