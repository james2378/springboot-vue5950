package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *发布任务：(PublishTask)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "PublishTask")
public class PublishTask implements Serializable {

    //PublishTask编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publish_task_id")
    private Integer publish_task_id;
    // 任务名称
    @Basic
    private String task_name;
    // 任务时间
    @Basic
    private Timestamp task_time;
    // 任务价格
    @Basic
    private String task_price;
    // 任务内容
    @Basic
    private String task_content;
    // 取货地址
    @Basic
    private String pick_up_address;
    // 发布人电话
    @Basic
    private String publisher_telephone;
    // 发布人
    @Basic
    private Integer publisher;
    // 收货人
    @Basic
    private String consignee;
    // 收货地址
    @Basic
    private String receiving_address;
    // 收货人电话
    @Basic
    private String consignee_telephone;
    // 任务要求
    @Basic
    private String task_requirements;
    // 支付状态
    @Basic
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @Basic
    private String pay_type;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
