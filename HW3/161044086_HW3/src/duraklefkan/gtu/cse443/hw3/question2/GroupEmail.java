package duraklefkan.gtu.cse443.hw3.question2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class to represent Group Email addresses.
 */
public class GroupEmail extends EmailComponent {

    private ArrayList<EmailComponent> emailComponents = new ArrayList<>();
    private String address;
    private String name;

    /**
     * Constructs GroupEmail object wtih given name and address.
     * @param address address of group mail
     * @param name name of group
     */
    public GroupEmail(String address, String name) {
        this.address = address;
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addEmail(EmailComponent emailComponent) {
        emailComponents.add(emailComponent);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeEmail(EmailComponent emailComponent) {
        emailComponents.remove(emailComponent);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailComponent getChild(int i) {
        return emailComponents.get(i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void print() {

        System.out.println("Name : " + getName() + " , " + "Address : " + getAddress() + "\n");
        Iterator<EmailComponent> itr = emailComponents.iterator();

        while (itr.hasNext()) {
            System.out.print("\t");
            itr.next().print();
        }
        System.out.println();

    }
}
