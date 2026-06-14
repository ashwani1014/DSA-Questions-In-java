package String;
public class replace {
     public String defangIPaddr(String address) {
       String ans = address.replace(".", "[.]");
        return ans;
    }
}
