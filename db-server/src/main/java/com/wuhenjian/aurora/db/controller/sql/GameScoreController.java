package com.wuhenjian.aurora.db.controller.sql;

import com.wuhenjian.aurora.db.controller.AbstractSqlBaseController;
import com.wuhenjian.aurora.db.controller.SqlBaseController;
import com.wuhenjian.aurora.db.dao.sql.GameScoreMapper;
import com.wuhenjian.aurora.utils.entity.dao.GameScore;
import com.wuhenjian.aurora.utils.entity.dao.GameScoreCriteria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:30
 */
@RestController
@RequestMapping(SqlBaseController.BASE_PATH + "/game-score")
public class GameScoreController extends AbstractSqlBaseController<GameScore,GameScoreCriteria,GameScoreMapper> {

	@Resource(name = "gameScoreMapper")
	@Override
	public void setMapper(GameScoreMapper mapper) {
		super.setMapper(mapper);
	}
}
