package June09;

import java.util.ArrayList;

public class ContMain {
    static void main(String[] args) {

        ArrayList<Cont> cont = new ArrayList<>();
        cont.add(new Cont("Harry",1,"Maths"));
        cont.add(new Cont("Ron",2,"Physics"));
        cont.add(new Cont("Tom",3,"Chemistry"));
        cont.add(new Cont("Jerry",4,"Economics"));


        for(Cont e : cont){
            System.out.println(e);
        }

    }
}
