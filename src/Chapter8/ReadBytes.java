package Chapter8;

import java.io.IOException;

public class ReadBytes {

    public static void main(String[] args) throws IOException {

        byte[] data = new byte[10];

        System.out.println("Enter some characters:");
        System.in.read(data);

        System.out.println("You have entered:");
        for (byte item: data) {
            System.out.print((char)item);
        }

    }
}
