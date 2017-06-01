/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg2.pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Usuario
 */
public class TestFileAccess {

    public static void main(String[] args) throws Exception {
        
        String home = System.getProperty("user.dir");
        
        System.out.println(home);
        
        File fichero = new File(home + File.separator + "nuevo.txt");
        
        
        FileReader fr = new FileReader(fichero);
        BufferedReader buffer = new BufferedReader(fr);
        String cad;
        while ((cad = buffer.readLine()) != null) {
            System.out.println(cad);

        }
    }

}
