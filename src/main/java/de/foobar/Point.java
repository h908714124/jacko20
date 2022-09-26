package de.foobar;

primitive class Point {
    final Integer x;
    final Integer y;

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer x() { return x; }
    public Integer y() { return y; }
}
