import java.util.Scanner;

public class App    {

    public static void main(String[] args) {
        
        String[] prendasGco = new String [5];
        prendasGco [0]= "Chaqueta Cuero Icon";
        prendasGco [1]= "Jean Slim Fit";
        prendasGco [2]= "Camiseta Polo Leather";
        prendasGco [3]= null;
        prendasGco [4]= null;
     
     Scanner leer = new Scanner(System.in);
     int opcion = 0;
     
     //menu principal del programa
     do{
        System.out.println("1.Listar");
        System.out.println("2.Buscar");
        System.out.println("3.Agregar");
        System.out.println("4.Salir");
        opcion = leer.nextInt();
        
        if (opcion == 1) {
        for (String prendas : prendasGco) {
            if(prendas != null) {
                System.out.println(prendas);
            
            }

        }     
    }
    else if (opcion ==2) {
        System.out.println("Ingrese nombre de la prenda");
        leer.nextLine();
        String prendaBuscada = leer.nextLine();

        String resultado = buscarPrenda(prendasGco, prendaBuscada);
        System.out.println(resultado);
    }

    else if (opcion ==3) {
        System.out.println("Ingrese la prenda que desea agregar");
        leer.nextLine();

        String nuevaPrenda = leer.nextLine();

        String resultado = agregarPrendas (prendasGco, nuevaPrenda);
        System.out.println(resultado);


    } 
    
     } while(opcion!=4);
 
   

}

    public static String buscarPrenda (String[] prendasGco, String prendaBuscada) {

        for (String prenda : prendasGco) {
            if (prenda != null && prenda.equalsIgnoreCase(prendaBuscada)){
                return "Prenda encontrada con exito:" + prenda + "!";
            }
        
        }
        return  "la prenda no existe en inventario";
    }

    public static String agregarPrendas (String[] prendasGco, String nuevaPrenda) {

        for (int i = 0; i < prendasGco.length; i++){

            if (prendasGco[i] == null){
                prendasGco[i] = nuevaPrenda;
                return "Prenda añadida con exito";
            }
        }
      return "inventario lleno";
    }


}

