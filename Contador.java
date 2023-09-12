public class Contador{

    private double valorCount;

    
    public Contador (){

    }
    public Contador(double valorCount) {
        this.valorCount = valorCount;
    }

    public double getValorCount(){
        return valorCount;
    }

    public double zerar(double valorCount) {
        valorCount = 0;
        return valorCount;
    }

    public double incrementar(double valorCount, double valorInc) {
        valorCount = valorCount + valorInc;
        return valorCount;
    }
    
}