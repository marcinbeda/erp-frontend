package pl.beda.erpFrontend.rest;

import pl.beda.erpFrontend.dto.OperatorAuthenticationResultDto;

@FunctionalInterface
public interface AuthenticationResultHandler {

    void handle(OperatorAuthenticationResultDto operatorAuthenticationResultDto);
}
