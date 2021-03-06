package com.drawnblue.dao;

import com.drawnblue.entity.UserBuyBonus;
import com.drawnblue.entity.UserBuyBonusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBuyBonusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_buy_bonus
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    long countByExample(UserBuyBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_buy_bonus
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByExample(UserBuyBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_buy_bonus
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByPrimaryKey(String buyBonusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_buy_bonus
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insert(UserBuyBonus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_buy_bonus
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insertSelective(UserBuyBonus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_buy_bonus
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    List<UserBuyBonus> selectByExample(UserBuyBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_buy_bonus
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    UserBuyBonus selectByPrimaryKey(String buyBonusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_buy_bonus
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserBuyBonus record, @Param("example") UserBuyBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_buy_bonus
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExample(@Param("record") UserBuyBonus record, @Param("example") UserBuyBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_buy_bonus
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKeySelective(UserBuyBonus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_buy_bonus
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKey(UserBuyBonus record);
}