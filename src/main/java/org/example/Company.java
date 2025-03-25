package org.example;

public class Company {

    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro);
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        // Dizinin sınırlarını kontrol et
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Hata: Geçersiz index. 0 ile " + (developerNames.length - 1) + " arasında bir değer girin.");
            return;
        }

        // Eğer ilgili index boşsa, değeri ata
        if (developerNames[index] == null || developerNames[index].isEmpty()) {
            developerNames[index] = name;
            System.out.println("Çalışan başarıyla eklendi: " + name);
        } else {
            // Eğer doluysa uyarı mesajı ver
            System.out.println("Hata: Bu index zaten dolu. Mevcut çalışan: " + developerNames[index]);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            System.out.println("Hata: Giro 0'ın altına düşemez.");
            return;
        }
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }
}
