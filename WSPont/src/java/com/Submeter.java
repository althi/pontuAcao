/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucas
 */
@Entity
@Table(name = "submeter")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Submeter.findAll", query = "SELECT s FROM Submeter s"),
    @NamedQuery(name = "Submeter.findByMatricula", query = "SELECT s FROM Submeter s WHERE s.matricula = :matricula"),
    @NamedQuery(name = "Submeter.findByDataSubm", query = "SELECT s FROM Submeter s WHERE s.dataSubm = :dataSubm"),
    @NamedQuery(name = "Submeter.findByArqSubm", query = "SELECT s FROM Submeter s WHERE s.arqSubm = :arqSubm"),
    @NamedQuery(name = "Submeter.findByStatus", query = "SELECT s FROM Submeter s WHERE s.status = :status"),
    @NamedQuery(name = "Submeter.findByIdSubm", query = "SELECT s FROM Submeter s WHERE s.idSubm = :idSubm")})
public class Submeter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "matricula")
    private Integer matricula;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dataSubm")
    @Temporal(TemporalType.DATE)
    private Date dataSubm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "arqSubm")
    private String arqSubm;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "idSubm")
    private String idSubm;
    @JoinColumn(name = "matricula", referencedColumnName = "matricula", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuario usuario;

    public Submeter() {
    }

    public Submeter(Integer matricula) {
        this.matricula = matricula;
    }

    public Submeter(Integer matricula, Date dataSubm, String arqSubm, int status, String idSubm) {
        this.matricula = matricula;
        this.dataSubm = dataSubm;
        this.arqSubm = arqSubm;
        this.status = status;
        this.idSubm = idSubm;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Date getDataSubm() {
        return dataSubm;
    }

    public void setDataSubm(Date dataSubm) {
        this.dataSubm = dataSubm;
    }

    public String getArqSubm() {
        return arqSubm;
    }

    public void setArqSubm(String arqSubm) {
        this.arqSubm = arqSubm;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getIdSubm() {
        return idSubm;
    }

    public void setIdSubm(String idSubm) {
        this.idSubm = idSubm;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matricula != null ? matricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Submeter)) {
            return false;
        }
        Submeter other = (Submeter) object;
        if ((this.matricula == null && other.matricula != null) || (this.matricula != null && !this.matricula.equals(other.matricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Submeter[ matricula=" + matricula + " ]";
    }
    
}
