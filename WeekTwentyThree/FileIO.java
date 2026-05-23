package WeekTwentyThree;

import java.io.*;

public class FileIO {
    static void main(String[] args) {
        String[] names = {"John", "Carl", "Jerry"};
        try {
            // Option 1: Writing to a file
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a file");
            writer.write("\nYou're my sunshine");

            for (String name : names) {
                writer.write("\n" + name);
            }
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
