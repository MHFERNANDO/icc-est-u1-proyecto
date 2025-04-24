package controller;
import views.view;
import model.person;
import controller.SortingMethods;
import controller.SearchMethods;
import java.util.Scanner;

public class controller {
    private view view;
    private person[] persons;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;

    public controller(view view, SortingMethods sortingMethods, SearchMethods searchMethods, int n) {
        this.view = new view();
        this.sortingMethods = new SortingMethods();
        this.searchMethods = new SearchMethods();
        this.persons = new person[n];
        Scanner scanner = new Scanner(System.in);
    }
    public void start(){
        int option = 0;
        option=view.showMenu();
    }
    public void inputPerson(){
        person newPerson = view.inputPerson();
        person[] newPersons = new person[persons.length + 1];
        for (int i = 0; i < persons.length; i++) {
            newPersons[i] = persons[i];
        }
        newPersons[newPersons.length - 1] = newPerson;
        persons = newPersons;
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
                System.out.println("Invalid option");
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
                        System.out.println("Found: " + foundPerson.toString());
                    } else {
                        System.out.println("Not found");
                    }
                } else {
                    System.out.println("Array not sorted by name");
                }
                break;
            case 2:
                int age = view.inputAge();
                if (searchMethods.isSortedByAge(persons)) {
                    person foundPerson = searchMethods.binarySearchByAge(persons, age);
                    if (foundPerson != null) {
                        System.out.println("Found: " + foundPerson.toString());
                    } else {
                        System.out.println("Not found");
                    }
                } else {
                    System.out.println("Array not sorted by age");
                }
                break;
            default:
                System.out.println("Invalid option");
        }
    }


}