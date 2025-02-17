public class Task {
   private String name;
   private boolean completed;
   private String date;

   public Task() {
   }

   public Task(String name, boolean completed, String date) {
     this.date = date;
     this.completed = completed;
     this.name = name;
   }

   public void setName(String name) {
     this.name = name;
   }

  public String getName() {
    return name;
  }

   public void setCompleted(boolean completed) {
     this.completed = completed;
   }

   public boolean getCompleted() {
     return completed;
   }

   public void setDate(String date) {
     this.date = date;
   }

   public String getDate() {
     return date;
   }

   public static void printTasks() {
     for (int i = 0; i < Main.howManyTasks; i++) {
       System.out.println(i + ". " + Main.tasks.get(i).getName());
       System.out
           .println("  Date due: " + Main.tasks.get(i).getDate() + "\n  Completed?: " + Main.tasks.get(i).getCompleted());
     }
   }
}
