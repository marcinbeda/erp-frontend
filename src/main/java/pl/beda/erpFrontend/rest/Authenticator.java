package pl.beda.erpFrontend.rest;

import pl.beda.erpFrontend.dto.OperatorCredentialsDto;
import pl.beda.erpFrontend.handler.AuthenticationResultHandler;

public interface Authenticator {

    void authenticate(OperatorCredentialsDto operatorCredentialsDto, AuthenticationResultHandler authenticationResultHandler);

}
