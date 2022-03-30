package com.zy.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zy.blog.dao.pojo.Tag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TagMapper extends BaseMapper<Tag> {
    /**
     * 根据文章查询标签列表
     * @param id
     * @return
     */
    List<Tag> findTagsByArticleId(Long id);

    /**
     * 查询最热标签前n条
     * @param limit
     * @return
     */
    List<Long> findHotsTags(int limit);

    List<Tag> findTagsByTagIds(List<Long> tagIds);
}
