package com.wuhenjian.aurora.db.controller.sql;

import com.wuhenjian.aurora.db.controller.AbstractSqlBaseController;
import com.wuhenjian.aurora.db.controller.SqlBaseController;
import com.wuhenjian.aurora.db.dao.sql.GameMatchInfoMapper;
import com.wuhenjian.aurora.utils.entity.dao.GameMatchInfo;
import com.wuhenjian.aurora.utils.entity.dao.GameMatchInfoCriteria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:29
 */
@RestController
@RequestMapping(SqlBaseController.BASE_PATH + "/game-match-info")
public class GameMatchInfoController extends AbstractSqlBaseController<GameMatchInfo,GameMatchInfoCriteria,GameMatchInfoMapper> {

	@Resource(name = "gameMatchInfoMapper")
	@Override
	public void setMapper(GameMatchInfoMapper mapper) {
		super.setMapper(mapper);
	}
}
