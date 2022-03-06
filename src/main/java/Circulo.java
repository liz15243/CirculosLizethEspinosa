public class Circulo {
    private double radio;
    private double area;
    private double diametro;
    private double circunferencia;


    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public double getArea() {
        return area;
    }

    public double getDiametro() {
        return diametro;
    }


    public void setArea(double area) {
        this.area = area;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    public void  calcularArea (){
        area = (Math.pow(radio,2))*3.1416;
        System.out.println(area);
    }
    public void calcularDiametro (){
        diametro = radio*2;
        System.out.println(diametro);
    }
    public void calcularCircunferencia (){
        circunferencia = diametro*3.1416;
        System.out.println(circunferencia);
}

public void radio (){
    System.out.println( radio + " es la mitad de la medida de la distancia a través del centro de un círculo");
}
 public Circulo(){
     System.out.println("Calculos");
 }

}
