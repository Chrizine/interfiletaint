package interfiletaint;

public class SourceClass {
  public String get() {
    return getRequestUrl();
  }
  
  public void SameFileSink() {
    doSth("foo");
    String tainted = get();
    java.io.FileReader fr = new java.io.FileReader(tainted);
  }
  
  public void InterfileProblem() {
    String tainted = get();
    SinkClass sc = new SinkClass();
    sc.SinkMethod(tainted);
  }
}
