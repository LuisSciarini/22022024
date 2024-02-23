package primeiro_exemplo;

import modelos.Pessoafisica;

public class Hello2 {
    public static void main(Int[] args) {
        System.out.println("Funciona!!!");

        Pessoafisica p1 = new Pessoafisica ();
        p1.setIdade("123");

        System.out.println(p1.getIdade());
    }
}