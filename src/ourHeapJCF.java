/**
 *  Clase ourHeapJavaCollectionsFramework
 *
 * @author Isabel Ortiz 18176
 * @author Diego Estrada 18540
 */
import java.util.PriorityQueue;

/**
 * @param <E> vector
 */
public class ourHeapJCF<E> {

   // Atributos
    protected PriorityQueue ourHeap;

    /**
     * Nuevo ourHeapJCF
     */
    public ourHeapJCF() {
        ourHeap = new PriorityQueue<E>();
    }

    /**
     * @param vector vector de tipo PriorityQueue
     */
    public ourHeapJCF(PriorityQueue<E> vector) {
        ourHeap = new PriorityQueue<E>(vector.size());
        for (int i = 0; i < vector.size(); i++) {
            vector.poll();
        }
    }

    /**
     * Agrega pacientes nuevos
     *
     * @param value paciente
     */
    public void add(E value) {
        ourHeap.add(value);
    }

    /**
     * Se llama al paciente siguiente y lo atiende sacandolo de la cola
     * @return nombre del paciente atendido
     */
    public String next() {
        if (!ourHeap.isEmpty()) {
            String patient = ourHeap.poll().toString();
            return patient;
        } else {
            String message = "No hay pacientes";
            return message;
        }
    }
    /**
     * Revisa el paciente siguiente con mayor prioridad
     * @return retorna el paciente con mayor prioridad
     */
    public String check() {
        if (!ourHeap.isEmpty()) {
            String patient = ourHeap.peek().toString();
            return patient;
        } else {
            String message = "No hay pacientes";
            return message;
        }
    }
}
