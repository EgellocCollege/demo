import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<>();

        addItem("Pancake Breakfast",
                "Pancakes with scramed egg and toast",
                true,
                2.99
                );

        addItem("Regular Pankcake Breakfast",
                "Pancakes with scramed egg and sauage",
                true,
                1.99
        );

        addItem("BlueBerry Pancake",
                "with fresh bluerreies",
                true,
                3.99
        );

        addItem("Warffles",
                "Warffles with your choice of BlueBerries  and srawberries",
                true,
                6.99
        );

    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

//    public ArrayList getMenuItems(){
//        return menuItems;
//    }

    @Override
    public Iterator createIterator(){
        return  new PancakeHouseMenuIterator(menuItems);
    }

}
