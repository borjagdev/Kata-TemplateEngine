import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TemplateEngine {
    public static String parse(String template, HashMap<String, String> variables) {
        if (!variables.isEmpty()) {
            Iterator<Map.Entry<String, String>> iterator = variables.entrySet().iterator();
            String key = iterator.next().getKey();
            String value = variables.get(key);
            String templateVariable = "`$" + key + "`";
            template = template.replace(templateVariable, value);

            if (iterator.hasNext()) {
                key = iterator.next().getKey();
                value = variables.get(key);
                templateVariable = "`$" + key + "`";
                template = template.replace(templateVariable, value);
            }
        }
        return template;
    }
}
