package Chapter8;

import java.io.*;

public class FIleStream {

    public static void main(String[] args) throws IOException {

        File file = new File(
                System.getProperty("user.home") + "/Desktop/test.txt"
        );
        FileOutputStream writeMe = new FileOutputStream(file, true);
        writeMe.write((int)'X');
        writeMe.close();

        FileInputStream readMe = new FileInputStream(file);

        int item;
        do {
            item = readMe.read();
            if (item != -1) {
                System.out.print((char) item);
            }

        } while (item != -1);
        readMe.close();

    }
}
