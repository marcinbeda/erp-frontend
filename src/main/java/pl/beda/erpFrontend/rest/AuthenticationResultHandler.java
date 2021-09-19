package pl.beda.erpFrontend.rest;

@FunctionalInterface
public interface AuthenticationResultHandler {

    void handle(boolean authenticationResult);
}
