package ua.com.jon.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by b.chupika on 28.03.2017
 */
@Entity
@Data
public class CostItem {
    @Id
    private Long id;
    private String title;
    private String description;

}
