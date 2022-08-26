package dic.util;


import java.util.Date;

import org.apache.ibatis.reflection.MetaObject;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;


public class MybatisAuditHandler implements MetaObjectHandler {
@Override
public void insertFill(MetaObject metaObject) {
  // 声明自动填充字段的�?�辑�?
 
	Date now = new Date();
    setFieldValByName("create_time", now, metaObject);
    setFieldValByName("logicFlag", 1, metaObject);
 }



 @Override
 public void updateFill(MetaObject metaObject) {
  // 声明自动填充字段的�?�辑�?
	
	 setFieldValByName("update_time", new Date(), metaObject);

	 
 }
}

