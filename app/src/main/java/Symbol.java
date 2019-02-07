public class Symbol {
    private int number;
    private String title;
    private String description;
    private int imgResourceId;

    public Symbol(int number, String title, String description, int imgResourceId) {
        this.number = number;
        this.title = title;
        this.description = description;
        this.imgResourceId = imgResourceId;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImgResourceId() {
        return imgResourceId;
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "number=" + number +
                ", title='" + title + '\'' +
                '}';
    }
}
