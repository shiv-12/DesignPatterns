package BuilderPattern;

public class User {

    private final String userName;
    private final String userMobileNo;
    private final int userAge;
    private final String userAddress;

    private User(Builder builder) {
        this.userName = builder.userName;
        this.userMobileNo = builder.userMobileNo;
        this.userAge = builder.userAge;
        this.userAddress = builder.userAddress;
    }

    public static class Builder {

        private String userName;
        private final String userMobileNo;
        private int userAge;
        private String userAddress;

        public Builder(String userMobileNo) {
            this.userMobileNo = userMobileNo;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder userAddress(String userAddress) {
            this.userAddress = userAddress;
            return this;
        }

        public Builder userAge(int userAge) {
            this.userAge = userAge;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User {" +
                "userName='" + userName + '\'' +
                ", userMobileNo='" + userMobileNo + '\'' +
                ", userAge=" + userAge +
                ", userAddress='" + userAddress + '\'' +
                '}';
    }
}
