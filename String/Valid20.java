package String;

public class Valid20 {
    
     
    public boolean isValid(String s) {

 

        while(s.contains("()") ||
              s.contains("{}") ||
              s.contains("[]")) {

            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
              }
              

        return s.isEmpty();
    }
}
 



 