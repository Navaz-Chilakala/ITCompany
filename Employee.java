package company;

import java.util.UUID;

public abstract class Employee {
 private UUID id;
 private String name;
 private String email;
 private String department;

 public Employee(String name, String email, String department) {
     this.id = UUID.randomUUID();
     this.name = name;
     this.email = email;
     this.department = department;
 }

 public UUID getId() {
     return id;
 }

 public String getName() {
     return name;
 }

 public String getEmail() {
     return email;
 }

 public String getDepartment() {
     return department;
 }

 public abstract void work();
}
