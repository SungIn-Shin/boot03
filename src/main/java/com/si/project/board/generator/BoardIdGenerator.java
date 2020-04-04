package com.si.project.board.generator;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;

import java.io.Serializable;
import java.util.Properties;

public class BoardIdGenerator implements IdentifierGenerator , Configurable {

    private String prefix;

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object o) throws HibernateException {
        // BD000000001, BD000000002, ... BD00000000N

//        String boardId = "BD" + StringUtils.leftPad("1", 10, '0');
        String prefix = "A";
        // 123

//        String queary = String.format("select %s", "seq1_1");

//        Stream seq = session.createQuery(query).stream();

        return prefix +  StringUtils.leftPad("1", 10, '0');
    }

    @Override
    public void configure(Type type, Properties properties,
                          ServiceRegistry serviceRegistry) throws MappingException {
        prefix = properties.getProperty("prefix");
    }
}
