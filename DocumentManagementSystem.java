
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class DocumentManagementSystem {
    private Map<String, String> documents;

    public DocumentManagementSystem() {
        this.documents = new HashMap<>();
    }

    public void addDocument(String name, String content) {
        documents.put(name, content);
    }

    public String getDocument(String name) {
        return documents.get(name);
    }

    public void deleteDocument(String name) {
        documents.remove(name);
    }

    public void displayDocuments() {
        for (String name : documents.keySet()) {
            System.out.println(name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        DocumentManagementSystem dms = new DocumentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Document Management System");
            System.out.println("1. Add Document");
            System.out.println("2. Get Document");
            System.out.println("3. Delete Document");
            System.out.println("4. Display Documents");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter document name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter document content: ");
                    String content = scanner.nextLine();
                    dms.addDocument(name, content);
                    break;
                case 2:
                    System.out.print("Enter document name: ");
                    name = scanner.nextLine();
                    System.out.println(dms.getDocument(name));
                    break;
                case 3:
                     System.out.print("Enter document name: ");
                    name = scanner.nextLine();
                    dms.deleteDocument(name);
                    break;
                    
               
                    
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Invalid Option ");
            }
        }
    }
}
      