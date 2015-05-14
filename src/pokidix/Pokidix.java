/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokidix;

import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author TOSHIBA
 */
public class Pokidix {

    

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.add(new JScrollPane(new evolutionPanel()));
        frame.setVisible(true);
    }

}
