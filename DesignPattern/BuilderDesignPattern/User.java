package BuilderDesignPattern;

public class User {

    private final String userId;
    private final String userName;
    private final String userCity;

    private User(UserBuilder userBuilder) {
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.userCity = userBuilder.userCity;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserCity() {
        return userCity;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", userCity=" + userCity + "]";
    }

    // Inner class responsible to initialize User object
    static class UserBuilder {
        private String userId;
        private String userName;
        private String userCity;

        public UserBuilder() {
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setUserCity(String userCity) {
            this.userCity = userCity;
            return this;
        }

        public User buildUser(){
            return new User(this);
        }

    }

}
