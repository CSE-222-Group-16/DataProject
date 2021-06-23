package org.cse222;

public class Main {
    public static void main(String[] args) {
        //database created
        Database database = new Database();

        addUsers addUser = new addUsers();
        addUser.addConsultant(database);
        addUser.addDoctors(database);

        System.out.println(database.getDoctors().size());
        System.out.println(database.getConsultants().size());

    }
}
