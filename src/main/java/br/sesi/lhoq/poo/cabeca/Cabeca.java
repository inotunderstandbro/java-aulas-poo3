package br.sesi.lhoq.poo.cabeca;

public class Cabeca {
    public Olho olhoEsquerdo;
    public Olho olhoDireito;
   public Orelha zurea;
   public Nariz aspirador;
   public Boca bocudo;

   public Cabeca(){
       this.olhoDireito = new Olho();
       this.olhoEsquerdo = new Olho();
       this.zurea = new Orelha();
       this.aspirador = new Nariz();
       this.bocudo = new Boca();

   }
}
