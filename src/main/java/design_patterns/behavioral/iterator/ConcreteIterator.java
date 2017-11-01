package design_patterns.behavioral.iterator;

class ConcreteIterator extends Iterator {

  private String word;
  private int count = 0;

  public ConcreteIterator(String word) {
    this.word = word;
  }

  public String current() {
    return String.valueOf(word.charAt(count));
  }

  public boolean hasNext() {
    return (count + 1 < word.length());
  }

  public String first() {
    return String.valueOf(word.charAt(0));
  }

  public String last() {
    return String.valueOf(word.charAt(word.length() - 1));
  }

  public String next() {
    count++;

    return current();
  }
}