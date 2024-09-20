package br.lpm;

public class Main {
    public static void main(String[] args) throws Exception {
        RevisaoAed revisaoAed;
        revisaoAed = new RevisaoAed();
        
        System.out.println("1o elemento com loop: " + revisaoAed.fibLoop(1));
        System.out.println("2o elemento com loop: " + revisaoAed.fibLoop(2));
        System.out.println("3o elemento com loop: " + revisaoAed.fibLoop(3));
        System.out.println("4o elemento com loop: " + revisaoAed.fibLoop(4));
        System.out.println("5o elemento com loop: " + revisaoAed.fibLoop(5));
        
        System.out.println("1o elemento com recursividade: " + revisaoAed.fibRec(1));
        System.out.println("2o elemento com recursividade: " + revisaoAed.fibRec(2));
        System.out.println("3o elemento com recursividade: " + revisaoAed.fibRec(3));
        System.out.println("4o elemento com recursividade: " + revisaoAed.fibRec(4));
        System.out.println("5o elemento com recursividade: " + revisaoAed.fibRec(5));

        Imc imc = new Imc();
        imc.peso = 82.5f;
        imc.altura = 1.83f;
        System.out.println("Peso " + imc.peso + 
                            "\nAltura " + imc.altura + 
                            "\nImc é " + imc.getImc());
    }
}
