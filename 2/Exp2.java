public class Exp2 {
    public static void main(String args[]) {
        String[][] employees = {
                {"Anju Devi", "Anju@email.com", "EMP0001", "523-1234"},
                {"John Singh", "John@email.com", "EMP0002", "565-5678"},
                {"Alexa Kumari", "Alexa@email.com", "EMP0003", "555-9012"},
                {"Alice Lee", "Alice@email.com", "EMP0004", "526-3456"},
                {"Mike Brown", "Mike@email.com", "EMP0005", "546-7890"}
        };

        System.out.println("NAME          EMAIL               EMPLOYEE ID     PHONE");
        //System.out.println("--------------------------------------------------------");

        for (String[] emp : employees) {
            String name = String.format("%-14s", emp[0]);
            String email = String.format("%-20s", emp[1]);
            String empId = String.format("%-15s", emp[2]);
            String phone = String.format("%-15s", emp[3]);
            System.out.println(name + email + empId + phone);
        }
    }
}