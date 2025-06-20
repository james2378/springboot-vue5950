package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *完成任务：(CompleteTheTask)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CompleteTheTask")
public class CompleteTheTask implements Serializable {

    //CompleteTheTask编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "complete_the_task_id")
    private Integer complete_the_task_id;
    // 任务名称
    @Basic
    private String task_name;
    // 评价
    @Basic
    private String evaluate;
    // 任务时间
    @Basic
    private String task_time;
    // 任务价格
    @Basic
    private String task_price;
    // 发布人
    @Basic
    private Integer publisher;
    // 发布人电话
    @Basic
    private String publisher_telephone;
    // 配送员
    @Basic
    private Integer delivery_clerk;
    // 任务状态
    @Basic
    private String task_status;
    // 评语
    @Basic
    private String comment;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
