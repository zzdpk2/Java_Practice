import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Chapter2_11 {
    String name;
    int numberOfHoursPerWeek;
    double hourlyPayRate;
    double federalTax;
    double stateTax;

    public void setName(String name) { this.name = name; }

    public void setNumberOfHoursPerWeek(int numberOfHoursPerWeek){ this.numberOfHoursPerWeek = numberOfHoursPerWeek; }

    public void setHourlyPayRate(double hourlyPayRate){
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        this.hourlyPayRate = Double.parseDouble(decimalFormat.format(hourlyPayRate));
    }

    public void setFederalTax(double federalTax){
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        this.federalTax = Double.parseDouble(decimalFormat.format(federalTax));
    }

    public void setStateTax(double stateTax){
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        this.stateTax = Double.parseDouble(decimalFormat.format(stateTax));
    }

    public String getName(){ return name; }

    public int getNumberOfHoursPerWeek() { return  numberOfHoursPerWeek; }

    public double getHourlyPayRate() { return hourlyPayRate; }

    public double getFederalTax() { return  federalTax; }

    public double getStateTax() { return stateTax; }

    public void inputValueViaTerminal(){
        // Input information
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an employee's name: ");
        setName(input.next());
        input.reset();
        System.out.print("Please enter the number of hours worked in a week: ");
        setNumberOfHoursPerWeek(input.nextInt());
        input.reset();
        System.out.println("Please enter the hourly pay rate: ");
        setHourlyPayRate(input.nextDouble());
        input.reset();
        System.out.println("Please enter the federal tax rate: ");
        setFederalTax(input.nextDouble());
        input.reset();
        System.out.println("Please enter the state tax rate: ");
        setStateTax(input.nextDouble());
        input.close();
    }

    public void inputValueViaGUI(){
        // Input value
        setName(JOptionPane.showInputDialog(null, "Name", "Input", JOptionPane.QUESTION_MESSAGE));
        setNumberOfHoursPerWeek(Integer.parseInt(JOptionPane.showInputDialog(null, "Number of Hours Per Week", "Input", JOptionPane.QUESTION_MESSAGE)));
        setHourlyPayRate(Double.parseDouble(JOptionPane.showInputDialog(null, "Hourly Pay Rate", "Input", JOptionPane.QUESTION_MESSAGE)));
        setFederalTax(Double.parseDouble(JOptionPane.showInputDialog(null, "Federal Tax Rate", "Input", JOptionPane.QUESTION_MESSAGE)));
        setStateTax(Double.parseDouble(JOptionPane.showInputDialog(null, "State Tax Rate", "Input", JOptionPane.QUESTION_MESSAGE)));
    }

    public void computeChangeViaTerminal(){

        //input information
        inputValueViaTerminal();

        // Format information
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        // Output information
        System.out.println("Employee Name: " + getName());
        System.out.println("Hours Worked: " + getNumberOfHoursPerWeek());
        System.out.println("Pay Rate: " + getHourlyPayRate());
        System.out.println("Gross Pay: $" + getHourlyPayRate() * getNumberOfHoursPerWeek());
        System.out.println("Deductions: ");
        System.out.println("\t Federal Withholding $" + "(" +  100 * getFederalTax() + "% ): $" + getHourlyPayRate() * getNumberOfHoursPerWeek() * getFederalTax());
        System.out.println("\t State Withholding $" + "(" +  100 * getStateTax() + "% ): $" + getHourlyPayRate() * getNumberOfHoursPerWeek() * getStateTax());
        System.out.println("\t Total Deduction: $" + decimalFormat.format(getHourlyPayRate() * getNumberOfHoursPerWeek() * (getFederalTax() + getStateTax())));
        System.out.println("Net Pay: $" + getHourlyPayRate() * getNumberOfHoursPerWeek() * (1 - (getFederalTax() + getStateTax())));

    }

    public void computeChangeViaGUI(){

        inputValueViaGUI();
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        JOptionPane.showMessageDialog(null,
                "Employee Name: " + getName() +
                "\nHours Worked: " + getNumberOfHoursPerWeek() +
                "\nPay Rate: " + getHourlyPayRate() +
                "\nGross Pay: " + getHourlyPayRate() * getNumberOfHoursPerWeek() +
                "\nDeductions: " +
                "\n\t Federal Withholding $" + "(" + 100 * getFederalTax() + "% ): $" + getHourlyPayRate() * getNumberOfHoursPerWeek() * getFederalTax() +
                "\n\t State Withholding $" + "(" +  100 * getStateTax() + "% ): $" + getHourlyPayRate() * getNumberOfHoursPerWeek() * getStateTax() +
                "\n\t Total Deduction: $" + decimalFormat.format(getHourlyPayRate() * getNumberOfHoursPerWeek() * (getFederalTax() + getStateTax()))+
                "\n Net Pay: $" + getHourlyPayRate() * getNumberOfHoursPerWeek() * (1 - (getFederalTax() + getStateTax())) +
                "\n", "Summary", JOptionPane.INFORMATION_MESSAGE);

    }
    public static void main(String[] args) {

        Chapter2_11 c1 = new Chapter2_11();
//        c1.computeChangeViaTerminal();
        c1.computeChangeViaGUI();

    }
}
