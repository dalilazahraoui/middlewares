/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yassine
 */
@Entity
@Table(name = "geotripentity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Geotripentity.findAll", query = "SELECT g FROM Geotripentity g"),
    @NamedQuery(name = "Geotripentity.findById", query = "SELECT g FROM Geotripentity g WHERE g.id = :id"),
    @NamedQuery(name = "Geotripentity.findByTripdescription", query = "SELECT g FROM Geotripentity g WHERE g.tripdescription = :tripdescription"),
    @NamedQuery(name = "Geotripentity.findByTripname", query = "SELECT g FROM Geotripentity g WHERE g.tripname = :tripname")})
public class Geotripentity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "TRIPDESCRIPTION")
    private String tripdescription;
    @Size(max = 255)
    @Column(name = "TRIPNAME")
    private String tripname;

    public Geotripentity() {
    }

    public Geotripentity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTripdescription() {
        return tripdescription;
    }

    public void setTripdescription(String tripdescription) {
        this.tripdescription = tripdescription;
    }

    public String getTripname() {
        return tripname;
    }

    public void setTripname(String tripname) {
        this.tripname = tripname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Geotripentity)) {
            return false;
        }
        Geotripentity other = (Geotripentity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Geotripentity[ id=" + id + " ]";
    }
    
}
