package interfiletaint;

public class SinkClass {
  public void SinkMethod(String s) {
    java.io.FileReader fr = new java.io.FileReader(s);
    doSth(fr);
  }
  
  public void InterfileProblem() {
    SourceClass sc = new SourceClass();
    String tainted = sc.get();
    SinkMethod(tainted);
    sth("fooooooooooo");
  }
}
