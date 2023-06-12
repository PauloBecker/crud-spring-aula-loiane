package com.becker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.validator.constraints.Length;

@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("_id")
    private Long id;

    @NotBlank
    @NotNull
    @Length(min = 3, max = 100)
    @Column(length = 100, nullable = false)
    private String name;

    @NotNull
    @Length(max = 10)
    @Pattern(regexp = "front-end|back-end|full-stack")
    @Column(length = 10, nullable = false)
    private String category;


}
