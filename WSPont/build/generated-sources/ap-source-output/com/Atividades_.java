package com;

import com.ServidorUfla;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-08-21T01:01:49")
@StaticMetamodel(Atividades.class)
public class Atividades_ { 

    public static volatile SingularAttribute<Atividades, String> tipoAtiv;
    public static volatile SingularAttribute<Atividades, Integer> idAtiv;
    public static volatile SingularAttribute<Atividades, String> nomeAtiv;
    public static volatile CollectionAttribute<Atividades, ServidorUfla> servidorUflaCollection;

}