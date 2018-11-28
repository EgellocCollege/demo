import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {


    ArrayList menus;

    public Waitress(ArrayList menus) {
        this.menus = menus;
    }

    public void printMenu(){

//        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
//        Iterator dinerIterator = dinerMenu.createIterator();
//        Iterator cafeIteratoer = cafeMenu.createIterator();
//
//        System.out.println("Menu -- Breakfast");
//        printMenu(pancakeIterator);
//        System.out.println("Menu -- Diner");
//        printMenu(dinerIterator);
//        System.out.println("Menu -- Cafe");
//        printMenu(cafeIteratoer);

        Iterator iterator = menus.iterator();
        while (iterator.hasNext()){
            Menu menu = (Menu) iterator.next();
            printMenu(menu.createIterator());
        }

    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + " - " + menuItem.getDescription() + " - " + menuItem.getPrice());
        }
    }
}
