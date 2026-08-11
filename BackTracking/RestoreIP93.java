package BackTracking;
import java.util.*;
 
public class RestoreIP93{
    List<String> ans=new ArrayList<>();
    List<String> path=new ArrayList<>();

public   List<String> RestoreIp(String s){
        
     

    helper(0,0,s);
    return ans;
}

public   void helper(int index,int part,String s){
     
     

    if(part==4){
        if(index==s.length()){
            ans.add(String.join(".",path));
        }
        return ;
    }
     
    for(int i=index;i<Math.min(s.length(),index+3);i++){

        String segment =s.substring(index,i+1);

        if(Integer.parseInt(segment)>255){
            break;
        }
        if (segment.length() > 1 && segment.charAt(0) == '0') {
                break;
            }

            path.add(segment);

            helper(i+1,part+1,s);

            path.remove(path.size()-1);


    }



}


}