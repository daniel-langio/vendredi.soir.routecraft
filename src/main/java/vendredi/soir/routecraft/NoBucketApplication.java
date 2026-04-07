package vendredi.soir.routecraft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import vendredi.soir.routecraft.endpoint.rest.controller.health.HealthBucketController;
import vendredi.soir.routecraft.file.bucket.BucketComponent;
import vendredi.soir.routecraft.file.bucket.BucketConf;

@SpringBootApplication
@ComponentScan(
    basePackages = "vendredi.soir.routecraft",
    excludeFilters = {
      @ComponentScan.Filter(
          type = FilterType.ASSIGNABLE_TYPE,
          value = {
            HealthBucketController.class,
            BucketComponent.class,
            BucketConf.class,
            PojaApplication.class
          })
    })
public class NoBucketApplication {

  public static void main(String[] args) {
    SpringApplication.run(NoBucketApplication.class, args);
  }
}
