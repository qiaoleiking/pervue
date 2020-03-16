package com.qiaolei.pervue.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 
 * </p>
 *
 * @author ql
 * @since 2020-03-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("lx_qlgoods")
public class Qlgoods implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "gid", type = IdType.AUTO)
    private Integer gid;

    private String name;

    private String url;

    private BigDecimal price;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date created;

    private Integer province;

    private Integer city;

    private Integer district;


}
