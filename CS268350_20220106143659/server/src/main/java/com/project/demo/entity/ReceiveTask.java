package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *领取任务：(ReceiveTask)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ReceiveTask")
public class ReceiveTask implements Serializable {

    //ReceiveTask编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receive_task_id")
    private Integer receive_task_id;
    // 任务名称
    @Basic
    private String task_name;
    // 任务价格
    @Basic
    private String task_price;
    // 任务时间
    @Basic
    private String task_time;
    // 发布人
    @Basic
    private Integer publisher;
    // 发布人电话
    @Basic
    private String publisher_telephone;
    // 配送员电话
    @Basic
    private String distributor_telephone;
    // 配送员
    @Basic
    private Integer delivery_clerk;
    // 取货地址
    @Basic
    private String pick_up_address;
    // 收货人电话
    @Basic
    private String consignee_telephone;
    // 收货人
    @Basic
    private String consignee;
    // 收货地址
    @Basic
    private String receiving_address;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
