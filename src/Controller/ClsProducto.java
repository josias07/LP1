/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modell.IdProducto;
import java.util.ArrayList;

/**
 *
 * @author alumno05
 */
public class ClsProducto {
    ArrayList <IdProducto>tbproducto = new ArrayList<IdProducto>(); 
    public ClsProducto(IdProducto idp) {
        tbproducto.add(idp);
    }
    
    public ArrayList reporteProducto(){        
        return tbproducto;
    }
    
    
}
