package praktikum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BurgerPriceAndReceiptTest {

    @Mock
    private Bun bun;

    @Mock
    private Ingredient sauce;

    @Mock
    private Ingredient filling;

    // getPrice()
    @Test
    void checkReturnGetPrice() {
        Burger burger = new Burger();

        when(bun.getPrice()).thenReturn(10f);
        when(sauce.getPrice()).thenReturn(20f);
        when(filling.getPrice()).thenReturn(30f);

        burger.bun = bun;
        burger.addIngredient(sauce);
        burger.addIngredient(filling);

        float actual = burger.getPrice();

        // (10*2)+20+30=70
        assertEquals(70, actual);
    }

    // getReceipt()
    @Test
    void checkReturnGetReceipt() {
        Burger burger = new Burger();

        when(bun.getName()).thenReturn("Булочка с кунжутом");
        when(bun.getPrice()).thenReturn(10f);

        when(sauce.getType()).thenReturn(IngredientType.SAUCE);
        when(sauce.getName()).thenReturn("Кетчуп");
        when(sauce.getPrice()).thenReturn(20f);

        when(filling.getType()).thenReturn(IngredientType.FILLING);
        when(filling.getName()).thenReturn("Котлета");
        when(filling.getPrice()).thenReturn(30f);

        burger.bun = bun;
        burger.addIngredient(sauce);
        burger.addIngredient(filling);

        String actual = burger.getReceipt();

        String expected = String.format(
                "(==== %s ====)%n" +
                "= %s %s =%n" +
                "= %s %s =%n" +
                "(==== %s ====)%n" +
                "%nPrice: %f%n",
                "Булочка с кунжутом",
                "sauce", "Кетчуп",
                "filling", "Котлета",
                "Булочка с кунжутом",
                70f
        );

        assertEquals(expected, actual);
    }

}
