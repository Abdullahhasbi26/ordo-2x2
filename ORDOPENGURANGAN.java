/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordo.pengurangan;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class ORDOPENGURANGAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        int matrix1[] [] = new int[2][2]; //jumlah kurung siku untuk melihat dimensi dari array
        
        int matrix2[] [] = new int[2][2];
        
        System.out.println("Matrix 1");
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++)
            {
                System.out.println("Masukkan isi Index ke [" + i +"][" +j +"] : ");
                matrix1[i][j] = masukan.nextInt();
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("");
        System.out.println("Matrix 2");
        
        for (int i = 0; i < matrix2.length; i++){
            for (int j = 0; j < matrix2[0].length; j++)
            {
                System.out.println("Masukkan isi Index ke [" + i +"][" +j +"] : ");
                matrix2[i][j] = masukan.nextInt();
            }
            System.out.println("");
        }
        
        System.out.println(" ");
        System.out.println("Matrix 1 ");
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++)
            {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Matrix 2 ");
        
        for (int i = 0; i < matrix2.length; i++){
            for (int j = 0; j < matrix2[0].length; j++)
            {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println("");
        }
        
        
        
       
        
        System.out.println("");
        System.out.println("Pengurangan");
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                int hasil = matrix1[i][j] - matrix2[i][j];
                System.out.print(hasil + " ");
            }
            System.out.println("");
        }
        
        
        
    }
    
}