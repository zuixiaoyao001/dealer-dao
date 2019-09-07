package com.drawnblue.dao;

import com.drawnblue.entity.MultiLan;
import com.drawnblue.entity.MultiLanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MultiLanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multi_lan
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    long countByExample(MultiLanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multi_lan
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByExample(MultiLanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multi_lan
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByPrimaryKey(String elementId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multi_lan
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insert(MultiLan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multi_lan
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insertSelective(MultiLan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multi_lan
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    List<MultiLan> selectByExample(MultiLanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multi_lan
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    MultiLan selectByPrimaryKey(String elementId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multi_lan
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") MultiLan record, @Param("example") MultiLanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multi_lan
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExample(@Param("record") MultiLan record, @Param("example") MultiLanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multi_lan
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKeySelective(MultiLan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multi_lan
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKey(MultiLan record);
}