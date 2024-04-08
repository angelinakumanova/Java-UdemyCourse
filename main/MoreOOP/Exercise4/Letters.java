package MoreOOP.Exercise4;

public enum Letters {
    a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;

    private int position;
    Letters () {
        this.position = ordinal() + 1;
    }

    public int getPosition() {
        return position;
    }
}
