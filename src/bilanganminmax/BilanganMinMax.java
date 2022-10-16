/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilanganminmax;

/**
 *
 * @author learn
 */
public class BilanganMinMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []nilai = {23,59,11,20,89,73,4,17,50, 2,100};
        int max = 0;
        int min = 1000;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > max){
                max = nilai[i];
            }else if(nilai[i]<min){
                min = nilai[i];
            }
        }
        System.out.println("Nilai Minimum : " + min);
        System.out.println("Nilai Maksimum : " + max);
    }
    
}
