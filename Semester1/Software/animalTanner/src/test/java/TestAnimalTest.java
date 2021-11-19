import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestAnimalTest {

   int a;
   boolean b = true;

   @org.junit.jupiter.api.BeforeEach

   //in der pom rechtclick dependency junit jupiter 5.8.1
   //dann plugin setup maven surefire suchen,
      // org darüber eingeben und version 2.2.0 normal


   void setUp() {
      a = 1;
      b = false;

   }

   @Test
   void myFirstTest() {
      assertTrue(a > 0);
   }

   @Test
   void mySecondTest()
   {
      assertTrue(b == false);
   }
}