import java.util.HashMap;
import java.util.Map;

public class TemplateEngine {
    public static String parse(String template, HashMap<String, String> variables) {
        for (Map.Entry<String, String> pair : variables.entrySet()) {
            String templateVariable = "`$" + pair.getKey() + "`";
            template = template.replace(templateVariable, pair.getValue());
        }
        return template;
    }
}