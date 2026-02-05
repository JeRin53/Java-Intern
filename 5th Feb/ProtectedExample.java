
class One {
  protected void printOne() {
    System.out.println("printOne method of One class.");
  }
}


public class ProtectedExample extends One {
  public static void main(String[] args) {
    ProtectedExample obj = new ProtectedExample();
    obj.printOne();
  }
}