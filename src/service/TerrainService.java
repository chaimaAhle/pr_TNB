/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Terrain;

/**
 *
 * @author simob
 */
public class TerrainService extends AbstractFacade<Terrain>{
    
    public TerrainService() {
        super(Terrain.class);
    }
    public int add(){
        Terrain terrain=new Terrain(Long.MIN_VALUE);
        create(terrain);
        return 1;
    }
    
}
