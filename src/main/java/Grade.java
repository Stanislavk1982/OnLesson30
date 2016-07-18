public class Grade {
    private int number;
    private String letter;
    private String text;

    public Grade(int number, String letter, String text) {

        this.number = number;
        this.letter = letter;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "number=" + number +
                ", letter='" + letter + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
