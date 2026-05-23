package WeekTwentyThree;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        baos.write("Hello ".getBytes(StandardCharsets.UTF_8));
        baos.write("Suvam".getBytes(StandardCharsets.UTF_8));

        byte[] data = baos.toByteArray();
        String text = baos.toString(StandardCharsets.UTF_8);

        System.out.println(text);
        System.out.println(data.length);
    }
}