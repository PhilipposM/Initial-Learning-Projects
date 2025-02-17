import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static int howManyTasks = 0;

  public static ArrayList<Task> tasks = new ArrayList<>();

  public static void main(String[] args) {
    boolean exit = false;
    int taskIndex = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.println(
        "Here are your keybindings: \n1. 'a' to add a new task \n2. 'd' to remove a task\n3. '<number>' to go to the task you want. \n4. 'e' to edit the task selected \n4. 'x' to exit");
    while (!exit) {
      String keybinding = scanner.nextLine();

      if (keybinding.equals("a")) {
        howManyTasks++;
        taskIndex = howManyTasks - 1;

        System.out.println("\nAdded a new task!!\n");
        tasks.add(new Task());

        System.out.println("Task name: ");
        tasks.get(taskIndex).setName(scanner.nextLine());

        System.out.println("Date due: ");
        tasks.get(taskIndex).setDate(scanner.nextLine());

        System.out.println("Is it completed? (true/false)");
        tasks.get(taskIndex).setCompleted(Boolean.parseBoolean(scanner.nextLine()));

        Task.printTasks();
        keybinding = null;

        System.out.println("\nNext action: ");

      } else if (keybinding.equals("d")) {
        howManyTasks--;
        tasks.remove(taskIndex);
        Task.printTasks();
        keybinding = null;
        System.out.println("\nNext action: ");

      } else if (keybinding.matches("^\\d+$"))
        taskIndex = Integer.parseInt(keybinding);
      System.out.println(taskIndex);

    }
    
    else if(keybinding.equals("e")) {
      System.out.println("Task name: ");
      tasks.get(taskIndex).setName(scanner.nextLine());

      System.out.println("Date due: ");
      tasks.get(taskIndex).setDate(scanner.nextLine());

      System.out.println("Is it completed? (true/false)");
      tasks.get(taskIndex).setCompleted(Boolean.parseBoolean(scanner.nextLine()));

      Task.printTasks();
      keybinding = null;
      System.out.println("\nNext action: ");

    } else if (keybinding.equals("x")) {
      exit = true;
    }
    scanner.close();
  }
}
