/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Lucas
 */
@Entity
@Table(name = "atividades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Atividades.findAll", query = "SELECT a FROM Atividades a"),
    @NamedQuery(name = "Atividades.findByIdAtiv", query = "SELECT a FROM Atividades a WHERE a.idAtiv = :idAtiv"),
    @NamedQuery(name = "Atividades.findByTipoAtiv", query = "SELECT a FROM Atividades a WHERE a.tipoAtiv = :tipoAtiv"),
    @NamedQuery(name = "Atividades.findByNomeAtiv", query = "SELECT a FROM Atividades a WHERE a.nomeAtiv = :nomeAtiv")})
public class Atividades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAtiv")
    private Integer idAtiv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tipoAtiv")
    private String tipoAtiv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nomeAtiv")
    private String nomeAtiv;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAtiv")
    private Collection<ServidorUfla> servidorUflaCollection;

    public Atividades() {
    }

    public Atividades(Integer idAtiv) {
        this.idAtiv = idAtiv;
    }

    public Atividades(Integer idAtiv, String tipoAtiv, String nomeAtiv) {
        this.idAtiv = idAtiv;
        this.tipoAtiv = tipoAtiv;
        this.nomeAtiv = nomeAtiv;
    }

    public Integer getIdAtiv() {
        return idAtiv;
    }

    public void setIdAtiv(Integer idAtiv) {
        this.idAtiv = idAtiv;
    }

    public String getTipoAtiv() {
        return tipoAtiv;
    }

    public void setTipoAtiv(String tipoAtiv) {
        this.tipoAtiv = tipoAtiv;
    }

    public String getNomeAtiv() {
        return nomeAtiv;
    }

    public void setNomeAtiv(String nomeAtiv) {
        this.nomeAtiv = nomeAtiv;
    }

    @XmlTransient
    public Collection<ServidorUfla> getServidorUflaCollection() {
        return servidorUflaCollection;
    }

    public void setServidorUflaCollection(Collection<ServidorUfla> servidorUflaCollection) {
        this.servidorUflaCollection = servidorUflaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAtiv != null ? idAtiv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atividades)) {
            return false;
        }
        Atividades other = (Atividades) object;
        if ((this.idAtiv == null && other.idAtiv != null) || (this.idAtiv != null && !this.idAtiv.equals(other.idAtiv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Atividades[ idAtiv=" + idAtiv + " ]";
    }
    
}
