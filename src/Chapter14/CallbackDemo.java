package Chapter14;

public class CallbackDemo {

    public static void main(String[] args) {
        CallbackFunc reverse = str -> {
            String result = "";
            for (int length = str.length()-1; length >= 0; length-- ) {
                result += str.charAt(length);
            }

            return result;
        };
        CallbackFunc lower = String::toLowerCase;

        doSome(reverse);
        doSome(lower);
    }

    public static void doSome(CallbackFunc func) {
        System.out.println(func.changeString("Hello World!"));
    }
}

interface CallbackFunc {
    String changeString(String str);
}