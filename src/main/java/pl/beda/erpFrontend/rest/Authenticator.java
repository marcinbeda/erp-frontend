package pl.beda.erpFrontend.rest;

import pl.beda.erpFrontend.dto.OperatorCredentialsDto;

public interface Authenticator {

    void authenticate(OperatorCredentialsDto operatorCredentialsDto, AuthenticationResultHandler authenticationResultHandler);

}
