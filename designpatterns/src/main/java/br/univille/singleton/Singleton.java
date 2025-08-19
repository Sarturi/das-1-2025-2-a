package br.univille.singleton;

public class Singleton {
    // variavel global - "espécie" Tipo que é carregado na memória antes de ele existir
    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance (){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
