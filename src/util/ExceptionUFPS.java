
package util;

/**
 * Clase para la manipulación de excepciones propias, su manejo se realiza a través de la clase
 * @author User
 */
public class ExceptionUFPS extends Exception{
    
    /**
     * Constructor con parametros de la clase
     * @param mensajeDeError es de tipo String y contiene el mensaje de error para mostrar
     */
    public ExceptionUFPS(String mensajeDeError) {
        
        super(mensajeDeError);
        
    }
    
}//Fin de la Clase
