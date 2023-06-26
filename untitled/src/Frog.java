public class Frog extends Animal implements Water,Land{
    int numberOfLegs;

    public Frog(boolean mammals,boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
        this.numberOfLegs = 4;
    }

    public void sayHello(int mood) {
        //mood=happy
        if (mood == MOOD_HAPPY) {
            System.out.println("quack quack quack");
        }
        // mood=scare
        else if (mood == MOOD_SCARE) {
            System.out.println( "plop into the water" );
        }
    }

    public boolean hasGills(){
        return true;
    }

    public boolean hasLaysEggs(){
        return true;
    }
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

}