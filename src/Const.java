public class Const {
    private int age;
    private String name;
    public Const(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println(this.name);



    }
    public Const(){
       this(5, "kuba");
        System.out.println(age);
    }
    public void setName(String name){
        this.name = name;
        System.out.println(name);

    }
}
