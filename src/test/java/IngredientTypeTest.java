import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;
import praktikum.IngredientType;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class IngredientTypeTest {

    static Stream<Arguments> listTypeIngredient() {
        return Stream.of(
                Arguments.of("SAUCE", IngredientType.SAUCE),
                Arguments.of("FILLING", IngredientType.FILLING)
        );
    }

    @ParameterizedTest
    @MethodSource("listTypeIngredient")
    void doesReturnIngredientTypeCorrectValue(String type, IngredientType ingredientType) {
        assertEquals(type, ingredientType.name());
    }

}
