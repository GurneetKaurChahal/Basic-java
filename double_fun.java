/**
 * double_fun
 */
public class double_fun {

  public static void main(String[] args) {
      int[] arrangement;
      arrangement = checklist(100);
    printlist(arrangement);
  }
    public static int[] checklist(int n) {
        int collection[] = new int[n];
        for(int i=0; i<n; i+=2){
            collection[i] =i;
        }
        return collection ;
    }
    public static void printlist(int[] arrangement) {
        for( int i=0; i<arrangement.length ;i+=2){
        System.out.println(arrangement[i]);
        }
        
    }
}