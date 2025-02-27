public class Dynamic_Dispatch {
    public static void main(String[] args) {
        parent P = new parent();
        child C = new child();
        P.show();
        C.show();
    }
}

class parent{
    void show(){
        System.out.println("Parent class is called");
    }
}

class child{
    void show(){
        System.out.println("child class is called");
    }
}