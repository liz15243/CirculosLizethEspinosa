public class Circulo {
    public double radio;
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    public double calcularArea (){
        double area;
        area = (Math.pow(radio,2))*3.1416;

        return area;
    }
    public double calcularDiametro (){
        double diametro;
        diametro = radio*2;

        return diametro;
    }
public double calcularCircunferencia (){
        double circunferencia;
        circunferencia = calcularDiametro()*3.1416;

        return circunferencia;
}



}
