/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heartrestjersey;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author leand
 */
public class HeartRestJersey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
             HttpServer server = HttpServerFactory.create("http://localhost:8080/rest");
        server.start();
        boolean x = false;
        while (!x) {
            System.out.print("Wollen Sie das Programm beenden[j/n]");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String temp = br.readLine();
            if (temp.compareTo("j") == 0) {
                break;
            }
        }
      
        
        
        
       
        System.exit(0); 
    }
    
}
