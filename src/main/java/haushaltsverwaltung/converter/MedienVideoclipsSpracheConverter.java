/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haushaltsverwaltung.converter;

import haushaltsverwaltung.db.DAO;
import haushaltsverwaltung.model.MedienVideoclipsSprache;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author A.Dridi
 */
@FacesConverter("medienVideoclipsSpracheConverter")
public class MedienVideoclipsSpracheConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {

        if (value == null || value.trim().isEmpty()) {
            return "";

        } else {

            DAO dao = new DAO();
            List<MedienVideoclipsSprache> liste = dao.getAllMedienVideoclipsSprache();
            MedienVideoclipsSprache kategorieAusgewaehlt = null;

            for (MedienVideoclipsSprache a : liste) {
                if ((a.getBezeichnung()).equals(value)) {
                    kategorieAusgewaehlt = a;
                }
            }
            return kategorieAusgewaehlt;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {

        if (value == null) {
            return "";
        } else {

            return value.toString();
        }

    }

}
