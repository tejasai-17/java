public class encapsulation {
    public static void main(String[] args) {
        student ob = new student();
        ob.setName("Tejasai");
        System.out.println("Your name: "+ob.getName());  
    }
}

class student {
    private String name;
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
}
