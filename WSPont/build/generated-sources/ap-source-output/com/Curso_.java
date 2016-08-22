package com;

import com.ServidorUfla;
import com.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-08-21T20:38:51")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, String> nomeCurso;
    public static volatile SingularAttribute<Curso, Integer> idCurso;
    public static volatile CollectionAttribute<Curso, ServidorUfla> servidorUflaCollection;
    public static volatile CollectionAttribute<Curso, Usuario> usuarioCollection;

}