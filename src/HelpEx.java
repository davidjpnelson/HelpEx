/*

An improved Help system that uses a do-while to process menu selection.

 */
import java.io.IOException;
public class HelpEx {

  public static void main(String[] args) throws IOException {
    char choice, ignore;
    for (;;) {

      do {
        System.out.println("Help on");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("  3. for");
        System.out.println("  4. while");
        System.out.println("  5. do-while");
        System.out.println("  6. break");
        System.out.println("  7. continue\n");
        System.out.print("Choose one (q to quit):\n");

        choice = (char) System.in.read();
        do {
          ignore = (char) System.in.read();
        } while (ignore != '\n');
      } while (choice < '1' | choice > '7' & choice != 'q');

      if (choice == 'q') break;

      System.out.println();

      switch (choice) {
        case '1' -> {
          System.out.println("The if:\n");
          System.out.println("if(condition) statement;");
          System.out.println("else statement;");
        }
        case '2' -> {
          System.out.println("The switch:\n");
          System.out.println("switch(expression) {");
          System.out.println("  case constant -> {");
          System.out.println("    statement sequence;");
          System.out.println("  }");
          System.out.println("  default ->");
          System.out.println("    statement sequence;");
          System.out.println("}");
        }
        case '3' -> {
          System.out.println("The for:\n");
          System.out.println("for(initialization; condition; iteration)");
          System.out.println("  statement;");
        }
        case '4' -> {
          System.out.println("The while:\n");
          System.out.println("while(condition) statement;");
        }
        case '5' -> {
          System.out.println("The do-while:\n");
          System.out.println("do {");
          System.out.println("  statement;");
          System.out.println("} while (condition);");
        }
        case '6' -> {
          System.out.println("The break:\n");
          System.out.println("break; or break label;");
        }
        case '7' -> {
          System.out.println("The continue:\n");
          System.out.println("continue; or continue label;");
        }
        default -> // not necessary with do while loop ensuring case selection
            System.out.println("Selection not found.");
      }
      System.out.println();
    }
  }
}
