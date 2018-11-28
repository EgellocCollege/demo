package DoubleInterfaceIteratorAndCalbak;

public class mian {
    public static void main(String[] args){


        ViewGroup viewRoot = new ViewGroup("ViewRoot",null);

        // 定义一个叶
        View node11 = new ViewItem("left11",viewRoot);
        viewRoot.add(node11);


        // 定义一个枝，有2个叶
        ViewGroup node12 = new ViewGroup("node12",viewRoot);
        node12.add(new ViewItem("left121",node12));
        node12.add(new ViewItem("left122",node12));
        viewRoot.add(node12);



        // 定义一个枝，有2个叶和一个枝
        ViewGroup node13 = new ViewGroup("node13",viewRoot);
        node13.add(new ViewItem("left131",node13));
        node13.add(new ViewItem("left132",node13));


        ViewGroup node133 = new ViewGroup("node133",node13);

        View left1331 = new ViewItem("left1331",node133);
        node133.add(left1331);

        View left1332 = new ViewItem("left1332",node133);
        node133.add(left1332);


        node13.add(node133);

        viewRoot.add(node13);

        System.out.println("---- Test The First Inferface onPress  ----");
        viewRoot.onPress();

        System.out.println("---- Test The Second Inferface onDraw  ----");
        viewRoot.onDraw();


        System.out.println("---- Call Back From Down To Up ----");
        left1332.CallBack();





    }
}
