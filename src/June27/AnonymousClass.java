package June27;

public class AnonymousClass {

    interface Game{
        public void play();
    }

    static void main(String[] args) {

        Game  g = new Game(){
            @Override
            public void play() {
                System.out.println("Playing anonymous class");
            }
        };
        g.play();


    }
}
