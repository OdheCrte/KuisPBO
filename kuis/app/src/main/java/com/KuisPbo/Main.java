package com.KuisPbo;

import com.Menu.Nilai;
import com.Menu.Android;
import com.Menu.Web;
import java.util.Scanner;
import java.lang.*;


public class Main {

  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String nik,nama;
   double tesT,tesC,tesW;
   char pilih,temp;
   Nilai n=new Nilai();
   Android android=new Android();
   Web web=new Web();
   System.out.println("form Pendaftaran PT. Udin");
   System.out.println("1. Android Development");
   System.out.println("2. Web Defelopment");
   System.out.println("Pilih Jenis Form : ");
   pilih=sc.next().charAt(0);temp=pilih;
   if(pilih=='1'||pilih=='2'){
       System.out.println("Input NIK\t: ");nik=sc.next();
       System.out.println("Input Nama\t: ");nama=sc.next();
       System.out.println("Input Nilai Tes Tulis\t: ");tesT=sc.nextDouble();
       System.out.println("Input Nilai Tes Coding\t: ");tesC=sc.nextDouble();
       System.out.println("Input Nilai Tes Wawancara\t: ");tesW=sc.nextDouble();
       if(pilih=='1'){
         android.getnik(nik);
         android.getnama(nama);
         android.gettesT(tesT);
         android.gettesC(tesC);
         android.gettesW(tesW);
       }
       else {
         web.getnik(nik);
         web.getnama(nama);
         web.gettesT(tesT);
         web.gettesC(tesC);
         web.gettesW(tesW);
       }
       do{
     System.out.println("Menu");
     System.out.println("1. Edit");
     System.out.println("2. Tampil");
     System.out.println("3. Exit");
     System.out.println("Pilih : ");
     pilih=sc.next().charAt(0);
     switch(pilih){
       case'1':System.out.println("Input Nilai Tes Tulis\t: ");tesT=sc.nextDouble();
               System.out.println("Input Nilai Tes Coding\t: ");tesC=sc.nextDouble();
               System.out.println("Input Nilai Tes Wawancara\t: ");tesW=sc.nextDouble();
               if(temp=='1'){
                 android.gettesT(tesT);
                 android.gettesC(tesC);
                 android.gettesW(tesW);
               }else{
                 web.gettesT(tesT);
                 web.gettesC(tesC);
                 web.gettesW(tesW);
               }
               break;
       case'2':if(temp=='1'){
                nilai.NilaiAkhir();
                System.out.println(android.NilaiAkhir());
                System.out.println(nilai.Keterangan()+android.Keterangan());
               }else {
                System.out.println(nilai.NilaiAkhir()+web.NilaiAkhir());
                System.out.println(nilai.Keterangan()+web.Keterangan());
               }
               break;
     }
   }while(pilih!='3');
   }else {
       System.out.println("ERROR INPUT !!");
       System.exit(0);
   }
  }
}
