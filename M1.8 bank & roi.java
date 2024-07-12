class Bank
{
  float getROI()
  {
      return 0;
  }
}
class SBI extends Bank
{
 float getROI()
 {
 return 8.4f;
 }
}
class ICICI extends Bank
{
 float getROI()
 {
 return 7.3f;
 }
}
class AXIS extends Bank
{
 float getROI()
 {
 return 9.7f;
 }
}
public class ak {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI, " + b.getROI());
        
    }
    
}
