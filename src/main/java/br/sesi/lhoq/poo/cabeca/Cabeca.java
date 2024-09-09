package br.sesi.lhoq.poo.cabeca;

public class Cabeca {
    public Olho zoio;
   public Orelha zurea;
   public Nariz aspirador;
   public Boca bocudo;

   public Cabeca(){
       this.zoio = new Olho();
       this.zurea = new Orelha();
       this.aspirador = new Nariz();
       this.bocudo = new Boca();

   }
}
