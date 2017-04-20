/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.business;

import br.com.sysodonto.dao.DUsuario;
import br.com.sysodonto.entity.Usuario;

public class BUsuario {
    
    public boolean cadastrarUsuario(Usuario usuario){
        return new DUsuario().cadastrar(usuario);
    }
    
}
