package WeekTwentyThree;

import java.io.*;

public class FileExample {

    public static void writeToFile()
    {
        //Write to file
        try(FileWriter fw=new FileWriter("c:\\ICP-Programming\\FileExample.txt"))
        {
            fw.write("Name,age,grade");
            fw.write("\na,12,4.0");
            fw.write("\nb,13,3.0");
            fw.write("\nc,14,2.0");
            fw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("PRogram enfaf");
        }
    }
    public static void readFile()
    {
        //Read from file

        try(BufferedReader fr = new BufferedReader(new FileReader("c:\\ICP-Programming\\FileExample.txt")))
        {
            String line;
            fr.readLine(); //Skip the header
            while((line=fr.readLine())!=null)
            {
                String[] fields=line.split(",");
                String name=fields[0].trim();
                int age=Integer.parseInt(fields[1].trim());
                double grade=Double.parseDouble(fields[2].trim());
                System.out.println(name+" | "+age+" | "+grade);

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) {
        writeToFile();
        readFile();
    }
}