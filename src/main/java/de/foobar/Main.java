package de.foobar;

public class Main {

  public static void main(String[] args) {
    Point p1 = new Point(1, 2);
    Point p2 = new Point(2, 1);
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p1.x());
    System.out.println(p1.y());
  }
}
