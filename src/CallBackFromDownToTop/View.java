package CallBackFromDownToTop;

public abstract  class View {

    View parent;

    String name;



    public  void add(View view){

    };

    public  void remove(View view){

    };

    public void print(){
        System.out.println(name);
    }

    public void CallBack(){
        System.out.println(name);
        if (parent == null){
            return;
        }
        parent.CallBack();
    }
}
