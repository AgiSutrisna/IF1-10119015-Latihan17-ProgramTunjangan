/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       String menikah;
       int gaji,tunjangan,total;
       Scanner input = new Scanner(System.in);
      
       System.out.println("==========Program Tunjangan==========");
       System.out.print("Berapakah gaji anda perbulan?\t: Rp.");
       gaji =input.nextInt();
       System.out.print("Status Anda ? (Menikah/Belum)\t: ");
       menikah = input.next();
      
       switch(menikah){
          case "Menikah" :
              tunjangan = (int) (0.35*gaji);
              total = tunjangan + gaji;
              System.out.println("=====Hasil Perhitungan Gaji Anda=====");
              System.out.println("Gaji Pokok\t: Rp." + gaji);
              System.out.println("Tunjangan\t: Rp."+ tunjangan);
              System.out.println("Total Gaji\t: Rp." + total );
              System.out.println("Deployed by : Agi Sutrisna");
              break;
          default :
              tunjangan = 0;
              total = tunjangan + gaji;
              System.out.println("=====Hasil Perhitungan Gaji Anda=====");
              System.out.println("Gaji Pokok\t: Rp." + gaji);
              System.out.println("Tunjangan\t: Rp."+ tunjangan);
              System.out.println("Total Gaji\t: Rp." + total );
              System.out.println("Deployed by : Agi Sutrisna");
          
      }
    
       
       

       
       
       
        
        
        
    }
    
}
