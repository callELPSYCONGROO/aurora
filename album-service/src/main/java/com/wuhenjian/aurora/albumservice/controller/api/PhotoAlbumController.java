package com.wuhenjian.aurora.albumservice.controller.api;

import com.wuhenjian.aurora.albumservice.service.PhotoAlbumService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2018/1/5 11:22
 */
@RestController
public class PhotoAlbumController {

	@Resource(name = "photoAlbumService")
	private PhotoAlbumService photoAlbumService;


}
