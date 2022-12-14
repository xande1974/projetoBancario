package com.mycompany.bancario;
public class Bancario {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta (21368);
        p1.setDono(" Ale");
        p1.abrirConta(" CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta (103109);
        p2.setDono(" Eli");
        p2.abrirConta(" CP");
        
        System.out.println(p1.toString());
   
            
        
    }
}
