package dao;

import java.util.*;
import javax.ejb.*;
import javax.persistence.*;
import jpa.*;
//import javax.transaction.Transaction;


@Stateless(mappedName = "Interface")
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class DaoJpa implements IdaoLocal{
    
@PersistenceContext
private EntityManager em;
// liste des GeoNOtes
public List<Geonotesentity> getAllGeonotesentity() {
    return em.createQuery("SELECT g FROM Geonotesentity g").getResultList();
}
// liste des GeoTrips
public List<Geotripentity> getAllGeotripentity() {
    return em.createQuery("SELECT g FROM Geotripentity g").getResultList();
}

    @Override
    public Geonotesentity getGeoNoteById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Geotripentity getGeoTripById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}