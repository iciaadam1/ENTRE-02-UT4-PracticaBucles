import java.util.Random;
/**
 *    
 */
public class PracticaBucles {
    private final char ESPACIO = ' ';
    private final char CARACTER = '\u0040';
    private Random generador;

    /**
     * Constructor  
     */
    public PracticaBucles()    {
        generador = new Random();
    }

    /**
     *  El método  genera  números aleatorios  entre -1000 y 5000 (inclusive)
     *  y calcula y escribe:
     *      - la media de todos los números
     *      - la suma de los impares
     *      - el máximo de los pares
     *        
     *  El proceso termina cuando sale un 0 o bien se han escrito n nºs
     *  
     *  Los números se escriben  en filas de 5 columnas 
     *  Cada nº aleatorio se muestra en un espacio de 12 posiciones en la pantalla  
     *  y al lado de cada nº se muestra otro nº con las mismas cifras y 
     *  en el mismo orden pero sin ceros (en 5 posiciones)
     *  
     *   Utiliza solo bucles while
     */
    public void generarNumeros(int n)   {
    String str = "";
    int sumaNumeros = 0;
    int sumaImpares = 0;
    int maximoPar = 0;
    for(int i=1; i<=n; i++){
        int numeroGenerado = generador.nextInt(4001)-1000;
        sumaNumeros += numeroGenerado;
        if(esImpar(numeroGenerado)){
        sumaImpares = numeroGenerado;
        }
        else{
        if(numeroGenerado>=maximoPar){
         maximoPar = numeroGenerado;
        }
        }
        }
    int media = sumaNumeros/n;
    System.out.println("Media: "+ media + "\nSuma impares: "+ sumaImpares + "\nMáximo pares: "+ maximoPar); 
    
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        return numero % 2 != 0;
    }

    /**
     *  Dado un nº genera y devuelve otro nuevo 
     *  con las mismas cifras y en el mismo orden pero sin 
     *  los 0
     *  Ej - si numero = 2040 devuelve  24, si numero = 1009 devuelve  19
     *  si numero = 3000 devuelve 3
     *   
     *   
     */
    public int obtenerNumeroSinCeros(int numero)   {
        int cifra = 0;
        int numeroSin0 = 0;
        int multiplicar = 1;
        while(numero>0){ 
        cifra = numero%10; 
        if(cifra!=0){
        numeroSin0 = numeroSin0 + cifra * multiplicar;
        multiplicar = multiplicar*10;
        }
        numero = numero/10;
        }
        return numeroSin0;
     }

    /**
     *  Borrar la pantalla
     *
     */
    public void borrarPantalla()    {
        System.out.println('\u000C');
    }

    /**
     *  
     *  Dibuja la letra N (ver figura en el enunciado)
     *  Con bucles for
     *  
     *  Hay que usar el método escribirCaracter()
     *  
     *  
     *   
     */
    public void escribirLetraN(int altura)    {
        String caracter = "@";
        String str = "";
        int fila = 0;
        int col = 0;
        int espacios1 = fila-1;
        int espacios2 = altura-fila;
        for(fila = 1; fila<=altura; fila++){
        for(col = 3; col <=altura ; col++){
            
         
        System.out.printf("\n%" + espacios1 + "@" );
        }
        }

    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
       for(int i = 1; i<=n; i++){
        System.out.print(caracter);
        }
       
       
       
       
    }

}
