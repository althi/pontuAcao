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
@Table(name = "servidor-ufla")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServidorUfla.findAll", query = "SELECT s FROM ServidorUfla s"),
    @NamedQuery(name = "ServidorUfla.findByMatricula", query = "SELECT s FROM ServidorUfla s WHERE s.matricula = :matricula"),
    @NamedQuery(name = "ServidorUfla.findByFreqAula", query = "SELECT s FROM ServidorUfla s WHERE s.freqAula = :freqAula"),
    @NamedQuery(name = "ServidorUfla.findByFreqPesquisa", query = "SELECT s FROM ServidorUfla s WHERE s.freqPesquisa = :freqPesquisa"),
    @NamedQuery(name = "ServidorUfla.findByPartiCurso", query = "SELECT s FROM ServidorUfla s WHERE s.partiCurso = :partiCurso"),
    @NamedQuery(name = "ServidorUfla.findByPartiPalestra", query = "SELECT s FROM ServidorUfla s WHERE s.partiPalestra = :partiPalestra"),
    @NamedQuery(name = "ServidorUfla.findByReprovacao", query = "SELECT s FROM ServidorUfla s WHERE s.reprovacao = :reprovacao"),
    @NamedQuery(name = "ServidorUfla.findByAprovacao", query = "SELECT s FROM ServidorUfla s WHERE s.aprovacao = :aprovacao"),
    @NamedQuery(name = "ServidorUfla.findByPontuacao", query = "SELECT s FROM ServidorUfla s WHERE s.pontuacao = :pontuacao"),
    @NamedQuery(name = "ServidorUfla.findByIdDisciplina", query = "SELECT s FROM ServidorUfla s WHERE s.idDisciplina = :idDisciplina"),
    @NamedQuery(name = "ServidorUfla.findByFreqBiblioteca", query = "SELECT s FROM ServidorUfla s WHERE s.freqBiblioteca = :freqBiblioteca")})
public class ServidorUfla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "matricula")
    private Integer matricula;
    @Basic(optional = false)
    @NotNull
    @Column(name = "freqAula")
    private int freqAula;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "pontuacao")
    private int pontuacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDisciplina")
    private int idDisciplina;
    @Basic(optional = false)
    @NotNull
    @Column(name = "freqBiblioteca")
    private int freqBiblioteca;
    @JoinColumn(name = "idAtiv", referencedColumnName = "idAtiv")
    @ManyToOne(optional = false)
    private Atividades idAtiv;
    @JoinColumn(name = "idCurso", referencedColumnName = "idCurso")
    @ManyToOne(optional = false)
    private Curso idCurso;
    @JoinColumn(name = "matricula", referencedColumnName = "matricula", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuario usuario;

    public ServidorUfla() {
    }

    public ServidorUfla(Integer matricula) {
        this.matricula = matricula;
    }

    public ServidorUfla(Integer matricula, int freqAula, int freqPesquisa, int partiCurso, int partiPalestra, int reprovacao, int aprovacao, int pontuacao, int idDisciplina, int freqBiblioteca) {
        this.matricula = matricula;
        this.freqAula = freqAula;
        this.freqPesquisa = freqPesquisa;
        this.partiCurso = partiCurso;
        this.partiPalestra = partiPalestra;
        this.reprovacao = reprovacao;
        this.aprovacao = aprovacao;
        this.pontuacao = pontuacao;
        this.idDisciplina = idDisciplina;
        this.freqBiblioteca = freqBiblioteca;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public int getFreqAula() {
        return freqAula;
    }

    public void setFreqAula(int freqAula) {
        this.freqAula = freqAula;
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

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public int getFreqBiblioteca() {
        return freqBiblioteca;
    }

    public void setFreqBiblioteca(int freqBiblioteca) {
        this.freqBiblioteca = freqBiblioteca;
    }

    public Atividades getIdAtiv() {
        return idAtiv;
    }

    public void setIdAtiv(Atividades idAtiv) {
        this.idAtiv = idAtiv;
    }

    public Curso getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso) {
        this.idCurso = idCurso;
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
        if (!(object instanceof ServidorUfla)) {
            return false;
        }
        ServidorUfla other = (ServidorUfla) object;
        if ((this.matricula == null && other.matricula != null) || (this.matricula != null && !this.matricula.equals(other.matricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ServidorUfla[ matricula=" + matricula + " ]";
    }
    
}
