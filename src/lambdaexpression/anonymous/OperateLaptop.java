package lambdaexpression.anonymous;

public class OperateLaptop {

    public static void main(String[] args) {
        //Please implement anonymous class for interface laptop
        Laptop laptop = new Laptop() {
            @Override
            public void ramSize(int memorySize) {
                System.out.println("Computer with aviable RAM size are : " + memorySize + " GB");
            }

            @Override
            public void monitorSize(int screenSize) {
                System.out.println("Monitor with aviable Screen size are : " + screenSize + " Inches");
            }
        };
        laptop.monitorSize(16);
        laptop.monitorSize(15);
        laptop.ramSize(8);

        //please implement anonymous function for Phone FunctionalInterface
        Phone phone = new Phone() {
            @Override
            public void cellularNetwork(String network) {
                System.out.println("Aviable Cellular Network are : " + network);
            }
        };
        phone.cellularNetwork("T-mobile");
        phone.cellularNetwork("Verizon");
    }

}
