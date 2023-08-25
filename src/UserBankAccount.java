public class UserBankAccount {

        String username;
        String iban;
        double balance;
        String bic;
        UserDetails userDetails;

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public String getIban() {
                return iban;
        }

        public void setIban(String iban) {
                this.iban = iban;
        }

        public double getBalance() {
                return balance;
        }

        public void setBalance(double balance) {
                this.balance = balance;
        }

        public String getBic() {
                return bic;
        }

        public void setBic(String bic) {
                this.bic = bic;
        }

        public UserDetails getUserDetails() {
                return userDetails;
        }

        public void setUserDetails(UserDetails userDetails) {
                this.userDetails = userDetails;
        }

        @Override
        public String toString() {
                return "UserBankAccount{" +
                        "username='" + username + '\'' +
                        ", iban='" + iban + '\'' +
                        ", balance=" + balance +
                        ", bic='" + bic + '\'' +
                        ", userDetails=" + userDetails +
                        '}';
        }


}
