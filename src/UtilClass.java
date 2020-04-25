import com.coustomErrorHandling.CoustomErrorH;

public class UtilClass {

    public String checkIfIdentical(int one, int two) throws CoustomErrorH{
       if (one != two){
           throw new CoustomErrorH("Dont match");
       }else{
           String message = "They match";
           return message;
       }
    }

}
