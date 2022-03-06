import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.FileReader;

public class parser {
    public static void parseJSON() throws Exception {
        Object parseObj = new JSONParser().parse(new FileReader("config.json"));
        JSONObject jObj = (JSONObject) parseObj; // narrowing casting

        String date = (String) jObj.get("Date");
        // TODO: iterate through JSON and return list of keys and values
    }
}
