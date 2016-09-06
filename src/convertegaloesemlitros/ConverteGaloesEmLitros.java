/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertegaloesemlitros;

/**
 *
 * @Tatiane Paz 26/08/2016
 */
public class ConverteGaloesEmLitros {

    //Este programa converte galões para litros
    
    public static void main(String[] args) {
        double gallons; //contém o número de galões
        double liters;  //contém a conversão para litros
        
        gallons = 10;   //começa com 10 galões
        
        liters = gallons *3.7854;   //converte para litros
        
        System.out.println(gallons+" gallons is "+liters+" liters.");
    }
    
}
