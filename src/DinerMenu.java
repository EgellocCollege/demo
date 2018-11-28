import java.util.Iterator;
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems =0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "Bacon with lettrue & tomato on whole wheat",
                true,
                2.49
        );

        addItem("BLT",
                "Bacon  with tomato egg and sauage",
                false,
                2.59
        );

        addItem("Soup of day",
                "Soup of day with fresh bluerreies",
                true,
                3.49
        );

        addItem("Hotdog",
                "Hotdog with saurkraut,relish,onlions",
                true,
                6.59
        );

    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems>=MAX_ITEMS){
            System.err.println("Sorry , menu is full ! cannot add item to menu");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems  = numberOfItems + 1;
        }

    }

//    public MenuItem[] getMenuItems(){
//        return menuItems;
//    }

    @Override
    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }

}
