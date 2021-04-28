package com.casestudy.customermanager.model.customer;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class CustomerType {

    @Id
    private String customerTypeId;

    private String customerTypeName;

    @OneToMany(mappedBy = "customerType")
    private Set<Customer> customer;

}
