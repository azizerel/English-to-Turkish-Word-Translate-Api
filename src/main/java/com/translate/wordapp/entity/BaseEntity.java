package com.translate.wordapp.entity;

import com.translate.wordapp.constant.BaseModelConstant;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * created by Abdulaziz Erel on 22:35 09.06.2020
 **/
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = BaseModelConstant.ID_COLUMN_NAME, updatable = false)
    private Long id;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = BaseModelConstant.CREATED_DATE_COLUMN_NAME)
    private Date createdAt;

    @CreatedBy
    @Column(name = BaseModelConstant.CREATED_BY_COLUMN_NAME)
    private String createdBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
