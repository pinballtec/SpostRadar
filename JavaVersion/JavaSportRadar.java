import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



public class JavaSportRadar {
    public static void main(String[] args) throws Exception{
        JSONParser parser= new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("D:\\new_beginning\\SportRadar\\data.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray subjects = (JSONArray)jsonObject.get("Events");
            for (int i=0; i<subjects.size();i++)
            {
                JSONObject Events=(JSONObject)subjects.get(i);

                Number probability_home_team_winner = (Number) Events.get("probability_home_team_winner");
                Number probability_draw = (Number) Events.get("probability_draw");
                Number probability_away_team_winner = (Number) Events.get("probability_away_team_winner");
                String start_date = (String) Events.get("start_date");
                System.out.print(start_date + " ");
//                System.out.println("Home team winner: " + probability_home_team_winner);
//                System.out.println("Away team winner: " + probability_away_team_winner);
//                  System.out.println(Events);
                JSONArray array = (JSONArray)Events.get("competitors");

                for (int a=0;a<array.size();a++){
                    JSONObject team_name = (JSONObject)array.get(a);
                    String name = (String) team_name.get("name");
                    String qualifier = (String) team_name.get("qualifier");
                    System.out.print(" Team name is: " + name + ",");
                    System.out.print(" Team qualifier is  " + qualifier + ", ");
                }
                }


            //Iterator iterator = subjects.iterator();
            //while (iterator.hasNext()) {
                //System.out.println(iterator.next());
            //}
        } catch(Exception e) {
            e.printStackTrace();
        }

        }
    }


