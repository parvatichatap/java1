package constructor;

public class Emp {
    int id;
    String name;
    String companyName;
   Emp(int eid, String nm,String cname) {
       id=eid;
       name =nm;
       companyName =cname;
   }
}
class EmpImpl{
    public static void main(String[] args) {
        Emp e1=new Emp(1,"amit","codekul");
        Emp e2=new Emp(2,"potato","codekul");
        Emp e3=new Emp(3,"tomato","codekul");
        Emp e4=new Emp(4,"abd","codekul");

        System.out.println("ID : "+e1.id +"Name : "+ e1.name + " Company : "+e1.companyName);
        System.out.println("ID : "+e2.id +"Name : "+ e2.name + " Company : "+e2.companyName);
        System.out.println("ID : "+e3.id +"Name : "+ e3.name + " Company : "+e3.companyName);
        System.out.println("ID : "+e4.id +"Name : "+ e4.name + " Company : "+e4.companyName);

    }
}
