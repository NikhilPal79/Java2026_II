package May12.Blocks;

public class Block {

    static{
        System.out.println(" this is static block");
    }

    {
        System.out.println(" this is instance block");
    }

    public Block(){
        System.out.println(" this is constructor");
    }

    static void main(String[] args) {

        Block block = new Block();

    }
}
