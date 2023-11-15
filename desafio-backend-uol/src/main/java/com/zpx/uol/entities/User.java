package com.zpx.uol.entities;

import com.zpx.uol.enums.Dc;
import com.zpx.uol.enums.Marvel;
import com.zpx.uol.enums.Team;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_user")
@Data
public class User {

    @Id
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String email;

    private String phone;

    @ManyToOne
    @Enumerated
    private List<Marvel> nick_marvels = new ArrayList<>();

    @ManyToOne
    @Enumerated
    private List<Dc> nick_dcs = new ArrayList<>();

    @ManyToOne
    @Enumerated
    private List<Team> teams = new ArrayList<>();

}
