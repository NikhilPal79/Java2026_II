package July02;


import java.sql.SQLOutput;

interface Work {
    void work();
}

interface Min {
    int min(int a , int b);
}

interface Play {

    String play(String teamA, String teamB);
}

interface Greet{
    String greetPeople(String name);
}

public class Main {
    static void main(String[] args) {
        Work work = () -> System.out.println("hello");
        work.work();

        Min obj = ( a,  b) -> {

            if(a<b){
                return a;
            }else {
            return b;
            }
        };
        System.out.println(obj.min(10, 20));

        Play meth = (teamA, teamB) -> {

            if(teamA.equals(teamB)){
                return teamA;
            }else {
                return teamB;
            }
        };
        System.out.println(meth.play("Spain", "Portugal"));

        Greet atom =  n  -> "Hello " + n;
        System.out.println(atom.greetPeople("Nikhil"));
    }
}
