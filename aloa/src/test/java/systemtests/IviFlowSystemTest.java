package systemtests;

import org.junit.Before;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.http.MediaType;

import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;


//@WebFluxTest
@RunWith(SpringRunner.class)
public class IviFlowSystemTest
{

    @Autowired
    ApplicationContext context;


    WebTestClient webTestClient = WebTestClient.bindToServer().baseUrl("https://jsonplaceholder.typicode.com/todos/1").build();

/*    @Before
    public void setup() throws Exception {

        this.webTestClient = WebTestClient.bindToApplicationContext(this.context).build();
    }*/


    @Test
    public void getSomeEndpointShouldReturnOK()
    {
        //given
        String url = "https://jsonplaceholder.typicode.com/todos/1";

/*        WebTestClient testClient = WebTestClient
                .bindToServer()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .build();*/

        //when
        WebTestClient.ResponseSpec response = webTestClient.get()
                .uri(url)
                .accept(MediaType.APPLICATION_JSON)
                //    .header("Authorization", "Bearer " + randomAlphanumeric(20))
                .exchange();

        //then
        assertThat(response.expectStatus().isOk()
                           .expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8));

        //  String json = new String(Objects.requireNonNull(response.expectBody().returnResult().getResponseBody()));


    }
}
