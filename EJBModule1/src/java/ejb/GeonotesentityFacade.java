/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.Geonotesentity;

/**
 *
 * @author Yassine
 */
@Stateless
public class GeonotesentityFacade extends AbstractFacade<Geonotesentity> implements GeonotesentityFacadeLocal {
    @PersistenceContext(unitName = "EJBModule1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GeonotesentityFacade() {
        super(Geonotesentity.class);
    }
    
}
