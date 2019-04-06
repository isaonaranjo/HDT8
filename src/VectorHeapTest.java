/**
 *  Clase Test de VectorHeap
 * @author Isabel Ortiz 18176
 * @author Diego Estrada 18540
 */
import static org.junit.Assert.*;

public class VectorHeapTest {

    /**
     * Test de Remove
     */
    @org.junit.Test
    public void remove() {
        Patient patient = new Patient("Luisa", "Golpe", "A");
        System.out.println("remove");
        VectorHeap instance = new VectorHeap();
        instance.add(patient);
        Object expResult = patient;
        Object result = instance.remove();
        assertEquals(expResult, result);

    }

    /**
     * Test de getFirst
     */
    @org.junit.Test
    public void getFirst() {
        System.out.println("getFirst");
        Patient patient = new Patient("Luisa", "Golpe", "A");
        VectorHeap instance = new VectorHeap();
        instance.add(patient);
        Object expResult = patient;
        Object result = instance.getFirst();
        assertEquals (expResult, result);
    }

    /**
     * Test de Add
     */
    @org.junit.Test
    public void add() {
        System.out.println("add");
        VectorHeap instance = new VectorHeap();
        instance.add(new Patient("Luisa", "Golpe", "A"));
    }
}
