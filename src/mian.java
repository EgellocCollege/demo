import composite.Menu;
import composite.MenuComponent;
import composite.MenuItem;
import composite.Waitress;

public class mian {
    public static void main(String[] args){

        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu","Breakfast");
        MenuComponent dinerMenu = new Menu("Diner House Menu","Diner");
        MenuComponent cafeMenu = new Menu("cafe Menu","cafe");

        MenuComponent dessertMenu = new Menu("DeSSERT Menu","DeSSERT");

        MenuComponent allMenus = new Menu("All Menu","ALL");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Hotdog",
                "Hotdog with saurkraut,relish,onlions",
                true,
                6.59));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Dessert of day",
                "Soup of day with fresh bluerreies",
                true,
                3.49));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();



    }
}
