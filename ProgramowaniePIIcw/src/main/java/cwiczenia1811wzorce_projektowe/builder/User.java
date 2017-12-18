package cwiczenia1811wzorce_projektowe.builder;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phoneNumber;

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.address = userBuilder.address;
        this.phoneNumber = userBuilder.phoneNumber;

    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static class UserBuilder{
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private String phoneNumber;

        /**
         * METODY WYWOŁYWANE PRZEZ UŻYTKOWNIKA:
         */

        public UserBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName( String lastName){
            this.lastName = lastName;
            return this;
        }
        public UserBuilder age (int age){
            this.age= age;
            return this;
        }
        public UserBuilder address(String address){
            this.address = address;
            return this;
        }
        public UserBuilder phoneNumber (String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }
        public User build(){
            User user=new User(this);
            return user;
        }
    }
}
