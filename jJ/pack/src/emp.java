public class emp {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java EmployeeSalaryCalculator <Name> <BasicPay>");
            return;
        }

        String name = args[0];
        double basicPay;

        try {
            basicPay = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid basic pay. Please enter a numeric value.");
            return;
        }

        // Constants for DA percentage and HRA percentage
        final double DA_PERCENTAGE = 64.0;
        final double HRA_PERCENTAGE = 15.0;

        // Calculate DA and HRA
        double da = (DA_PERCENTAGE / 100) * basicPay;
        double hra = (HRA_PERCENTAGE / 100) * basicPay;

        // Calculate total salary
        double totalSalary = basicPay + da + hra;

        // Display the employee's name, basic pay, DA, HRA, and total salary
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Pay: $" + basicPay);
        System.out.println("DA: $" + da);
        System.out.println("HRA: $" + hra);
        System.out.println("Total Salary: $" + totalSalary);
    }
}
