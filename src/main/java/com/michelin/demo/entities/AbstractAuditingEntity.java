package com.michelin.demo.entities;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Data
public abstract class AbstractAuditingEntity<ID> extends AbstractEntity<ID>{

    @LastModifiedBy
    @Column(name = "lastUpdatedBy")
    private String lastUpdatedBy;

    @LastModifiedDate
    @Column(name = "lastUpdatedDate")
    private Date lastUpdatedDate;
}
