public class Photograph extends Content{

    private String photograph;

    @Override
    protected void setChanged() {

    }

    public Photograph(String photograph) {
        this.photograph = photograph;
    }


    public String getPhotograph() {
        return photograph;
    }

    public void setPhotograph(String photograph) {
        this.photograph = photograph;
    }


}
