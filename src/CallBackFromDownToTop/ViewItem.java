package CallBackFromDownToTop;

public class ViewItem extends View {


    public ViewItem(String name,View parwent) {
        this.name = name;
        this.parent = parwent;
    }
}
