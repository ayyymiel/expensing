import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.FileReader;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileWriter;
import java.util.List;
import java.util.ArrayList;

public class parser {
    public static void writeJSON(JSONObject writtenItems) throws Exception{
        try (FileWriter file = new FileWriter("resources/config.json")) {
            file.write((writtenItems.toJSONString()));
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readJSON() {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("resources/config.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray configArray = (JSONArray)  jsonObject.get("Config Array");
            String[] configList = new String[configArray.size()];
            System.out.println(configList[0]);

        } catch (ParseException | IOException e) {
        e.printStackTrace();
        }
    }
}
