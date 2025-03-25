package org.example;

import java.util.Arrays;

public class Employee {

    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthplans;
    }

    public void addHealthPlan(int index, String name) {
        // Dizinin sınırlarını kontrol et
        if (index < 0 || index >= healthPlans.length) {
            System.out.println("Hata: Geçersiz index. Lütfen 0 ile " + (healthPlans.length - 1) + " arasında bir değer girin.");
            return;
        }

        // Eğer ilgili index boşsa, değeri ata
        if (healthPlans[index] == null || healthPlans[index].isEmpty()) {
            healthPlans[index] = name;
            System.out.println("Sağlık planı başarıyla eklendi: " + name);
        } else {
            // Eğer doluysa uyarı mesajı ver
            System.out.println("Hata: Bu index zaten dolu. Mevcut sağlık planı: " + healthPlans[index]);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
