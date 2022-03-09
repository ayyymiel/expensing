import org.json.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileWriter;

public class parser {
    public static void writeJSON(JSONObject writtenItems) throws Exception{
        try (FileWriter file = new FileWriter("config.json")) {
            file.write((writtenItems.toJSONString()));
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double readJSON(String expType) throws Exception {
        JSONParser parseJson = new JSONParser();
        try (FileReader reader = new FileReader("config.json")) {
            Object readerObj = parseJson.parse(reader);
            JSONObject jsonObj = (JSONObject) readerObj;

            return (double) jsonObj.get(expType);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
