package IterateUpToDown;

public class mian {
    public static void main(String[] args){


        ViewGroup viewRoot = new ViewGroup("ViewRoot");

        // 定义一个叶
        View node11 = new ViewItem("left11");
        viewRoot.add(node11);


        // 定义一个枝，有2个叶
        ViewGroup node12 = new ViewGroup("node12");
        node12.add(new ViewItem("left121"));
        node12.add(new ViewItem("left122"));
        viewRoot.add(node12);



        // 定义一个枝，有2个叶和一个枝
        ViewGroup node13 = new ViewGroup("node13");
        node13.add(new ViewItem("left131"));
        node13.add(new ViewItem("left132"));


        ViewGroup node133 = new ViewGroup("node133");
        node133.add(new ViewItem("left1331"));
        node133.add(new ViewItem("left1332"));
        node13.add(node133);

        viewRoot.add(node13);

        viewRoot.print();








    }
}
