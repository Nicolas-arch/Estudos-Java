public class testaScopoVariaveis {
    public static void main(String[] args) {
        System.out.println("testando Condicionais");



        int idade = 2;
        int quantidadedePessoas=3;
        boolean acompanhado;
        //boolean acompanhado= quantidadedePessoas>=2;

        if(quantidadedePessoas>=2){
            //acompanhado n existe
             acompanhado=true;
            //acompanhado existe
        }else{//acompanhado n existe
            //acompanhado n existe
             acompanhado=false;
            //acompanhado existe
        }//acompanhado n existe

        
        System.out.println("valor acompanhado = "+acompanhado);
        if (idade >= 18 || acompanhado) {
            System.out.println("seja bem-vindo");

        }else{
            System.out.println("espere mais um pouco");
        }

    }
}
