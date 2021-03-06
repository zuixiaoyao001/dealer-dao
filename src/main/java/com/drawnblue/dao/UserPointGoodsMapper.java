package com.drawnblue.dao;

import com.drawnblue.entity.UserPointGoods;
import com.drawnblue.entity.UserPointGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPointGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_goods
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    long countByExample(UserPointGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_goods
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByExample(UserPointGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_goods
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByPrimaryKey(String pointGoodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_goods
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insert(UserPointGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_goods
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insertSelective(UserPointGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_goods
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    List<UserPointGoods> selectByExample(UserPointGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_goods
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    UserPointGoods selectByPrimaryKey(String pointGoodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_goods
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserPointGoods record, @Param("example") UserPointGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_goods
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExample(@Param("record") UserPointGoods record, @Param("example") UserPointGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_goods
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKeySelective(UserPointGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_goods
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKey(UserPointGoods record);
}