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
  public abstract LISTELEMENTS AddInBack(NODE NEW);
  public abstract void printElements();
}

public class NODE : LISTELEMENTS {
  LISTELEMENTS next;
  INT obj;

  public NODE(INT obj) {
    this.obj = obj;
    next = new LASTNODE();
  }

  public override LISTELEMENTS AddInBack(NODE NEW) {
    next = next.AddInBack(NEW);
    return this;
  }

  public override void printElements() {
    obj.printInfo();
    next.printElements();
  }
}

public class LASTNODE : LISTELEMENTS {
  public override LISTELEMENTS AddInBack(NODE NEW) {
    return NEW;
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

  public void printElements() {
    First_Node.printElements();
  }
}

public class MAIN {
  static LIST l = new LIST();
  public static void Main(string[] args) {
    l.AddInBack(new PERSON("Peter"));
    l.AddInBack(new PERSON("Hans"));
    l.AddInBack(new PERSON("Schmidt"));

    l.printElements();
  }
}
