package practicas.calculadora.jessicamaciel;

public class Operaciones {
    public int numero1;
    public int numero2;

    public Operaciones (int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
public void suma (){
    int suma = numero1 + numero2;
    System.out.println("El resultado de la suma es: " + suma);
}
    public void resta (){
        int resta = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resta);
    }
    public void multiplicacion (){
        int multiplicacion = numero1 * numero2;
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
    }
public void division (){
    int division = numero1 / numero2;
    System.out.println("El resultado de la división es: " + division);
}
}
