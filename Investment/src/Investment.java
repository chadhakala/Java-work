public class Investment {

        private String name; // Name of account holder \\
        private String investmentType; // Savings, 529, 401k, IRA, etc. \\
        private double investmentAmount; // Amount of money in each account \\
        private double interestRate; // Interest rate on investments \\

        // Constructor here \\

        public Investment(String name, String investmentType, double investmentAmount, double interestRate) {
            this.name = name;
            this.investmentType = investmentType;
            setInvestmentAmount(investmentAmount);
            setInterestRate(interestRate);
        }

        // Method for getting your annual earnings on investment, not taking into account taxes yet,
        // you can do that for the inheritance if you wish \\
        public double getAnnualInvestmentAmount() {
            return investmentAmount * interestRate;
        }

        // Getters here \\

        public String getName() {
            return name;
        }

        public String getInvestmentType() {
            return investmentType;
        }

        public double getInvestmentAmount() {
            return investmentAmount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        // Setters here \\
        // Only for investmentAmount & interestRate because these are the only values that can/will change. \\
        // Name & type of investment are static, if you want to do a new type of investment, it'll be under a new account \\

        public void setInvestmentAmount(double investmentAmount) {
            if (investmentAmount <= 0) {
                this.investmentAmount = 0; // Need to invest at least $1 \\
            } else {
                this.investmentAmount = investmentAmount;
            }
        }

        public void setInterestRate(double interestRate) {
            if (interestRate <= 0) {
                this.interestRate = 0; // Interest can't be less than or equal to 0, but it can change over time \\
            } else {
                this.interestRate = interestRate;
            }
        }
}
