package com.oop_design_patterns.builder;

public class Person {

    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String salutation;
    private final String suffix;
    private final String streetAddress;
    private final String city;
    private final String state;
    private final boolean isFemale;
    private final boolean isEmployed;
    private final boolean isHomewOwner;

    public Person(
            final String newLastName,
            final String newFirstName,
            final String newMiddleName,
            final String newSalutation,
            final String newSuffix,
            final String newStreetAddress,
            final String newCity,
            final String newState,
            final boolean newIsFemale,
            final boolean newIsEmployed,
            final boolean newIsHomeOwner)
    {
        this.lastName = newLastName;
        this.firstName = newFirstName;
        this.middleName = newMiddleName;
        this.salutation = newSalutation;
        this.suffix = newSuffix;
        this.streetAddress = newStreetAddress;
        this.city = newCity;
        this.state = newState;
        this.isFemale = newIsFemale;
        this.isEmployed = newIsEmployed;
        this.isHomewOwner = newIsHomeOwner;
    }

    private class PersonBuilder {

        private String newLastName;
        private String newFirstName;
        private String newMiddleName;
        private String newSalutation;
        private String newSuffix;
        private String newStreetAddress;
        private String newCity;
        private String newState;
        private boolean newIsFemale;
        private boolean newIsEmployed;
        private boolean newIsHomeOwner;

        public PersonBuilder() {
        }

        public PersonBuilder setNewLastName(String newLastName) {
            this.newLastName = newLastName;
            return this;
        }

        public PersonBuilder setNewFirstName(String newFirstName) {
            this.newFirstName = newFirstName;
            return this;
        }

        public PersonBuilder setNewMiddleName(String newMiddleName) {
            this.newMiddleName = newMiddleName;
            return this;
        }

        public PersonBuilder setNewSalutation(String newSalutation) {
            this.newSalutation = newSalutation;
            return this;
        }

        public PersonBuilder setNewSuffix(String newSuffix) {
            this.newSuffix = newSuffix;
            return this;
        }

        public PersonBuilder setNewStreetAddress(String newStreetAddress) {
            this.newStreetAddress = newStreetAddress;
            return this;
        }

        public PersonBuilder setNewCity(String newCity) {
            this.newCity = newCity;
            return this;
        }

        public PersonBuilder setNewState(String newState) {
            this.newState = newState;
            return this;
        }

        public PersonBuilder setNewIsFemale(boolean newIsFemale) {
            this.newIsFemale = newIsFemale;
            return this;
        }

        public PersonBuilder setNewIsEmployed(boolean newIsEmployed) {
            this.newIsEmployed = newIsEmployed;
            return this;
        }

        public PersonBuilder setNewIsHomeOwner(boolean newIsHomeOwner) {
            this.newIsHomeOwner = newIsHomeOwner;
            return this;
        }

        public Person createPerson() {
            return new Person(newLastName, newFirstName, newMiddleName, newSalutation, newSuffix, newStreetAddress, newCity, newState, newIsFemale, newIsEmployed, newIsHomeOwner);
        }

    }

    public static void main(String[] args) {
//        Person person = new Person();
        
    }
}
