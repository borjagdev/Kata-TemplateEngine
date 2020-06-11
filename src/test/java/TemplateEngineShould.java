import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

public class TemplateEngineShould {

    /* TO DO:
    - ("hola", {}) -> "hola"
    - ("hola `$user`", {}) -> "hola `$user`"
    - ("hola `$name`", {user=Carlos}) -> "hola `$name`"
    - ("hola `$user`, hoy es `$day`", {user=Carlos, day=miercoles}) -> "hola Carlos, hoy es miercoles"
    */

    @Test
    void return_same_input_when_no_variables_are_given() {
        HashMap<String,String> variables = new HashMap<>();
        assertThat(TemplateEngine.parse("Hola", variables)).isEqualTo("Hola");
    }

}
