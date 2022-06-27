/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasvarias;

/**
 *
 * @author rfort
 */
public class Nombre {
    String nom, apel1, apel2;
    Nombre(String nom, String apel1, String apel2) { 
        this.nom = nom; 
        this.apel1 = apel1;
        this.apel2 = apel2;
        
       public String getNombreOrdenNormal(){
    
    return nom + " " + apel1 + " " + apel2;
    
    }

public String getNombreOrdenInverso(){
    
    nom = this.apel1;
    apel1 = this.apel2;
    apel2 = this.nom;
   
    return nom + " "+ apel1 + ", " + apel2;
    
}
    }    


}