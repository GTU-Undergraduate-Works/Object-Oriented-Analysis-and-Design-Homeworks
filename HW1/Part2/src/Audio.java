public class Audio extends Content {


    private String audio;

    @Override
    protected void setChanged() {

    }

    public Audio(String audio) {
        this.audio = audio;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
}
