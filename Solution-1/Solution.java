

public class Solution1 {
    public static void main (String[] args) {
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("12345"));
        System.out.println(validatePin("a234"));
    }
    static char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    static boolean isDigit(char c){
        for (int j = 0; j < 10; j++) {
            if(c==numbers[j]) return true;
        }
        return false;
    }

    public static boolean validatePin(String pin){
        if(pin.length() != 6 && pin.length() != 4) return false;
        for (int i = 0; i < pin.length() ; i++) {
            if(isDigit(pin.charAt(i))==false) {
                return false;
            }
        }
        return true;
    }
}
