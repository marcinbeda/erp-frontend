package pl.beda.erpFrontend.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import pl.beda.erpFrontend.dto.OperatorAuthenticationResultDto;
import pl.beda.erpFrontend.dto.OperatorCredentialsDto;
import pl.beda.erpFrontend.handler.AuthenticationResultHandler;

public class AuthenticatorImpl implements Authenticator {

    private static final String AUTHENTICATION_URL = "http://localhost:8080/verify_operator_credentials";

    private final RestTemplate restTemplate;

    public AuthenticatorImpl() {
        restTemplate = new RestTemplate();
    }


    @Override
    public void authenticate(OperatorCredentialsDto operatorCredentialsDto, AuthenticationResultHandler authenticationResultHandler) {
        Runnable authenticationTask = () -> {
            processAuthentication(operatorCredentialsDto, authenticationResultHandler);
        };
        Thread authenticationThread = new Thread(authenticationTask);
        authenticationThread.setDaemon(true);
        authenticationThread.start();
    }

    private void processAuthentication(OperatorCredentialsDto operatorCredentialsDto, AuthenticationResultHandler authenticationResultHandler) {
        ResponseEntity<OperatorAuthenticationResultDto> responseEntity = restTemplate.postForEntity(AUTHENTICATION_URL, operatorCredentialsDto, OperatorAuthenticationResultDto.class);
//       OperatorAuthenticationResultDto dto = new OperatorAuthenticationResultDto();
//       dto.setAuthenticated(true);
//       dto.setFirstName("user");
//       dto.setLastName("password");
//       dto.setIdOperator(1L);
        authenticationResultHandler.handle(responseEntity.getBody());
    }
}
