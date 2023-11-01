package Percobaan;

public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        //Koreksi R-2. karena R-1 Bernilai 100
        ElectricityBill eBill = new ElectricityBill(5,"R-2");
        ow.pay(eBill);
        System.out.println("------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Ziraaa",500);
        ow.pay(pEmp);
        System.out.println("------------------");

        InternshipEmployee iEmp = new InternshipEmployee("Brilyan",5);
        ow.showMyEmployee(pEmp);
        System.out.println("------------------");
        ow.showMyEmployee(iEmp);

        //ow.pay(iEmp);
    }
}
