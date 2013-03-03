/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Local;
import jpa.Geotripentity;

/**
 *
 * @author Yassine
 */
@Local
public interface GeotripentityFacadeLocal {

    void create(Geotripentity geotripentity);

    void edit(Geotripentity geotripentity);

    void remove(Geotripentity geotripentity);

    Geotripentity find(Object id);

    List<Geotripentity> findAll();

    List<Geotripentity> findRange(int[] range);

    int count();
    
}
