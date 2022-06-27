package re.data.migration.flyway.FlywayMigration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import re.data.migration.flyway.FlywayMigration.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}