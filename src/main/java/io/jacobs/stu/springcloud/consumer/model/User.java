/*
 * Copyright 2013-2017 www.mwee.cn.
 */

package io.jacobs.stu.springcloud.consumer.model;


import lombok.Data;

import java.io.Serializable;

/**
 * Created by Jacobs Lei on 2017/8/8.
 *
 * @author Jacobs Lei
 */
@Data
public class User implements Serializable{
    private String userNam="jacobs";
    private String key="sbocaj";

}
