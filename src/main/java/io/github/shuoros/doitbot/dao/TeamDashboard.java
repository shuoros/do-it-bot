package io.github.shuoros.doitbot.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TEAM_DASHBOARDS", schema = "DO-IT")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public final class TeamDashboard extends Dashboard {

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private List<User> users;

}
