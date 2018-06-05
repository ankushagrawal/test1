package com.quizzo.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.quizzo.core.domain.enums.CustomLockNameEnum;
import com.quizzo.core.utils.datetime.converter.JodaDateTimeConverter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.joda.time.DateTime;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "custom_lock",
        uniqueConstraints =
        {@UniqueConstraint(columnNames = {"entity_name", "entity_id"})}
    )
@Data
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomLockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @JsonProperty(value = "id")
    private Long id;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "entity_name")
    private CustomLockNameEnum entityName;

    @NotNull
    @Column(name = "entity_id")
    private String entityId;

    @Column(name = "created_at")
    @JsonIgnore
    @Convert(converter = JodaDateTimeConverter.class)
    private DateTime createdAt;
}
