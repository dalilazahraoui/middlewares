/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.Geotripentity;

/**
 *
 * @author Yassine
 */
@Stateless
public class GeotripentityFacade extends AbstractFacade<Geotripentity> implements GeotripentityFacadeLocal {
    @PersistenceContext(unitName = "EJBModule1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GeotripentityFacade() {
        super(Geotripentity.class);
    }
    
}
