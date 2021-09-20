package pl.beda.erpFrontend.handler;

import pl.beda.erpFrontend.dto.OperatorAuthenticationResultDto;

@FunctionalInterface
public interface AuthenticationResultHandler {

    void handle(OperatorAuthenticationResultDto operatorAuthenticationResultDto);
}
