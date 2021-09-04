/*    								control test of tracking while finding
                                knight's tour on virtual chessboard by
                                   heuristic accessibility algorithm and checking tour
                                      was closed
                           
 */
 
public class KnightsTourTest {
   
   public static void main(String[] args) {
      
      System.out.printf("******** %s %n", KnightsTourControl.START_INFO);
      System.out.printf("*** %s %n%s%n", KnightsTourControl.QUIT_INFO, KnightsTourControl.EOT_INFO);
      
      KnightsTourControl knightsTourControl = new KnightsTourControl();
      
      do {
         knightsTourControl.printMenu();
      } while (true == StandardInput.getKnightsTourControlCommand(knightsTourControl));
      
   } 
   
} 
