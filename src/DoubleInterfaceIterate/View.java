package DoubleInterfaceIterate;

public class View implements IEvent, IDraw {

    View parent;

    String name;



    public  void add(View view){

    };

    public  void remove(View view){

    };

    @Override
    public void onPress(){
        System.out.println("Interface onPress--" + name);
    }

    @Override
    public void onDraw(){
        System.out.println("Interface onDraw---- " + name);
    }
}
