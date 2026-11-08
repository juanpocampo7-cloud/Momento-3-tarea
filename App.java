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
        System.out.println("1.Listar 2.Buscar 3.Agregar 4.Salir");
        opcion = leer.nextInt();
    
     } while(opcion!=4);
     
    }
}
