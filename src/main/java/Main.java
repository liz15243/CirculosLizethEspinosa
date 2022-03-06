public class Main {
    public static void main(String[] args) {
        Circulo objetoNoSirve = new Circulo();
        Circulo objetocalculoUno = new Circulo(4.5);
        System.out.println("Area: " + objetocalculoUno.calcularArea());
        System.out.println("Diametro: " + objetocalculoUno.calcularDiametro());
        System.out.println("Circunferencia: " + objetocalculoUno.calcularCircunferencia());



    }

}
