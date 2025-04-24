import controller.controller;
import controller.SortingMethods;
import controller.SearchMethods;
import java.util.Scanner;
import model.person;
import views.view;
import controller.SortingMethods;
import controller.SearchMethods;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int n=leer.nextInt();
        controller controller = new controller(new views.view(), new SortingMethods(), new SearchMethods(), n);
        controller.start();
    }
}
