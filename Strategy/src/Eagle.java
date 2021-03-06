// Strategy Design Pattern
// Eagle class inherited from Animal


// Eagle: Initialized several properties of Animal class
// Eagle: Defined flying type and swimming type
public class Eagle extends Animal {

    // The constructor initializes Eagle objects
    public Eagle(){

        super();
        // Given the animal name for Eagle
        setName("Eagle");

        // We set the Flying interface polymorphically, as a flying Animal
        flyingType = new HighFlying();
        // We set the Swimming interface polymorphically, as a swimming Animal
        swimmingType = new UnableSwimming();

        //
        System.out.println("Eagle: One eagle is created");
    }

}