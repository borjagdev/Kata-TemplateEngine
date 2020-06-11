import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TemplateEngineShould {

    @Test
    public void test() {
        assertThat(TemplateEngine.parse("")).isEqualTo("");
    }
}
