package lt.codeacademy.interface_example;

public class Person extends Creature implements Human {

    private String name;
    private Long personalCode;

    public Person(String name, Long personalCode) {
        this.name = name;
        this.personalCode = personalCode;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Long getIdentityNumber() {
        return personalCode;
    }

    @Override
    public String saySomethingSmart() {
        return "I am a smart person!";
    }
}
