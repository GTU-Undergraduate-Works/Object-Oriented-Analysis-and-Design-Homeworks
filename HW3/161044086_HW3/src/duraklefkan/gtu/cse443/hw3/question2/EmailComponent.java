package duraklefkan.gtu.cse443.hw3.question2;

/**
 * Abstract Class to represent Email Components.
 */
public abstract class EmailComponent {

    /**
     * Add given email component to this email component
     * @param emailComponent email component
     */
    public void addEmail(EmailComponent emailComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * Remove given email component from this email component
     * @param emailComponent email component
     */
    public void removeEmail(EmailComponent emailComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the child of this email component with given index i
     * @param i index to get child
     * @return child of this email component in given index
     */
    public EmailComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets address of this email component
     * @return address of this email component
     */
    public String getAddress() {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets name of this email component
     * @return name of email component
     */
    public String getName() {
        throw new UnsupportedOperationException();
    }

    /**
     * Prints mails of this email component
     */
    public void print() {
        throw new UnsupportedOperationException();
    }


}
