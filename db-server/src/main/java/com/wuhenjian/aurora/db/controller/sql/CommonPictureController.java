package com.wuhenjian.aurora.db.controller.sql;

import com.wuhenjian.aurora.db.controller.AbstractSqlBaseController;
import com.wuhenjian.aurora.db.controller.SqlBaseController;
import com.wuhenjian.aurora.db.dao.sql.CommonPictureMapper;
import com.wuhenjian.aurora.utils.entity.dao.CommonPicture;
import com.wuhenjian.aurora.utils.entity.dao.CommonPictureCriteria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:29
 */
@RestController
@RequestMapping(SqlBaseController.BASE_PATH + "/common-picture")
public class CommonPictureController extends AbstractSqlBaseController<CommonPicture, CommonPictureCriteria, CommonPictureMapper> {

	@Resource(name = "commonPictureMapper")
	@Override
	public void setMapper(CommonPictureMapper mapper) {
		super.setMapper(mapper);
	}
}
