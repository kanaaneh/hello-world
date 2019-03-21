package de.riser.taskmanager.view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.riser.taskmanager.domain.Task;

/**
 * Beispiel View
 * 
 * @author mahmad
 */
// @ManagedBean(value = "tasksView")
@Named
@ViewScoped
// @javax.inject.
public class TasksView {

   private List<Task> tasks;
   
   @Inject
   protected FacesContext facesContext;
   
   public TasksView() {
      super();
      System.out.println("Init Tasks...");
   }

   @PostConstruct
   public void init() {
      createDummyTasks();
   }

   private void createDummyTasks() {
      tasks = new ArrayList<>();
      tasks.add(new Task("MAH", "Prototyp Tasks Manager erstellen", "5%"));
      tasks.add(new Task("KKN", "Prototyp Tasks Manager testen", "0%"));
      tasks.add(new Task("MAH", "Prototyp 2 Tasks Manager erstellen", "0%"));
      tasks.add(new Task("KKN", "Prototyp 2 Tasks Manager testen", "0%"));
      for(int i = 0; i < 21; i++) {
         tasks.add(new Task("KKN", "Aufgabe " + (i + 1) + " für KKN...", "0%"));
      }
      for(int i = 0; i < 19; i++) {
         tasks.add(new Task("MAH", "Aufgabe " + (i + 1) + " für MAH...", "0%"));
      }
   }

   public List<Task> getTasks() {
      return tasks;
   }
   
   public String getTesttext() {
      return "Ich bin ein Testtext";
   }

}
