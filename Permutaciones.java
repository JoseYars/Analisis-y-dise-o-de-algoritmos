import java.util.Arrays;

/* En el siguiente codigo hacemos uso de los metodos recursivos para
generar permutaciones gracias a la funcion generarPermutaciones
realiza los intercambios necesarios con ayuda de la funcion intercambiar que
cambia de lugar dos numeros hasta generar todas las iteraciones, tambien
se mide el tiempo de ejecucion del programa */ 


public class Permutaciones {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4 ,5, 6, 7, 8};

        // Obtener el tiempo de inicio
        long inicioTiempo = System.currentTimeMillis();

        // Llamar a la función para generar permutaciones
        generarPermutaciones(array, 0);

        // Obtener el tiempo de finalización
        long finTiempo = System.currentTimeMillis();

        // Calcular y mostrar el tiempo total de ejecución
        long tiempoTotal = finTiempo - inicioTiempo;
        System.out.println("Tiempo de ejecución: " + tiempoTotal + " milisegundos");
    }

    // Función para generar todas las permutaciones
    public static void generarPermutaciones(int[] array, int indice) {
        if (indice == array.length - 1) {
            // Se ha alcanzado el final del array, imprimir la permutación
            System.out.println(Arrays.toString(array));
        } else {
            for (int i = indice; i < array.length; i++) {
                // Intercambiar los elementos en las posiciones indice e i
                intercambiar(array, indice, i);
                // Llamar recursivamente para el siguiente índice
                generarPermutaciones(array, indice + 1);
                // Deshacer el intercambio para volver al estado anterior
                intercambiar(array, indice, i);
            }
        }
    }

    // Función para intercambiar dos elementos en un array
    public static void intercambiar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
