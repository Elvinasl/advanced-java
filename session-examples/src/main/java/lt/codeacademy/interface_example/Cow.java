package lt.codeacademy.interface_example;

public class Cow extends Creature implements Animal {

    private static final String SOUND = "MUUUU!";

    public Cow() {
    }

    public void produceMilk() {
        // something
    }

    @Override
    public String makeSound() {
        return SOUND;
    }

    @Override
    public String getName() {
        return this.getClass().getName();
    }


    @Override
    public Long getIdentityNumber() {
        return -1L;
    }
}
