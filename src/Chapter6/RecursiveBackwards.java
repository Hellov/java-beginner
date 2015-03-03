package Chapter6;

public class RecursiveBackwards {

    public static void main(String[] args) {

        System.out.println(backwards("123456T"));
    }


    private static String backwards (String in) {

        if (in.length() == 1) {
            return in;
        }
        return in.substring(in.length()-1, in.length()) + backwards(in.substring(0, in.length()-1));
    }
}
