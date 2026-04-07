package vendredi.soir.routecraft.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import vendredi.soir.routecraft.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
