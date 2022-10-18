package animals;

public abstract class Animal{
    protected Object backLeftLeg, backRightLeg, frontLeftLeg, frontRightLeg, tail;
    protected String breed;
    protected String[] breeds;

    public void voice (){
        System.out.println("I'm an unknown animal, what do you expect me to say?");
    }
    
    public String getBreed() {
        return breed;
    }
}