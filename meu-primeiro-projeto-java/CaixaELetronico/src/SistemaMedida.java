public class SistemaMedida {

    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P":{
                System.out.println("Pequeno");
                
            }
            case "M":{
                System.out.println("Medio");
                break;
            }
            case "g":{
                System.out.println("Grande");
                
            }

            default:{
                System.out.println("Indefinido");
            }


                
        }
    
 }
}
