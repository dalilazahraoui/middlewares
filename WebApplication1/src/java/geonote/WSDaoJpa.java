/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geonote;

import javax.ejb.EJB;
import javax.jws.*;
import jpa.*;
import dao.*;
import dao.IdaoLocal;
import java.util.*;
import jpa.Geonotesentity;

/**
 *
 * @author Yassine
 */
@WebService(serviceName = "WSDaoJpa")
public class WSDaoJpa {
    @EJB
    private IdaoLocal dao;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")
    
    @WebMethod
public List<Geonotesentity> getAllGeonotesentity(){
    return dao.getAllGeonotesentity();
}
    
        @WebMethod
public List<Geotripentity> getAllGeotripentity(){
    return dao.getAllGeotripentity();
}
    
}
