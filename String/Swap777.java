package String;

public class Swap777 {
    

   

    public boolean canTransform(String start, String end) {

        int n = start.length();

        int i = 0;
        int j = 0;

        while (i < n || j < n) {

            while (i < n && start.charAt(i) == 'X') {
                i++;
            }

            while (j < n && end.charAt(j) == 'X') {
                j++;
            }

            if (i == n || j == n) {
                return i == n && j == n;
            }

            if (start.charAt(i) != end.charAt(j)) {
                return false;
            }

            // L cannot move right
            if (start.charAt(i) == 'L' && i < j) {
                return false;
            }

            // R cannot move left
            if (start.charAt(i) == 'R' && i > j) {
                return false;
            }

            i++;
            j++;
        }

        return true;
    }
}
 
