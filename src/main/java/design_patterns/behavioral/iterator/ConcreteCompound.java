package design_patterns.behavioral.iterator;

class ConcreteCompound extends Compound {

  public String word;

  public ConcreteCompound(String word) {
    this.word = word;
  }

  public Iterator getIterator() {
    return new ConcreteIterator(word);
  }
}