package com.personal.jsonplaceholder.framework.pojo.builder;

import com.personal.jsonplaceholder.framework.pojo.object.User;
import com.personal.jsonplaceholder.framework.util.TestUtils;
import org.apache.commons.lang3.RandomStringUtils;

public class UserBuilder {

  private User user;

  public UserBuilder() {

  }

  public User.Geo buildGeoLocation(final double lat, final double lng) {
    return new User.Geo().setLat(String.valueOf(lat)).setLng(String.valueOf(lng));
  }

  public User.Address buildAddress(final User.Geo geo,
      final String city,
      final String street,
      final String suite,
      final int zipCode) {
    return new User.Address().setGeo(geo).setCity(city).setStreet(street).setSuite(suite)
        .setZipcode(zipCode);
  }

  public User.Company buildCompany(final String name,
      final String catchPhrase,
      final String bs) {
    return new User.Company().setBs(bs).setCatchPhrase(catchPhrase).setName(name);
  }

  public User buildUser(final String name,
      final User.Address address,
      final User.Company company) {
    this.user = new User().setName(name).setAddress(address).setCompany(company);
    return this.user;
  }

  public User setUserEmail(final String email) {
    return this.user.setEmail(email);
  }

  public User setUserPhone(final String phone) {
    return this.user.setPhone(phone);
  }

  public User setUserWebsite(final String webSite) {
    return this.user.setWebsite(webSite);
  }

  public User buildCompleteUser() {
    final String companyName = "TestCompany_" + RandomStringUtils.randomAlphabetic(5);
    final String catchPhrase = RandomStringUtils.randomAlphabetic(15);
    final String bs = RandomStringUtils.randomAlphabetic(10);
    final User.Company company = this.buildCompany(companyName, catchPhrase, bs);

    final double longitude = Math.random() * Math.PI * 2;
    final double latitude = Math.acos(Math.random() * 2 - 1);
    final User.Geo location = this.buildGeoLocation(latitude, longitude);

    final String city = "TestCity_" + RandomStringUtils.randomAlphabetic(8);
    final String street = "TestStreet_" + RandomStringUtils.randomAlphabetic(5);
    final String suite = RandomStringUtils.randomAlphabetic(2);
    final int zipCode = TestUtils.generateRandomNumber(10);
    final User.Address address = this.buildAddress(location, city, street, suite, zipCode);

    final String name = "FirstName " + RandomStringUtils.randomAlphabetic(7);
    final String phoneNumber = String.valueOf(TestUtils.generateRandomNumber(99999999));
    final String email = "test_" + RandomStringUtils.randomAlphabetic(5) + "@testdomain.com";
    return this.buildUser(name, address, company).setEmail(email).setPhone(phoneNumber);
  }
}
