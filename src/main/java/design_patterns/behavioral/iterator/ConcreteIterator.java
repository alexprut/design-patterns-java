package design_patterns.behavioral.iterator;

class ConcreteIterator extends Iterator {

  public String word;
  public int count = 0;

  public ConcreteIterator(String word) {
    this.word = word;
  }

  public String current() {
    return String.valueOf(word.charAt(count));
  }

  public boolean hasNext() {
    if ((count + 1) <= word.length()) {
      return true;
    }

    return false;
  }

  public String first() {
    return String.valueOf(word.charAt(0));
  }

  public String last() {
    return String.valueOf(word.charAt(word.length() - 1));
  }

  public String next() {
    String next = String.valueOf(word.charAt(count));
    count++;

    return next;
  }

  public String previous() {
    count--;
    return String.valueOf(word.charAt(count));
  }
}