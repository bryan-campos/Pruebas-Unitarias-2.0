import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPrueba {
    
    public TestPrueba() {
    }
    
     Operaciones var = new Operaciones();
        
        //Test de la comprobacion de numeros
        @Test
        public void testComprobacion1(){
        assertEquals(true, var.comprobar(-1));
        }
        @Test
        public void testComprobacion2(){
        assertEquals(false, var.comprobar(4));
        }
        public void testComprobacion3(){
        assertEquals(true, var.comprobar(-2));
        }
        
        //Test de la comprobacion de numeros
        @Test
        public void testComprobar(){
        assertEquals(true, var.comprobar1(1,1));
        }
        @Test
        public void testComprobar1(){
        assertEquals(false, var.comprobar1(4,2));
        }
        public void testComprobar2(){
        assertEquals(true, var.comprobar1(-2,-2));
        }
    
         //Test de las Horas
        @Test
        public void testComprobarTiempo(){
        assertEquals(var.tiempo(6),360);
        }
          @Test
        public void testComprobarTiempo1(){
        assertEquals(var.tiempo(2),120);
        }
         @Test
        public void testComprobarTiempo2(){
        assertEquals(var.tiempo(3),180);
        }
}
