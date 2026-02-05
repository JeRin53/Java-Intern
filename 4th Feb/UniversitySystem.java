import java.io.*; // Files and IO
import java.time.LocalDateTime; // Date & Time
import java.util.Arrays; // Arrays

// 1. Modifier Types: 'public' class
public class UniversitySystem {

    // 2. Primitive Data Types & Modifiers
    private int totalStudents = 0; // Instance variable
    public static final String UNIVERSITY_NAME = "Global Tech"; // Static constant

    // 3. Inner Classes
    class Student {
        String name; // Non-primitive (String)
        double gpa;

        Student(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }
    }

    // 4. Methods & Exceptions
    public void processEnrollment(String name, double gpa) throws IOException {
        // 5. Decision Making
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty!"); // Exception
        }

        // 6. Strings & String Buffer
        StringBuffer logEntry = new StringBuffer();
        logEntry.append("Enrolled: ").append(name).append(" at ").append(LocalDateTime.now());

        // 7. Files and IO
        try (FileWriter writer = new FileWriter("enrollment_log.txt", true)) {
            writer.write(logEntry.toString() + "\n");
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }

    // 8. Threading: Creating a thread for background tasks
    public void startBackupTask() {
        Thread backupThread = new Thread(() -> {
            System.out.println("Background backup started at: " + LocalDateTime.now());
            // 9. Loop Control & Basic Operators
            for (int i = 1; i <= 3; i++) {
                System.out.println("Backing up part " + i + "/3...");
                try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
            }
            System.out.println("Backup complete.");
        });
        backupThread.start();
    }

    public static void main(String[] args) {
        UniversitySystem sys = new UniversitySystem();

        // 10. Arrays & Non-primitive types
        String[] studentList = {"Alice", "Bob", "Charlie"};
        System.out.println("Current Students: " + Arrays.toString(studentList));

        // 11. Basic Operators & Logic
        int studentCount = studentList.length;
        boolean isFull = studentCount >= 10;

        try {
            sys.processEnrollment("David", 3.8);
            sys.startBackupTask();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
