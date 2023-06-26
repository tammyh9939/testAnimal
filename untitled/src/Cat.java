public class Cat extends Animal implements Land{
    int numberOfLegs;
    public Cat(boolean mammals,boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
        this.numberOfLegs = 4;
    }

    @Override
    public void sayHello() {
        System.out.println("meow~");
        //עוד אופציה לגבי ברירת המחדל של התגובה של החיה
        /* if (this.mood != MOOD_HAPPY && this.mood != MOOD_SCARE) {
            System.out.println("wagging their tails");
        }
        else {
            sayHello(this.mood);
        }*/
    }

    public void sayHello(int mood) {
        //mood=happy
        if (mood == MOOD_HAPPY) {
            System.out.println("purr, purr");
        }
        // mood=scare
        else if (mood == MOOD_SCARE) {
            System.out.println( "hiss" );
        }
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
