abstract class Animal {
        protected boolean mammals;
        protected boolean carnivorous;
        public static final int MOOD_HAPPY = 1;
        public static final int MOOD_SCARE = 2;
        protected int mood;

   public Animal(boolean mammals, boolean carnivorous, int mood) {
        this.mammals = mammals;
        this.carnivorous = carnivorous;
        this.mood = mood;
    }
    public void sayHello(){
        sayHello(this.mood);
    }
    public abstract void sayHello(int mood);

    public boolean isMammals(){
        return this.mammals;
    }

    public void setMammals(boolean mammals){
        this.mammals = mammals;
    }

    public boolean isCarnivorous(){
        return this.carnivorous;
    }

    public void setCarnivorous(boolean carnivorous){
        this.carnivorous = carnivorous;
    }
}
