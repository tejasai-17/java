class single_inheretence{
    public static void main(String[] args) {
        circle ob = new circle();
        ob.area(1);
    }
}

class shape{
    protected void area(){
    System.out.println("show area");
    }
}

class circle extends shape {
    protected void area(int r){
        System.out.println(3.14*r*r);
    }
}