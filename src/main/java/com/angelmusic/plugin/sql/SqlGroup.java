package com.angelmusic.plugin.sql;

import com.google.common.collect.Lists;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by wangyong on 16-12-14.
 */
@XmlRootElement
class SqlGroup {

    @XmlAttribute
    String name;
    @XmlElement(name = "sql")
    List<SqlItem> sqlItems = Lists.newArrayList();

    void addSqlgroup(SqlItem sqlGroup) {
        sqlItems.add(sqlGroup);
    }
}
