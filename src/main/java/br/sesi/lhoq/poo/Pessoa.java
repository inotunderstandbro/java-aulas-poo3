package br.sesi.lhoq.poo;

import br.sesi.lhoq.poo.cabeca.Cabeca;
import br.sesi.lhoq.poo.inferior.Membrosinferiores;
import br.sesi.lhoq.poo.tronco.Tronco;

public class Pessoa {
    public Cabeca cabeca;
    public Tronco tronco;
    public Membrosinferiores inferioes;

    public Pessoa(){
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferioes = new Membrosinferiores();
    }
}

