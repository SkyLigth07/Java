public class MinhaCLasse {
    
    public static void main (String [] args) {

        String primeiroNome = "Sidney";
        String segundoNome = "Santiago";


        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeroNome, String segundoNome) {
        return primeroNome.concat("").concat(segundoNome);

    }


    
    
}
