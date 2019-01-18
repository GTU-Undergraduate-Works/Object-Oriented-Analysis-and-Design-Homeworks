package duraklefkan.gtu.cse443.hw3.question2;

/**
 * Class to represent personal emails.
 */
public class PersonalEmail extends EmailComponent {

    private String adress;
    private String name;

    /**
     * Constructs PersonalEmail object with given address and name
     * @param address person mail address
     * @param name name of person
     */
    public PersonalEmail(String address, String name) {
        this.adress = address;
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAddress() {
        return adress;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void print() {
        System.out.println("\tName : " + getName() + " , " + "Address : " + getAddress());
    }
}
