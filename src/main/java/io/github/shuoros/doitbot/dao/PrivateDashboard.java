package io.github.shuoros.doitbot.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "PRIVATE_DASHBOARDS", schema = "DO-IT")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public final class PrivateDashboard extends Dashboard {

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;

}
