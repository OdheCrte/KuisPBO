package com.Menu;

public class Web extends Nilai{
    protected String nik,nama;
    protected double tesT,tesC,tesW;
    public Web(){
      
    }
    public void getnik(String nikk){
      this.nik=nikk;
    }public void getnama(String namaa){
      this.nama=namaa;
    }public void gettesT(double testT){
      this.tesT=testT;
    }public void gettesC(double testC){
      this.tesC=testC;
    }public void gettesW(double testW){
      this.tesW=testW;
    }@Override
    public double NilaiAkhir(tesT,tesC,tesW){
      return (tesT*0.4)+(tesC*0.35)+(tesW*0.25);
    }@Override
    public void Keterangan(NilaiAkhir,nama){
      if(NilaiAkhir>=85){
        System.out.println("");
      }else{
        System.out.println("Gagal");
        System.out.println("Mohon Maaf kepada "+nama+" telah ditolak sebagai android");
      }
      return 0;
    }
}
