package cat.roser.lletdeproximitat.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roser
 */
public class Camio {
    private double pesMax;
    private double carrega;
    private double litresTotal;
    private List<Vaca> vaques;

    public Camio(double pesMax) {
        this.pesMax = pesMax;
        this.litresTotal = 0.0;
        this.carrega = 0.0;
        this.vaques = new ArrayList<>();
    }

    public double getPesMax() {
        return pesMax;
    }

    public double getCarrega() {
        return carrega;
    }
    
    public double getLitresTotal() {
        return litresTotal;
    }

    public List<Vaca> getVaques() {
        return vaques;
    }
    
   

    @Override
    public String toString() {
        return "Camio{" + "pesMax=" + pesMax + ", litresTotal=" + litresTotal + ", vaques=" + vaques + '}';
    }
    
    /**
     * Afegeix una vaca al camió.
     * Calcula la carrega del camió. Si sobrepasa el pesTotal, no afegeix la
     * vaca, en cas contrari l'afegeix, actualitza la càrrega
     * i calcula els litresTotal.
     * @param newVaca 
     */
    public boolean afegirVaca(Vaca newVaca){
        boolean result = false;
        if(!vaques.contains(newVaca)) {
            if(pesMax>=carrega +newVaca.getPes() ){
           
                if (vaques.add(newVaca)) {
                    carrega  += newVaca.getPes();
                    litresTotal += newVaca.getLlet();
                    result = true;
                }
            }
        }
        return result;
    }
    
    /**
    * Si la vaca existeix en el camió, la treu i actualitza la carrega i els
    * litresTotal
    */
    public boolean treureVaca(Vaca remVaca){
        
        boolean result = false;
       
        if(vaques.remove(remVaca)){
            this.carrega = this.carrega - remVaca.getPes();
            this.litresTotal = this.litresTotal - remVaca.getLlet();
            result = true;
        }
        return result;
        
    }
    
    
    
}
