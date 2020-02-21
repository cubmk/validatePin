public class Solution {

    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("12345"));
        System.out.println(validatePin("a234"));
    }

    public static boolean validatePin(String pin){
        int size = pin.length();
        if (size!=4 && size!= 6) return false;
        for (int i = 0; i < size; i++) {
            int character=pin.charAt(i);
            if(character<48 || 58<character) return false;
        }
        return true;
    }
}
