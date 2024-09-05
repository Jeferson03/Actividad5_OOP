package figuras;

public class Cilindro extends FiguraGeometricas {
    private double radio;
    private double altura;
    
    public Cilindro(double radio, double altura){
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    public double calcularVolumen(){
        double volumen = Math.PI * altura * Math.pow(radio, 2.0);
        return volumen;
    }
    public double calcularSuperficie(){
        double area_ladoA = 2.0 * Math.PI * radio * altura;
        double area_ladoB = 2.0 * Math.PI * Math.pow(radio, 2.0);
        return area_ladoA + area_ladoB;
    }
}
