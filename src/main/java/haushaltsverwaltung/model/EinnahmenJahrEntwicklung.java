/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haushaltsverwaltung.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author A.Dridi
 */
@Entity
@SequenceGenerator(name = "einnahmenjahr_seq", sequenceName = "einnahmenjahr_id_seq", allocationSize = 1)
public class EinnahmenJahrEntwicklung implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO, generator = "einnahmenjahr_seq")
    @Id
    private Integer einnahmen_id;

    private Integer jahr;
    private Double betrag;
    private String bemerkungen;

    public Integer getEinnahmen_id() {
        return einnahmen_id;
    }

    public void setEinnahmen_id(Integer einnahmen_id) {
        this.einnahmen_id = einnahmen_id;
    }

    public Integer getJahr() {
        return jahr;
    }

    public void setJahr(Integer jahr) {
        this.jahr = jahr;
    }

    public Double getBetrag() {
        return betrag;
    }

    public void setBetrag(Double betrag) {
        this.betrag = betrag;
    }

    public String getBemerkungen() {
        return bemerkungen;
    }

    public void setBemerkungen(String bemerkungen) {
        this.bemerkungen = bemerkungen;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.einnahmen_id);
        hash = 79 * hash + Objects.hashCode(this.jahr);
        hash = 79 * hash + Objects.hashCode(this.betrag);
        hash = 79 * hash + Objects.hashCode(this.bemerkungen);
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
        final EinnahmenJahrEntwicklung other = (EinnahmenJahrEntwicklung) obj;
        if (!Objects.equals(this.bemerkungen, other.bemerkungen)) {
            return false;
        }
        if (!Objects.equals(this.einnahmen_id, other.einnahmen_id)) {
            return false;
        }
        if (!Objects.equals(this.jahr, other.jahr)) {
            return false;
        }
        if (!Objects.equals(this.betrag, other.betrag)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EinnahmenJahrEntwicklung{" + "einnahmen_id=" + einnahmen_id + ", jahr=" + jahr + ", betrag=" + betrag + ", bemerkungen=" + bemerkungen + '}';
    }
    
    
}
