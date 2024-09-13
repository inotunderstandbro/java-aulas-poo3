package br.sesi.lhoq.poo;

import br.sesi.lhoq.poo.cabeca.Cabeca;
import br.sesi.lhoq.poo.cabeca.Olho;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Olho Olho1 = new Olho();
        Olho1.cego = true;
        Olho1.diametroOlho = 2.0f;
        Olho1.corIris = "azul";

        Olho Olho2 = new Olho();
        Olho2.cego = true;
        Olho2.diametroOlho = 2.0f;
        Olho2.corIris = "castanho";

        Cabeca cabeca = new Cabeca();
        cabeca.olhoEsquerdo = Olho1;
        cabeca.olhoDireito = Olho2;



        pessoa1.cabeca = cabeca;


    }
}
