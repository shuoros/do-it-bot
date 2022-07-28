package io.github.shuoros.doitbot.dao.repository;

import io.github.shuoros.doitbot.dao.PrivateDashboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivateDashboardRepository extends JpaRepository<PrivateDashboard, String> {
}
