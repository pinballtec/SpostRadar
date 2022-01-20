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
                JSONArray competitors = (JSONArray) Events.get("competitors");
//                System.out.println("Home team winner: " + probability_home_team_winner);
//                System.out.println("Away team winner: " + probability_away_team_winner);
//                System.out.println("Draw: " + probability_draw);
                  System.out.println("Teams" + competitors);

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


