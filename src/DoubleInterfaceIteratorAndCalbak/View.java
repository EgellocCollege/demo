package DoubleInterfaceIteratorAndCalbak;

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

    public void CallBack(){
        System.out.println(name);
        if (parent == null){
            return;
        }
        parent.CallBack();
    }

}
