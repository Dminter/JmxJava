package jmxjava.base.reflect_;

public class User extends People {
    public String school;
    private String name = "zsj";
    private int age;
    public final int y=111;
   private void say(){
         System.out.println("hello");
    }
    public void info(){
        System.out.println("user:"+name+" "+age);
    }


    private void sum(int a,int b){
         System.out.println("a+b:"+a+b);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
