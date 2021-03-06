package com.drawnblue.dao;

import com.drawnblue.entity.UserRecharge;
import com.drawnblue.entity.UserRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRechargeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_recharge
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    long countByExample(UserRechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_recharge
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByExample(UserRechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_recharge
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByPrimaryKey(String rechargeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_recharge
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insert(UserRecharge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_recharge
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insertSelective(UserRecharge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_recharge
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    List<UserRecharge> selectByExample(UserRechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_recharge
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    UserRecharge selectByPrimaryKey(String rechargeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_recharge
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserRecharge record, @Param("example") UserRechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_recharge
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExample(@Param("record") UserRecharge record, @Param("example") UserRechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_recharge
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKeySelective(UserRecharge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_recharge
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKey(UserRecharge record);
}