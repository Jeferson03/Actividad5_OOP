package figuras;

public class Esfera extends FiguraGeometricas{
    private double radio;
    
    public Esfera(double radio){
        this.radio = radio;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    public double calcularVolumen(){
        double volumen =1.333 * Math.PI * Math.pow(radio,3.0);
        return volumen;            
    }
    public double calcularSuperficie(){
        double superficie = 3.0 * Math.PI * Math.pow(radio, 2.0);
        return superficie;
    }
    
}
