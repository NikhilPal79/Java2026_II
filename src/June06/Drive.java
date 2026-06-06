package June06;

public class Drive {

    int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void bookTest(){
        if(age < 18){
            throw new InvalidAgeException("invalid age, not eligible");
        }else {
            System.out.println("valid age, You are eligible");
        }
    }
}
