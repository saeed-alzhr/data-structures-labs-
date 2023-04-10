
public class Person {
    private String name;
private int age;
private double height; 

public Person() {
name = "";
age = 0;
height=0.0;
}

public Person(String nName, int nAge,double nHeight) {
name = nName;
age = nAge;
height=nHeight;
}

public String getName() {
return name;
}

public int getAge() {
return age;
}
public double getHeight(){
return height;
}

public void setName(String nName) {
name = nName;
}

public void setAge(int nAge) {
age = nAge;
}
public void setHeight( double nHeight){
height =nHeight;

}

public String toString() {
return "Person(" + name + ", " + age +","+ height+")";

    
}
}
