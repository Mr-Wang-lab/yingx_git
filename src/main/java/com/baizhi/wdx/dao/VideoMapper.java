package com.baizhi.wdx.dao;

import com.baizhi.wdx.entity.Video;
import com.baizhi.wdx.po.VideoPo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface VideoMapper extends Mapper<Video> {

    List<VideoPo> queryByReleaseTime();
}