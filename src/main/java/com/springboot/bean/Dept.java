package com.springboot.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Auther: madali
 * @Date: 2018/8/31 10:17
 */
@Entity
@Table(name = "dept")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

}
