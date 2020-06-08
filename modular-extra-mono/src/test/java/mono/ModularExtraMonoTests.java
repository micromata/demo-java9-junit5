package mono;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Modular Extra Mono Tests // main -> _no sources_ | test -> 'module mono'")
class ModularExtraMonoTests {

  @Test
  void modular() {
    var module = getClass().getModule();
    Assertions.assertTrue(module.isNamed());
    Assertions.assertEquals("mono", module.getName());
  }
}
