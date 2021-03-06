package lab7;

public class Student {
    //class properties
    private String id;
    private String name;
    private char gender;
    //constructor
    //1.default constructor
    public  Student (){}
    //2.desing constructor
    public  Student (String id, String name, char gender){
      this.id = id;
      this.name = name;
      this.gender = gender;


    }

    //getter and setter methods
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName (){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public char getGender (){
        return this.gender;
    }
    public void setGender(char gender){
        this.gender = gender;
    }

    //toString


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}//class
