package views;
import java.util.Scanner;
import model.person;
public class view {
    Scanner leer = new Scanner(System.in);
    
    public int showMenu(){
        System.out.println("Ingrese una opcion: "); 
        System.out.println("1. Agregar persona ");
        System.out.println("2. Ordenar personas ");
        System.out.println("3. Buscar persona ");
        System.out.println("4. Mostrar personas ");
        System.out.println("5. Salir ");
        return leer.nextInt();
    }
    public person inputPerson(){
        System.out.println("Enter name: ");
        String name = leer.nextLine();
        System.out.println("Enter age: ");
        int age = leer.nextInt();
        return new person(name, age);
    }
    public int selectSortingMethod(){
        System.out.println("Select sorting method: ");
        System.out.println("1. Metodo de Burbuja");
        System.out.println("2. Metodo de Seleccion");
        System.out.println("3. Metodo de Insercion");
        System.out.println("4. Metodo de Burbuja Mejorado");
        return leer.nextInt();
    }
    public int selectSearchCriterion(){
        System.out.println("Selecciona el criterio de busqueda: ");
        System.out.println("1. Nombre");
        System.out.println("2. Edad");
        return leer.nextInt();
    }
    public void displayPerson(person[] p, int i){
        System.out.println("Name: " + p[i].getName() + ", Age: " + p[i].getAge());
    }
    public int inputAge(){
        System.out.println("Ingrese edad ");
        return leer.nextInt();
    }
    public String inputName(){
        System.out.println("Ingrese nombre ");
        return leer.next();
    }
}
