import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

public class TemplateEngineShould {

    /* TO DO:
    - ("hola", {}) -> "hola"
    - ("hola `$user`", {}) -> "hola `$user`"
    - ("hola `$name`", {user=Carlos}) -> "hola Carlos"
    - ("hola `$user`, hoy es `$day`", {user=Carlos, day=miercoles}) -> "hola Carlos, hoy es miercoles"
    */

    @Test
    void return_same_input_when_no_variables_are_given() {
        HashMap<String, String> variables = new HashMap<>();
        assertThat(TemplateEngine.parse("Hola", variables)).isEqualTo("Hola");
        assertThat(TemplateEngine.parse("Hola `$user`", variables)).isEqualTo("Hola `$user`");
    }

    @Test
    void parse_template_and_substitute_a_variable() {
        HashMap<String, String> variables = new HashMap<>();
        variables.put("user", "Carlos");
        assertThat(TemplateEngine.parse("Hola `$user`", variables)).isEqualTo("Hola Carlos");
    }

    @Test
    void parse_template_and_substitute_all_variables() {
        HashMap<String, String> variables = new HashMap<>();
        variables.put("user", "Carlos");
        variables.put("day", "jueves");
        assertThat(TemplateEngine.parse("Hola `$user`, hoy es `$day`", variables))
                .isEqualTo("Hola Carlos, hoy es jueves");
    }

}
