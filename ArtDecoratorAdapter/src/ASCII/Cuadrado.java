package ASCII;

public class Cuadrado extends AsciiArt {

    public Cuadrado(int longitud, char caracterRelleno) {
        String fila = Character.toString(caracterRelleno).repeat(longitud);
        this.lineas = new String[longitud];
        for (int i = 0; i < longitud; i++) {
            this.lineas[i] = fila;
        }
    }
}
