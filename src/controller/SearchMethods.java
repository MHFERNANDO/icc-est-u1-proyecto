package controller;
import model.person;
public class SearchMethods {
    
    public person binarySearchByAge(person[] persons, int age){
        int bajo=0;
        int alto=persons.length-1;
        while(bajo<=alto){
            int medio=(bajo+alto)/2;
            if(persons[medio].getAge()==age){
                return persons[medio];
            }else if(persons[medio].getAge()<age){
                bajo=medio+1;
            }else{
                alto=medio-1;
            }
        }return null;
    }
    public person binarySearchByName(person[] persons, String name){
        int bajo=0;
        int alto=persons.length-1;
        while(bajo<=alto){
            int medio=(bajo+alto)/2;
            if(persons[medio].getName().equals(name)){
                return persons[medio];
            }else if(persons[medio].getName().compareTo(name)<0){
                bajo=medio+1;
            }else{
                alto=medio-1;
            }
        }return null;
    }
    public boolean isSortedByAge(person[] persons){
        for(int i=0; i<persons.length-1; i++){
            if(persons[i].getAge()>persons[i+1].getAge()){
                return false;
            }
        }return true;
    }
    public boolean isSortedByName(person[] persons){
        for(int i=0; i<persons.length-1; i++){
            if(persons[i].getName().compareTo(persons[i+1].getName())>0){
                return false;
            }
        }return true;

    }
}
