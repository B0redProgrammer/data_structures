using System.Diagnostics;

public class TESTS {

}

public class PERSON : INT {
  public System.String name;

  public PERSON(System.String name) {
    this.name = name;
  }

  public void printInfo() {
    System.Console.WriteLine(name);
  }
}

public interface INT {
  void printInfo();
}

public abstract class LISTELEMENTS {
  public abstract LISTELEMENTS AddInBack(NODE New);
  public abstract void printElements();
}

public class NODE : LISTELEMENTS {
  LISTELEMENTS next;
  INT obj;

  public NODE(INT obj) {
    this.obj = obj;
    next = new LASTNODE();
  }

  public override LISTELEMENTS AddInBack(NODE New) {
    next = next.AddInBack(New);
    return this;
  }

  public override void printElements() {
    obj.printInfo();
    next.printElements();
  }

  public void SetNext(LISTELEMENTS next) {
    this.next = next;
  }
}

public class LASTNODE : LISTELEMENTS {
  public override LISTELEMENTS AddInBack(NODE New) {
    return New;
  }

  public override void printElements() {

  }
}

public class LIST {
  LISTELEMENTS First_Node;

  public LIST() {
    First_Node = new LASTNODE();
  }

  public void AddInBack(INT Entity) {
    First_Node = First_Node.AddInBack(new NODE(Entity));
  }

  public void AddInFront(INT Entity) {
    NODE NewNode = new NODE(Entity);
    NewNode.SetNext(First_Node);
    First_Node = NewNode;
  }

  public void printElements() {
    First_Node.printElements();
  }
}

public class MAIN {
  static LIST l = new LIST();
  public static void Main(string[] args) {
    l.AddInFront(new PERSON("Peter"));
    l.AddInFront(new PERSON("Hans"));
    l.AddInFront(new PERSON("Schmidt"));

    l.printElements();
  }
}
