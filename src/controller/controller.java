package controller;
import views.view;
import model.person;

public class controller {
    private view view;
    private person[] persons;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;

    public controller() {
        this.view = new view();
        this.sortingMethods = new SortingMethods();
        this.searchMethods = new SearchMethods();
    }
    
    public void start(){
        int option = 0;
        do {
            
            
            option = view.showMenu();
            switch (option) {
                case 1:
                    inputPerson();
                    break;
                case 2:
                    sortPersons();
                    break;
                case 3:
                    searchPerson();
                    break;
                case 4:
                    view.displayPerson(persons, persons.length);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida, intente de nuevo.");
            }

        }while (option != 5); 
    }
    public void inputPerson(){
        int size = view.inputSize();
        persons = new person[size];
        for (int i = 0; i < size; i++) {
            persons[i] = view.inputPerson();
        }
    }
    public void sortPersons(){
        int option = view.selectSortingMethod();
        switch (option) {
            case 1:
                sortingMethods.sortByNameWhitBubbleSort(persons);
                break;
            case 2:
                sortingMethods.sortByNameWithSelection(persons);
                break;
            case 3:
                sortingMethods.sortByNameWithInsertion(persons);
                break;
            case 4:
                sortingMethods.sortByAgeWithInsertion(persons);
                break;
            default:
                System.out.println("opcion invalida");
        }
    }
    public void searchPerson(){
        int option = view.selectSearchCriterion();
        switch (option) {
            case 1:
                String name = view.inputName();
                if (searchMethods.isSortedByName(persons)) {
                    person foundPerson = searchMethods.binarySearchByName(persons, name);
                    if (foundPerson != null) {
                        System.out.println("Encontrado: " + foundPerson.toString());
                    } else {
                        System.out.println("No Encontrado");
                    }
                } else {
                    System.out.println("Lista no ordenada por nombre");
                }
                break;
            case 2:
                int age = view.inputAge();
                if (searchMethods.isSortedByAge(persons)) {
                    person foundPerson = searchMethods.binarySearchByAge(persons, age);
                    if (foundPerson != null) {
                        System.out.println("Encontrado: " + foundPerson.toString());
                    } else {
                        System.out.println("No Encontrado");
                    }
                } else {
                    System.out.println("Lista no ordenada por edad");
                }
                break;
            default:
                System.out.println("opcion invalida");
        }
    }


}