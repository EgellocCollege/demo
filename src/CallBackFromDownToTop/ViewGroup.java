package CallBackFromDownToTop;

import java.util.ArrayList;
import java.util.Iterator;

public class ViewGroup extends View {

    ArrayList<View> childViews;

    public ViewGroup(String name,View parwent) {
        this.name = name;
        this.parent = parwent;
        childViews = new ArrayList<>();
    }

    @Override
    public void add(View view) {
        childViews.add(view);
    }

    @Override
    public void remove(View view) {
        childViews.remove(view);
    }

    @Override
    public void print(){
        super.print();
        Iterator iterator = childViews.iterator();
        while (iterator.hasNext()){
            View childView = (View)iterator.next();
            childView.print();

        }
    }
}
