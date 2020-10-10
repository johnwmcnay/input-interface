public class Prompt implements TextToDisplay {

    private String prompt;

    public Prompt(String prompt) {
        this.setPrompt(prompt);
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getPrompt() {
        return this.prompt;
    }

    @Override
    public void print() {
        System.out.println(this.getPrompt());
    }
}
