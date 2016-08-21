package com;

import com.Atividades;
import com.Curso;
import com.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-08-21T01:01:49")
@StaticMetamodel(ServidorUfla.class)
public class ServidorUfla_ { 

    public static volatile SingularAttribute<ServidorUfla, Integer> freqPesquisa;
    public static volatile SingularAttribute<ServidorUfla, Integer> idDisciplina;
    public static volatile SingularAttribute<ServidorUfla, Integer> freqBiblioteca;
    public static volatile SingularAttribute<ServidorUfla, Integer> freqAula;
    public static volatile SingularAttribute<ServidorUfla, Integer> partiPalestra;
    public static volatile SingularAttribute<ServidorUfla, Integer> pontuacao;
    public static volatile SingularAttribute<ServidorUfla, Integer> aprovacao;
    public static volatile SingularAttribute<ServidorUfla, Atividades> idAtiv;
    public static volatile SingularAttribute<ServidorUfla, Integer> matricula;
    public static volatile SingularAttribute<ServidorUfla, Integer> reprovacao;
    public static volatile SingularAttribute<ServidorUfla, Curso> idCurso;
    public static volatile SingularAttribute<ServidorUfla, Integer> partiCurso;
    public static volatile SingularAttribute<ServidorUfla, Usuario> usuario;

}