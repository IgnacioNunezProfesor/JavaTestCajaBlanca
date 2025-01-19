package EED;

import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.api.Test;
 
class MatematicasTest { 
    @Test
    void addition() {
        assertEquals(2, Matematicas.add(1, 1));
        assertNotEquals(5, Matematicas.add(1, 1));
    } 
}