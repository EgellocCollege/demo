import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItems ;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position>= menuItems.size()){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {

        MenuItem menuItem = menuItems.get(position);
        position = position +1;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position < 0){
            throw  new IllegalStateException("You cannot remove an item until you have done at least one next");
        }

            for (int i = 0;i<menuItems.size();i++){
                menuItems.remove(i);
            }


    }
}
