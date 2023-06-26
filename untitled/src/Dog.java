public class Dog extends Animal implements Land{
    int numberOfLegs;
    public Dog(boolean mammals,boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
        this.numberOfLegs = 4;
    }

    @Override
    public void sayHello() {
        System.out.println("wagging their tails");
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
            System.out.println("hav hav");
        }
        // mood=scare
        else if (mood == MOOD_SCARE) {
            System.out.println("whooping");
        }
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
