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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucas
 */
@Entity
@Table(name = "ranking")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ranking.findAll", query = "SELECT r FROM Ranking r"),
    @NamedQuery(name = "Ranking.findByMatricula", query = "SELECT r FROM Ranking r WHERE r.matricula = :matricula"),
    @NamedQuery(name = "Ranking.findByPontuacao", query = "SELECT r FROM Ranking r WHERE r.pontuacao = :pontuacao"),
    @NamedQuery(name = "Ranking.findByUltimaAtualizacao", query = "SELECT r FROM Ranking r WHERE r.ultimaAtualizacao = :ultimaAtualizacao")})
public class Ranking implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "matricula")
    private Integer matricula;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pontuacao")
    private int pontuacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ultimaAtualizacao")
    @Temporal(TemporalType.DATE)
    private Date ultimaAtualizacao;
    @JoinColumn(name = "matricula", referencedColumnName = "matricula", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuario usuario;

    public Ranking() {
    }

    public Ranking(Integer matricula) {
        this.matricula = matricula;
    }

    public Ranking(Integer matricula, int pontuacao, Date ultimaAtualizacao) {
        this.matricula = matricula;
        this.pontuacao = pontuacao;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Date getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(Date ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
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
        if (!(object instanceof Ranking)) {
            return false;
        }
        Ranking other = (Ranking) object;
        if ((this.matricula == null && other.matricula != null) || (this.matricula != null && !this.matricula.equals(other.matricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Ranking[ matricula=" + matricula + " ]";
    }
    
}
