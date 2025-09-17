

class employee {
    int id;
    String name;

}

public class Custom_class {
    public static void main(String[] args) {
        System.out.println("This is example of customer command");
        employee nameEmp = new employee();
        nameEmp.id = 123;
        nameEmp.name="Himanshu";
        System.out.println(nameEmp.id);
        System.out.println(nameEmp.name);

    }
}
