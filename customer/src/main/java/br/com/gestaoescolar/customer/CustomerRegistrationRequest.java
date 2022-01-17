package br.com.gestaoescolar.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
