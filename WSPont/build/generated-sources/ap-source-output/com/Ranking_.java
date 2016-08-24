package com;

import com.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-08-23T23:32:52")
@StaticMetamodel(Ranking.class)
public class Ranking_ { 

    public static volatile SingularAttribute<Ranking, Integer> pontuacao;
    public static volatile SingularAttribute<Ranking, Date> ultimaAtualizacao;
    public static volatile SingularAttribute<Ranking, Integer> matricula;
    public static volatile SingularAttribute<Ranking, Usuario> usuario;

}