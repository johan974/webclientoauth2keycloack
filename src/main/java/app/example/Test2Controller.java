package app.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import static org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction.clientRegistrationId;

@RestController
public class Test2Controller {

  @Autowired
  private @Qualifier("method2") WebClient webClient2;

  @GetMapping("/test2")
  public String test2() {
    return webClient2.get().uri("http://localhost:8086/test2")
            .attributes(clientRegistrationId("businesspartners"))
            .retrieve().bodyToMono(String.class).block();

  }
}
