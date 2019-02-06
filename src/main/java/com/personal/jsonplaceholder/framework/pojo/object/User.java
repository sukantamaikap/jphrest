package com.personal.jsonplaceholder.framework.pojo.object;

import com.google.gson.annotations.SerializedName;

/**
 * POJO of User
 */
public final class User {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("email")
    private String email;

    @SerializedName("address")
    private Address address;

    @SerializedName("phone")
    private String phone;

    @SerializedName("website")
    private String website;

    @SerializedName("company")
    private Company company;

    public User() {}

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public User setAddress(Address address) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getWebsite() {
        return website;
    }

    public User setWebsite(String website) {
        this.website = website;
        return this;
    }

    public Company getCompany() {
        return company;
    }

    public User setCompany(Company company) {
        this.company = company;
        return this;
    }

    /**
     * Represents the address of an user
     */
    public static class Address {
        @SerializedName("street")
        private String street;

        @SerializedName("suite")
        private String suite;

        @SerializedName("city")
        private String city;

        @SerializedName("zipcode")
        private int zipcode;

        @SerializedName("geo")
        private Geo geo;

        public Address() {}

        public String getStreet() {
            return street;
        }

        public Address setStreet(String street) {
            this.street = street;
            return this;
        }

        public String getSuite() {
            return suite;
        }

        public Address setSuite(String suite) {
            this.suite = suite;
            return this;
        }

        public String getCity() {
            return city;
        }

        public Address setCity(String city) {
            this.city = city;
            return this;
        }

        public int getZipcode() {
            return zipcode;
        }

        public Address setZipcode(final int zipcode) {
            this.zipcode = zipcode;
            return this;
        }

        public Geo getGeo() {
            return geo;
        }

        public Address setGeo(Geo geo) {
            this.geo = geo;
            return this;
        }
    }

    /**
     * Represents the latitude and longitude of an user
     */
    public static class Geo {
        @SerializedName("lng")
        private String lng;

        @SerializedName("lat")
        private String lat;

        public Geo() {}

        public String getLng() {
            return lng;
        }

        public Geo setLng(String lng) {
            this.lng = lng;
            return this;
        }

        public String getLat() {
            return lat;
        }

        public Geo setLat(String lat) {
            this.lat = lat;
            return this;
        }
    }

    /**
     * Represents a company
     */
    public static class Company {
        @SerializedName("name")
        private String name;

        @SerializedName("catchPhrase")
        private String catchPhrase;

        @SerializedName("bs")
        private String bs;

        public Company() {}

        public String getName() {
            return name;
        }

        public Company setName(String name) {
            this.name = name;
            return this;
        }

        public String getCatchPhrase() {
            return catchPhrase;
        }

        public Company setCatchPhrase(String catchPhrase) {
            this.catchPhrase = catchPhrase;
            return this;
        }

        public String getBs() {
            return bs;
        }

        public Company setBs(String bs) {
            this.bs = bs;
            return this;
        }
    }
}
