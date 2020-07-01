package cat.roser.lletdeproximitat.model;

import java.util.Objects;

/**
 * TAD class for Raca
 * @author roser
 */
public class Raca {
    
    public static String desconeguda = "Desconeguda";
	
    private String nom;    
    private double litresPerKg;
	
    public Raca(){
        
    }
    
    public Raca(String nom, double litres)
    {
    	if (nom == null || nom.isBlank() || nom.isEmpty()) {
    		nom = desconeguda;
    	}
        this.nom = nom;
        litresPerKg = litres;
    }

    public String getNom() {
		return nom;
	}
    
    public double getLitresPerKg() {
		return litresPerKg;
    }

    @Override
    public String toString()
    {
        return nom;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nom);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Raca other = (Raca) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }
    
    

}
