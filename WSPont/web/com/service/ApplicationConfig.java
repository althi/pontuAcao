/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Lucas
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.service.AtividadePontuacaoFacadeREST.class);
        resources.add(com.service.AtividadesFacadeREST.class);
        resources.add(com.service.CursoFacadeREST.class);
        resources.add(com.service.DisciplinaFacadeREST.class);
        resources.add(com.service.RankingFacadeREST.class);
        resources.add(com.service.ServidorFacadeREST.class);
        resources.add(com.service.ServidorUflaFacadeREST.class);
        resources.add(com.service.SubmeterFacadeREST.class);
        resources.add(com.service.UsuarioFacadeREST.class);
    }
    
}
