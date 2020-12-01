package com.Menu;

public class Android extends Nilai{
    protected String nik,nama;
    protected double tesT,tesC,tesW;
    public Android(){
      
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
    }
    @Override
    public double NilaiAkhir(double tesT,double tesC,double tesW){
      return (tesT*0.2)+(tesC*0.5)+(tesW*0.3);
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
