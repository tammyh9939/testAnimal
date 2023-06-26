public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(true,true,0);
        Cat cat = new Cat(true,true,1);
        Frog frog = new Frog(false,false,1);

        dog.sayHello();
        dog.sayHello(1);
        dog.sayHello(2);
        cat.sayHello();
        cat.sayHello(1);
        cat.sayHello(2);
        frog.sayHello();
        frog.sayHello(1);
        frog.sayHello(2);


    }

}