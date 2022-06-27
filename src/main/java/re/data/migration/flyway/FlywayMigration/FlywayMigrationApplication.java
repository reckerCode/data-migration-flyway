package re.data.migration.flyway.FlywayMigration;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
public class FlywayMigrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlywayMigrationApplication.class, args);

		try {
			XmlMapper xmlMapper = new XmlMapper();
			Person pojo = new Person();
			pojo.setFirstName("Raja");
			pojo.setLastName("Ramesh");
			pojo.setAddress("Hyderabad");
			String xml = xmlMapper.writeValueAsString(pojo);
			System.out.println(xml);
		} catch(Exception e) {
			e.printStackTrace();
		}

		Map map = new HashMap();
		map.getOrDefault(true, Collections.emptySet());
	}

}
