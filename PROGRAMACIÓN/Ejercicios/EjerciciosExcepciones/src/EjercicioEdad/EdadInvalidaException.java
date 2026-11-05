package EjercicioEdad;

public class EdadInvalidaException extends Exception {


        public EdadInvalidaException(String mensaje) {
            super();
        }
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa");
        }
        if (edad > 120) {
            throw new EdadInvalidaException("La edad no puede ser mayor que 120");
        }
    }
}
