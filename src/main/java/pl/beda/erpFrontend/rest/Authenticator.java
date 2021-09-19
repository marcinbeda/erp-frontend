package pl.beda.erpFrontend.rest;

import pl.beda.erpFrontend.dto.UserCredentialsDto;

public interface Authenticator {

    void authenticate(UserCredentialsDto userCredentialsDto, AuthenticationResultHandler authenticationResultHandler);

}
