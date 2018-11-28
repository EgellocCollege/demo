package DoubleInterfaceIterate;

import java.util.ArrayList;
import java.util.Iterator;

public class ViewGroup extends View {

    ArrayList<View> childViews;

    public ViewGroup(String name) {
        this.name = name;
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
    public void onPress(){
        super.onPress();
        Iterator iterator = childViews.iterator();
        while (iterator.hasNext()){
            View childView = (View)iterator.next();
            childView.onPress();

        }
    }

    @Override
    public void onDraw(){
        super.onDraw();
        Iterator iterator = childViews.iterator();
        while (iterator.hasNext()){
            View childView = (View)iterator.next();
            childView.onDraw();

        }
    }

}
