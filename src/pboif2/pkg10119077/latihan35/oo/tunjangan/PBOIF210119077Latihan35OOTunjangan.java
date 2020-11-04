/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan35.oo.tunjangan;

import java.util.Scanner;
import tunjangan.tunjangan;
/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fauzan
 * NIM      : 10119077
 * Kelas    : IF-2
 * Deskripsi: Tunjangan (OO)
 */
public class PBOIF210119077Latihan35OOTunjangan {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        tunjangan tunj = new tunjangan();
        System.out.println("===========Program Tunjangan=========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp.");
        tunj.gajiPokok = input.nextInt();
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        tunj.status = input.next();
        
        tunj.tampilHasil();
    }
    
}
