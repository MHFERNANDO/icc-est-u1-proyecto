package views;
import java.util.Scanner;
import model.person;
public class view {
    Scanner leer = new Scanner(System.in);
    
    public int showMenu(){
        System.out.println("Ingrese una opcion: "); 
        System.out.println("1. Cambiar persona ");
        System.out.println("2. Ordenar personas ");
        System.out.println("3. Buscar persona ");
        System.out.println("4. Mostrar personas ");
        System.out.println("5. Salir ");
        return leer.nextInt();
    }
    public person inputPerson(){
        System.out.println("Enter name: ");
        String name = leer.next();
        System.out.println("Enter age: ");
        int age = leer.nextInt();
        return new person(name, age);
    }
    public int selectSortingMethod(){
        System.out.println("Select sorting method: ");
        System.out.println("1. Metodo de Burbuja");
        System.out.println("2. Metodo de Seleccion por Nombre");
        System.out.println("3. Metodo de Insercion por Nombre");
        System.out.println("4. Metodo de Insercion por Edad");
        return leer.nextInt();
    }
    public int selectSearchCriterion(){
        System.out.println("Selecciona el criterio de busqueda: ");
        System.out.println("1. Nombre");
        System.out.println("2. Edad");
        return leer.nextInt();
    }
    public void displayPerson(person[] p, int i){
        for (int j = 0; j < p.length; j++) {
            System.out.println("Persona " + (j+1) + ": " + p[j].toString());
        }
    }
    public int inputAge(){
        System.out.println("Ingrese edad ");
        return leer.nextInt();
    }
    public String inputName(){
        System.out.println("Ingrese nombre ");
        return leer.next();
    }
    public int inputSize(){
        System.out.println("Ingrese el tamaño del arreglo: ");
        return leer.nextInt();
    }
}
