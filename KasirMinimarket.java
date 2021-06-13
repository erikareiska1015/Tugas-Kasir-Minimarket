/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir.minimarket;

/**
 *
 * @author Erika Winckler
 */
public class KasirMinimarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FormRegister rg = new FormRegister();
        rg.setVisible(true);
        rg.pack();
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(FormRegister.EXIT_ON_CLOSE);
    }
    
}
