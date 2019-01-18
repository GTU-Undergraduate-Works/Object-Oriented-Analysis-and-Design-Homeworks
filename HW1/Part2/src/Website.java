public class Website {

    private Text text;
    private Audio audio;
    private Photograph photograph;

    public Website(Text text, Audio audio, Photograph photograph) {
        this.text = text;
        this.audio = audio;
        this.photograph = photograph;
    }


    public void addTextSubscriber(Subscriber subscriber) {
        text.addSubscriber(subscriber);
    }

    public void addAudioSubscriber(Subscriber subscriber) {
        audio.addSubscriber(subscriber);
    }

    public void addPhpotographSubscriber(Subscriber subscriber) {
        photograph.addSubscriber(subscriber);
    }

    public void deleteTextSubscriber(Subscriber subscriber) {
        text.deleteSubscriber(subscriber);
    }

    public void deleteAudioSubscriber(Subscriber subscriber) {
        audio.deleteSubscriber(subscriber);
    }

    public void deletePhpotographSubscriber(Subscriber subscriber) {
        photograph.deleteSubscriber(subscriber);
    }


    public Text getText() {
        return text;
    }

    public Audio getAudio() {
        return audio;
    }

    public Photograph getPhotograph() {
        return photograph;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public void setPhotograph(Photograph photograph) {
        this.photograph = photograph;
    }
}
