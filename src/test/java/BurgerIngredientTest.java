import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.extension.ExtendWith;
import praktikum.Burger;
import praktikum.Ingredient;

@ExtendWith(MockitoExtension.class)
public class BurgerIngredientTest {

    @Mock
    private Ingredient ingredient1;

    @Mock
    private Ingredient ingredient2;

    private Burger burger;

    @BeforeEach
    void setUp() {
        burger = new Burger();
        burger.addIngredient(ingredient1);
    }

    // Проверка добавления ингредиентов
    @Test
    void addIngredientAndCheckingList() {
        burger.addIngredient(ingredient2);

        assertEquals(2, burger.ingredients.size());
        assertEquals(ingredient1, burger.ingredients.get(0));
        assertEquals(ingredient2, burger.ingredients.get(1));
    }

    // Проверка удаления единственного ингредиента
    @Test
    void checkingRemoveSingleIngredient() {
        burger.removeIngredient(0);

        assertEquals(0, burger.ingredients.size());
        //assertEquals(mockIngredient1, burger.ingredients.get(0));
    }

    // Проверка удаления ингредиента + сдвиг остальных
    @Test
    void checkingRemoveOneIngredientAndShiftList() {
        burger.addIngredient(ingredient2);
        burger.removeIngredient(0);

        assertEquals(1, burger.ingredients.size());
        assertEquals(ingredient2, burger.ingredients.get(0));
    }

    // Смена ингредиентов местами
    @Test
    void checkMoveIngredients() {
        burger.addIngredient(ingredient2);
        burger.moveIngredient(1, 0);

        assertEquals(2, burger.ingredients.size());
        assertEquals(ingredient2, burger.ingredients.get(0));
        assertEquals(ingredient1, burger.ingredients.get(1));
    }

}
