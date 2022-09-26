package de.foobar;

public class Main {

  public static void main(String[] args) {
    Point p1 = new Point(null, Integer.valueOf("1"));
    Point p2 = new Point(null, Integer.valueOf("1"));
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p1 == p2);
    System.out.println(p1.x());
    System.out.println(p1.y());
  }
}
