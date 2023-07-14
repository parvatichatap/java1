package association;

public class Employee {
    int id;
     String name;
         Address address;

        public Employee( int id,String name, Address address) {
            this.id=id;
            this.name = name;
            this.address = address;
        }
        void display(){
            System.out.println("id : "+ id);
            System.out.println("name : "+ name);
            System.out.println("address : "+ address);
            System.out.println("street : "+address.street );
            System.out.println(" city: "+address.city );
            System.out.println("state : "+address.state );

        }


    }

     class Address {
         String street;
      String city;
    String state;


        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;

        }


    }

 class EmployeeImpl {
    public static void main(String[] args) {
        Address address = new Address("mumbai high way", "pune", "maharastra");
        Employee employee = new Employee(1, "rohini", address);
        employee.display();


    }
}

