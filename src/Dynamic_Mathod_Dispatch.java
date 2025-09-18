class phone {
    public void iphone(){
        System.out.println("Iphone new launch");
    }

    public void Newlaunch(){
        System.out.println("New launch phone in market for all product");
    }
}
class Smartphone extends phone{

    public void Newlaunch(){
        System.out.println("New Smart phone launch in market");
    }

    public void mtd(){
        System.out.println("Create obj reference with help of super not runnning");
    }

}

public class Dynamic_Mathod_Dispatch {
    public static void main(String[] args) {
        phone obj = new Smartphone();
        obj.Newlaunch();
        // obj.mtd(); --> Not allow

    }
}
