package com.smartcommunity.mapper;

import com.smartcommunity.pojo.Notice;
import com.smartcommunity.pojo.NoticeExample;

import edu.hust.smartcommunity.paginator.domain.PageBounds;
import edu.hust.smartcommunity.paginator.domain.PageList;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface NoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbggenerated Sun Jan 25 17:22:54 CST 2015
     */
    int countByExample(NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbggenerated Sun Jan 25 17:22:54 CST 2015
     */
    int deleteByExample(NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbggenerated Sun Jan 25 17:22:54 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbggenerated Sun Jan 25 17:22:54 CST 2015
     */
    int insert(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbggenerated Sun Jan 25 17:22:54 CST 2015
     */
    int insertSelective(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbggenerated Sun Jan 25 17:22:54 CST 2015
     */
    List<Notice> selectByExample(NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbggenerated Sun Jan 25 17:22:54 CST 2015
     */
    Notice selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbggenerated Sun Jan 25 17:22:54 CST 2015
     */
    int updateByExampleSelective(@Param("record") Notice record, @Param("example") NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbggenerated Sun Jan 25 17:22:54 CST 2015
     */
    int updateByExample(@Param("record") Notice record, @Param("example") NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbggenerated Sun Jan 25 17:22:54 CST 2015
     */
    int updateByPrimaryKeySelective(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbggenerated Sun Jan 25 17:22:54 CST 2015
     */
    int updateByPrimaryKey(Notice record);
    /**
     * added
     */
    List<Notice> selectByPage(@Param("example") NoticeExample noticeExample);
    PageList<Notice> selectByPage(@Param("example") NoticeExample noticeExample, PageBounds pageBounds);

    PageList<Notice> selectByExample(NoticeExample example, PageBounds pageBounds);
    /**
     * 有问题
     * @param example
     * @param pageBounds
     * @return
     */
    PageList<Notice> selectNoticeByUser(com.smartcommunity.pojo.UserNoticeExample example, PageBounds pageBounds);
    
}
