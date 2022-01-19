import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;


public class JavaSportRadar {
    public static void main(String[] args){
        JSONParser parser= new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("D:\\new_beginning\\SportRadar\\data.json"));
            JSONObject jsonObject = (JSONObject)obj;
            JSONArray subjects = (JSONArray)jsonObject.get("Events");
            System.out.println("Events:");
            Iterator iterator = subjects.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

