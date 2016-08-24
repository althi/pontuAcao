package com;

import com.Curso;
import com.Ranking;
import com.Servidor;
import com.ServidorUfla;
import com.Submeter;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-08-23T21:38:27")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, ServidorUfla> servidorUfla;
    public static volatile SingularAttribute<Usuario, String> senha;
    public static volatile SingularAttribute<Usuario, Servidor> servidor;
    public static volatile SingularAttribute<Usuario, Submeter> submeter;
    public static volatile SingularAttribute<Usuario, Integer> periodo;
    public static volatile SingularAttribute<Usuario, Integer> matricula;
    public static volatile SingularAttribute<Usuario, Curso> idCurso;
    public static volatile SingularAttribute<Usuario, Integer> tipoUsuario;
    public static volatile SingularAttribute<Usuario, String> nome;
    public static volatile SingularAttribute<Usuario, Ranking> ranking;
    public static volatile SingularAttribute<Usuario, Date> dataCriacao;

}