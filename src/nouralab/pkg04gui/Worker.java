/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nouralab.pkg04gui;

public class Worker {

    String name, position;
    int hourRate, hours, overTime;
    boolean medicalInsurance, dentalInsurance, disAbilityInsurance, retirementPlan;

    double regWage, overtimeWage, totalWage, totalDeductions, netPay;

    public Worker() {
    }

    public Worker(String name, String position, int hours, boolean medicalInsurance, boolean dentalInsurance, boolean disAbilityInsurance, boolean retirementPlan) {
        this.name = name;
        this.position = position;
        this.hours = hours;
        this.medicalInsurance = medicalInsurance;
        this.dentalInsurance = dentalInsurance;
        this.disAbilityInsurance = disAbilityInsurance;
        this.retirementPlan = retirementPlan;
    }

    public double getHoursWorked() {
        if (hours > 40) {
            return hours;
        }
        return hours;
    }

    public double getRegWage() {
        if (getOverTime() > 0) {
            regWage = (40 * 1.5) * hourRate;
        } else {

            regWage = hourRate * hours;
        }
        return regWage;
    }

    public double getOvertimeWage() {
        overtimeWage = (overTime * 1.5) * hourRate;
        return overtimeWage;
    }

    public double getTotalWage() {
        totalWage = overtimeWage + regWage;
        return totalWage;
    }

    public double getTotalDeductions() {
        totalDeductions = 0;
        if (position.equals("Admin A1")) {
            if (medicalInsurance) {
                totalDeductions = totalDeductions + 80;
            }
            if (disAbilityInsurance) {
                totalDeductions = totalDeductions + 30;
            }
            if (dentalInsurance) {
                totalDeductions = totalDeductions + 50;
            }
            if (retirementPlan) {
                totalDeductions = totalDeductions + (getTotalWage() * 0.03);
            }
        } else if (position.equals("Worker P1")) {
            if (medicalInsurance) {
                totalDeductions = totalDeductions + 80;
            }
            if (disAbilityInsurance) {
                totalDeductions = totalDeductions + 30;
            }
            if (dentalInsurance) {
                totalDeductions = totalDeductions + 50;
            }

        }

        return totalDeductions;
    }

    public double getNetPay() {
        netPay = totalWage - totalDeductions;
        return netPay;
    }

    public String getRoleInfo(String role) {
        if (role.equals("Admin A1")) {

        } else if (role.equals("Worker P1")) {

        } else if (role.equals("Worker P2")) {

        }
        return name;
    }

    public int getOverTime() {
        if (hours > 40) {
            overTime = hours - 40;
        } else {
            overTime = 0;
        }
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getHourRate() {

        if (position.equals("Admin A1")) {
            hourRate = 60;
        } else if (position.equals("Worker P1")) {
            hourRate = 40;
        } else if (position.equals("Worker P2")) {
            hourRate = 30;
        } else {
            hourRate = 0;
        }
        return hourRate;
    }

    public void setHourRate(int hourRate) {
        this.hourRate = hourRate;
    }

    public boolean isMedicalInsurance() {
        return medicalInsurance;
    }

    public void setMedicalInsurance(boolean medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    public boolean isDentalInsurance() {
        return dentalInsurance;
    }

    public void setDentalInsurance(boolean dentalInsurance) {
        this.dentalInsurance = dentalInsurance;
    }

    public boolean isDisAbilityInsurance() {
        return disAbilityInsurance;
    }

    public void setDisAbilityInsurance(boolean disAbilityInsurance) {
        this.disAbilityInsurance = disAbilityInsurance;
    }

    public boolean isRetirementPlan() {
        return retirementPlan;
    }

    public void setRetirementPlan(boolean retirementPlan) {
        this.retirementPlan = retirementPlan;
    }

    @Override
    public String toString() {
        return "Worker{" + "name=" + name + ", position=" + position + ", hourRate=" + hourRate + ", hours=" + hours + ", medicalInsurance=" + medicalInsurance + ", dentalInsurance=" + dentalInsurance + ", disAbilityInsurance=" + disAbilityInsurance + ", retirementPlan=" + retirementPlan + '}';
    }

}
