
package cat.roser.lletdeproximitat.model;

import java.util.Objects;

/**
 * TAD class for Vaca
 * @author roser
 */
public class Vaca {
    private String nom;
    private double pes;
    private Raca raca;

    public Vaca() {
        raca = new Raca();
    }

    public Vaca(String nom, double pes, Raca raca) {
        this.nom = nom;
        this.pes = pes;
        this.raca = raca;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }
    
    public double getLlet() {
    	return pes * raca.getLitresPerKg();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.nom);
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
        final Vaca other = (Vaca) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vaca{" + "Nom=" + nom + ", Pes=" + pes + ", Raca=" + this.raca.getNom() + '}';
    }
    
}
