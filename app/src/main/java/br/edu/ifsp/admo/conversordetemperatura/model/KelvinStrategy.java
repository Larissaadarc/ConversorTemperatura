package br.edu.ifsp.admo.conversordetemperatura.model;

public class KelvinStrategy implements ConversorTemperatura {
    private static KelvinStrategy instance;
    private KelvinStrategy(){  }
    public static KelvinStrategy getInstance(){
        if(instance==null){
            instance=new KelvinStrategy();
        }
        return instance;
    }
    @Override
    public double converter(double temperatura){
        return (temperatura - 32) / 1.8;
    }

}
