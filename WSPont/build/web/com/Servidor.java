/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucas
 */
@Entity
@Table(name = "servidor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servidor.findAll", query = "SELECT s FROM Servidor s"),
    @NamedQuery(name = "Servidor.findByFreqAula", query = "SELECT s FROM Servidor s WHERE s.freqAula = :freqAula"),
    @NamedQuery(name = "Servidor.findByFreqBiblioteca", query = "SELECT s FROM Servidor s WHERE s.freqBiblioteca = :freqBiblioteca"),
    @NamedQuery(name = "Servidor.findByFreqPesquisa", query = "SELECT s FROM Servidor s WHERE s.freqPesquisa = :freqPesquisa"),
    @NamedQuery(name = "Servidor.findByPartiCurso", query = "SELECT s FROM Servidor s WHERE s.partiCurso = :partiCurso"),
    @NamedQuery(name = "Servidor.findByPartiPalestra", query = "SELECT s FROM Servidor s WHERE s.partiPalestra = :partiPalestra"),
    @NamedQuery(name = "Servidor.findByReprovacao", query = "SELECT s FROM Servidor s WHERE s.reprovacao = :reprovacao"),
    @NamedQuery(name = "Servidor.findByAprovacao", query = "SELECT s FROM Servidor s WHERE s.aprovacao = :aprovacao"),
    @NamedQuery(name = "Servidor.findByMatricula", query = "SELECT s FROM Servidor s WHERE s.matricula = :matricula")})
public class Servidor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "freqAula")
    private int freqAula;
    @Basic(optional = false)
    @NotNull
    @Column(name = "freqBiblioteca")
    private int freqBiblioteca;
    @Basic(optional = false)
    @NotNull
    @Column(name = "freqPesquisa")
    private int freqPesquisa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partiCurso")
    private int partiCurso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partiPalestra")
    private int partiPalestra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reprovacao")
    private int reprovacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aprovacao")
    private int aprovacao;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "matricula")
    private Integer matricula;
    @JoinColumn(name = "matricula", referencedColumnName = "matricula", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuario usuario;
    @JoinColumn(name = "idAtiv", referencedColumnName = "idAtiv")
    @ManyToOne(optional = false)
    private AtividadePontuacao idAtiv;

    public Servidor() {
    }

    public Servidor(Integer matricula) {
        this.matricula = matricula;
    }

    public Servidor(Integer matricula, int freqAula, int freqBiblioteca, int freqPesquisa, int partiCurso, int partiPalestra, int reprovacao, int aprovacao) {
        this.matricula = matricula;
        this.freqAula = freqAula;
        this.freqBiblioteca = freqBiblioteca;
        this.freqPesquisa = freqPesquisa;
        this.partiCurso = partiCurso;
        this.partiPalestra = partiPalestra;
        this.reprovacao = reprovacao;
        this.aprovacao = aprovacao;
    }

    public int getFreqAula() {
        return freqAula;
    }

    public void setFreqAula(int freqAula) {
        this.freqAula = freqAula;
    }

    public int getFreqBiblioteca() {
        return freqBiblioteca;
    }

    public void setFreqBiblioteca(int freqBiblioteca) {
        this.freqBiblioteca = freqBiblioteca;
    }

    public int getFreqPesquisa() {
        return freqPesquisa;
    }

    public void setFreqPesquisa(int freqPesquisa) {
        this.freqPesquisa = freqPesquisa;
    }

    public int getPartiCurso() {
        return partiCurso;
    }

    public void setPartiCurso(int partiCurso) {
        this.partiCurso = partiCurso;
    }

    public int getPartiPalestra() {
        return partiPalestra;
    }

    public void setPartiPalestra(int partiPalestra) {
        this.partiPalestra = partiPalestra;
    }

    public int getReprovacao() {
        return reprovacao;
    }

    public void setReprovacao(int reprovacao) {
        this.reprovacao = reprovacao;
    }

    public int getAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(int aprovacao) {
        this.aprovacao = aprovacao;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public AtividadePontuacao getIdAtiv() {
        return idAtiv;
    }

    public void setIdAtiv(AtividadePontuacao idAtiv) {
        this.idAtiv = idAtiv;
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
        if (!(object instanceof Servidor)) {
            return false;
        }
        Servidor other = (Servidor) object;
        if ((this.matricula == null && other.matricula != null) || (this.matricula != null && !this.matricula.equals(other.matricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Servidor[ matricula=" + matricula + " ]";
    }
    
}
