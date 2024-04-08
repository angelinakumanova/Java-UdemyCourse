package MoreOOP.Exercise7;

public enum ChessLetters {
    a,
    b,
    c,
    d,
    e,
    f,
    g,
    h;

    private int position;

    ChessLetters() {
        this.position = ordinal();
    }

    public int getPosition() {
        return position;
    }
}
