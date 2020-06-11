import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TemplateEngine {
    public static String parse(String template, HashMap<String, String> variables) {
        Iterator<Map.Entry<String, String>> iterator = variables.entrySet().iterator();
        String key;
        String value;
        String templateVariable;
        while (iterator.hasNext()) {
            key = iterator.next().getKey();
            value = variables.get(key);
            templateVariable = "`$" + key + "`";
            template = template.replace(templateVariable, value);
        }

        return template;
    }
}