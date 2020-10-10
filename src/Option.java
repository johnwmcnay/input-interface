public class Option implements TextToDisplay {

    private String optionText;
    private static byte count = 0;

    public Option(String text) {
        setOptionText(text);
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public String getOptionText() {
        return this.optionText;
    }

    public static void resetCount() {
        count = 0;
    }

    public static byte incrementCount() {
        return ++count;
    }

    @Override
    public void print() {
        System.out.printf("%d: %s\n", incrementCount(), getOptionText());
    }
}
