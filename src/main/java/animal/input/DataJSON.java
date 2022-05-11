package animal.input;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;


public class DataJSON implements Record {

    private static final String PATH_TO_JSON = "C:\\Users\\Михаил\\IdeaProjects\\Animals\\src\\main\\java\\animals.json";

    @Override
    public long getData() throws Exception {
        JSONParser parser = new JSONParser();
        long sum = 0;
        try (FileReader reader = new FileReader(PATH_TO_JSON)) {
            JSONObject json = (JSONObject) parser.parse(reader);
            JSONObject animals = (JSONObject) json.get("Animals");
            for (Object animal : animals.values()) {
                sum += (long) animal;
            }
        }
        return sum;
    }
}

