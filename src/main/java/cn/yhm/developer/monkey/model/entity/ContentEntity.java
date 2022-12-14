package cn.yhm.developer.monkey.model.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 内容表实体类
 * <p>
 * 数据库：db_monkey
 * <p>
 * 表：t_monkey_content
 *
 * @author victor2015yhm@gmail.com
 * @since 2022-09-06 00:11:24
 */
@NoArgsConstructor
@Accessors(chain = true)
@Getter
@Setter
@TableName(value = "t_monkey_content")
public class ContentEntity implements Serializable {

    private static final long serialVersionUID = -7719800824369943769L;

    /**
     * 内容ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 乐观锁
     */
    @TableField(value = "version")
    private Integer version;

    /**
     * 逻辑删除
     */
    @TableLogic
    @TableField(value = "deleted")
    private Integer deleted;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
