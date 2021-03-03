/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numletras66650;
import java.util.Scanner;
/**
 *
 * @author Adriana
 */
public class NumLetras66650 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entra= new Scanner(System.in);
        int mult;
        int unid;
        System.out.println("Introduce un numero cualquiera del 0 al 99");
        int n= entra.nextInt();
        mult=n/10;
        unid=n%10;
        String[] unidades = {"cero", "uno", "dos", "tres", "cuatro ", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] distinto = {"Diez", "Once", "Doce", "Trece", "Catorce", "Quince", "Diez y seis", "Diez y siete", "Diez y ocho", "Diez y nueve"};
        
        switch (mult){
            case 0: 
                System.out.println(unidades[unid]);
                break;
            case 1:
                System.out.println(distinto[unid]);
                break;
            case 2:
                if(unid==0){
                  System.out.println("Veinte");  
            }else{
                  System.out.println("Veinte y "+ unidades[unid]);
                }
                break;
            case 3:
                if(unid==0){
                  System.out.println("Treinta");  
            }else{
                  System.out.println("Treinta y "+ unidades[unid]);
                }
                break;
            case 4:
                if(unid==0){
                  System.out.println("Cuarenta");  
            }else{
                  System.out.println("Cuarenta y "+ unidades[unid]);
                }
                break;
            case 5:
                if(unid==0){
                  System.out.println("Cincuenta");  
            }else{
                  System.out.println("Cincuenta y "+ unidades[unid]);
                }
                break;
            case 6:
                if(unid==0){
                  System.out.println("Sesenta");  
            }else{
                  System.out.println("Sesenta y "+ unidades[unid]);
                }
                break;
            case 7:
                if(unid==0){
                  System.out.println("Setenta");  
            }else{
                  System.out.println("Setenta y "+ unidades[unid]);
                }
                break;
            case 8:
                if(unid==0){
                  System.out.println("Ochenta");  
            }else{
                  System.out.println("Ochenta y "+ unidades[unid]);
                }
                break;
            case 9:
                if(unid==0){
                  System.out.println("Noventa");  
            }else{
                  System.out.println("Noventa y "+ unidades[unid]);
                }
                break;
            default:
                System.out.println("Numero fuera del rango");
         break;
                
                
        }
    }
    
}
