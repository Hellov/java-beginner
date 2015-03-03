package Chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadCharacters {

    public static void main(String[] args) throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String str;
        do {
            str = input.readLine();
            System.out.println(str);
        } while (!str.equals("!STOP"));

    }
}
