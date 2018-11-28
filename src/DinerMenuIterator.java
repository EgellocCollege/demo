import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }
    @Override
    public boolean hasNext() {
        if (position>=menuItems.length || menuItems[position] != null){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position = position +1;

        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0){
            throw  new IllegalStateException("You cannot remove an item until you have done at least one next");
        }
        if (menuItems[position-1] != null){
            for (int i = position -1;i<(menuItems.length-1);i++){
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length-1] = null;
        }
    }
}
