package com;

import com.AtividadePontuacao;
import com.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-08-21T20:38:51")
@StaticMetamodel(Servidor.class)
public class Servidor_ { 

    public static volatile SingularAttribute<Servidor, Integer> freqPesquisa;
    public static volatile SingularAttribute<Servidor, Integer> aprovacao;
    public static volatile SingularAttribute<Servidor, AtividadePontuacao> idAtiv;
    public static volatile SingularAttribute<Servidor, Integer> reprovacao;
    public static volatile SingularAttribute<Servidor, Integer> matricula;
    public static volatile SingularAttribute<Servidor, Integer> freqBiblioteca;
    public static volatile SingularAttribute<Servidor, Integer> partiCurso;
    public static volatile SingularAttribute<Servidor, Usuario> usuario;
    public static volatile SingularAttribute<Servidor, Integer> freqAula;
    public static volatile SingularAttribute<Servidor, Integer> partiPalestra;

}