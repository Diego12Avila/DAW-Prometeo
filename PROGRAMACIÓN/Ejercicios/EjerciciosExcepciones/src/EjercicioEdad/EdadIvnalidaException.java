package EjercicioEdad;

// Hereda de Exception para ser una excepción verificada (checked)
public class EdadInvalidaException extends Exception {

    // Constructor que recibe el mensaje de error personalizado
    public EdadInvalidaException(String mensaje) {
        // Pasamos el mensaje al constructor de la clase base (Exception)
        // Esto hace que e.getMessage() devuelva este texto automáticamente
        super(mensaje);
    }
}