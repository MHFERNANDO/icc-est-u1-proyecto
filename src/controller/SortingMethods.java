package controller;
import model.person;
public class SortingMethods {
    public void sortByNameWhitBubbleSort(person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = i+1; j < persons.length; j++) {
                if (persons[i].getName().compareTo(persons[j].getName()) > 0) {
                    person temp = persons[j];
                    persons[j] = persons[i];
                    persons[i] = temp;
                }
            }
        }
    }
    public void sortByNameWithSelection(person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[j].getName().compareTo(persons[minIndex].getName()) < 0) {
                    minIndex = j;
                }
            }
            person temp = persons[minIndex];
            persons[minIndex] = persons[i];
            persons[i] = temp;
        }
    }
    public void sortByNameWithInsertion(person[] persons) {
        for (int i = 1; i < persons.length; i++) {
            person key = persons[i];
            int j = i - 1;
            while (j >= 0 && persons[j].getName().compareTo(key.getName()) > 0) {
                persons[j + 1] = persons[j];
                j--;
            }
            persons[j + 1] = key;
        }
    }
    public void sortByAgeWithInsertion(person[] persons) {
        for (int i = 1; i < persons.length; i++) {
            person key = persons[i];
            int j = i - 1;
            while (j >= 0 && persons[j].getAge() > key.getAge()) {
                persons[j + 1] = persons[j];
                j--;
            }
            persons[j + 1] = key;
        }
    }
    

}
