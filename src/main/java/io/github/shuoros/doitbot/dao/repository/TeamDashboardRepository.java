package io.github.shuoros.doitbot.dao.repository;

import io.github.shuoros.doitbot.dao.TeamDashboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamDashboardRepository extends JpaRepository<TeamDashboard, String> {
}
