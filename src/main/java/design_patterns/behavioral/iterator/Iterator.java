package design_patterns.behavioral.iterator;

abstract class Iterator {

  abstract String current();

  abstract boolean hasNext();

  abstract String first();

  abstract String last();

  abstract String next();

  abstract String previous();
}