package Percobaan;

public class Tester1 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Ziraaa",500);
        InternshipEmployee iEmp = new InternshipEmployee("Brilyan",5);
        ElectricityBill eBill = new ElectricityBill(5,"A-1");
        Employee e;
        Payable p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
        //p= iEmp;
        //e = eBill;
    }
}
