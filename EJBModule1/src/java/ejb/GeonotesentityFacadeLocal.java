/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Local;
import jpa.Geonotesentity;

/**
 *
 * @author Yassine
 */
@Local
public interface GeonotesentityFacadeLocal {

    void create(Geonotesentity geonotesentity);

    void edit(Geonotesentity geonotesentity);

    void remove(Geonotesentity geonotesentity);

    Geonotesentity find(Object id);

    List<Geonotesentity> findAll();

    List<Geonotesentity> findRange(int[] range);

    int count();
    
}
