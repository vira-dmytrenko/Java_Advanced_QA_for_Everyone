public class Inherit {
    public static void main(String[] args) {
        C c = new C("red");
        ((A)c).jump();
    }
}

class A{
    String name;

    A(String name){
        this.name = name;
        System.out.println("A");
    }

    public void jump(){
        System.out.println("jump A");
    }
}

class B extends A{
    String color;

    B(String color){
        super("kate");
        this.color = color;
    }

    public void jump(){
        System.out.println("jump B");
    }
}

class C extends B{
    C(String color) {
        super(color);
    }

    public void jump(){
        super.jump();
    }
}


