public class PalindromeChecker {
    public static void main(String[] args) {
        
        String car = "rarcecar";
        
        System.out.println(isPalindromeRecursive(car, 0, car.length()-1));
        
    }

    
    private static Boolean isPalindromeRecursive(String car, int start, int end) {

        if(start >= end){
            return true;
        }

        if(car.charAt(start) != car.charAt(end)){
            return false;
        }

        return isPalindromeRecursive(car, start+1, end-1);
    }
}
