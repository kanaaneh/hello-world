package de.riser.taskmanager.domain;

import java.io.Serializable;

public class Task implements Serializable {

   private static final long serialVersionUID = -1131427554507096578L;

   private String title;

   private String employee;

   private String progress;
   
   public Task() {
      super();
   }

   public Task(String employee, String title, String progress) {
      super();
      this.employee = employee;
      this.title = title;
      this.progress = progress;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getEmployee() {
      return employee;
   }

   public void setEmployee(String employee) {
      this.employee = employee;
   }

   public String getProgress() {
      return progress;
   }

   public void setProgress(String progress) {
      this.progress = progress;
   }

}
