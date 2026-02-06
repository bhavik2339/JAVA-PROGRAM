class Javacons {
    String name;
    int id;

    Javacons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    Javacons(Javacons obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}

public class copy {
    public static void main(String[] args) {

        Javacons ob = new Javacons("BHAVIK",114);
        System.out.println("Name: " + ob.name + " and Id: " + ob.id);

        Javacons ob1 = new Javacons(ob);
        System.out.println("Copy Constructor used Second Object");
        System.out.println("Name: " + ob1.name + " and Id: " + ob1.id);
    }
}
