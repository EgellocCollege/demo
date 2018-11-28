import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu  {
    Hashtable menuItems = new Hashtable();


    public CafeMenu(){
        addItem("Cafe A",
                "Pancakes with scramed egg and toast",
                true,
                2.0
        );

        addItem("Cafe B",
                "Pancakes with scramed egg and sauage",
                true,
                3.0
        );

        addItem("Cafe Air",
                "with fresh bluerreies",
                true,
                4.0
        );



    }


    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(),menuItem);
    }

//    public Hashtable getMenuItems(){
//        return menuItems;
//    }

   public Iterator createIterator(){
        return menuItems.values().iterator();
   }
}
