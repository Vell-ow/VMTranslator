public class VMTranslator
{
  final static String FILE_NAME = "10";
  final static String FILE_NAME_2 = "Bob";
    
  public static void main(String[] args) 
  {
    CodeWriter cw = new CodeWriter(FILE_NAME);
    Parser par = new Parser(FILE_NAME_2);
  }
}