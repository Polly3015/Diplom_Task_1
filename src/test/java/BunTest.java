import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import praktikum.Bun;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class BunTest {

    @Test
    public void getReturnName() {
        Bun bun = new Bun("Мягкая", 10);
        assertEquals("Мягкая", bun.getName());
    }

    @Test
    public void getReturnPrice() {
        Bun bun = new Bun("Мягкая", 10);
        assertEquals(10, bun.getPrice());
    }

}
