package static_keyword;

public class Student {

    String name;
    int id;
    static String universityName = "Daffodil International University";

    Student(String userName, int uniqueId){
        name = userName;
        id = uniqueId;
    }
    void displayInfo(){
        System.out.println("User Name: "+name);
        System.out.println("User id: "+id);
        System.out.println("User University: "+universityName);
    }
}
