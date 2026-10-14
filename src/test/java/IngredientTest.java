import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class IngredientTest {

    private IngredientType type = IngredientType.SAUCE;
    private String name = "Котлета";
    private float price = 20;

    @Test
    public void getReturnPriceIngredient() {
        Ingredient ingredient = new Ingredient (type, name, price);
        assertEquals(price, ingredient.getPrice());
    }

    @Test
    public void getReturnNameIngredient() {
        Ingredient ingredient = new Ingredient (type, name, price);
        assertEquals(name, ingredient.getName());
    }

    @Test
    public void getReturnTypeIngredient() {
        Ingredient ingredient = new Ingredient (type, name, price);
        assertEquals(type, ingredient.getType());
    }


}
