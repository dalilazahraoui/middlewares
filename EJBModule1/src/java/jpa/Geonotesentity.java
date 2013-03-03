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
@Table(name = "geonotesentity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Geonotesentity.findAll", query = "SELECT g FROM Geonotesentity g"),
    @NamedQuery(name = "Geonotesentity.findById", query = "SELECT g FROM Geonotesentity g WHERE g.id = :id"),
    @NamedQuery(name = "Geonotesentity.findByAltitude", query = "SELECT g FROM Geonotesentity g WHERE g.altitude = :altitude"),
    @NamedQuery(name = "Geonotesentity.findByLatitude", query = "SELECT g FROM Geonotesentity g WHERE g.latitude = :latitude"),
    @NamedQuery(name = "Geonotesentity.findByLongitude", query = "SELECT g FROM Geonotesentity g WHERE g.longitude = :longitude"),
    @NamedQuery(name = "Geonotesentity.findByMemo", query = "SELECT g FROM Geonotesentity g WHERE g.memo = :memo"),
    @NamedQuery(name = "Geonotesentity.findByTitle", query = "SELECT g FROM Geonotesentity g WHERE g.title = :title")})
public class Geonotesentity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "ALTITUDE")
    private String altitude;
    @Size(max = 255)
    @Column(name = "LATITUDE")
    private String latitude;
    @Size(max = 255)
    @Column(name = "LONGITUDE")
    private String longitude;
    @Size(max = 255)
    @Column(name = "MEMO")
    private String memo;
    @Size(max = 255)
    @Column(name = "TITLE")
    private String title;

    public Geonotesentity() {
    }

    public Geonotesentity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        if (!(object instanceof Geonotesentity)) {
            return false;
        }
        Geonotesentity other = (Geonotesentity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Geonotesentity[ id=" + id + " ]";
    }
    
}
