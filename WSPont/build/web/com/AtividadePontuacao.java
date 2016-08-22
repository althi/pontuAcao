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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Lucas
 */
@Entity
@Table(name = "atividade-pontuacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AtividadePontuacao.findAll", query = "SELECT a FROM AtividadePontuacao a"),
    @NamedQuery(name = "AtividadePontuacao.findByIdAtiv", query = "SELECT a FROM AtividadePontuacao a WHERE a.idAtiv = :idAtiv"),
    @NamedQuery(name = "AtividadePontuacao.findByPontuacao", query = "SELECT a FROM AtividadePontuacao a WHERE a.pontuacao = :pontuacao")})
public class AtividadePontuacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAtiv")
    private Integer idAtiv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pontuacao")
    private int pontuacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAtiv")
    private Collection<Servidor> servidorCollection;

    public AtividadePontuacao() {
    }

    public AtividadePontuacao(Integer idAtiv) {
        this.idAtiv = idAtiv;
    }

    public AtividadePontuacao(Integer idAtiv, int pontuacao) {
        this.idAtiv = idAtiv;
        this.pontuacao = pontuacao;
    }

    public Integer getIdAtiv() {
        return idAtiv;
    }

    public void setIdAtiv(Integer idAtiv) {
        this.idAtiv = idAtiv;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    @XmlTransient
    public Collection<Servidor> getServidorCollection() {
        return servidorCollection;
    }

    public void setServidorCollection(Collection<Servidor> servidorCollection) {
        this.servidorCollection = servidorCollection;
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
        if (!(object instanceof AtividadePontuacao)) {
            return false;
        }
        AtividadePontuacao other = (AtividadePontuacao) object;
        if ((this.idAtiv == null && other.idAtiv != null) || (this.idAtiv != null && !this.idAtiv.equals(other.idAtiv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.AtividadePontuacao[ idAtiv=" + idAtiv + " ]";
    }
    
}
