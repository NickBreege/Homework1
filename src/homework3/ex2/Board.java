package homework3.ex2;

public abstract class Board extends Os {
    private String nameBoard;
    private int width;
    private int length;
    private int height;

    public String getNameBoard() {
        return nameBoard;
    }

    public void setNameBoard(String nameBoard) {
        this.nameBoard = nameBoard;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
