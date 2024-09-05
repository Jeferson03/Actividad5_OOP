package figuras;

public class Piramide extends FiguraGeometricas {
    private double base;
    private double altura;
    private double apotema;
    
    public Piramide(double base, double altura, double apotema){
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setSuperficie(calcularSuperficie());
        this.setVolumen(calcularVolumen());
    }
    public double calcularVolumen(){
        double volumen = (Math.pow(base, 2.0)* altura)/3.0;
        return volumen;
    }
    public double calcularSuperficie(){
        double area_base = Math.pow(base,2.0);
        double area_lado = 2.0 * base * apotema;
        return area_base + area_lado;
    }
}
