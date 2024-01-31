package day08_practice_tasks;

public class Tip {

    public String checkSplit;
    public int numberOfPeople, checkAmount;
    public String serviceQuality;

    public void setInfoSplitYes(String checkSplit, int numberOfPeople, int checkAmount, String serviceQuality) {
        this.checkSplit = checkSplit;
        this.numberOfPeople = numberOfPeople;
        this.checkAmount = checkAmount;
        this.serviceQuality = serviceQuality;
    }

    public void setInfoSplitNo(String checkSplit, int checkAmount, String serviceQuality) {
        this.checkSplit = checkSplit;
        this.checkAmount = checkAmount;
        this.serviceQuality = serviceQuality;
    }

    public String splitYes() {
        double totalTip = checkAmount * .25;
        double totalToPay = totalTip + checkAmount;
        double totalPerPerson = totalToPay / (double) numberOfPeople;
        double tipPerPerson = totalTip / (double) numberOfPeople;
        return "Total to pay = " + totalToPay +
                "\nTotal tip = " + totalTip +
                "\nTotal per person = " + totalPerPerson +
                "\nTip per person = " + tipPerPerson;
    }

    public String splitNo() {
        double totalTip = checkAmount * .25;
        double totalToPay = totalTip + checkAmount;
        return "Total to pay = " + totalToPay +
                "\nTotal tip = " + totalTip;
    }


}