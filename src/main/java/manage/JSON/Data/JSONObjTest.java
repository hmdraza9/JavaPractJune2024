package manage.JSON.Data;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;


public class JSONObjTest {
    public static void main(String[] args) throws IOException, ParseException {
        JSONObject jo = new JSONObject();
        jo.put("name","Nick");
        jo.put("City","Leh");
        jo.put("Age","23");
        jo.put("Phone","1234567890");
        jo.put("DOB","1-1-1990");
        JSONObject mo = new JSONObject();
        mo.put("Marital Status","Married");
        mo.put("Spouse","Seb");
        mo.put("Kids","yes");
        jo.put("Married",mo);
        System.out.println("Jo: "+jo);

        Object obj = new JSONParser().parse(new FileReader("Data/JSON/Test.json"));
        JSONObject jObj = (JSONObject)obj;
        String name = (String)jObj.get("name");
        System.out.println("Name: "+name);
    }
}
