
public class User {
    private int id;
    private String name;
    private int age;
    
    public User(int id,String name,int age){
    super();
    this.name=name;
    this.age=age;
    this.id=id;
    }
    
    public String getName(){
    return name;
    }
    public void setName(String name){
    this.name=name;
    }
    public int getİd(){
    return id;
    }
    public void setİd(int id){
    this.id=id;
    }
    public int getAge(){
    return age;
    }
    public void setAge(int age)
    {
    this.age=age;
    }
    
}
