/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sysodonto;

import br.com.sysodonto.dao.Dao;
import br.com.sysodonto.view.FormLogin;
import javax.swing.UIManager;

/**
 *
 * @author Kisak
 */
public class SysOdonto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       try {
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                /*if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }*/UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (ClassNotFoundException ex) {
            
        } 
       
        
        new FormLogin().setVisible(true);
      
      
        Dao dao = new Dao();
        dao.conectar();
    }
    
}
