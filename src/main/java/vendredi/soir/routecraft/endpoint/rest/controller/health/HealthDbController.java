package vendredi.soir.routecraft.endpoint.rest.controller.health;

import static vendredi.soir.routecraft.endpoint.rest.controller.health.PingController.KO;
import static vendredi.soir.routecraft.endpoint.rest.controller.health.PingController.OK;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vendredi.soir.routecraft.PojaGenerated;
import vendredi.soir.routecraft.repository.DummyRepository;

@PojaGenerated
@RestController
@AllArgsConstructor
public class HealthDbController {

  DummyRepository dummyRepository;

  @GetMapping("/health/db")
  public ResponseEntity<String> dummyTable_should_not_be_empty() {
    return dummyRepository.findAll().isEmpty() ? KO : OK;
  }
}
