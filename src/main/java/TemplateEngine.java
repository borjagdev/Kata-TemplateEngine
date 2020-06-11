import java.util.HashMap;

public class TemplateEngine {
    public static String parse(String template, HashMap<String, String> variables) {
        if (!variables.isEmpty()) {
            String key = variables.entrySet().iterator().next().getKey();
            String value = variables.get(key);
            String templateVariable = "`$" + key + "`";
            template = template.replace(templateVariable, value);
        }
        return template;
    }
}
