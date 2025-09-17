package io.github.nathanjrussell;

public record SecurityClearance(
        String firstName,
        String lastName,
        String middleName,
        String email,
        String phone,
        String address,
        String city,
        State state,
        String zipCode,
        String country,
        int birthYear,
        int birthMonth,
        int birthDay,
        String fatherFirstName,
        String fatherLastName,
        String fatherBirthCity,
        State fatherBirthState,
        String fatherBirthCountry,
        int fatherBirthYear,
        int fatherBirthMonth,
        int fatherBirthDay,
        String fatherBirthZipCode,
        String motherFirstName,
        String motherLastName,
        String motherMaidenName,
        String motherBirthCity,
        State motherBirthState,
        String motherBirthCountry,
        int motherBirthYear,
        int motherBirthMonth,
        int motherBirthDay,
        String motherBirthZipCode
) {
    //---------------------------------------------------------------
    public static class Builder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String email;
        private String phone;
        private String address;
        private String city;
        private State state;
        private String zipCode;
        private String country;
        private int birthYear;
        private int birthMonth;
        private int birthDay;
        private String fatherFirstName;
        private String fatherLastName;
        private String fatherBirthCity;
        private State fatherBirthState;
        private String fatherBirthCountry;
        private int fatherBirthYear;
        private int fatherBirthMonth;
        private int fatherBirthDay;
        private String fatherBirthZipCode;
        private String motherFirstName;
        private String motherLastName;
        private String motherMaidenName;
        private String motherBirthCity;
        private State motherBirthState;
        private String motherBirthCountry;
        private int motherBirthYear;
        private int motherBirthMonth;
        private int motherBirthDay;
        private String motherBirthZipCode;


        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder state(State state) {
            this.state = state;
            return this;
        }

        public Builder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder birthYear(int birthYear) {
            this.birthYear = birthYear;
            return this;
        }

        public Builder birthMonth(int birthMonth) {
            this.birthMonth = birthMonth;
            return this;
        }

        public Builder birthDay(int birthDay) {
            this.birthDay = birthDay;
            return this;
        }

        public Builder fatherFirstName(String fatherFirstName) {
            this.fatherFirstName = fatherFirstName;
            return this;
        }

        public Builder fatherLastName(String fatherLastName) {
            this.fatherLastName = fatherLastName;
            return this;
        }

        public Builder fatherBirthCity(String fatherBirthCity) {
            this.fatherBirthCity = fatherBirthCity;
            return this;
        }

        public Builder fatherBirthState(State fatherBirthState) {
            this.fatherBirthState = fatherBirthState;
            return this;
        }

        public Builder fatherBirthCountry(String fatherBirthCountry) {
            this.fatherBirthCountry = fatherBirthCountry;
            return this;
        }

        public Builder fatherBirthYear(int fatherBirthYear) {
            this.fatherBirthYear = fatherBirthYear;
            return this;
        }

        public Builder fatherBirthMonth(int fatherBirthMonth) {
            this.fatherBirthMonth = fatherBirthMonth;
            return this;
        }

        public Builder fatherBirthDay(int fatherBirthDay) {
            this.fatherBirthDay = fatherBirthDay;
            return this;
        }

        public Builder fatherBirthZipCode(String fatherBirthZipCode) {
            this.fatherBirthZipCode = fatherBirthZipCode;
            return this;
        }

        //-----------------------------------------------------------------------

        public Builder motherFirstName(String motherFirstName) {
            this.motherFirstName = motherFirstName;
            return this;
        }

        public Builder motherLastName(String motherLastName) {
            this.motherLastName = motherLastName;
            return this;
        }

        public Builder motherBirthCity(String motherBirthCity) {
            this.motherBirthCity = motherBirthCity;
            return this;
        }

        public Builder motherBirthState(State motherBirthState) {
            this.motherBirthState = motherBirthState;
            return this;
        }

        public Builder motherBirthCountry(String motherBirthCountry) {
            this.motherBirthCountry = motherBirthCountry;
            return this;
        }

        public Builder motherBirthYear(int motherBirthYear) {
            this.motherBirthYear = motherBirthYear;
            return this;
        }

        public Builder motherBirthMonth(int motherBirthMonth) {
            this.motherBirthMonth = motherBirthMonth;
            return this;
        }

        public Builder motherBirthDay(int motherBirthDay) {
            this.motherBirthDay = motherBirthDay;
            return this;
        }

        public Builder motherBirthZipCode(String motherBirthZipCode) {
            this.motherBirthZipCode = motherBirthZipCode;
            return this;
        }

        public Builder motherMaidenName(String motherMaidenName) {
            this.motherMaidenName = motherMaidenName;
            return this;
        }


        public SecurityClearance build() {
            return new SecurityClearance(
                    firstName,
                    lastName,
                    middleName,
                    email,
                    phone,
                    address,
                    city,
                    state,
                    zipCode,
                    country,
                    birthYear,
                    birthMonth,
                    birthDay,
                    fatherFirstName,
                    fatherLastName,
                    fatherBirthCity,
                    fatherBirthState,
                    fatherBirthCountry,
                    fatherBirthYear,
                    fatherBirthMonth,
                    fatherBirthDay,
                    fatherBirthZipCode,
                    motherFirstName,
                    motherLastName,
                    motherMaidenName,
                    motherBirthCity,
                    motherBirthState,
                    motherBirthCountry,
                    motherBirthYear,
                    motherBirthMonth,
                    motherBirthDay,
                    motherBirthZipCode
            );
        }
    }
}
