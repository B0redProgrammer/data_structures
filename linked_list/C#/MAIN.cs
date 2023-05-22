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

}

public class NODE : LISTELEMENTS {
  LISTELEMENTS next;
  INT obj;

  public NODE(INT obj) {
    this.obj = obj;
    next = new LASTNODE();
  }
}

public class LASTNODE : LISTELEMENTS {

}

public class LIST {
  LISTELEMENTS First_Node;

  public LIST() {
    First_Node = new LASTNODE();
  }
}

public class MAIN {
  public NODE n = new NODE(new PERSON());
  public static void Main(string[] args) {

  }
}
