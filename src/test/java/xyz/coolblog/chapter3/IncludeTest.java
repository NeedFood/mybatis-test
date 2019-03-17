package xyz.coolblog.chapter3;

import org.apache.ibatis.builder.xml.XMLMapperBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.junit.Test;

import java.io.InputStream;

public class IncludeTest {

    @Test
    public void testInclude() throws Exception {
        Configuration configuration = new Configuration();
        String resource = "chapter3/mapper/ArticleIncludeMapper.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        XMLMapperBuilder builder = new XMLMapperBuilder(inputStream, configuration, resource, configuration.getSqlFragments());
        builder.parse();
    }
}
